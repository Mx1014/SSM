package com.kylin.electricassistsys.systemlogaspect;

import com.kylin.electricassistsys.data.api.other.SysSystemsettingApi;
import com.kylin.electricassistsys.data.api.tsys.TSystemLogApi;
import com.kylin.electricassistsys.dto.base.BaseDto;
import com.kylin.electricassistsys.dto.other.SysSystemsettingDto;
import com.kylin.electricassistsys.dto.system.TSystemLogDto;
import com.kylin.electricassistsys.tools.IPHelper;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthorizedException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import scala.reflect.internal.Trees;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/***
 * 系统操作日志记录数据
 * spring aop 采用的是 cjlib
 * cwx
 * 2018/5/11
 */

@Aspect    //该标签把LoggerAspect类声明为一个切面
@Order(1)  //设置切面的优先级：如果有多个切面，可通过设置优先级控制切面的执行顺序（数值越小，优先级越高）
@Component //该标签把LoggerAspect类放到IOC容器中
public class SystemLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(SystemLogAspect.class);
    @Resource
    private TSystemLogApi tSystemLogApi;
    @Resource
    private SysSystemsettingApi systemsettingApi;


    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private Map<String, List<String>> userUrlMap = new HashMap<String, List<String>>();


    /**
     * 环绕通知(需要携带类型为ProceedingJoinPoint类型的参数)
     * 环绕通知包含前置、后置、返回、异常通知；ProceedingJoinPoin 类型的参数可以决定是否执行目标方法
     * 且环绕通知必须有返回值，返回值即目标方法的返回值
     *
     * @param
     */
    @Around("@within(org.springframework.web.bind.annotation.RequestMapping)")
    public Object aroundMethod(ProceedingJoinPoint point) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String ipAddress = IPHelper.getIpAddress(request);
        Object o = null;
        long t1 = System.currentTimeMillis();
        try {
            o = point.proceed();
            TSystemLogDto dto = new TSystemLogDto();
            long t2 = System.currentTimeMillis();
            if (o.toString().length() < 5000 || o.toString().length() != 0) {
                dto.setUserResult(o.toString());
            } else {
                dto.setUserResult("data is too long");
            }
            dto.setUserDuration((t2 - t1));
            dto.setUserMethod(point.getTarget().getClass().getName() + "." + point.getSignature().getName());
            StringBuilder stringBuilder = new StringBuilder();
            for (String s : request.getParameterMap().keySet()) {
                stringBuilder.append(s);
                stringBuilder.append(" = ");
                stringBuilder.append(request.getParameterMap().get(s)[0]);
                stringBuilder.append(" | ");
            }
            dto.setUserParameters(stringBuilder.toString());
            dto.setUserIp(ipAddress);
            dto.setUserURL(request.getRequestURL().toString());
            dto.setUserAgent(request.getHeader("user-agent"));
            tSystemLogApi.insertSystem(dto);
            logger.info("request contentType:{}", request.getHeader("Accept"));
            logger.info("request param : {}", dto.getUserParameters());
            logger.info("reuest method : {}", request.getMethod());
            logger.info("request url : {}", dto.getUserURL());
        } catch (Exception e) {//这里建议将异常向上层抛让异常处理器来进行捕捉
            if (e instanceof UnknownAccountException) {
                throw new UnknownAccountException(e);
            } else if (e instanceof IncorrectCredentialsException) {
                throw new IncorrectCredentialsException(e);
            } else if (e instanceof UnauthorizedException) {
                throw new UnauthorizedException(e);
            } else if (e instanceof ExcessiveAttemptsException) {
                throw e;
            } else {
                throw new Exception(e);
            }
        }
        return o;
    }


    /***
     * 定义一个方法，用于声明切入点表达式，方法中一般不需要添加其他代码
     * 使用@Pointcut声明切入点表达式
     * 后面的通知直接使用方法名来引用当前的切点表达式；如果是其他类使用，加上包名即可
     */

  /*  @Pointcut("execution(public * com.kylin.electricassistsys.controller.*Controller.*(..))")
    public void declearJoinPointExpression(){}
*/
    @Pointcut("execution(public * com.kylin.electricassistsys.controller.*.*Controller.*(..))")
    public void declearJoinPointExpression() {
    }

    /***
     * 前置通知
     * @param joinPoint
     *
     * */


    @Before("declearJoinPointExpression()") //该标签声明次方法是一个前置通知：在目标方法开始之前执行
    public void beforMethod(JoinPoint joinPoint) {
        // String url = request.getRequestURI();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        HttpServletRequest request = servletRequestAttributes.getRequest();
        HttpServletResponse response = servletRequestAttributes.getResponse();
        String url = request.getRequestURI().substring(1);
        List<SysSystemsettingDto> sysSystemsettingDtos = systemsettingApi.selectSystemsettingResult();
        if (sysSystemsettingDtos.size() > 0 && !"/permissionSystem/user/getUserLogin".equals(url) && !"/permissionSystem/system/captchImg".equals(url)) {
            SysSystemsettingDto sysSystemsettingDto = sysSystemsettingDtos.get(0);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Date visitstarttime = sysSystemsettingDto.getVisitstarttime();
            Date visitendtime = sysSystemsettingDto.getVisitendtime();
            if (visitstarttime != null || visitendtime != null) {
                String visitstarttimeStr = sdf.format(visitstarttime);
                String visitendtimeStr = sdf.format(visitendtime);
                LocalTime now = LocalTime.now();
                String s = now.toString();
                String nowStr = s.substring(0, s.indexOf("."));
                long visitstarttimeLon = Long.valueOf(visitstarttimeStr.replaceAll("[-\\s:]", ""));
                long visitendtimeLon = Long.valueOf(visitendtimeStr.replaceAll("[-\\s:]", ""));
                long nowLon = Long.valueOf(nowStr.replaceAll("[-\\s:]", ""));
                Boolean result = visitstarttimeLon > nowLon || nowLon > visitendtimeLon;
                if (result) {
                    response.setStatus(400);
                    try {
                        response.getWriter().write(":" + visitstarttimeStr + "-" + visitendtimeStr+"*时间段才能被访问！" );
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    throw new ExcessiveAttemptsException("系统管理设置系统在:" + visitstarttimeStr + "-" + visitendtimeStr + "时间段才能被访问！");
                }
            }
        }


        if (url.indexOf("/permissionSystem") == -1) {
            String methodName = joinPoint.getSignature().getName();
            List<Object> args = Arrays.asList(joinPoint.getArgs());

            if (args.size() > 0) {
                String userRedisreQequestId = "";
                if (args.get(0) instanceof Map) {
                    Map map = (Map) args.get(0);
                    userRedisreQequestId = (String) map.get("userRedisreQequestId");
                } else {
                    if (args.get(0) instanceof BaseDto) {
                        BaseDto baseDto = (BaseDto) args.get(0);
                        userRedisreQequestId = baseDto.getUserRedisreQequestId();
                    } else {
                        Cookie[] cookie = request.getCookies();
                        for (int i = 0; i < cookie.length; i++) {
                            Cookie cook = cookie[i];
                            if (cook.getName().equalsIgnoreCase("Admin-Token")) { //获取键
                                userRedisreQequestId = cook.getValue().toString();    //获取值
                            }
                        }
                    }
                }

                if (userRedisreQequestId != null && userUrlMap.get(userRedisreQequestId) == null) {
                    List<String> requestUrlSet = new ArrayList<String>();
                    String key = userRedisreQequestId + "_Permission";
                    Boolean aBoolean = redisTemplate.opsForSet().isMember(key, url);
                    Set<Object> members = redisTemplate.opsForSet().members(key);
                    Iterator<Object> iterator = members.iterator();
//                    requestUrlSet = new ArrayList<String>();
                    while (iterator.hasNext()) {
                        String s = iterator.next().toString();
                        int api = s.indexOf("api");
                        if (api != -1) {
                            String requestUrl = s.substring(api + 3);
                            int i = requestUrl.indexOf("_");
                            if (i != -1) {
                                requestUrl.replaceAll("_", "*");
                                String[] split = requestUrl.split("_");
                                requestUrl = new StringBuilder(split[0]).append(split[1]).toString();
                            }
                            requestUrlSet.add(requestUrl);
                        }
                        userUrlMap.put(userRedisreQequestId, requestUrlSet);
                    }

                }
                if (userUrlMap.get(userRedisreQequestId).size() > 0 && !userUrlMap.get(userRedisreQequestId).contains(url)) {
                    response.setStatus(403);
                    throw new ExcessiveAttemptsException("没有权限访问！");
                }
            }
        }
        //  System.out.println("this method " + methodName + " begin. param<" + args + ">");
    }

    /***
     * 后置通知（无论方法是否发生异常都会执行,所以访问不到方法的返回值）
     * @param joinPoint
     * */


    @After("declearJoinPointExpression()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("this method " + methodName + " end.");
    }

    /***
     * 返回通知（在方法正常结束执行的代码）
     * 返回通知可以访问到方法的返回值！
     * @param
     */

    @AfterReturning(value = "declearJoinPointExpression()", returning = "result")
    public void afterReturnMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("this method " + methodName + " end.result<" + result + ">");
    }

    /***
     * 异常通知（方法发生异常执行的代码）
     * 可以访问到异常对象；且可以指定在出现特定异常时执行的代码
     * @param joinPoint
     * @param ex
     * */


    @AfterThrowing(value = "declearJoinPointExpression()", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("this method " + methodName + " end.ex message<" + ex + ">");
    }

}

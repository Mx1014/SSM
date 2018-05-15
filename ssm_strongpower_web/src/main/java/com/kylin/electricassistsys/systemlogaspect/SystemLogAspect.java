package com.kylin.electricassistsys.systemlogaspect;

import com.kylin.electricassistsys.data.api.TSystemLogApi;
import com.kylin.electricassistsys.dto.system.TSystemLogDto;
import com.kylin.electricassistsys.tools.sqlfilter.SqlRegular;
import org.apache.logging.log4j.util.Strings;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

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
    @Resource
    private TSystemLogApi tSystemLogApi;

    /***
     * 定义一个方法，用于声明切入点表达式，方法中一般不需要添加其他代码
     * 使用@Pointcut声明切入点表达式
     * 后面的通知直接使用方法名来引用当前的切点表达式；如果是其他类使用，加上包名即可
     */

    @Pointcut("execution(public * com.kylin.electricassistsys.controller.*Controller.*(..))")
    public void declearJoinPointExpression(){}

    /***
     * 前置通知
     * @param joinPoint
     *
     * */


    @Before("declearJoinPointExpression()") //该标签声明次方法是一个前置通知：在目标方法开始之前执行
    public void beforMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("this method "+methodName+" begin. param<"+ args+">");
    }
    /***
     * 后置通知（无论方法是否发生异常都会执行,所以访问不到方法的返回值）
     * @param joinPoint
     * */


    @After("declearJoinPointExpression()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("this method "+methodName+" end.");
    }
    /***
     * 返回通知（在方法正常结束执行的代码）
     * 返回通知可以访问到方法的返回值！
     * @param
     */

    @AfterReturning(value="declearJoinPointExpression()",returning="result")
    public void afterReturnMethod(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("this method "+methodName+" end.result<"+result+">");
    }
    /***
     * 异常通知（方法发生异常执行的代码）
     * 可以访问到异常对象；且可以指定在出现特定异常时执行的代码
     * @param joinPoint
     * @param ex
     * */


    @AfterThrowing(value="declearJoinPointExpression()",throwing="ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Exception ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("this method "+methodName+" end.ex message<"+ex+">");
    }
     /**
     * 环绕通知(需要携带类型为ProceedingJoinPoint类型的参数)
     * 环绕通知包含前置、后置、返回、异常通知；ProceedingJoinPoin 类型的参数可以决定是否执行目标方法
     * 且环绕通知必须有返回值，返回值即目标方法的返回值
     * @param
     */

    @Around(value="declearJoinPointExpression()")
    public Object aroundMethod(ProceedingJoinPoint point){
        Object result=null;
        try {
            TSystemLogDto dto = new TSystemLogDto();
        // 获取session中当前用户
         HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
         HttpSession session = request.getSession();
         String ip = SqlRegular.getIpAddress(request);
         Object [] objs = point.getArgs(); // 获取方法的输入参数
         String host=request.getRemoteHost();//返回发出请求的客户机的主机名
         int port =request.getRemotePort();//返回发出请求的客户机的端口号。
         String url= request.getRequestURI();
         String parme="";
         ip="ip:"+ip+"-host:"+host+"-:port"+port;
        for(int i=0;i<objs.length;i++){
            parme+=objs[i].toString();
        }
          String className = point.getTarget().getClass().getSimpleName();

           String methodName = point.getSignature().getName();
            //前置通知
            System.out.println("The method "+ methodName+" start. param<"+ Arrays.asList(point.getArgs())+">");
            //执行目标方法
            result = point.proceed();
            //返回通知
            System.out.println("The method "+ methodName+" end. result<"+ result+">");
            if(Strings.isNotEmpty(parme)||"".equals(parme)){
                parme=result.toString();
            }
            dto.setUserName("");
            dto.setUserIp(ip);
            dto.setUserMethod(url);
            dto.setUserParameters(parme);
           // dto.setUserOperationLegitimate();
          tSystemLogApi.insertSystem(dto);
        } catch (Throwable e) {
            //异常通知
            throw new RuntimeException(e);
        }
        //后置通知

        return result;
    }


}

package com.kylin.electricassistsys.controller.system;

import com.kylin.electricassistsys.model.SysUser;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.tools.constants.URLConstants;
import com.kylin.electricassistsys.tools.httpclient.HttpClientUtilsJsonObject;
import io.swagger.annotations.Api;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * @Auther: cwx
 * @Date: 2018/6/4 16:16
 * @Description: 用戶數據
 */
@RestController
@RequestMapping("/userData")
@Api(value = "/userData", description = "用户数据信息接口", produces = MediaType.APPLICATION_JSON)
public class UserDataController {
    private static final Logger LOG = LogManager.getLogger(UserDataController.class);
    /**
     * 从redis查询用户的基本信息和权限信息
     */
    @Resource
    private RedisCacheService redisCacheService;

     @RequestMapping(value="getUserDataInsert",method =RequestMethod.POST,produces = "application/json;charset=UTF-8")
     public JSONResult getUserDataInsert(@RequestBody SysUser sysuser) {
         JSONResult result = null;
         try {
             String jsessionid = sysuser.getjSessionid();
             boolean faleg = redisCacheService.hasKey(jsessionid);
             if (faleg) {
                 System.err.print("start---:"+System.currentTimeMillis());
              /*   sysuser.setLoginName(LoginName);
                 sysuser.setPassword(password);*/
                 Map<String, Object> map = MyBeanUtils.bean2map(sysuser);
                 HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                 Map<Object, Object> str = http.doPost(URLConstants.USERINSERT, map, jsessionid);
                 result = JSONResult.success(str);
                 System.err.print("end----:"+System.currentTimeMillis());
                 return result;
             }
             result = JSONResult.lostCode("登录验证码过期");
         } catch (Exception e) {
             result= JSONResult.failure("服务器错误,请您联系系统管理员");
             e.printStackTrace();
         }
          return  result;
     }
}

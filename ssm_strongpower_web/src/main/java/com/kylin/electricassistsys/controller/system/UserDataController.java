package com.kylin.electricassistsys.controller.system;

import com.kylin.electricassistsys.model.SysUser;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.rsas.MD5Utils;
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
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
                 sysuser.setLoginName(MD5Utils.md5LoginName(sysuser.getLoginName()));
                 String salt = UUID.randomUUID().toString().replaceAll("-", "");
                 sysuser.setPasswordSalt(salt);
                 sysuser.setPassword(MD5Utils.createPassword(sysuser.getPassword(), salt, 2));
                 Map<String, Object> map = MyBeanUtils.bean2map(sysuser);
                 HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                 result = http.doPost(URLConstants.USERINSERT, map, jsessionid);
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

    /**
     * 获取用户的权限集
     * @return
     */
    @RequestMapping(value="/getlistRole",method =RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public JSONResult getlistRole(){
         JSONResult result = null;
         try {
             String jsessionid ="shiro-session-410a7460-eba1-4d14-8a4c-bee53f8844c6";
             Map map = new HashMap();
             map.put("page","1");
             map.put("rows","10");
             HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
             result = http.doPost(URLConstants.role, map, jsessionid);
           //  System.err.print("數據返回接口打印--"+str.toString());
             result=JSONResult.success();
         }catch (Exception e){
         }
         return result;
     }




}

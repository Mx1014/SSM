package com.kylin.electricassistsys.controller.system;

import com.kylin.electricassistsys.mybeanutils.JSONResult;
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
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: cwx
 * @Date: 2018/5/25 16:56
 * @Description: 用户登录数据信息,用户的权限信息请求接口
 */
@RestController
@RequestMapping("/user")
@Api(value = "/user", description = "用户登录数据信息,用户的权限信息请求接口", produces = MediaType.APPLICATION_JSON)
public class UserLoginDataController {
    private static final Logger LOG = LogManager.getLogger(UserLoginDataController.class);
    /**
     * 从redis查询用户的基本信息和权限信息
     */
    @Resource
    private RedisCacheService redisCacheService;

    /**
     * 用户登录
    * //@param loginName 用户名
    * //@param password 用户密码
     *
     * @return
     */
     @RequestMapping(value="/getUserLogin",method =RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public JSONResult getUserLogin( @RequestBody Map<String,Object>params){
         JSONResult result = null;
    try {
        Map json=new HashMap();
        json.put("loginName",params.get("loginName").toString());
        json.put("password",params.get("password").toString());
        json.put("platforms","1");
        HttpClientUtilsJsonObject http= new HttpClientUtilsJsonObject();
        Map<Object,Object> str=  http.doPost(URLConstants.LOGIN,json,null);
        System.err.println("登录数据--"+str.toString());
        LOG.info("登录数据--"+str.toString());
        result=JSONResult.success(str);
         }catch (Exception e){
             e.printStackTrace();
             result=JSONResult.failure("服务器错误,请您联系系统管理员");
      }
       return  result;
    }
    /**
     *
     * //@param id
     * params
     * @return
     */
    @RequestMapping(value="/getUserMenuLogin",method =RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public JSONResult getUserMenuLogin(@RequestBody Map<String,Object>params){
        JSONResult result = null;
        try {
            Map json=new HashMap();
            json.put("id",params.get("id").toString());
            String jsessionid =params.get("jsessionid").toString();
           boolean faleg= redisCacheService.hasKey(jsessionid);
           if(faleg){
               HttpClientUtilsJsonObject http= new HttpClientUtilsJsonObject();
               Map<Object,Object> str=  http.doPost(URLConstants.USERMENU,json,jsessionid);
               result=JSONResult.success(str);
               return  result;
           }
            result=JSONResult.lostCode("登录验证码过期");
        }catch (Exception e){
            e.printStackTrace();
        }
        return  result;
    }



}

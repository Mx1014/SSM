package com.kylin.electricassistsys.controller.system;

import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/25 16:56
 * @Description: 用户登录数据信息,用户的权限信息请求接口
 */
@RestController
@RequestMapping("user")
@Api(value = "user", description = "用户登录数据信息,用户的权限信息请求接口", produces = MediaType.APPLICATION_JSON)
public class UserLoginDataController {
    /**
     * 从redis查询用户的基本信息和权限信息
     */
    @Resource
    private RedisCacheService redisCacheService;

    /**
     * 用户登录
     * @param userName 用户名
     * @param passWord 用户密码
     * @param userCookie 用户 Jsession
     * @return
     */
     @RequestMapping("getUserLogin")
    public JSONResult getUserLogin(String userName,String passWord,String userCookie){
         JSONResult result = null;
         try {
           Object obj=  redisCacheService.get(userCookie);
           if(obj!=null){

           }


         }catch (Exception e){
             e.printStackTrace();
         }


      return  null;

    }


}

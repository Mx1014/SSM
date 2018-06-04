package com.kylin.electricassistsys.controller.test;

import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

/**
 * @Auther: whq
 * @Date: 2018/6/1 15:11
 * @Description:
 */
@RestController
@RequestMapping("login")
@Api(value = "login", description = "用户登录", produces = MediaType.APPLICATION_JSON)
public class LoginController {
    @RequestMapping("loginIn")
    public Object login(@RequestBody String username, @RequestBody String password){
        System.err.println("*******************************");
        System.out.println("########################"+username+password+"########################");
        System.err.println("*******************************");
        return JSONResult.success();
    }
}

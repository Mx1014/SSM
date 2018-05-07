package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGqlxDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TJcsjFqGqlxDataServerImpl;
import com.kylin.electricassistsys.server.impl.TJcsjSyfsDataServerImpl;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/syfs")
@Api(value = "syfs", description = "变电站属性", produces = MediaType.APPLICATION_JSON)
public class TJcsjSyfsDataController {
    @Resource
    private TJcsjSyfsDataServerImpl tJcsjSyfsDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("list")
    public List setList() {
        try {
            return tJcsjSyfsDataServerImpl.getList();
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }
    }
}

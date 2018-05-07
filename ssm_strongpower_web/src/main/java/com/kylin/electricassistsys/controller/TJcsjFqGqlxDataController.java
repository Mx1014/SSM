package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGdfqDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGqlxDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TJcsjFqGdfqDataServerImpl;
import com.kylin.electricassistsys.server.impl.TJcsjFqGqlxDataServerImpl;
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
@RequestMapping("/gqlx")
@Api(value = "gqlx", description = "供区类型划分", produces = MediaType.APPLICATION_JSON)
public class TJcsjFqGqlxDataController {
    @Resource
    private TJcsjFqGqlxDataServerImpl tJcsjFqGqlxDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Page getPages(@RequestBody TJcsjFqGqlxDto tJcsjFqGqlxDto) {
        Page page1 = new Page(tJcsjFqGqlxDto.getPage(), tJcsjFqGqlxDto.getLimit());
        return tJcsjFqGqlxDataServerImpl.getPages(page1, tJcsjFqGqlxDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TJcsjFqGqlxDto tJcsjFqGqlxDto) {
        try {
            tJcsjFqGqlxDataServerImpl.update(tJcsjFqGqlxDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("insert")
    public String insert(@RequestBody TJcsjFqGqlxDto tJcsjFqGqlxDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjFqGqlxDto.settGqlxId(uuidStr);
            tJcsjFqGqlxDataServerImpl.insert(tJcsjFqGqlxDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("list")
    public List setList() {
        try {
            return tJcsjFqGqlxDataServerImpl.getList();
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }


    @RequestMapping("del")
    public String delete(@RequestBody String id) {
        try {
            tJcsjFqGqlxDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGdfqDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TJcsjFqGdfqDataServerImpl;
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
@RequestMapping("/gdfq")
@Api(value = "gdfq", description = "供电分区", produces = MediaType.APPLICATION_JSON)
public class TJcsjFqGdfqDataController {
    @Resource
    private TJcsjFqGdfqDataServerImpl tJcsjFqGdfqDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Page getPages(@RequestBody TJcsjFqGdfqDto tJcsjFqGdfqDto) {
        Page page1 = new Page(tJcsjFqGdfqDto.getPage(), tJcsjFqGdfqDto.getLimit());
        return tJcsjFqGdfqDataServerImpl.getPages(page1, tJcsjFqGdfqDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TJcsjFqGdfqDto tJcsjFqGdfqDto) {
        try {
            tJcsjFqGdfqDataServerImpl.update(tJcsjFqGdfqDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("insert")
    public String insert(@RequestBody TJcsjFqGdfqDto tJcsjFqGdfqDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjFqGdfqDto.settGdfqId(uuidStr);
            tJcsjFqGdfqDataServerImpl.insert(tJcsjFqGdfqDto);
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
            return tJcsjFqGdfqDataServerImpl.getList();
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
            tJcsjFqGdfqDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

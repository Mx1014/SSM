package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjJxxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjJxxxDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TJcsjFqGqlxDataServerImpl;
import com.kylin.electricassistsys.server.impl.TJcsjJxxxDataServerImpl;
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
@RequestMapping("/jxxx")
@Api(value = "jxxx", description = "接线信息", produces = MediaType.APPLICATION_JSON)
public class TJcsjJxxxDataController {
    @Resource
    private TJcsjJxxxDataServerImpl tJcsjJxxxDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Page getPages(@RequestBody TJcsjJxxxDto tJcsjJxxxDto) {
        Page page1 = new Page(tJcsjJxxxDto.getPage(), tJcsjJxxxDto.getLimit());
        return tJcsjJxxxDataServerImpl.getPages(page1, tJcsjJxxxDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TJcsjJxxxDto tJcsjJxxxDto) {
        try {
            tJcsjJxxxDataServerImpl.update(tJcsjJxxxDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("insert")
    public String insert(@RequestBody TJcsjJxxxDto tJcsjJxxxDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjJxxxDto.settJxid(uuidStr);
            tJcsjJxxxDataServerImpl.insert(tJcsjJxxxDto);
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
            return tJcsjJxxxDataServerImpl.getList();
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
            tJcsjJxxxDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

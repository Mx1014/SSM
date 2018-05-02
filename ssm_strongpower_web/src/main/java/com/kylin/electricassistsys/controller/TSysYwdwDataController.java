package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ddsb.TDdsbBdzDto;
import com.kylin.electricassistsys.dto.tsys.TSysYwdwDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TSysDanweiDataServerImpl;
import com.kylin.electricassistsys.server.impl.TSysYwdwDataServerImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import scala.reflect.internal.Trees;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ywdw")
@Api(value = "Test信息", description = "用户信息", produces = MediaType.APPLICATION_JSON)
public class TSysYwdwDataController {
    @Resource
    private TSysYwdwDataServerImpl tSysYwdwDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "test用户提交", notes = "test用户提交", httpMethod = "POST", produces = MediaType.APPLICATION_JSON)
    @ApiImplicitParams(@ApiImplicitParam(name = "id", value = "test", dataType = "String"))
    public void add(@RequestBody String id) {
        // testDataServerImpl.add(id);
        redisCacheService.set("user_" + id, id);
    }

    @RequestMapping("list")
    public List<TSysYwdwDto> list() {

        return tSysYwdwDataServerImpl.getList();
    }

    @RequestMapping("page")
    public Page getPages(@RequestBody TSysYwdwDto tSysYwdwDto) {
        Page page1 = new Page(tSysYwdwDto.getPage(), tSysYwdwDto.getLimit());
        return tSysYwdwDataServerImpl.getPages(page1,tSysYwdwDto);
    }
    @RequestMapping(value = "update" , produces = "application/json;charset=UTF-8" ,method = RequestMethod.POST,headers = "Accept=application/json")
    public String update(@RequestBody TSysYwdwDto tSysYwdwDto) {
        try{
            tSysYwdwDataServerImpl.update(tSysYwdwDto);
            return "保存成功";
        }catch (Exception e){
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
    @RequestMapping("insert")
    public String insert(@RequestBody TSysYwdwDto tSysYwdwDto) {
        try{
            String uuidStr = UUID.randomUUID().toString().replace("-","").toLowerCase();
            tSysYwdwDto.settSysId(uuidStr);
            tSysYwdwDataServerImpl.insert(tSysYwdwDto);
            return "保存成功";
        }catch (Exception e){
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
    @RequestMapping("del")
    public String delete(@RequestBody String id) {
        try{
            tSysYwdwDataServerImpl.delete(id);
            return "保存成功";
        }catch (Exception e){
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

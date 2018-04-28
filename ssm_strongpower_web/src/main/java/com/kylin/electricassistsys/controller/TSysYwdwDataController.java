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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@RequestMapping("/ywdw")
@Api(value = "Test信息", description = "用户信息", produces = MediaType.APPLICATION_JSON)
public class TSysYwdwDataController {
    @Resource
    private TSysYwdwDataServerImpl tSysYwdwDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping(value = "add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    @ApiOperation(value = "test用户提交", notes = "test用户提交", httpMethod = "POST", produces = MediaType.APPLICATION_JSON)
    @ApiImplicitParams(@ApiImplicitParam(name = "id", value = "test", dataType = "String"))
    public void add(@RequestBody String id) {
        // testDataServerImpl.add(id);
        redisCacheService.set("user_" + id, id);
    }

    @RequestMapping("list")
    @ResponseBody
    public List<TSysYwdwDto> list() {

        return tSysYwdwDataServerImpl.getList();
    }

    @RequestMapping("page")
    @ResponseBody
    public Page getPages() {
        Page page = new Page(1, 5);
        return tSysYwdwDataServerImpl.getPages(page);
    }

}

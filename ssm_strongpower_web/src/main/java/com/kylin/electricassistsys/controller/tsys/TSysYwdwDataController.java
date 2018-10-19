package com.kylin.electricassistsys.controller.tsys;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsys.TSysYwdwDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.tsys.TSysYwdwDataServerImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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
    public JSONResult list() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tSysYwdwDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TSysYwdwDto tSysYwdwDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tSysYwdwDto.getPage(), tSysYwdwDto.getLimit());
            result = JSONResult.success(tSysYwdwDataServerImpl.getPages(page, tSysYwdwDto));
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TSysYwdwDto tSysYwdwDto) {
        JSONResult result = null;
        try {
            tSysYwdwDataServerImpl.update(tSysYwdwDto);
            result = JSONResult.success();
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TSysYwdwDto tSysYwdwDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tSysYwdwDto.settSysId(uuidStr);
            tSysYwdwDataServerImpl.insert(tSysYwdwDto);
            result = JSONResult.success();
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;


    }

    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tSysYwdwDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");

        }
        return result;


    }
}

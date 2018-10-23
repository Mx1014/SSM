package com.kylin.electricassistsys.controller.tsys;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsys.TSysModuleDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.tsys.TSysModuleDataServerImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/module")
@Api(value = "模块信息", description = "模块信息", produces = MediaType.APPLICATION_JSON)
public class TSysModuleDataController {
    @Resource
    private TSysModuleDataServerImpl tSysModuleDataServerImpl;
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
            result = JSONResult.success(tSysModuleDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TSysModuleDto tSysModuleDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tSysModuleDto.getPage(), tSysModuleDto.getLimit());
            result = JSONResult.success(tSysModuleDataServerImpl.getPages(page, tSysModuleDto));
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TSysModuleDto tSysModuleDto) {
        JSONResult result = null;
        try {
            tSysModuleDataServerImpl.update(tSysModuleDto);
            result = JSONResult.success();
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TSysModuleDto tSysModuleDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tSysModuleDto.setId(uuidStr);
            tSysModuleDataServerImpl.insert(tSysModuleDto);
            result = JSONResult.success();
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;


    }

    @RequestMapping("del")
    public JSONResult delete(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            tSysModuleDataServerImpl.delete(map.get("id").toString());
            result = JSONResult.success();
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");

        }
        return result;


    }
}

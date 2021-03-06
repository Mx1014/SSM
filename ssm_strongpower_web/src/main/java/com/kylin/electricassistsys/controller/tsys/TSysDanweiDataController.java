package com.kylin.electricassistsys.controller.tsys;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsys.TSysDanweiDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.tsys.TSysDanweiDataServerImpl;
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
@RequestMapping("/department")
@Api(value = "Test信息", description = "用户信息", produces = MediaType.APPLICATION_JSON)
public class TSysDanweiDataController {
    @Resource
    private TSysDanweiDataServerImpl tSysDanweiDataServerImpl;
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
    public JSONResult list() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tSysDanweiDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("page")
    @ResponseBody
    public JSONResult getPages() {
        JSONResult result = null;
        try {
            Page page = new Page(1, 5);
            result = JSONResult.success(tSysDanweiDataServerImpl.getPages(page));
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

}

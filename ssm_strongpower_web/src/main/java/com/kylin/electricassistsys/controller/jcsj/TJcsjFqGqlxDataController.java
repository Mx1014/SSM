package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGqlxDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.jcsj.TJcsjFqGqlxDataServerImpl;
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
    public JSONResult getPages(@RequestBody TJcsjFqGqlxDto tJcsjFqGqlxDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tJcsjFqGqlxDto.getPage(), tJcsjFqGqlxDto.getLimit());
            result = JSONResult.success(tJcsjFqGqlxDataServerImpl.getPages(page, tJcsjFqGqlxDto));
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjFqGqlxDto tJcsjFqGqlxDto) {
        JSONResult result = null;
        try {
            tJcsjFqGqlxDataServerImpl.update(tJcsjFqGqlxDto);
            result = JSONResult.success();
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjFqGqlxDto tJcsjFqGqlxDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjFqGqlxDto.settGqlxId(uuidStr);
            tJcsjFqGqlxDataServerImpl.insert(tJcsjFqGqlxDto);
            result = JSONResult.success();
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("list")
    public JSONResult setList() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tJcsjFqGqlxDataServerImpl.getList());
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjFqGqlxDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

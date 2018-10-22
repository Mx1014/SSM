package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsDycsDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.jcsj.TJcsjCsDycsDataServerImpl;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@RestController
@RequestMapping("/dycs")
@Api(value = "dycs", description = "电压参数", produces = MediaType.APPLICATION_JSON)
public class TJcsjCsDycsDataController {
    @Resource
    private TJcsjCsDycsDataServerImpl tJcsjCsDycsDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjCsDycsDto tJcsjCsDycsDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tJcsjCsDycsDto.getPage(), tJcsjCsDycsDto.getLimit());
            result = JSONResult.success(tJcsjCsDycsDataServerImpl.getPages(page, tJcsjCsDycsDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjCsDycsDto tJcsjCsDycsDto) {
        JSONResult result = null;
        try {
            tJcsjCsDycsDataServerImpl.update(tJcsjCsDycsDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjCsDycsDto tJcsjCsDycsDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjCsDycsDto.settDycsId(uuidStr);
            tJcsjCsDycsDataServerImpl.insert(tJcsjCsDycsDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("list")
    public JSONResult setList() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tJcsjCsDycsDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjCsDycsDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

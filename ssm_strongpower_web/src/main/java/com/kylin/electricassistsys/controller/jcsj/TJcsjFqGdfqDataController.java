package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjFqGdfqDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGdfqDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
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
    private TJcsjFqGdfqDataApi tJcsjFqGdfqDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping(value = "page", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
    public JSONResult getPages(@RequestBody TJcsjFqGdfqDto tJcsjFqGdfqDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tJcsjFqGdfqDto.getPage(), tJcsjFqGdfqDto.getLimit());
            result = JSONResult.success(tJcsjFqGdfqDataApi.getPages(page, tJcsjFqGdfqDto));
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjFqGdfqDto tJcsjFqGdfqDto) {
        JSONResult result = null;
        try {
            tJcsjFqGdfqDataApi.update(tJcsjFqGdfqDto);
            result = JSONResult.success();
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjFqGdfqDto tJcsjFqGdfqDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjFqGdfqDto.settGdfqId(uuidStr);
            tJcsjFqGdfqDataApi.insert(tJcsjFqGdfqDto);
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
            result = JSONResult.success(tJcsjFqGdfqDataApi.getList());
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
            tJcsjFqGdfqDataApi.delete(id);
            result = JSONResult.success();
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

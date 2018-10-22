package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjJxxxDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.jcsj.TJcsjJxxxDataServerImpl;
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
    public JSONResult getPages(@RequestBody TJcsjJxxxDto tJcsjJxxxDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tJcsjJxxxDto.getPage(), tJcsjJxxxDto.getLimit());
            result = JSONResult.success(tJcsjJxxxDataServerImpl.getPages(page, tJcsjJxxxDto));
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjJxxxDto tJcsjJxxxDto) {
        JSONResult result = null;
        try {
            tJcsjJxxxDataServerImpl.update(tJcsjJxxxDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjJxxxDto tJcsjJxxxDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjJxxxDto.settJxid(uuidStr);
            tJcsjJxxxDataServerImpl.insert(tJcsjJxxxDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("list")
    public JSONResult setList() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tJcsjJxxxDataServerImpl.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjJxxxDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

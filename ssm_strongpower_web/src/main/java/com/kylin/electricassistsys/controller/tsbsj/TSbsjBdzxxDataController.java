package com.kylin.electricassistsys.controller.tsbsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjBdzxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjBdzxxSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.tsbsj.TSbsjBdzxxDataServerImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
@RestController
@RequestMapping("bdzxx")
@Api(value = "bdzxx", description = "变电站信息", produces = MediaType.APPLICATION_JSON)
public class TSbsjBdzxxDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TSbsjBdzxxDataServerImpl tSbsjBdzxxDataServerImpl;

    @RequestMapping("list")
    public JSONResult list() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tSbsjBdzxxDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("alllist")
    public JSONResult allList(@RequestBody TSbsjBdzxxSelDto tSbsjBdzxxSelDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tSbsjBdzxxSelDto.getPage(), tSbsjBdzxxSelDto.getLimit());
            result = JSONResult.success(tSbsjBdzxxDataServerImpl.getAllList(page, tSbsjBdzxxSelDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TSbsjBdzxxDto tSbsjBdzxxDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tSbsjBdzxxDto.getPage(), tSbsjBdzxxDto.getLimit());
            result = JSONResult.success(tSbsjBdzxxDataServerImpl.getPages(page, tSbsjBdzxxDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TSbsjBdzxxDto tSbsjBdzxxDto) {
        JSONResult result = null;
        try {
            tSbsjBdzxxDataServerImpl.update(tSbsjBdzxxDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TSbsjBdzxxDto tSbsjBdzxxDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tSbsjBdzxxDto.settBdzxxId(uuidStr);
            tSbsjBdzxxDataServerImpl.insert(tSbsjBdzxxDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tSbsjBdzxxDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

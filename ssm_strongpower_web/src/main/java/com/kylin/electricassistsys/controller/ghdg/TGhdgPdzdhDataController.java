package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgPdzdhDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgPdzdhSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgPdzdhDataServerImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import java.util.UUID;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
@RestController
@RequestMapping("pdzdh")
@Api(value = "pdzdh", description = "配电自动化", produces = MediaType.APPLICATION_JSON)
public class TGhdgPdzdhDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgPdzdhDataServerImpl tGhdgPdzdhDataServerImpl;

    @RequestMapping("list")
    public JSONResult list() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tGhdgPdzdhDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("alllist")
    public JSONResult allList(@RequestBody TGhdgPdzdhSelDto tGhdgPdzdhSelDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgPdzdhSelDto.getPage(), tGhdgPdzdhSelDto.getLimit());
            result = JSONResult.success(tGhdgPdzdhDataServerImpl.getAllList(page, tGhdgPdzdhSelDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TGhdgPdzdhDto tGhdgPdzdhDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgPdzdhDto.getPage(), tGhdgPdzdhDto.getLimit());
            result = JSONResult.success(tGhdgPdzdhDataServerImpl.getPages(page, tGhdgPdzdhDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TGhdgPdzdhDto tGhdgPdzdhDto) {
        JSONResult result = null;
        try {
            tGhdgPdzdhDataServerImpl.update(tGhdgPdzdhDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TGhdgPdzdhDto tGhdgPdzdhDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgPdzdhDto.settPdzdhId(uuidStr);
            tGhdgPdzdhDataServerImpl.insert(tGhdgPdzdhDto);
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
            tGhdgPdzdhDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

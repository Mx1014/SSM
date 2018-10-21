package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgDwpbsbDataServerImpl;
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
@RequestMapping("dwpbsb")
@Api(value = "dwpbsb", description = "配电自动化", produces = MediaType.APPLICATION_JSON)
public class TGhdgDwpbsbDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgDwpbsbDataServerImpl tGhdgDwpbsbDataServerImpl;

    @RequestMapping("list")
    public JSONResult list() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tGhdgDwpbsbDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("alllist")
    public JSONResult allList(@RequestBody TGhdgDwpbsbSelDto tGhdgDwpbsbSelDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgDwpbsbSelDto.getPage(), tGhdgDwpbsbSelDto.getLimit());
            result = JSONResult.success(tGhdgDwpbsbDataServerImpl.getAllList(page, tGhdgDwpbsbSelDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TGhdgDwpbsbDto tGhdgDwpbsbDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgDwpbsbDto.getPage(), tGhdgDwpbsbDto.getLimit());
            result = JSONResult.success(tGhdgDwpbsbDataServerImpl.getPages(page, tGhdgDwpbsbDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TGhdgDwpbsbDto tGhdgDwpbsbDto) {
        JSONResult result = null;
        try {
            tGhdgDwpbsbDataServerImpl.update(tGhdgDwpbsbDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TGhdgDwpbsbDto tGhdgDwpbsbDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgDwpbsbDto.settDwpbsbId(uuidStr);
            tGhdgDwpbsbDataServerImpl.insert(tGhdgDwpbsbDto);
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
            tGhdgDwpbsbDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;


    }
}

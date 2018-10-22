package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwyxzbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwyxzbSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgDwyxzbDataServerImpl;
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
@RequestMapping("dwyxzb")
@Api(value = "dwyxzb", description = "电网运行指标", produces = MediaType.APPLICATION_JSON)
public class TGhdgDwyxzbDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgDwyxzbDataServerImpl tGhdgDwyxzbDataServerImpl;

    @RequestMapping("list")
    public JSONResult list() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tGhdgDwyxzbDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("alllist")
    public JSONResult allList(@RequestBody TGhdgDwyxzbSelDto tGhdgDwyxzbSelDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgDwyxzbSelDto.getPage(), tGhdgDwyxzbSelDto.getLimit());
            result = JSONResult.success(tGhdgDwyxzbDataServerImpl.getAllList(page, tGhdgDwyxzbSelDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TGhdgDwyxzbDto tGhdgDwyxzbDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgDwyxzbDto.getPage(), tGhdgDwyxzbDto.getLimit());
            result = JSONResult.success(tGhdgDwyxzbDataServerImpl.getPages(page, tGhdgDwyxzbDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TGhdgDwyxzbDto tGhdgDwyxzbDto) {
        JSONResult result = null;
        try {
            tGhdgDwyxzbDataServerImpl.update(tGhdgDwyxzbDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TGhdgDwyxzbDto tGhdgDwyxzbDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgDwyxzbDto.settDwyxzbId(uuidStr);
            tGhdgDwyxzbDataServerImpl.insert(tGhdgDwyxzbDto);
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
            tGhdgDwyxzbDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;


    }
}

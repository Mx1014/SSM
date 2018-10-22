package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgJmfbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgJmfbSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgJmfbDataServerImpl;
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
@RequestMapping("jmfb")
@Api(value = "jmfb", description = "导线截面分布", produces = MediaType.APPLICATION_JSON)
public class TGhdgJmfbDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgJmfbDataServerImpl tGhdgJmfbDataServerImpl;

    @RequestMapping("list")
    public JSONResult list() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tGhdgJmfbDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("alllist")
    public JSONResult allList(@RequestBody TGhdgJmfbSelDto tGhdgJmfbSelDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgJmfbSelDto.getPage(), tGhdgJmfbSelDto.getLimit());
            result = JSONResult.success(tGhdgJmfbDataServerImpl.getAllList(page, tGhdgJmfbSelDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TGhdgJmfbDto tGhdgJmfbDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgJmfbDto.getPage(), tGhdgJmfbDto.getLimit());
            result = JSONResult.success(tGhdgJmfbDataServerImpl.getPages(page, tGhdgJmfbDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TGhdgJmfbDto tGhdgJmfbDto) {
        JSONResult result = null;
        try {
            tGhdgJmfbDataServerImpl.update(tGhdgJmfbDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TGhdgJmfbDto tGhdgJmfbDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgJmfbDto.settJmfbId(uuidStr);
            tGhdgJmfbDataServerImpl.insert(tGhdgJmfbDto);
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
            tGhdgJmfbDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }
}

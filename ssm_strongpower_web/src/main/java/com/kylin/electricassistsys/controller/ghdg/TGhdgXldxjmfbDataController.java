package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgXldxjmfbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgXldxjmfbSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgXldxjmfbDataServerImpl;
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
@RequestMapping("xldxjmfb")
@Api(value = "xldxjmfb", description = "导线截面", produces = MediaType.APPLICATION_JSON)
public class TGhdgXldxjmfbDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgXldxjmfbDataServerImpl tGhdgXldxjmfbDataServerImpl;

    @RequestMapping("list")
    public JSONResult list() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tGhdgXldxjmfbDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("alllist")
    public JSONResult allList(@RequestBody TGhdgXldxjmfbSelDto tGhdgXldxjmfbSelDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgXldxjmfbSelDto.getPage(), tGhdgXldxjmfbSelDto.getLimit());
            result = JSONResult.success(tGhdgXldxjmfbDataServerImpl.getAllList(page, tGhdgXldxjmfbSelDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TGhdgXldxjmfbDto tGhdgXldxjmfbDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgXldxjmfbDto.getPage(), tGhdgXldxjmfbDto.getLimit());
            result = JSONResult.success(tGhdgXldxjmfbDataServerImpl.getPages(page, tGhdgXldxjmfbDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TGhdgXldxjmfbDto tGhdgXldxjmfbDto) {
        JSONResult result = null;
        try {
            tGhdgXldxjmfbDataServerImpl.update(tGhdgXldxjmfbDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TGhdgXldxjmfbDto tGhdgXldxjmfbDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgXldxjmfbDto.settXldxjmfbId(uuidStr);
            tGhdgXldxjmfbDataServerImpl.insert(tGhdgXldxjmfbDto);
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
            tGhdgXldxjmfbDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;


    }
}

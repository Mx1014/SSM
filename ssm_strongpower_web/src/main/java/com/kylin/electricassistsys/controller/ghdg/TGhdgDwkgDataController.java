package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgDwkgDataServerImpl;
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
@RequestMapping("dwkg")
@Api(value = "dwkg", description = "电网开关", produces = MediaType.APPLICATION_JSON)
public class TGhdgDwkgDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgDwkgDataServerImpl tGhdgDwkgDataServerImpl;

    @RequestMapping("list")
    public JSONResult list() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tGhdgDwkgDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("alllist")
    public JSONResult allList(@RequestBody TGhdgDwkgSelDto tGhdgDwkgSelDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgDwkgSelDto.getPage(), tGhdgDwkgSelDto.getLimit());
            result = JSONResult.success(tGhdgDwkgDataServerImpl.getAllList(page, tGhdgDwkgSelDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TGhdgDwkgDto tGhdgDwkgDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tGhdgDwkgDto.getPage(), tGhdgDwkgDto.getLimit());
            result = JSONResult.success(tGhdgDwkgDataServerImpl.getPages(page, tGhdgDwkgDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TGhdgDwkgDto tGhdgDwkgDto) {
        JSONResult result = null;
        try {
            tGhdgDwkgDataServerImpl.update(tGhdgDwkgDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TGhdgDwkgDto tGhdgDwkgDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgDwkgDto.settDwkgId(uuidStr);
            tGhdgDwkgDataServerImpl.insert(tGhdgDwkgDto);
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
            tGhdgDwkgDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;


    }
}

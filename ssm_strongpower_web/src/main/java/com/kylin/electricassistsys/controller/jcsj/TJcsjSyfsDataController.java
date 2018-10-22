package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjSyfsDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.jcsj.TJcsjSyfsDataServerImpl;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: whq
 * @ClassName: TJcsjSyfsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 使用方式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/syfs")
@Api(value = "syfs", description = "使用方式", produces = MediaType.APPLICATION_JSON)
public class TJcsjSyfsDataController {
    @Resource
    private TJcsjSyfsDataServerImpl tJcsjSyfsDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjSyfsDto tJcsjSyfsDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tJcsjSyfsDto.getPage(), tJcsjSyfsDto.getLimit());
            result = JSONResult.success(tJcsjSyfsDataServerImpl.getPages(page, tJcsjSyfsDto));
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjSyfsDto tJcsjSyfsDto) {
        JSONResult result = null;
        try {
            tJcsjSyfsDataServerImpl.update(tJcsjSyfsDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjSyfsDto tJcsjSyfsDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjSyfsDto.settSyfsId(uuidStr);
            tJcsjSyfsDataServerImpl.insert(tJcsjSyfsDto);
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
            result = JSONResult.success(tJcsjSyfsDataServerImpl.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjSyfsDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

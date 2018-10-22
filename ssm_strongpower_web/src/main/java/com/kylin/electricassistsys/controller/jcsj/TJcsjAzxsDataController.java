package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjAzxsDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.jcsj.TJcsjAzxsDataServerImpl;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

/**
 * @Auther: whq
 * @ClassName: TJcsjAzxsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 安装形式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/azxs")
@Api(value = "azxs", description = "安装形式", produces = MediaType.APPLICATION_JSON)
public class TJcsjAzxsDataController {
    @Resource
    private TJcsjAzxsDataServerImpl tJcsjAzxsDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjAzxsDto tJcsjAzxsDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tJcsjAzxsDto.getPage(), tJcsjAzxsDto.getLimit());
            result = JSONResult.success(tJcsjAzxsDataServerImpl.getPages(page, tJcsjAzxsDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjAzxsDto tJcsjAzxsDto) {
        JSONResult result = null;
        try {
            tJcsjAzxsDataServerImpl.update(tJcsjAzxsDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;


    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjAzxsDto tJcsjAzxsDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjAzxsDto.settAzxsId(uuidStr);
            tJcsjAzxsDataServerImpl.insert(tJcsjAzxsDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("list")
    public JSONResult setList() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tJcsjAzxsDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjAzxsDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }
}

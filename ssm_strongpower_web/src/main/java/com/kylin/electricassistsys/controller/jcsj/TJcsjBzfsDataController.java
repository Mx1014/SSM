package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjBzfsDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.jcsj.TJcsjBzfsDataServerImpl;
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
 * @ClassName: TJcsjBzfsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 布置方式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/bzfs")
@Api(value = "bzfs", description = "布置方式", produces = MediaType.APPLICATION_JSON)
public class TJcsjBzfsDataController {
    @Resource
    private TJcsjBzfsDataServerImpl tJcsjBzfsDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjBzfsDto tJcsjBzfsDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tJcsjBzfsDto.getPage(), tJcsjBzfsDto.getLimit());
            result = JSONResult.success(tJcsjBzfsDataServerImpl.getPages(page, tJcsjBzfsDto));
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjBzfsDto tJcsjBzfsDto) {
        JSONResult result = null;
        try {
            tJcsjBzfsDataServerImpl.update(tJcsjBzfsDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjBzfsDto tJcsjBzfsDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjBzfsDto.settBzfsId(uuidStr);
            tJcsjBzfsDataServerImpl.insert(tJcsjBzfsDto);
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
            result = JSONResult.success(tJcsjBzfsDataServerImpl.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjBzfsDataServerImpl.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("batchDel")
    public JSONResult batchDelete(@RequestBody String ids) {
        JSONResult result = null;
        try {
            tJcsjBzfsDataServerImpl.batchDelete(ids);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

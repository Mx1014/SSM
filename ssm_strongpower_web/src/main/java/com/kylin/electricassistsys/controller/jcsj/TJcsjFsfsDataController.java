package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjFsfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFsfsDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: whq
 * @ClassName: TJcsjFsfsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 敷设方式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/fsfs")
@Api(value = "fsfs", description = "敷设方式", produces = MediaType.APPLICATION_JSON)
public class TJcsjFsfsDataController {
    @Resource
    private TJcsjFsfsDataApi tJcsjFsfsDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjFsfsDto tJcsjFsfsDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjFsfsDataApi.getPages(new Page(tJcsjFsfsDto.getPage(), tJcsjFsfsDto.getLimit()), tJcsjFsfsDto);
            result = JSONResult.success(page);
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjFsfsDto tJcsjFsfsDto) {
        JSONResult result = null;
        try {
            tJcsjFsfsDataApi.update(tJcsjFsfsDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjFsfsDto tJcsjFsfsDto) {
        JSONResult result = null;
        try {
            tJcsjFsfsDataApi.insert(tJcsjFsfsDto);
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
            result = JSONResult.success(tJcsjFsfsDataApi.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjFsfsDataApi.delete(id);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("batchDel")
    public JSONResult batchDelete(@RequestBody String ids) {
        JSONResult result = null;
        try {
            tJcsjFsfsDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

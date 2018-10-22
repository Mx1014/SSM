package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjCtbbDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCtbbDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
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
 * @ClassName: TJcsjCtbbDataController
 * @Date: 2018/5/10 9:07
 * @Description: CT变比控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/ctbb")
@Api(value = "ctbb", description = "CT变比", produces = MediaType.APPLICATION_JSON)
public class TJcsjCtbbDataController {
    @Resource
    private TJcsjCtbbDataApi tJcsjCtbbDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjCtbbDto tJcsjCtbbDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjCtbbDataApi.getPages(new Page(tJcsjCtbbDto.getPage(), tJcsjCtbbDto.getLimit()), tJcsjCtbbDto);
            result = JSONResult.success(page);
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjCtbbDto tJcsjCtbbDto) {
        JSONResult result = null;
        try {
            tJcsjCtbbDataApi.update(tJcsjCtbbDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjCtbbDto tJcsjCtbbDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjCtbbDto.settCtbbId(uuidStr);
            tJcsjCtbbDataApi.insert(tJcsjCtbbDto);
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
            result = JSONResult.success(tJcsjCtbbDataApi.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjCtbbDataApi.delete(id);
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
            tJcsjCtbbDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

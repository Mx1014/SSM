package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjCsByqcsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsByqcsDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsByqcsSelDto;
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
 * @ClassName: TJcsjCsByqcsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 导线参数控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/byqcs")
@Api(value = "byqcs", description = "导线参数", produces = MediaType.APPLICATION_JSON)
public class TJcsjCsByqcsDataController {
    @Resource
    private TJcsjCsByqcsDataApi tJcsjCsByqcsDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjCsByqcsSelDto tJcsjCsByqcsSelDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjCsByqcsDataApi.getPages(new Page(tJcsjCsByqcsSelDto.getPage(), tJcsjCsByqcsSelDto.getLimit()), tJcsjCsByqcsSelDto);
            result = JSONResult.success(page);
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjCsByqcsDto tJcsjCsByqcsDto) {
        JSONResult result = null;
        try {
            tJcsjCsByqcsDataApi.update(tJcsjCsByqcsDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjCsByqcsDto tJcsjCsByqcsDto) {
        JSONResult result = null;
        try {
            tJcsjCsByqcsDataApi.insert(tJcsjCsByqcsDto);
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
            result = JSONResult.success(tJcsjCsByqcsDataApi.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjCsByqcsDataApi.delete(id);
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
            tJcsjCsByqcsDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

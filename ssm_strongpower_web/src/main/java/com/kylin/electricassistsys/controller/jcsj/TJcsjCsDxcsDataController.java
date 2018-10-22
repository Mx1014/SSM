package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjCsDxcsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsDxcsDto;
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
 * @ClassName: TJcsjCsDxcsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 变压器参数控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/dxcs")
@Api(value = "dxcs", description = "变压器参数", produces = MediaType.APPLICATION_JSON)
public class TJcsjCsDxcsDataController {
    @Resource
    private TJcsjCsDxcsDataApi tJcsjCsDxcsDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjCsDxcsDto tJcsjCsDxcsDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjCsDxcsDataApi.getPages(new Page(tJcsjCsDxcsDto.getPage(), tJcsjCsDxcsDto.getLimit()), tJcsjCsDxcsDto);
            result = JSONResult.success(page);
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjCsDxcsDto tJcsjCsDxcsDto) {
        JSONResult result = null;
        try {
            tJcsjCsDxcsDataApi.update(tJcsjCsDxcsDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjCsDxcsDto tJcsjCsDxcsDto) {
        JSONResult result = null;
        try {
            tJcsjCsDxcsDataApi.insert(tJcsjCsDxcsDto);
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
            result = JSONResult.success(tJcsjCsDxcsDataApi.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjCsDxcsDataApi.delete(id);
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
            tJcsjCsDxcsDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

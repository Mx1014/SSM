package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjCsByqcsDataApi;
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
    public Object getPages(@RequestBody TJcsjCsByqcsSelDto tJcsjCsByqcsSelDto) {
        JSONResult jsonResult = null;
        try {
            Page page = tJcsjCsByqcsDataApi.getPages(new Page(tJcsjCsByqcsSelDto.getPage(), tJcsjCsByqcsSelDto.getLimit()), tJcsjCsByqcsSelDto);
            jsonResult = JSONResult.success(page);
        } catch (Exception e) {
            jsonResult = JSONResult.failure("服务器错误请联系管理员");
        }
        return jsonResult;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public Object update(@RequestBody TJcsjCsByqcsDto tJcsjCsByqcsDto) {
        try {
            tJcsjCsByqcsDataApi.update(tJcsjCsByqcsDto);
            return JSONResult.success("更新成功");
        } catch (Exception e) {
            return JSONResult.failure("更新失败");
        }


    }

    @RequestMapping("insert")
    public Object insert(@RequestBody TJcsjCsByqcsDto tJcsjCsByqcsDto) {
        try {
            tJcsjCsByqcsDataApi.insert(tJcsjCsByqcsDto);
            return JSONResult.success("保存成功");
        } catch (Exception e) {
            return JSONResult.failure("保存失败");
        }


    }

    @RequestMapping("list")
    public Object setList() {
        try {
            return JSONResult.success(tJcsjCsByqcsDataApi.getList());
        } catch (Exception e) {
            return JSONResult.failure("服务器错误请联系管理员");
        }
    }


    @RequestMapping("del")
    public Object delete(@RequestBody String id) {
        try {
            tJcsjCsByqcsDataApi.delete(id);
            return JSONResult.success("删除成功");
        } catch (Exception e) {
            return JSONResult.failure("删除失败");
        }


    }

    @RequestMapping("batchDel")
    public Object batchDelete(@RequestBody String ids) {
        try {
            tJcsjCsByqcsDataApi.batchDelete(ids);
            return JSONResult.success("批量删除成功");
        } catch (Exception e) {
            return JSONResult.failure("批量删除失败");
        }


    }
}

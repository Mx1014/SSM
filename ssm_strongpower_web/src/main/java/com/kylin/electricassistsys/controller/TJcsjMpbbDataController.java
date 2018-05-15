package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjMpbbDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjMpbbDto;
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
 * @ClassName: TJcsjMpbbDataController
 * @Date: 2018/5/10 9:07
 * @Description: 铭牌变比控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/mpbb")
@Api(value = "mpbb", description = "铭牌变比", produces = MediaType.APPLICATION_JSON)
public class TJcsjMpbbDataController {
    @Resource
    private TJcsjMpbbDataApi tJcsjMpbbDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Object getPages(@RequestBody TJcsjMpbbDto tJcsjMpbbDto) {
        JSONResult jsonResult = null;
        try {
            Page page = tJcsjMpbbDataApi.getPages(new Page(tJcsjMpbbDto.getPage(), tJcsjMpbbDto.getLimit()), tJcsjMpbbDto);
            jsonResult = JSONResult.success(page);
        } catch (Exception e) {
            jsonResult = JSONResult.failure("服务器错误请联系管理员");
        }
        return jsonResult;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public Object update(@RequestBody TJcsjMpbbDto tJcsjMpbbDto) {
        try {
            tJcsjMpbbDataApi.update(tJcsjMpbbDto);
            return JSONResult.success("更新成功");
        } catch (Exception e) {
            return JSONResult.failure("更新失败");
        }


    }

    @RequestMapping("insert")
    public Object insert(@RequestBody TJcsjMpbbDto tJcsjMpbbDto) {
        try {
            tJcsjMpbbDataApi.insert(tJcsjMpbbDto);
            return JSONResult.success("保存成功");
        } catch (Exception e) {
            return JSONResult.failure("保存失败");
        }


    }

    @RequestMapping("list")
    public Object setList() {
        try {
            return JSONResult.success(tJcsjMpbbDataApi.getList());
        } catch (Exception e) {
            return JSONResult.failure("服务器错误请联系管理员");
        }
    }


    @RequestMapping("del")
    public Object delete(@RequestBody String id) {
        try {
            tJcsjMpbbDataApi.delete(id);
            return JSONResult.success("删除成功");
        } catch (Exception e) {
            return JSONResult.failure("删除失败");
        }


    }

    @RequestMapping("batchDel")
    public Object batchDelete(@RequestBody String ids) {
        try {
            tJcsjMpbbDataApi.batchDelete(ids);
            return JSONResult.success("批量删除成功");
        } catch (Exception e) {
            return JSONResult.failure("批量删除失败");
        }


    }
}

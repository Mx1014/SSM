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
    public Object getPages(@RequestBody TJcsjFsfsDto tJcsjFsfsDto) {
        JSONResult jsonResult = null;
        try {
            Page page = tJcsjFsfsDataApi.getPages(new Page(tJcsjFsfsDto.getPage(), tJcsjFsfsDto.getLimit()), tJcsjFsfsDto);
            jsonResult = JSONResult.success(page);
        } catch (Exception e) {
            jsonResult = JSONResult.failure("服务器错误请联系管理员");
        }
        return jsonResult;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public Object update(@RequestBody TJcsjFsfsDto tJcsjFsfsDto) {
        try {
            tJcsjFsfsDataApi.update(tJcsjFsfsDto);
            return JSONResult.success("更新成功");
        } catch (Exception e) {
            return JSONResult.failure("更新失败");
        }


    }

    @RequestMapping("insert")
    public Object insert(@RequestBody TJcsjFsfsDto tJcsjFsfsDto) {
        try {
            tJcsjFsfsDataApi.insert(tJcsjFsfsDto);
            return JSONResult.success("保存成功");
        } catch (Exception e) {
            return JSONResult.failure("保存失败");
        }


    }

    @RequestMapping("list")
    public Object setList() {
        try {
            return JSONResult.success(tJcsjFsfsDataApi.getList());
        } catch (Exception e) {
            return JSONResult.failure("服务器错误请联系管理员");
        }
    }


    @RequestMapping("del")
    public Object delete(@RequestBody String id) {
        try {
            tJcsjFsfsDataApi.delete(id);
            return JSONResult.success("删除成功");
        } catch (Exception e) {
            return JSONResult.failure("删除失败");
        }


    }

    @RequestMapping("batchDel")
    public Object batchDelete(@RequestBody String ids) {
        try {
            tJcsjFsfsDataApi.batchDelete(ids);
            return JSONResult.success("批量删除成功");
        } catch (Exception e) {
            return JSONResult.failure("批量删除失败");
        }


    }
}

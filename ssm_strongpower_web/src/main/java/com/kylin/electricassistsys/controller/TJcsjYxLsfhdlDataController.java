package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjYxLsfhdlDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxLsfhdlDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxLsfhdlSelDto;
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
 * @ClassName: TJcsjYxLsfhdlDataController
 * @Date: 2018/5/10 9:07
 * @Description: 历史负荷电量信息控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/lsfhdl")
@Api(value = "lsfhdl", description = "历史负荷电量信息", produces = MediaType.APPLICATION_JSON)
public class TJcsjYxLsfhdlDataController {
    @Resource
    private TJcsjYxLsfhdlDataApi tJcsjYxLsfhdlDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Object getPages(@RequestBody TJcsjYxLsfhdlSelDto tJcsjYxLsfhdlSelDto) {
        JSONResult jsonResult = null;
        try {
            Page page = tJcsjYxLsfhdlDataApi.getPages(new Page(tJcsjYxLsfhdlSelDto.getPage(), tJcsjYxLsfhdlSelDto.getLimit()), tJcsjYxLsfhdlSelDto);
            jsonResult = JSONResult.success(page);
        } catch (Exception e) {
            System.err.println(e);
            jsonResult = JSONResult.failure("服务器错误请联系管理员");
        }
        return jsonResult;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public Object update(@RequestBody TJcsjYxLsfhdlDto tJcsjYxLsfhdlDto) {
        try {
            tJcsjYxLsfhdlDataApi.update(tJcsjYxLsfhdlDto);
            return JSONResult.success("更新成功");
        } catch (Exception e) {
            return JSONResult.failure("更新失败");
        }


    }

    @RequestMapping("insert")
    public Object insert(@RequestBody TJcsjYxLsfhdlDto tJcsjYxLsfhdlDto) {
        try {
            tJcsjYxLsfhdlDataApi.insert(tJcsjYxLsfhdlDto);
            return JSONResult.success("保存成功");
        } catch (Exception e) {
            return JSONResult.failure("保存失败");
        }


    }

    @RequestMapping("list")
    public Object setList() {
        try {
            return JSONResult.success(tJcsjYxLsfhdlDataApi.getList());
        } catch (Exception e) {
            return JSONResult.failure("服务器错误请联系管理员");
        }
    }


    @RequestMapping("del")
    public Object delete(@RequestBody String id) {
        try {
            tJcsjYxLsfhdlDataApi.delete(id);
            return JSONResult.success("删除成功");
        } catch (Exception e) {
            return JSONResult.failure("删除失败");
        }


    }

    @RequestMapping("batchDel")
    public Object batchDelete(@RequestBody String ids) {
        try {
            tJcsjYxLsfhdlDataApi.batchDelete(ids);
            return JSONResult.success("批量删除成功");
        } catch (Exception e) {
            return JSONResult.failure("批量删除失败");
        }


    }
}

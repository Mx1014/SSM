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
    public Object getPages(@RequestBody TJcsjCsDxcsDto tJcsjCsDxcsDto) {
        JSONResult jsonResult = null;
        try {
            Page page = tJcsjCsDxcsDataApi.getPages(new Page(tJcsjCsDxcsDto.getPage(), tJcsjCsDxcsDto.getLimit()), tJcsjCsDxcsDto);
            jsonResult = JSONResult.success(page);
        } catch (Exception e) {
            jsonResult = JSONResult.failure("服务器错误请联系管理员");
        }
        return jsonResult;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public Object update(@RequestBody TJcsjCsDxcsDto tJcsjCsDxcsDto) {
        try {
            tJcsjCsDxcsDataApi.update(tJcsjCsDxcsDto);
            return JSONResult.success("更新成功");
        } catch (Exception e) {
            return JSONResult.failure("更新失败");
        }


    }

    @RequestMapping("insert")
    public Object insert(@RequestBody TJcsjCsDxcsDto tJcsjCsDxcsDto) {
        try {
            tJcsjCsDxcsDataApi.insert(tJcsjCsDxcsDto);
            return JSONResult.success("保存成功");
        } catch (Exception e) {
            return JSONResult.failure("保存失败");
        }


    }

    @RequestMapping("list")
    public Object setList() {
        try {
            return JSONResult.success(tJcsjCsDxcsDataApi.getList());
        } catch (Exception e) {
            return JSONResult.failure("服务器错误请联系管理员");
        }
    }


    @RequestMapping("del")
    public Object delete(@RequestBody String id) {
        try {
            tJcsjCsDxcsDataApi.delete(id);
            return JSONResult.success("删除成功");
        } catch (Exception e) {
            return JSONResult.failure("删除失败");
        }


    }

    @RequestMapping("batchDel")
    public Object batchDelete(@RequestBody String ids) {
        try {
            tJcsjCsDxcsDataApi.batchDelete(ids);
            return JSONResult.success("批量删除成功");
        } catch (Exception e) {
            return JSONResult.failure("批量删除失败");
        }


    }
}

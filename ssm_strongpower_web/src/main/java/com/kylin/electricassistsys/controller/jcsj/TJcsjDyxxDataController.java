package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjDyxxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDyxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDyxxSelDto;
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
 * @ClassName: TJcsjDyxxDataController
 * @Date: 2018/5/10 9:07
 * @Description: 电源信息控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/dyxx")
@Api(value = "dyxx", description = "电源信息", produces = MediaType.APPLICATION_JSON)
public class TJcsjDyxxDataController {
    @Resource
    private TJcsjDyxxDataApi tJcsjDyxxDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjDyxxSelDto tJcsjDyxxSelDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjDyxxDataApi.getPages(new Page(tJcsjDyxxSelDto.getPage(), tJcsjDyxxSelDto.getLimit()), tJcsjDyxxSelDto);
            result = JSONResult.success(page);
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjDyxxDto tJcsjDyxxDto) {
        JSONResult result = null;
        try {
            tJcsjDyxxDataApi.update(tJcsjDyxxDto);
            result = JSONResult.success();
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjDyxxDto tJcsjDyxxDto) {
        JSONResult result = null;
        try {
            tJcsjDyxxDataApi.insert(tJcsjDyxxDto);
            result = JSONResult.success();
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("list")
    public JSONResult setList() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tJcsjDyxxDataApi.getList());
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjDyxxDataApi.delete(id);
            result = JSONResult.success();
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("batchDel")
    public JSONResult batchDelete(@RequestBody String ids) {
        JSONResult result = null;
        try {
            tJcsjDyxxDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            System.err.println(e);
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

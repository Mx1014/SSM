package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjDylxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDylxDto;
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
 * @ClassName: TJcsjDylxDataController
 * @Date: 2018/5/10 9:07
 * @Description: 电源类型控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/dylx")
@Api(value = "dylx", description = "电源类型", produces = MediaType.APPLICATION_JSON)
public class TJcsjDylxDataController {
    @Resource
    private TJcsjDylxDataApi tJcsjDylxDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjDylxDto tJcsjDylxSelDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjDylxDataApi.getPages(new Page(tJcsjDylxSelDto.getPage(), tJcsjDylxSelDto.getLimit()), tJcsjDylxSelDto);
            result = JSONResult.success(page);
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjDylxDto tJcsjDylxDto) {
        JSONResult result = null;
        try {
            tJcsjDylxDataApi.update(tJcsjDylxDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjDylxDto tJcsjDylxDto) {
        JSONResult result = null;
        try {
            tJcsjDylxDataApi.insert(tJcsjDylxDto);
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
            result = JSONResult.success(tJcsjDylxDataApi.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjDylxDataApi.delete(id);
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
            tJcsjDylxDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

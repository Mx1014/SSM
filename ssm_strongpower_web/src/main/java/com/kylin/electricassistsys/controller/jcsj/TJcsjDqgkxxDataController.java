package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjDqgkxxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDqgkxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDqgkxxSelDto;
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
 * @ClassName: TJcsjDqgkxxDataController
 * @Date: 2018/5/10 9:07
 * @Description: 地区概况信息控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/dqgkxx")
@Api(value = "dqgkxx", description = "地区概况信息", produces = MediaType.APPLICATION_JSON)
public class TJcsjDqgkxxDataController {
    @Resource
    private TJcsjDqgkxxDataApi tJcsjDqgkxxDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjDqgkxxSelDto tJcsjDqgkxxSelDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjDqgkxxDataApi.getPages(new Page(tJcsjDqgkxxSelDto.getPage(), tJcsjDqgkxxSelDto.getLimit()), tJcsjDqgkxxSelDto);
            result = JSONResult.success(page);
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjDqgkxxDto tJcsjDqgkxxDto) {
        JSONResult result = null;
        try {
            tJcsjDqgkxxDataApi.update(tJcsjDqgkxxDto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjDqgkxxDto tJcsjDqgkxxDto) {
        JSONResult result = null;
        try {
            tJcsjDqgkxxDataApi.insert(tJcsjDqgkxxDto);
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
            result = JSONResult.success(tJcsjDqgkxxDataApi.getList());
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjDqgkxxDataApi.delete(id);
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
            tJcsjDqgkxxDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjXmxzDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjXmxzDto;
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
 * @ClassName: TJcsjXmxzDataController
 * @Date: 2018/5/10 9:07
 * @Description: 项目性质控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/xmxz")
@Api(value = "xmxz", description = "项目性质", produces = MediaType.APPLICATION_JSON)
public class TJcsjXmxzDataController {
    @Resource
    private TJcsjXmxzDataApi tJcsjXmxzDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjXmxzDto tJcsjXmxzDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjXmxzDataApi.getPages(new Page(tJcsjXmxzDto.getPage(), tJcsjXmxzDto.getLimit()), tJcsjXmxzDto);
            result = JSONResult.success(page);
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjXmxzDto tJcsjXmxzDto) {
        JSONResult result = null;
        try {
            tJcsjXmxzDataApi.update(tJcsjXmxzDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjXmxzDto tJcsjXmxzDto) {
        JSONResult result = null;
        try {
            tJcsjXmxzDataApi.insert(tJcsjXmxzDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("list")
    public JSONResult setList() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tJcsjXmxzDataApi.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjXmxzDataApi.delete(id);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("batchDel")
    public JSONResult batchDelete(@RequestBody String ids) {
        JSONResult result = null;
        try {
            tJcsjXmxzDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjMpbbDataApi;
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
    public JSONResult getPages(@RequestBody TJcsjMpbbDto tJcsjMpbbDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjMpbbDataApi.getPages(new Page(tJcsjMpbbDto.getPage(), tJcsjMpbbDto.getLimit()), tJcsjMpbbDto);
            result = JSONResult.success(page);
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjMpbbDto tJcsjMpbbDto) {
        JSONResult result = null;
        try {
            tJcsjMpbbDataApi.update(tJcsjMpbbDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjMpbbDto tJcsjMpbbDto) {
        JSONResult result = null;
        try {
            tJcsjMpbbDataApi.insert(tJcsjMpbbDto);
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
            result = JSONResult.success(tJcsjMpbbDataApi.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjMpbbDataApi.delete(id);
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
            tJcsjMpbbDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

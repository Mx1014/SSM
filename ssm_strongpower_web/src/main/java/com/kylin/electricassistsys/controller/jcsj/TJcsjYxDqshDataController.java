package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjYxDqshDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxDqshDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxDqshSelDto;
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
 * @ClassName: TJcsjYxDqshDataController
 * @Date: 2018/5/10 9:07
 * @Description: 地区经济和社会信息控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/dqsh")
@Api(value = "dqsh", description = "地区经济和社会信息", produces = MediaType.APPLICATION_JSON)
public class TJcsjYxDqshDataController {
    @Resource
    private TJcsjYxDqshDataApi tJcsjYxDqshDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjYxDqshSelDto tJcsjYxDqshSelDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjYxDqshDataApi.getPages(new Page(tJcsjYxDqshSelDto.getPage(), tJcsjYxDqshSelDto.getLimit()), tJcsjYxDqshSelDto);
            result = JSONResult.success(page);
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjYxDqshDto tJcsjYxDqshDto) {
        JSONResult result = null;
        try {
            tJcsjYxDqshDataApi.update(tJcsjYxDqshDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjYxDqshDto tJcsjYxDqshDto) {
        JSONResult result = null;
        try {
            tJcsjYxDqshDataApi.insert(tJcsjYxDqshDto);
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
            result = JSONResult.success(tJcsjYxDqshDataApi.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjYxDqshDataApi.delete(id);
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
            tJcsjYxDqshDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjZjxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZjxDto;
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
 * @ClassName: TJcsjZjxDataController
 * @Date: 2018/5/10 9:07
 * @Description: 主接线控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/zjx")
@Api(value = "zjx", description = "主接线", produces = MediaType.APPLICATION_JSON)
public class TJcsjZjxDataController {
    @Resource
    private TJcsjZjxDataApi tJcsjZjxDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Object getPages(@RequestBody TJcsjZjxDto tJcsjZjxDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjZjxDataApi.getPages(new Page(tJcsjZjxDto.getPage(), tJcsjZjxDto.getLimit()), tJcsjZjxDto);
            result = JSONResult.success(page);
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjZjxDto tJcsjZjxDto) {
        JSONResult result = null;
        try {
            tJcsjZjxDataApi.update(tJcsjZjxDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjZjxDto tJcsjZjxDto) {
        JSONResult result = null;
        try {
            tJcsjZjxDataApi.insert(tJcsjZjxDto);
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
            result = JSONResult.success(tJcsjZjxDataApi.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjZjxDataApi.delete(id);
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
            tJcsjZjxDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

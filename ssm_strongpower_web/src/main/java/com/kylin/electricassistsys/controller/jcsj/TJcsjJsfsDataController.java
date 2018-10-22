package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjJsfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjJsfsDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

/**
 * @Auther: whq
 * @ClassName: TJcsjJsfsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 架设方式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/jsfs")
@Api(value = "jsfs", description = "架设方式", produces = MediaType.APPLICATION_JSON)
public class TJcsjJsfsDataController {
    @Resource
    private TJcsjJsfsDataApi tJcsjJsfsDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Object getPages(@RequestBody TJcsjJsfsDto tJcsjJsfsDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjJsfsDataApi.getPages(new Page(tJcsjJsfsDto.getPage(), tJcsjJsfsDto.getLimit()), tJcsjJsfsDto);
            result = JSONResult.success(page);
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjJsfsDto tJcsjJsfsDto) {
        JSONResult result = null;
        try {
            tJcsjJsfsDataApi.update(tJcsjJsfsDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjJsfsDto tJcsjJsfsDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjJsfsDto.settJsfsId(uuidStr);
            tJcsjJsfsDataApi.insert(tJcsjJsfsDto);
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
            result = JSONResult.success(tJcsjJsfsDataApi.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjJsfsDataApi.delete(id);
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
            tJcsjJsfsDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

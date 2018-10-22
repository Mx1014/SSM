package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjTyfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjTyfsDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: whq
 * @ClassName: TJcsjTyfsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 调压方式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/tyfs")
@Api(value = "tyfs", description = "调压方式", produces = MediaType.APPLICATION_JSON)
public class TJcsjTyfsDataController {
    @Resource
    private TJcsjTyfsDataApi tJcsjTyfsDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjTyfsDto tJcsjTyfsDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tJcsjTyfsDto.getPage(), tJcsjTyfsDto.getLimit());
            result = JSONResult.success(tJcsjTyfsDataApi.getPages(page, tJcsjTyfsDto));
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjTyfsDto tJcsjTyfsDto) {
        JSONResult result = null;
        try {
            tJcsjTyfsDataApi.update(tJcsjTyfsDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjTyfsDto tJcsjTyfsDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjTyfsDto.settTyfsId(uuidStr);
            tJcsjTyfsDataApi.insert(tJcsjTyfsDto);
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
            result = JSONResult.success(tJcsjTyfsDataApi.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjTyfsDataApi.delete(id);
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
            tJcsjTyfsDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

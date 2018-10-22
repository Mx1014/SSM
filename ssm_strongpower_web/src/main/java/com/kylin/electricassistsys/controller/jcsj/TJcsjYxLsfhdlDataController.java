package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjYxLsfhdlDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxLsfhdlDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxLsfhdlSelDto;
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
 * @ClassName: TJcsjYxLsfhdlDataController
 * @Date: 2018/5/10 9:07
 * @Description: 历史负荷电量信息控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/lsfhdl")
@Api(value = "lsfhdl", description = "历史负荷电量信息", produces = MediaType.APPLICATION_JSON)
public class TJcsjYxLsfhdlDataController {
    @Resource
    private TJcsjYxLsfhdlDataApi tJcsjYxLsfhdlDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjYxLsfhdlSelDto tJcsjYxLsfhdlSelDto) {
        JSONResult result = null;
        try {
            Page page = tJcsjYxLsfhdlDataApi.getPages(new Page(tJcsjYxLsfhdlSelDto.getPage(), tJcsjYxLsfhdlSelDto.getLimit()), tJcsjYxLsfhdlSelDto);
            result = JSONResult.success(page);
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjYxLsfhdlDto tJcsjYxLsfhdlDto) {
        JSONResult result = null;
        try {
            tJcsjYxLsfhdlDataApi.update(tJcsjYxLsfhdlDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjYxLsfhdlDto tJcsjYxLsfhdlDto) {
        JSONResult result = null;
        try {
            tJcsjYxLsfhdlDataApi.insert(tJcsjYxLsfhdlDto);
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
            result = JSONResult.success(tJcsjYxLsfhdlDataApi.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjYxLsfhdlDataApi.delete(id);
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
            tJcsjYxLsfhdlDataApi.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

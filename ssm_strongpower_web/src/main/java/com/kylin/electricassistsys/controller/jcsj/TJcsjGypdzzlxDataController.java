package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjGypdzzlxDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.jcsj.TJcsjGypdzzlxDataServerImpl;
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
 * @ClassName: TJcsjGypdzzlxDataController
 * @Date: 2018/5/10 9:07
 * @Description: 高压配电装置类型控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/gypdzzlx")
@Api(value = "gypdzzlx", description = "高压配电装置类型", produces = MediaType.APPLICATION_JSON)
public class TJcsjGypdzzlxDataController {
    @Resource
    private TJcsjGypdzzlxDataServerImpl tJcsjGypdzzlxDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjGypdzzlxDto tJcsjGypdzzlxDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tJcsjGypdzzlxDto.getPage(), tJcsjGypdzzlxDto.getLimit());
            result = JSONResult.success(tJcsjGypdzzlxDataServerImpl.getPages(page, tJcsjGypdzzlxDto));
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public JSONResult update(@RequestBody TJcsjGypdzzlxDto tJcsjGypdzzlxDto) {
        JSONResult result = null;
        try {
            tJcsjGypdzzlxDataServerImpl.update(tJcsjGypdzzlxDto);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("insert")
    public JSONResult insert(@RequestBody TJcsjGypdzzlxDto tJcsjGypdzzlxDto) {
        JSONResult result = null;
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjGypdzzlxDto.settGypdzzlxId(uuidStr);
            tJcsjGypdzzlxDataServerImpl.insert(tJcsjGypdzzlxDto);
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
            result = JSONResult.success(tJcsjGypdzzlxDataServerImpl.getList());
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


    @RequestMapping("del")
    public JSONResult delete(@RequestBody String id) {
        JSONResult result = null;
        try {
            tJcsjGypdzzlxDataServerImpl.delete(id);
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
            tJcsjGypdzzlxDataServerImpl.batchDelete(ids);
            result = JSONResult.success();
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

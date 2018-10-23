package com.kylin.electricassistsys.controller.tsys;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tsys.TSystemLogApi;
import com.kylin.electricassistsys.dto.system.TSystemLogDto;
import com.kylin.electricassistsys.dto.tsys.TSysYwdwDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * 系统日志请求类
 * cwx
 * 2018/5/11
 */
@RestController
@RequestMapping("/systemlog")
@Api(value = "系统日志", description = "系统日志", produces = MediaType.APPLICATION_JSON)
public class TSystemLogController {
    @Resource
    TSystemLogApi tSystemLogApi;

    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TSystemLogDto tSystemLogDto) {
        JSONResult result = null;
        try {
            Page page = new Page(tSystemLogDto.getPage(), tSystemLogDto.getLimit());
            result = JSONResult.success(tSystemLogApi.getPages(page, tSystemLogDto));
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

}

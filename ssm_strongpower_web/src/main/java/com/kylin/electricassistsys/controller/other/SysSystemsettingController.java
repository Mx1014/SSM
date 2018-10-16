package com.kylin.electricassistsys.controller.other;

import com.kylin.electricassistsys.data.api.other.SysSystemsettingApi;
import com.kylin.electricassistsys.dto.other.SysSystemsettingDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

/**
 * @Auther: whq
 * @Date: 2018/10/12 08:56
 * @Description:
 */
@RestController
@RequestMapping("/systemsetting")
@Api(value = "systemsetting", description = "系统设置数据接口处理类", produces = MediaType.APPLICATION_JSON)
public class SysSystemsettingController {
    @Autowired
    private SysSystemsettingApi systemsettingApi;

    @RequestMapping("getResult")
    public JSONResult selectSystemsettingList() {
        JSONResult result = null;
        try {
            result = JSONResult.success(systemsettingApi.selectSystemsettingResult());
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    @RequestMapping("setData")
    public JSONResult setSystemsettingData(@RequestBody SysSystemsettingDto dto) {
        JSONResult result = null;
        try {
            systemsettingApi.saveOrUpdate(dto);
            result = JSONResult.success();
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

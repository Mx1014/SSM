package com.kylin.electricassistsys.controller.other;

import com.kylin.electricassistsys.data.api.other.PieDataApi;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

/**
 * @Auther: whq
 * @Date: 2018/10/12 08:56
 * @Description:
 */
@RestController
@RequestMapping("/pie")
@Api(value = "pie", description = "饼图数据接口处理类", produces = MediaType.APPLICATION_JSON)
public class PieDataController {
    @Autowired
    private PieDataApi pieDataApi;

    @RequestMapping("bdztypestatistics")
    public JSONResult selectBdzTypeStatistics() {
        JSONResult result = null;
        try {
            result = JSONResult.success(pieDataApi.selectBdzTypeResult());
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    @RequestMapping("xlxxgyzystatistics")
    public JSONResult selectXlxxGyZyStatistics() {
        JSONResult result = null;
        try {
            result = JSONResult.success(pieDataApi.selectXlxxGyZyResult());
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

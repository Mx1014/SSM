package com.kylin.electricassistsys.controller.newlyadded;


import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.newlyadded.ResourceManagementDataApi;
import com.kylin.electricassistsys.dto.newlyadded.ResourceManagementDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/23 15:46
 * @Description:资源管理数据接口处理类
 */
@RestController
@RequestMapping("/resourcemanagement")
@Api(value = "resourcemanagement", description = "资源管理数据接口处理类", produces = MediaType.APPLICATION_JSON)
public class ResourceManagementDataController {
    @Resource
    private ResourceManagementDataApi resourceManagementDataApi;

    /**
     * 220kv间隔管理
     * @return
     */
    @RequestMapping("selectPage220Kv")
    public JSONResult selectPage220Kv( @RequestBody ResourceManagementDto dto){
        JSONResult result = null;
        try {
            Page page = new Page(dto.getPage(), dto.getLimit());
            result=JSONResult.success(resourceManagementDataApi.selectPage220Kv(page,dto));
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
         return  result;
    }
    /**
     * 110kv间隔管理
     * @return
     */
    @RequestMapping("selectPage110Kv")
    public JSONResult selectPage110Kv(@RequestBody ResourceManagementDto dto){
        JSONResult result = null;
        try {
            Page page = new Page(dto.getPage(), dto.getLimit());
            result=JSONResult.success(resourceManagementDataApi.selectPage110Kv(page,dto));
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return  result;
    }
    /**
     * 35kv间隔管理
     * @return
     */
    @RequestMapping("selectPage35Kv")
    public JSONResult selectPage35Kv(@RequestBody ResourceManagementDto dto){
        JSONResult result = null;
        try {
            Page page = new Page(dto.getPage(), dto.getLimit());
            result=JSONResult.success(resourceManagementDataApi.selectPage35Kv(page,dto));
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return  result;
    }
    /**
     * 10kv间隔管理
     * @return
     */
    @RequestMapping("selectPage10Kv")
    public JSONResult selectPage10Kv(@RequestBody ResourceManagementDto dto){
        JSONResult result = null;
        try {
           // JSESSIONID=shiro-session-121f7ed5-a620-43d1-b98f-0ac9fa67f4c4;

            Page page = new Page(dto.getPage(), dto.getLimit());
            result=JSONResult.success(resourceManagementDataApi.selectPage10Kv(page,dto));
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return  result;
    }

    /**
     * 根据主键id进行删除数据
     * @param id
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result = null;
        try {
            resourceManagementDataApi.deleteById(id);
            result=JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return  result;
    }

    /**
     * 根据主键id进行批量删除
     * @param ids
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result = null;
        try {
            resourceManagementDataApi.deleteBatchIds(ids);
            result =JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");

        }
        return  result;

    }












}

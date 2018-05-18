package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TSbsjZyllxxxDataApi;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjZyllxxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjZyllxxxSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 14:10
 * @Description: 中压鏈路线路信息接口業務請求類
 */
@RestController
@RequestMapping("zyllxxx")
@Api(value = "zyllxxx", description = "中压鏈路线路信息接口業務請求類", produces = MediaType.APPLICATION_JSON)
public class TSbsjZyllxxxDataController {
    /**
     * 中压鏈路线路信息接口
     */
    @Resource
    private TSbsjZyllxxxDataApi tSbsjZyllxxxDataApi;
    /**
     * 动态查询中压鏈路线路信息进行分页
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TSbsjZyllxxxSelDto dto){
        JSONResult result =null;
        try {
            Page page =   tSbsjZyllxxxDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
            result=JSONResult.success(page);
        }catch (Throwable  e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result ;
    }

    /**
     *
     * 添加中压线鏈路路信息指标数据
     * @return
     */
    @RequestMapping("insert")
    public JSONResult saveData(@RequestBody TSbsjZyllxxxDto dto){
        JSONResult result =null;
        try {
            tSbsjZyllxxxDataApi.insert(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }
    /**
     *
     * 删除根据id中压鏈路线路信息指标数据
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;
        try {
            tSbsjZyllxxxDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 中压鏈路线路信息指标数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tSbsjZyllxxxDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }

        return result;
    }
    /**
     *
     * 更新用中压鏈路线路信息数据
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TSbsjZyllxxxDto dto){
        JSONResult result=null;
        try {
            tSbsjZyllxxxDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    /**
     *
     * 更新用中压鏈路线路信息数据
     * @return
     */
    @RequestMapping("list")
    public JSONResult listData(){
        JSONResult result=null;
        try {
            result=JSONResult.success(tSbsjZyllxxxDataApi.getList());
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }



}

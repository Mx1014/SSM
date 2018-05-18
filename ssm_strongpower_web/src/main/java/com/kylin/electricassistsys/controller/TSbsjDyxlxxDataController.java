package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TSbsjDyxlxxDataApi;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjDyxlxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjDyxlxxSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 16:02
 * @Description: 低壓綫路信息接口請求類
 */
@RestController
@RequestMapping("/dyxlxx")
@Api(value = "dyxlxx", description = "低壓綫路信息接口請求類", produces = MediaType.APPLICATION_JSON)
public class TSbsjDyxlxxDataController {
    @Resource
 private TSbsjDyxlxxDataApi  tSbsjDyxlxxDataApi;

    /**
     * 动态查询低壓綫路信息进行分页
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TSbsjDyxlxxSelDto dto){
        JSONResult result =null;
        try {
            Page page =   tSbsjDyxlxxDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
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
    public JSONResult saveData(@RequestBody TSbsjDyxlxxDto dto){
        JSONResult result =null;
        try {
            tSbsjDyxlxxDataApi.insert(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }
    /**
     *
     * 删除根据id低壓綫路信息指标数据
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;
        try {
            tSbsjDyxlxxDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 低壓綫路信息指标数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tSbsjDyxlxxDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }

        return result;
    }
    /**
     *
     * 更新用低壓綫路信息数据
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TSbsjDyxlxxDto dto){
        JSONResult result=null;
        try {
            tSbsjDyxlxxDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    /**
     *
     * 更新用低壓綫路信息数据
     * @return
     */
    @RequestMapping("list")
    public JSONResult listData(){
        JSONResult result=null;
        try {
            result=JSONResult.success(tSbsjDyxlxxDataApi.getList());
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

}

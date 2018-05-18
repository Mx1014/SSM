package com.kylin.electricassistsys.controller.tjisuan;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tjisuan.TJisuanXlnDataApi;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanXlnDto;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanXlnSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/18 16:09
 * @Description: 中压线路N-1校验接口業務請求類
 */
@RestController
@RequestMapping("/jisuanxln")
@Api(value = "jisuanxln", description = "中压线路N-1校验接口業務請求類", produces = MediaType.APPLICATION_JSON)
public class TJisuanXlnDataController {
    @Resource
    private TJisuanXlnDataApi tJisuanXlnDataApi;

    /**
     * 动态查询中压线路N-1校验进行分页
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJisuanXlnSelDto dto){
        JSONResult result =null;
        try {
            Page page =   tJisuanXlnDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
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
    public JSONResult saveData(@RequestBody TJisuanXlnDto dto){
        JSONResult result =null;
        try {
            tJisuanXlnDataApi.insert(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }
    /**
     *
     * 删除根据id中压线路N-1校验指标数据
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;
        try {
            tJisuanXlnDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 中压线路N-1校验指标数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tJisuanXlnDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }

        return result;
    }
    /**
     *
     * 更新用中压线路N-1校验数据
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TJisuanXlnDto dto){
        JSONResult result=null;
        try {
            tJisuanXlnDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    /**
     *
     * 更新用中压线路N-1校验数据
     * @return
     */
    @RequestMapping("list")
    public JSONResult listData(){
        JSONResult result=null;
        try {
            result=JSONResult.success(tJisuanXlnDataApi.getList());
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
 
}

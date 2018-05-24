package com.kylin.electricassistsys.controller.tyx;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tyx.TYxGyxljfdlDataApi;
import com.kylin.electricassistsys.dto.tyx.TYxGyxljfdlDto;
import com.kylin.electricassistsys.dto.tyx.TYxGyxljfdlSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/24 16:10
 * @Description: 高压线路电量信息接口请求类
 */
@RestController
@RequestMapping("/gyxljfdl")
@Api(value = "/gyxljfdl", description = "高压线路电量信息接口请求类", produces = MediaType.APPLICATION_JSON)
public class TYxGyxljfdlDataController {
    @Resource
    private TYxGyxljfdlDataApi tYxGyxljfdlDataApi;
    
   /**
     * 动态查询高压线路电量信息进行分页
     * @param dto
     * @return
             */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TYxGyxljfdlSelDto dto){
        JSONResult result =null;
        try {
            Page page =   tYxGyxljfdlDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
            result=JSONResult.success(page);
        }catch (Throwable  e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result ;
    }

    /**
     *
     * 添加高压线路电量信息指标数据
     * @return
     */
    @RequestMapping("insert")
    public JSONResult saveData(@RequestBody TYxGyxljfdlDto dto){
        JSONResult result =null;
        try {
            tYxGyxljfdlDataApi.insert(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }
    /**
     *
     * 删除根据id高压线路电量信息
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;
        try {
            tYxGyxljfdlDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
            JSONResult.failure("服务器错误请联系管理员");

        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 高压线路电量信息数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tYxGyxljfdlDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }

        return result;
    }
    /**
     *
     * 更新用高压线路电量信息数据
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TYxGyxljfdlDto dto){
        JSONResult result=null;
        try {
            tYxGyxljfdlDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    /**
     *
     * 更新高压线路电量信息
     * @return
     */
    @RequestMapping("list")
    public JSONResult listData(){
        JSONResult result=null;
        try {
            result=JSONResult.success(tYxGyxljfdlDataApi.getList());
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

}

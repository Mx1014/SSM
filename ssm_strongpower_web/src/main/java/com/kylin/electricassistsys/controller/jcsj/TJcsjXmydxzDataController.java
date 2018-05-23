package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjXmydxzDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjXmydxzDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: whq
 * @Date: 2018/5/17 10:15
 * @Description:项目用电性质请求类
 */
@RestController
@RequestMapping("/xmydxz")
@Api(value = "xmydxz", description = "项目用电性质请求类", produces = MediaType.APPLICATION_JSON)
public class TJcsjXmydxzDataController {
    /**
     * 项目用电性质接口请求
     */
    @Resource
    private TJcsjXmydxzDataApi tJcsjXmydxzDataApi;
    /**
     * 动态查询进行分页
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjXmydxzDto dto){
        JSONResult result =null;
        try {
            Page page =   tJcsjXmydxzDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
            result=JSONResult.success(page);
        }catch (Throwable  e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result ;
    }

    /**
     *
     * 添加项目用电性质数据
     * @return
     */
    @RequestMapping("insert")
    public JSONResult saveData(@RequestBody TJcsjXmydxzDto dto){
        JSONResult result =null;
        try {
            tJcsjXmydxzDataApi.insert(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }
    /**
     * 获取项目用电性质数据列表
     * @param
     * @return
     */
    @RequestMapping("list")
    public JSONResult getList() {
        try {
            return JSONResult.success(tJcsjXmydxzDataApi.getList());
        } catch (Exception e) {
            return JSONResult.failure("服务器错误请联系管理员");
        }
    }
    /**
     *
     * 删除根据id项目用电性质数据
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;
        try {
            tJcsjXmydxzDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 项目用电性质数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tJcsjXmydxzDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }

        return result;

    }
    /**
     *
     * 更新项目用电性质数据
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TJcsjXmydxzDto dto){
        JSONResult result=null;
        try {
            tJcsjXmydxzDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


}

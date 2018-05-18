package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjZyyhxxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZyyhxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZyyhxxSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 10:15
 * @Description:用户重要信息请求类
 */
@RestController
@RequestMapping("/zyyhxx")
@Api(value = "zyyhxx", description = "用户重要信息请求类", produces = MediaType.APPLICATION_JSON)
public class TJcsjZyyhxxDataController {
    /**
     * 用户重要信息接口请求
     */
    @Resource
    private TJcsjZyyhxxDataApi tJcsjZyyhxxDataApi;
    /**
     * 动态查询进行分页
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjZyyhxxSelDto dto){
        JSONResult result =null;
        try {
            Page page =   tJcsjZyyhxxDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
            result=JSONResult.success(page);
        }catch (Throwable  e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result ;
    }

    /**
     *
     * 添加用户重要信息指标数据
     * @return
     */
    @RequestMapping("insert")
    public JSONResult saveData(@RequestBody TJcsjZyyhxxDto dto){
        JSONResult result =null;
        try {
            tJcsjZyyhxxDataApi.insert(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }
    /**
     *
     * 删除根据id用户重要信息指标数据
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;
        try {
            tJcsjZyyhxxDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 用户重要信息指标数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tJcsjZyyhxxDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }

        return result;

    }
    /**
     *
     * 更新用户重要信息运行指标数据
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TJcsjZyyhxxDto dto){
        JSONResult result=null;
        try {
            tJcsjZyyhxxDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }


}

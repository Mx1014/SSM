package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjZypwyxzbDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZypwyxzbDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZypwyxzbSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * 查询中压配网运行指标及分析请求类
 *
 *
 */
@RestController
@RequestMapping("/zypwyxzb")
@Api(value = "zypwyxzb", description = "查询中压配网运行指标及分析请求类", produces = MediaType.APPLICATION_JSON)
public class TJcsjZypwyxzbDataController {
    /**
     * 查询中压配网运行指标及分析接口
     */
    @Resource
    private TJcsjZypwyxzbDataApi tJcsjZypwyxzbDataApi;

    /**
     * 动态查询进行分页
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJcsjZypwyxzbSelDto dto){
        JSONResult result =null;
        try {
            Page page =   tJcsjZypwyxzbDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
            result=JSONResult.success(page);
        }catch (Throwable  e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
      return result ;
      }

    /**
     *
     * 添加中压配网运行指标数据
     * @return
     */
      @RequestMapping("insert")
    public JSONResult saveData(@RequestBody TJcsjZypwyxzbDto dto){
          JSONResult result =null;
          try {
              tJcsjZypwyxzbDataApi.insert(dto);
              result=JSONResult.success();
          }catch (Throwable e){
              result=JSONResult.failure("服务器错误请联系管理员");
          }
      return result;

    }
    /**
     *
     * 删除根据id中压配网运行指标数据
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;
        try {
            tJcsjZypwyxzbDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 中压配网运行指标数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tJcsjZypwyxzbDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }

        return result;

    }
    /**
     *
     * 更新中压配网运行指标数据
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TJcsjZypwyxzbDto dto){
        JSONResult result=null;
        try {
            tJcsjZypwyxzbDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

}

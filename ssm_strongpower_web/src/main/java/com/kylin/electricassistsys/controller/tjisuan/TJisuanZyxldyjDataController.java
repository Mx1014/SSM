package com.kylin.electricassistsys.controller.tjisuan;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tjisuan.TJisuanZyxldyjDataApi;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanZyxldyjDto;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanZyxldyjSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/22 14:25
 * @Description:中压线路电压降 接口请求类
 */
@RestController
@RequestMapping("/zyxldyj")
@Api(value = "zyxldyj", description = "中压线路电压降 接口请求类", produces = MediaType.APPLICATION_JSON)
public class TJisuanZyxldyjDataController {
    @Resource 
    private TJisuanZyxldyjDataApi  tJisuanZyxldyjDataApi;

    /**
     * 动态查询中压线路电压降行分页
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TJisuanZyxldyjSelDto dto){
        JSONResult result =null;
        try {
            Page page =   tJisuanZyxldyjDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
            result=JSONResult.success(page);
        }catch (Throwable  e){
            result=JSONResult.failure("服务器错误请联系管理员");
            e.printStackTrace();
        }
        return result ;
    }

    /**
     *
     * 添加中压线路电压降指标数据
     * @return
     */
    @RequestMapping("insert")
    public JSONResult saveData(@RequestBody TJisuanZyxldyjDto dto){
        JSONResult result =null;
        try {
            tJisuanZyxldyjDataApi.insert(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
            e.printStackTrace();
        }
        return result;

    }
    /**
     *
     * 删除根据id中压线路电压降数据
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;

        try {
            tJisuanZyxldyjDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
            e.printStackTrace();
        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 中压线路电压降数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tJisuanZyxldyjDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
            e.printStackTrace();
        }

        return result;
    }
    /**
     *
     * 更新用中压线路电压降数据
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TJisuanZyxldyjDto dto){
        JSONResult result=null;
        try {
            tJisuanZyxldyjDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
            e.printStackTrace();
        }
        return result;
    }

    /**
     *
     * 更新用中压线路电压降数据
     * @return
     */
    @RequestMapping("list")
    public JSONResult listData(){
        JSONResult result=null;
        try {
            result=JSONResult.success(tJisuanZyxldyjDataApi.getList());
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
            e.printStackTrace();
        }
        return result;
    }


}

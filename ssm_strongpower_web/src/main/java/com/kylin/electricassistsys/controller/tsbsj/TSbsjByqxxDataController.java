package com.kylin.electricassistsys.controller.tsbsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tsbsj.TSbsjByqxxDataApi;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjByqxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjByqxxSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
/**
 * @Auther: cwx
 * @Date: 2018/5/18 14:58
 * @Description:变压器信息接口业务請求類
 */
@RestController
@RequestMapping("/byqxx")
@Api(value = "/byqxx", description = "变压器信息接口业务請求類", produces = MediaType.APPLICATION_JSON)
public class TSbsjByqxxDataController {
    @Resource
    private TSbsjByqxxDataApi  tSbsjByqxxDataApi;
    /**
     * 动态查询变压器信息进行分页
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TSbsjByqxxSelDto dto){
        JSONResult result =null;
        try {
            Page page =   tSbsjByqxxDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
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
    public JSONResult saveData(@RequestBody TSbsjByqxxDto dto){
        JSONResult result =null;
        try {
            tSbsjByqxxDataApi.insert(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    /**
     *
     * 删除根据id变压器信息指标数据
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;
        try {
            tSbsjByqxxDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 变压器信息指标数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tSbsjByqxxDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
    /**
     *
     * 更新用变压器信息数据
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TSbsjByqxxDto dto){
        JSONResult result=null;
        try {
            tSbsjByqxxDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    /**
     *
     * 更新用变压器信息数据
     * @return
     */
    @RequestMapping("list")
    public JSONResult listData(){
        JSONResult result=null;
        try {
            result=JSONResult.success(tSbsjByqxxDataApi.getList());
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }
}

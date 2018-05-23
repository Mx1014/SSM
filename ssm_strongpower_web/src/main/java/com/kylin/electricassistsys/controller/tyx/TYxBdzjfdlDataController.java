package com.kylin.electricassistsys.controller.tyx;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tyx.TYxBdzjfdlDataApi;
import com.kylin.electricassistsys.dto.tyx.TYxBdzjfdlDto;
import com.kylin.electricassistsys.dto.tyx.TYxBdzjfdlSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/22 10:58
 * @Description: 变电站运行数据接口类請求類--變電站積分電量
 */
@RestController
@RequestMapping("/yxsjbdz")
@Api(value = "/yxsjbdz", description = "变电站运行数据接口类請求類--變電站積分電量", produces = MediaType.APPLICATION_JSON)
public class TYxBdzjfdlDataController {
    @Resource
    private TYxBdzjfdlDataApi tYxBdzjfdlDataApi;

    /**
     * 动态查询变电站运行数据进行分页
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TYxBdzjfdlSelDto dto){
        JSONResult result =null;
        try {
            Page page =   tYxBdzjfdlDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()),dto);
            result=JSONResult.success(page);
        }catch (Throwable  e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result ;
    }

    /**
     *
     * 添加变电站运行数据指标数据
     * @return
     */
    @RequestMapping("insert")
    public JSONResult saveData(@RequestBody TYxBdzjfdlDto dto){
        JSONResult result =null;
        try {
            tYxBdzjfdlDataApi.insert(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }
    /**
     *
     * 删除根据id变电站运行数据
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id){
        JSONResult result =null;
        try {
            tYxBdzjfdlDataApi.delete(id);
            result=JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
            JSONResult.failure("服务器错误请联系管理员");

        }
        return result;
    }
    /**
     *
     * 根据id进行批量删除 变电站运行数据数据
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids){
        JSONResult result=null;
        try {
            tYxBdzjfdlDataApi.deleteBatchIds(ids);
            result=JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
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
    public JSONResult updateData(@RequestBody TYxBdzjfdlDto dto){
        JSONResult result=null;
        try {
            tYxBdzjfdlDataApi.update(dto);
            result=JSONResult.success();
        }catch (Throwable e){
            e.printStackTrace();
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    /**
     *
     * 更新变电站运行数据
     * @return
     */
    @RequestMapping("list")
    public JSONResult listData(){
        JSONResult result=null;
        try {
            result=JSONResult.success(tYxBdzjfdlDataApi.getList());
        }catch (Throwable e){
            result=JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

}

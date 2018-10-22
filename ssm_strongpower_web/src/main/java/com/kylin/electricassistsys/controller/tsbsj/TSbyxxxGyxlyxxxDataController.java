package com.kylin.electricassistsys.controller.tsbsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tsbsj.TSbyxxxGyxlyxxxDataApi;
import com.kylin.electricassistsys.dto.tsbsj.TSbyxxxGyxlyxxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbyxxxGyxlyxxxSelDto;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;

/**
 * @Auther: cwx
 * @Date: 2018/5/22 16:53
 * @Description: 高压线路信息列表接口请求类
 */
@RestController
@RequestMapping("/gyxlyxxx")
@Api(value = "/gyxlyxxx", description = "高压线路信息列表接口请求类", produces = MediaType.APPLICATION_JSON)
public class TSbyxxxGyxlyxxxDataController {
    @Resource
    private TSbyxxxGyxlyxxxDataApi tSbyxxxGyxlyxxxDataApi;

    /**
     * 动态查询变电站运行数据进行分页
     *
     * @param dto
     * @return
     */
    @RequestMapping("page")
    public JSONResult getPages(@RequestBody TSbyxxxGyxlyxxxSelDto dto) {
        JSONResult result = null;
        try {
            Page page = tSbyxxxGyxlyxxxDataApi.selectPage(new Page(dto.getPage(), dto.getLimit()), dto);
            result = JSONResult.success(page);
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

    /**
     * 添加变电站运行数据指标数据
     *
     * @return
     */
    @RequestMapping("insert")
    public JSONResult saveData(@RequestBody TSbyxxxGyxlyxxxDto dto) {
        JSONResult result = null;
        try {
            tSbyxxxGyxlyxxxDataApi.insert(dto);
            result = JSONResult.success();
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;

    }

    /**
     * 删除根据id变电站运行数据
     *
     * @return
     */
    @RequestMapping("del")
    public JSONResult delData(@RequestBody String id) {
        JSONResult result = null;
        try {
            tSbyxxxGyxlyxxxDataApi.delete(id);
            result = JSONResult.success();
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");

        }
        return result;
    }

    /**
     * 根据id进行批量删除 变电站运行数据数据
     *
     * @return
     */
    @RequestMapping("batchDel")
    public JSONResult batchDelData(@RequestBody String ids) {
        JSONResult result = null;
        try {
            tSbyxxxGyxlyxxxDataApi.deleteBatchIds(ids);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 更新用中压线路N-1校验数据
     *
     * @return
     */
    @RequestMapping("update")
    public JSONResult updateData(@RequestBody TSbyxxxGyxlyxxxDto dto) {
        JSONResult result = null;
        try {
            tSbyxxxGyxlyxxxDataApi.update(dto);
            result = JSONResult.success();
        } catch (Throwable e) {
            result = JSONResult.failure("服务器错误请联系管理员");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 更新变电站运行数据
     *
     * @return
     */
    @RequestMapping("list")
    public JSONResult listData() {
        JSONResult result = null;
        try {
            result = JSONResult.success(tSbyxxxGyxlyxxxDataApi.getList());
        } catch (Throwable e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误请联系管理员");
        }
        return result;
    }

}

package com.kylin.electricassistsys.data.api.tsbsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjByqxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjByqxxSelDto;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/18 14:44
 * @Description: 变压器信息接口类
 */
public interface TSbsjByqxxDataApi {
    /**
     * 返回所有的數據
     * @return
     */
    public List<TSbsjByqxxDto> getList()throws Throwable;
    /**
     * 查询变压器信息进行分页
     * @param dto
     * @return
     */
    public Page<TSbsjByqxxSelDto> selectPage(Page page, TSbsjByqxxSelDto dto)throws Throwable ;

    /**
     *添加变压器信息接口
     * @param dto
     */
    public void insert(TSbsjByqxxDto dto)throws Throwable ;

    /**
     * 更新变压器信息接口
     * @param dto
     */
    public void update(TSbsjByqxxDto dto)throws Throwable ;

    /**
     *删除根据id中压线鏈路路信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 变压器信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
}

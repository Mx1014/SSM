package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjZyllxxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjZyllxxxSelDto;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 14:00
 * @Description: 中压鏈路线路信息接口類
 */
public interface TSbsjZyllxxxDataApi {
    /**
     * 返回所有的數據
     * @return
     */
    public List<TSbsjZyllxxxDto> getList()throws Throwable;
    /**
     * 查询中压鏈路线路信息进行分页
     * @param dto
     * @return
     */
    public Page<TSbsjZyllxxxSelDto> selectPage(Page page, TSbsjZyllxxxSelDto dto)throws Throwable ;

    /**
     *添加中压鏈路线路信息接口
     * @param dto
     */
    public void insert(TSbsjZyllxxxDto dto)throws Throwable ;

    /**
     * 更新中压鏈路线路信息接口
     * @param dto
     */
    public void update(TSbsjZyllxxxDto dto)throws Throwable ;

    /**
     *删除根据id中压线鏈路路信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 中压鏈路线路信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;


}

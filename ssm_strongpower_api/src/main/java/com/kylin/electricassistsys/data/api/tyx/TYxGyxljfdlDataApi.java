package com.kylin.electricassistsys.data.api.tyx;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tyx.TYxGyxljfdlDto;
import com.kylin.electricassistsys.dto.tyx.TYxGyxljfdlSelDto;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/24 15:54
 * @Description: 高压线路电量信息接口类
 */
public interface TYxGyxljfdlDataApi {

    /**
     * 返回所有的高压线路电量信息數據
     * @return
     */
    public List<TYxGyxljfdlDto> getList()throws Throwable;
    /**
     * 查询变高压线路电量信息进行分页
     * @param dto
     * @return
     */
    public Page<TYxGyxljfdlSelDto> selectPage(Page page, TYxGyxljfdlSelDto dto)throws Throwable ;

    /**
     *添加变高压线路电量信息接口
     * @param dto
     */
    public void insert(TYxGyxljfdlDto dto)throws Throwable ;

    /**
     * 更新变高压线路电量信息接口
     * @param dto
     */
    public void update(TYxGyxljfdlDto dto)throws Throwable ;

    /**
     *删除根据id高压线路电量信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 变高压线路电量信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
    
}

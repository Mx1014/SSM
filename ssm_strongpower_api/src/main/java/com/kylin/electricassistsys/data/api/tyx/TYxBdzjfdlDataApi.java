package com.kylin.electricassistsys.data.api.tyx;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tyx.TYxBdzjfdlDto;
import com.kylin.electricassistsys.dto.tyx.TYxBdzjfdlSelDto;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/22 10:44
 * @Description: 变电站运行数据接口类
 */
public interface TYxBdzjfdlDataApi {


    /**
     * 返回所有的变电站运行数据數據
     * @return
     */
    public List<TYxBdzjfdlDto> getList()throws Throwable;
    /**
     * 查询变变电站运行数据进行分页
     * @param dto
     * @return
     */
    public Page<TYxBdzjfdlSelDto> selectPage(Page page, TYxBdzjfdlSelDto dto)throws Throwable ;

    /**
     *添加变变电站运行数据接口
     * @param dto
     */
    public void insert(TYxBdzjfdlDto dto)throws Throwable ;

    /**
     * 更新变变电站运行数据接口
     * @param dto
     */
    public void update(TYxBdzjfdlDto dto)throws Throwable ;

    /**
     *删除根据id中压线鏈路路信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 变变电站运行数据接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
}

package com.kylin.electricassistsys.data.api.tjisuan;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanZyxldyjDto;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanZyxldyjSelDto;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/22 14:20
 * @Description: 中压线路电压降 接口类
 */
public interface TJisuanZyxldyjDataApi {

    /**
     * 返回所有的數據
     * @return
     */
    public List<TJisuanZyxldyjDto> getList()throws Throwable;
    /**
     * 查询中压线路电压降进行分页
     * @param dto
     * @return
     */
    public Page<TJisuanZyxldyjSelDto> selectPage(Page page, TJisuanZyxldyjSelDto dto)throws Throwable ;

    /**
     *添加中压线路电压降接口
     * @param dto
     */
    public void insert(TJisuanZyxldyjDto dto)throws Throwable ;

    /**
     * 更新中压线路电压降接口
     * @param dto
     */
    public void update(TJisuanZyxldyjDto dto)throws Throwable ;

    /**
     *删除根据id中压线鏈路路信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 中压线路电压降接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
}

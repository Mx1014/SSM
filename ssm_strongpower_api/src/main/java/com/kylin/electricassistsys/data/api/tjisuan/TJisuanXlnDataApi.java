package com.kylin.electricassistsys.data.api.tjisuan;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanXlnDto;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanXlnSelDto;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/18 16:02
 * @Description: 中压线路N-1校验接口類
 */
public interface TJisuanXlnDataApi {

    /**
     * 返回所有的數據
     * @return
     */
    public List<TJisuanXlnDto> getList()throws Throwable;
    /**
     * 查询变中压线路N-1校验进行分页
     * @param dto
     * @return
     */
    public Page<TJisuanXlnSelDto> selectPage(Page page, TJisuanXlnSelDto dto)throws Throwable ;

    /**
     *添加变中压线路N-1校验接口
     * @param dto
     */
    public void insert(TJisuanXlnDto dto)throws Throwable ;

    /**
     * 更新变中压线路N-1校验接口
     * @param dto
     */
    public void update(TJisuanXlnDto dto)throws Throwable ;

    /**
     *删除根据id中压线鏈路路信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 变中压线路N-1校验接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
}

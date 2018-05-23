package com.kylin.electricassistsys.data.api.tjisuan;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanByqnDto;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanByqnSelDto;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/21 15:48
 * @Description: 變壓器N-1信息接口
 */
public interface TJisuanByqnDataApi {

    /**
     * 返回所有的變壓器N-1信息數據
     * @return
     */
    public List<TJisuanByqnDto> getList()throws Throwable;
    /**
     * 查询变變壓器N-1信息进行分页
     * @param dto
     * @return
     */
    public Page<TJisuanByqnSelDto> selectPage(Page page, TJisuanByqnSelDto dto)throws Throwable ;

    /**
     *添加变變壓器N-1信息接口
     * @param dto
     */
    public void insert(TJisuanByqnDto dto)throws Throwable ;

    /**
     * 更新变變壓器N-1信息接口
     * @param dto
     */
    public void update(TJisuanByqnDto dto)throws Throwable ;

    /**
     *删除根据id中压线鏈路路信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 变變壓器N-1信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;



}

package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjXmydxzDto;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/5/17 10:05
 * @Description:项目用电性质接口类
 */
public interface TJcsjXmydxzDataApi {
    /**
     *查询项目用电性质对象列表接口
     * @param
     * @return
     */
    public List<TJcsjXmydxzDto> getList();

    /**
     * 查询项目用电性质接口进行分页
     * @param dto
     * @return
     */
    public Page<TJcsjXmydxzDto> selectPage(Page page, TJcsjXmydxzDto dto)throws Throwable ;

    /**
     *添加项目用电性质接口
     * @param dto
     */
    public void insert(TJcsjXmydxzDto dto)throws Throwable ;

    /**
     * 更新项目用电性质接口
     * @param dto
     */
    public void update(TJcsjXmydxzDto dto)throws Throwable ;

    /**
     *删除根据id项目用电性质接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 项目用电性质接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
}

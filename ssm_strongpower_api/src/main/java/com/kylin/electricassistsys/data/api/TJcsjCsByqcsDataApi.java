package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsByqcsDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsByqcsSelDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjCsByqcsDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 变压器参数操作Api
 */
public interface TJcsjCsByqcsDataApi {
    /**
     * 功能描述: 获取变压器参数对象列表
     *
     * @param: 无
     * @return: 变压器参数对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjCsByqcsDto> getList();

    /**
     * 功能描述: 更新变压器参数对象
     *
     * @param: 变压器参数对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjCsByqcsDto tJcsjCsByqcsDto);

    /**
     * 功能描述: 插入变压器参数对象
     *
     * @param: 变压器参数对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjCsByqcsDto tJcsjCsByqcsDto);

    /**
     * 功能描述: 删除变压器参数对象
     *
     * @param: 变压器参数对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除变压器参数对象
     *
     * @param: 多个变压器参数对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取变压器参数分页对象
     *
     * @param:  page 变压器参数分页对象
     * @param:  tJcsjCsByqcsDto 变压器参数对象
     * @return: 变压器参数分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjCsByqcsSelDto> getPages(Page<TJcsjCsByqcsSelDto> page, TJcsjCsByqcsSelDto tJcsjCsByqcsSelDto);
}

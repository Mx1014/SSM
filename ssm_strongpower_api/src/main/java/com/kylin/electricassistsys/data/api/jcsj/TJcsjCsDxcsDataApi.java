package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsDxcsDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjCsDxcsDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 导线参数操作Api
 */
public interface TJcsjCsDxcsDataApi {
    /**
     * 功能描述: 获取导线参数对象列表
     *
     * @param: 无
     * @return: 导线参数对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjCsDxcsDto> getList();

    /**
     * 功能描述: 更新导线参数对象
     *
     * @param: 导线参数对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjCsDxcsDto tJcsjCsDxcsDto);

    /**
     * 功能描述: 插入导线参数对象
     *
     * @param: 导线参数对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjCsDxcsDto tJcsjCsDxcsDto);

    /**
     * 功能描述: 删除导线参数对象
     *
     * @param: 导线参数对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除导线参数对象
     *
     * @param: 多个导线参数对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取导线参数分页对象
     *
     * @param:  page 导线参数分页对象
     * @param:  tJcsjCsDxcsDto 导线参数对象
     * @return: 导线参数分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjCsDxcsDto> getPages(Page<TJcsjCsDxcsDto> page, TJcsjCsDxcsDto tJcsjCsDxcsDto);
}

package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjBzfsDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjBzfsDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 布置方式操作Api
 */
public interface TJcsjBzfsDataApi {
    /**
     * 功能描述: 获取布置方式对象列表
     *
     * @param: 无
     * @return: 布置方式对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjBzfsDto> getList();

    /**
     * 功能描述: 更新布置方式对象
     *
     * @param: 布置方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjBzfsDto tJcsjBzfsDto);

    /**
     * 功能描述: 插入布置方式对象
     *
     * @param: 布置方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjBzfsDto tJcsjBzfsDto);

    /**
     * 功能描述: 删除布置方式对象
     *
     * @param: 布置方式对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);

    /**
     * 功能描述: 批量删除高压配电装置类型对象
     *
     * @param: 多个高压配电装置类型对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取布置方式分页对象
     *
     * @param: page 布置方式分页对象
     * @param: tJcsjBzfsDto 布置方式对象
     * @return: 布置方式分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjBzfsDto> getPages(Page<TJcsjBzfsDto> page, TJcsjBzfsDto tJcsjBzfsDto);
}

package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjGypdzzlxDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjGypdzzlxDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 高压配电装置类型操作Api
 */
public interface TJcsjGypdzzlxDataApi {
    /**
     * 功能描述: 获取高压配电装置类型对象列表
     *
     * @param: 无
     * @return: 高压配电装置类型对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjGypdzzlxDto> getList();

    /**
     * 功能描述: 更新高压配电装置类型对象
     *
     * @param: 高压配电装置类型对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjGypdzzlxDto tJcsjGypdzzlxDto);

    /**
     * 功能描述: 插入高压配电装置类型对象
     *
     * @param: 高压配电装置类型对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjGypdzzlxDto tJcsjGypdzzlxDto);

    /**
     * 功能描述: 删除高压配电装置类型对象
     *
     * @param: 高压配电装置类型对象id
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
     * 功能描述: 获取高压配电装置类型分页对象
     *
     * @param:  page 高压配电装置类型分页对象
     * @param:  tJcsjGypdzzlxDto 高压配电装置类型对象
     * @return: 高压配电装置类型分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjGypdzzlxDto> getPages(Page<TJcsjGypdzzlxDto> page, TJcsjGypdzzlxDto tJcsjGypdzzlxDto);
}

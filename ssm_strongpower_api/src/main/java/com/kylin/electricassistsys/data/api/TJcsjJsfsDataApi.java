package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjJsfsDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjJsfsDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 架设方式操作Api
 */
public interface TJcsjJsfsDataApi {
    /**
     * 功能描述: 获取架设方式对象列表
     *
     * @param: 无
     * @return: 架设方式对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjJsfsDto> getList();

    /**
     * 功能描述: 更新架设方式对象
     *
     * @param: 架设方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjJsfsDto tJcsjJsfsDto);

    /**
     * 功能描述: 插入架设方式对象
     *
     * @param: 架设方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjJsfsDto tJcsjJsfsDto);

    /**
     * 功能描述: 删除架设方式对象
     *
     * @param: 架设方式对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除架设方式对象
     *
     * @param: 多个架设方式对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取架设方式分页对象
     *
     * @param:  page 架设方式分页对象
     * @param:  tJcsjJsfsDto 架设方式对象
     * @return: 架设方式分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjJsfsDto> getPages(Page<TJcsjJsfsDto> page, TJcsjJsfsDto tJcsjJsfsDto);
}

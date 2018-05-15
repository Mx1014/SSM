package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjXmlxDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjXmlxDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 项目类型操作Api
 */
public interface TJcsjXmlxDataApi {
    /**
     * 功能描述: 获取项目类型对象列表
     *
     * @param: 无
     * @return: 项目类型对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjXmlxDto> getList();

    /**
     * 功能描述: 更新项目类型对象
     *
     * @param: 项目类型对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjXmlxDto tJcsjXmlxDto);

    /**
     * 功能描述: 插入项目类型对象
     *
     * @param: 项目类型对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjXmlxDto tJcsjXmlxDto);

    /**
     * 功能描述: 删除项目类型对象
     *
     * @param: 项目类型对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除项目类型对象
     *
     * @param: 多个项目类型对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取项目类型分页对象
     *
     * @param:  page 项目类型分页对象
     * @param:  tJcsjXmlxDto 项目类型对象
     * @return: 项目类型分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjXmlxDto> getPages(Page<TJcsjXmlxDto> page, TJcsjXmlxDto tJcsjXmlxDto);
}

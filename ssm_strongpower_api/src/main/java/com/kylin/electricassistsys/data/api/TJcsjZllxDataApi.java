package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZllxDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjZllxDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 资料类型操作Api
 */
public interface TJcsjZllxDataApi {
    /**
     * 功能描述: 获取资料类型对象列表
     *
     * @param: 无
     * @return: 资料类型对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjZllxDto> getList();

    /**
     * 功能描述: 更新资料类型对象
     *
     * @param: 资料类型对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjZllxDto tJcsjZllxDto);

    /**
     * 功能描述: 插入资料类型对象
     *
     * @param: 资料类型对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjZllxDto tJcsjZllxDto);

    /**
     * 功能描述: 删除资料类型对象
     *
     * @param: 资料类型对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除资料类型对象
     *
     * @param: 多个资料类型对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取资料类型分页对象
     *
     * @param:  page 资料类型分页对象
     * @param:  tJcsjZllxDto 资料类型对象
     * @return: 资料类型分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjZllxDto> getPages(Page<TJcsjZllxDto> page, TJcsjZllxDto tJcsjZllxDto);
}

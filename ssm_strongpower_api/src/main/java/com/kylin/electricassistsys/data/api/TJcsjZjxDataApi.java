package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZjxDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjZjxDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 主接线操作Api
 */
public interface TJcsjZjxDataApi {
    /**
     * 功能描述: 获取主接线对象列表
     *
     * @param: 无
     * @return: 主接线对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjZjxDto> getList();

    /**
     * 功能描述: 更新主接线对象
     *
     * @param: 主接线对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjZjxDto tJcsjZjxDto);

    /**
     * 功能描述: 插入主接线对象
     *
     * @param: 主接线对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjZjxDto tJcsjZjxDto);

    /**
     * 功能描述: 删除主接线对象
     *
     * @param: 主接线对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除主接线对象
     *
     * @param: 多个主接线对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取主接线分页对象
     *
     * @param:  page 主接线分页对象
     * @param:  tJcsjZjxDto 主接线对象
     * @return: 主接线分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjZjxDto> getPages(Page<TJcsjZjxDto> page, TJcsjZjxDto tJcsjZjxDto);
}

package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjTyfsDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjTyfsDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 调压方式操作Api
 */
public interface TJcsjTyfsDataApi {
    /**
     * 功能描述: 获取调压方式对象列表
     *
     * @param: 无
     * @return: 调压方式对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjTyfsDto> getList();

    /**
     * 功能描述: 更新调压方式对象
     *
     * @param: 调压方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjTyfsDto tJcsjTyfsDto);

    /**
     * 功能描述: 插入调压方式对象
     *
     * @param: 调压方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjTyfsDto tJcsjTyfsDto);

    /**
     * 功能描述: 删除调压方式对象
     *
     * @param: 调压方式对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除调压方式对象
     *
     * @param: 多个调压方式对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取调压方式分页对象
     *
     * @param:  page 调压方式分页对象
     * @param:  tJcsjTyfsDto 调压方式对象
     * @return: 调压方式分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjTyfsDto> getPages(Page<TJcsjTyfsDto> page, TJcsjTyfsDto tJcsjTyfsDto);
}

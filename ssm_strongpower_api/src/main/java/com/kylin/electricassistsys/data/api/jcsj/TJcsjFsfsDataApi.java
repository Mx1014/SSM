package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFsfsDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjFsfsDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 敷设方式操作Api
 */
public interface TJcsjFsfsDataApi {
    /**
     * 功能描述: 获取敷设方式对象列表
     *
     * @param: 无
     * @return: 敷设方式对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjFsfsDto> getList();

    /**
     * 功能描述: 更新敷设方式对象
     *
     * @param: 敷设方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjFsfsDto tJcsjFsfsDto);

    /**
     * 功能描述: 插入敷设方式对象
     *
     * @param: 敷设方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjFsfsDto tJcsjFsfsDto);

    /**
     * 功能描述: 删除敷设方式对象
     *
     * @param: 敷设方式对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除敷设方式对象
     *
     * @param: 多个敷设方式对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取敷设方式分页对象
     *
     * @param:  page 敷设方式分页对象
     * @param:  tJcsjFsfsDto 敷设方式对象
     * @return: 敷设方式分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjFsfsDto> getPages(Page<TJcsjFsfsDto> page, TJcsjFsfsDto tJcsjFsfsDto);
}

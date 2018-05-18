package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxDqshDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxDqshSelDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjYxDqshDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 地区经济和社会信息操作Api
 */
public interface TJcsjYxDqshDataApi {
    /**
     * 功能描述: 获取地区经济和社会信息对象列表
     *
     * @param: 无
     * @return: 地区经济和社会信息对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjYxDqshDto> getList();

    /**
     * 功能描述: 更新地区经济和社会信息对象
     *
     * @param: 地区经济和社会信息对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjYxDqshDto tJcsjYxDqshDto);

    /**
     * 功能描述: 插入地区经济和社会信息对象
     *
     * @param: 地区经济和社会信息对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjYxDqshDto tJcsjYxDqshDto);

    /**
     * 功能描述: 删除地区经济和社会信息对象
     *
     * @param: 地区经济和社会信息对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除地区经济和社会信息对象
     *
     * @param: 多个地区经济和社会信息对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取地区经济和社会信息分页对象
     *
     * @param:  page 地区经济和社会信息分页对象
     * @param:  tJcsjYxDqshDto 地区经济和社会信息对象
     * @return: 地区经济和社会信息分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjYxDqshSelDto> getPages(Page<TJcsjYxDqshSelDto> page, TJcsjYxDqshSelDto tJcsjYxDqshSelDto);
}

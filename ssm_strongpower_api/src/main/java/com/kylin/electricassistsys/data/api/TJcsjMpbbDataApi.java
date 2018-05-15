package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjMpbbDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjMpbbDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 铭牌变比操作Api
 */
public interface TJcsjMpbbDataApi {
    /**
     * 功能描述: 获取铭牌变比对象列表
     *
     * @param: 无
     * @return: 铭牌变比对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjMpbbDto> getList();

    /**
     * 功能描述: 更新铭牌变比对象
     *
     * @param: 铭牌变比对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjMpbbDto tJcsjMpbbDto);

    /**
     * 功能描述: 插入铭牌变比对象
     *
     * @param: 铭牌变比对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjMpbbDto tJcsjMpbbDto);

    /**
     * 功能描述: 删除铭牌变比对象
     *
     * @param: 铭牌变比对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除铭牌变比对象
     *
     * @param: 多个铭牌变比对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取铭牌变比分页对象
     *
     * @param:  page 铭牌变比分页对象
     * @param:  tJcsjMpbbDto 铭牌变比对象
     * @return: 铭牌变比分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjMpbbDto> getPages(Page<TJcsjMpbbDto> page, TJcsjMpbbDto tJcsjMpbbDto);
}

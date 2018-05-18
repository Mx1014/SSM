package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDyxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDyxxSelDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjDyxxDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 电源信息操作Api
 */
public interface TJcsjDyxxDataApi {
    /**
     * 功能描述: 获取电源信息对象列表
     *
     * @param: 无
     * @return: 电源信息对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjDyxxDto> getList();

    /**
     * 功能描述: 更新电源信息对象
     *
     * @param: 电源信息对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjDyxxDto tJcsjDyxxDto);

    /**
     * 功能描述: 插入电源信息对象
     *
     * @param: 电源信息对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjDyxxDto tJcsjDyxxDto);

    /**
     * 功能描述: 删除电源信息对象
     *
     * @param: 电源信息对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除电源信息对象
     *
     * @param: 多个电源信息对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取电源信息分页对象
     *
     * @param:  page 电源信息分页对象
     * @param:  tJcsjDyxxDto 电源信息对象
     * @return: 电源信息分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjDyxxSelDto> getPages(Page<TJcsjDyxxSelDto> page, TJcsjDyxxSelDto tJcsjDyxxSelDto);
}

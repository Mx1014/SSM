package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjXmxzDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjXmxzDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 项目性质操作Api
 */
public interface TJcsjXmxzDataApi {
    /**
     * 功能描述: 获取项目性质对象列表
     *
     * @param: 无
     * @return: 项目性质对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjXmxzDto> getList();

    /**
     * 功能描述: 更新项目性质对象
     *
     * @param: 项目性质对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjXmxzDto tJcsjXmxzDto);

    /**
     * 功能描述: 插入项目性质对象
     *
     * @param: 项目性质对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjXmxzDto tJcsjXmxzDto);

    /**
     * 功能描述: 删除项目性质对象
     *
     * @param: 项目性质对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除项目性质对象
     *
     * @param: 多个项目性质对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取项目性质分页对象
     *
     * @param:  page 项目性质分页对象
     * @param:  tJcsjXmxzDto 项目性质对象
     * @return: 项目性质分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjXmxzDto> getPages(Page<TJcsjXmxzDto> page, TJcsjXmxzDto tJcsjXmxzDto);
}

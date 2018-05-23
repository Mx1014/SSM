package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCtbbDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjCtbbDataApi
 * @Date: 2018/5/10 8:53
 * @Description: CT变比操作Api
 */
public interface TJcsjCtbbDataApi {
    /**
     * 功能描述: 获取CT变比对象列表
     *
     * @param: 无
     * @return: CT变比对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjCtbbDto> getList();

    /**
     * 功能描述: 更新CT变比对象
     *
     * @param: CT变比对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjCtbbDto tJcsjCtbbDto);

    /**
     * 功能描述: 插入CT变比对象
     *
     * @param: CT变比对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjCtbbDto tJcsjCtbbDto);

    /**
     * 功能描述: 删除CT变比对象
     *
     * @param: CT变比对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除CT变比对象
     *
     * @param: 多个CT变比对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取CT变比分页对象
     *
     * @param:  page CT变比分页对象
     * @param:  tJcsjCtbbDto CT变比对象
     * @return: CT变比分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjCtbbDto> getPages(Page<TJcsjCtbbDto> page, TJcsjCtbbDto tJcsjCtbbDto);
}

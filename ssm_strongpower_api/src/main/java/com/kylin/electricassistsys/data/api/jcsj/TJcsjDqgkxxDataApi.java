package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDqgkxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDqgkxxSelDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjDqgkxxDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 地区概况信息操作Api
 */
public interface TJcsjDqgkxxDataApi {
    /**
     * 功能描述: 获取地区概况信息对象列表
     *
     * @param: 无
     * @return: 地区概况信息对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjDqgkxxDto> getList();

    /**
     * 功能描述: 更新地区概况信息对象
     *
     * @param: 地区概况信息对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjDqgkxxDto tJcsjDqgkxxDto);

    /**
     * 功能描述: 插入地区概况信息对象
     *
     * @param: 地区概况信息对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjDqgkxxDto tJcsjDqgkxxDto);

    /**
     * 功能描述: 删除地区概况信息对象
     *
     * @param: 地区概况信息对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除地区概况信息对象
     *
     * @param: 多个地区概况信息对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取地区概况信息分页对象
     *
     * @param:  page 地区概况信息分页对象
     * @param:  tJcsjDqgkxxDto 地区概况信息对象
     * @return: 地区概况信息分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjDqgkxxSelDto> getPages(Page<TJcsjDqgkxxSelDto> page, TJcsjDqgkxxSelDto tJcsjDqgkxxSelDto);
}

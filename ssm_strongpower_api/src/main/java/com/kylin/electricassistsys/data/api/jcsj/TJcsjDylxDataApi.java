package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDylxDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjDylxDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 电源类型操作Api
 */
public interface TJcsjDylxDataApi {
    /**
     * 功能描述: 获取电源类型对象列表
     *
     * @param: 无
     * @return: 电源类型对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjDylxDto> getList();

    /**
     * 功能描述: 更新电源类型对象
     *
     * @param: 电源类型对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjDylxDto tJcsjDylxDto);

    /**
     * 功能描述: 插入电源类型对象
     *
     * @param: 电源类型对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjDylxDto tJcsjDylxDto);

    /**
     * 功能描述: 删除电源类型对象
     *
     * @param: 电源类型对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除电源类型对象
     *
     * @param: 多个电源类型对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取电源类型分页对象
     *
     * @param:  page 电源类型分页对象
     * @param:  tJcsjDylxDto 电源类型对象
     * @return: 电源类型分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjDylxDto> getPages(Page<TJcsjDylxDto> page, TJcsjDylxDto tJcsjDylxDto);
}

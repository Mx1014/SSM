package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjSyfsDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjSyfsDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 使用方式操作Api
 */
public interface TJcsjSyfsDataApi {
    /**
     * 功能描述: 获取使用方式对象列表
     *
     * @param: 无
     * @return: 使用方式对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjSyfsDto> getList();

    /**
     * 功能描述: 更新使用方式对象
     *
     * @param: 使用方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjSyfsDto tJcsjSyfsDto);

    /**
     * 功能描述: 插入使用方式对象
     *
     * @param: 使用方式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjSyfsDto tJcsjSyfsDto);

    /**
     * 功能描述: 删除使用方式对象
     *
     * @param: 使用方式对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);

    /**
     * 功能描述: 获取使用方式分页对象
     *
     * @param:  page 使用方式分页对象
     * @param:  tJcsjSyfsDto 使用方式对象
     * @return: 使用方式分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjSyfsDto> getPages(Page<TJcsjSyfsDto> page, TJcsjSyfsDto tJcsjSyfsDto);
}

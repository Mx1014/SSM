package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjAzxsDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjAzxsDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 安装形式操作Api
 */
public interface TJcsjAzxsDataApi {
    /**
     * 功能描述: 获取安装形式对象列表
     *
     * @param: 无
     * @return: 安装形式对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjAzxsDto> getList();

    /**
     * 功能描述: 更新安装形式对象
     *
     * @param: 安装形式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjAzxsDto tJcsjAzxsDto);

    /**
     * 功能描述: 插入安装形式对象
     *
     * @param: 安装形式对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjAzxsDto tJcsjAzxsDto);

    /**
     * 功能描述: 删除安装形式对象
     *
     * @param: 安装形式对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);

    /**
     * 功能描述: 获取安装形式分页对象
     *
     * @param:  page 安装形式分页对象
     * @param:  tJcsjAzxsDto 安装形式对象
     * @return: 安装形式分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjAzxsDto> getPages(Page<TJcsjAzxsDto> page, TJcsjAzxsDto tJcsjAzxsDto);
}

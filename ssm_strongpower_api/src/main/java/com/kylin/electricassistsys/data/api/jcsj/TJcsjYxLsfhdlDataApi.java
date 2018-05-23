package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxLsfhdlDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxLsfhdlSelDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjYxLsfhdlDataApi
 * @Date: 2018/5/10 8:53
 * @Description: 历史负荷电量信息操作Api
 */
public interface TJcsjYxLsfhdlDataApi {
    /**
     * 功能描述: 获取历史负荷电量信息对象列表
     *
     * @param: 无
     * @return: 历史负荷电量信息对象集合
     * @auther: whq
     * @date: 2018/5/10 8:54
     */
    public List<TJcsjYxLsfhdlDto> getList();

    /**
     * 功能描述: 更新历史负荷电量信息对象
     *
     * @param: 历史负荷电量信息对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:55
     */
    public void update(TJcsjYxLsfhdlDto tJcsjYxLsfhdlDto);

    /**
     * 功能描述: 插入历史负荷电量信息对象
     *
     * @param: 历史负荷电量信息对象
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:56
     */
    public void insert(TJcsjYxLsfhdlDto tJcsjYxLsfhdlDto);

    /**
     * 功能描述: 删除历史负荷电量信息对象
     *
     * @param: 历史负荷电量信息对象id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void delete(String id);
    /**
     * 功能描述: 批量删除历史负荷电量信息对象
     *
     * @param: 多个历史负荷电量信息对象id逗号隔断
     * @return: 无
     * @auther: whq
     * @date: 2018/5/10 8:57
     */
    public void batchDelete(String ids);

    /**
     * 功能描述: 获取历史负荷电量信息分页对象
     *
     * @param:  page 历史负荷电量信息分页对象
     * @param:  tJcsjYxLsfhdlDto 历史负荷电量信息对象
     * @return: 历史负荷电量信息分页对象
     * @auther: whq
     * @date: 2018/5/10 8:58
     */
    public Page<TJcsjYxLsfhdlSelDto> getPages(Page<TJcsjYxLsfhdlSelDto> page, TJcsjYxLsfhdlSelDto tJcsjYxLsfhdlSelDto);
}

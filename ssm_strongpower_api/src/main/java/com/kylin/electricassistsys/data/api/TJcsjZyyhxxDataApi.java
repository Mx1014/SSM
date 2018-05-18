package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZyyhxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZyyhxxSelDto;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 10:05
 * @Description:用户重要信息接口类
 */
public interface TJcsjZyyhxxDataApi {
    /**
     * 查询用户重要信息接口进行分页
     * @param dto
     * @return
     */
    public Page<TJcsjZyyhxxSelDto> selectPage(Page page, TJcsjZyyhxxSelDto dto)throws Throwable ;

    /**
     *添加用户重要信息接口
     * @param dto
     */
    public void insert(TJcsjZyyhxxDto dto)throws Throwable ;

    /**
     * 更新用户重要信息接口
     * @param dto
     */
    public void update(TJcsjZyyhxxDto dto)throws Throwable ;

    /**
     *删除根据id用户重要信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 用户重要信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
}

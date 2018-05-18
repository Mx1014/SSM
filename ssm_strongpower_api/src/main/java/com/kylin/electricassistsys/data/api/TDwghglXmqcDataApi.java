package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.wghgl.TDwghglXmqcDto;
import com.kylin.electricassistsys.dto.wghgl.TDwghglXmqcSelDto;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 17:17
 * @Description: 10kV电网新建工程接口類
 */
public interface TDwghglXmqcDataApi {
    /**
     * 返回所有的數據
     * @return
     */
    public List<TDwghglXmqcDto> getList()throws Throwable;
    /**
     * 查询0kV电网新建工程进行分页
     * @param dto
     * @return
     */
    public Page<TDwghglXmqcSelDto> selectPage(Page page, TDwghglXmqcSelDto dto)throws Throwable ;

    /**
     *添加0kV电网新建工程接口
     * @param dto
     */
    public void insert(TDwghglXmqcDto dto)throws Throwable ;

    /**
     * 更新0kV电网新建工程接口
     * @param dto
     */
    public void update(TDwghglXmqcDto dto)throws Throwable ;

    /**
     *删除根据id中压线鏈路路信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 0kV电网新建工程接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
}

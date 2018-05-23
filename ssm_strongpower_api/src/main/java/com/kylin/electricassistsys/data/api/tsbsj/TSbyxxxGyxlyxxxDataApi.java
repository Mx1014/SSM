package com.kylin.electricassistsys.data.api.tsbsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsbsj.TSbyxxxGyxlyxxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbyxxxGyxlyxxxSelDto;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/22 16:41
 * @Description: 高压线路信息列表接口类
 */
public interface TSbyxxxGyxlyxxxDataApi {
    /**
     * 返回所有的數據
     * @return
     */
    public List<TSbyxxxGyxlyxxxDto> getList()throws Throwable;
    /**
     * 查询高压线路信息进行分页
     * @param dto
     * @return
     */
    public Page<TSbyxxxGyxlyxxxSelDto> selectPage(Page page, TSbyxxxGyxlyxxxSelDto dto)throws Throwable ;

    /**
     *添加高压线路信息接口
     * @param dto
     */
    public void insert(TSbyxxxGyxlyxxxDto dto)throws Throwable ;

    /**
     * 更新高压线路信息接口
     * @param dto
     */
    public void update(TSbyxxxGyxlyxxxDto dto)throws Throwable ;

    /**
     *删除根据id中压线鏈路路信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 高压线路信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
    
    
}

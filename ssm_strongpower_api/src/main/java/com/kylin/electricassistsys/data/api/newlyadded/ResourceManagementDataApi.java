package com.kylin.electricassistsys.data.api.newlyadded;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.newlyadded.ResourceManagementDto;

/**
 * @Auther: cwx
 * @Date: 2018/5/23 15:23
 * @Description:  资源管理数据数据转换接口类
 */
public interface ResourceManagementDataApi {
    /**
     * 220kv间隔管理
     * @return
     */
    public Page<ResourceManagementDto> selectPage220Kv(Page page, ResourceManagementDto dto)throws  Throwable ;
    /**
     * 110kv间隔管理
     * @return
     */
    public Page<ResourceManagementDto> selectPage110Kv(Page page, ResourceManagementDto dto)throws  Throwable;
    /**
     * 35kv间隔管理
     * @return
     */
    public Page<ResourceManagementDto> selectPage35Kv(Page page, ResourceManagementDto dto)throws  Throwable;
    /**
     * 10kv间隔管理
     * @return
     */
    public Page<ResourceManagementDto> selectPage10Kv(Page page, ResourceManagementDto dto)throws  Throwable;

    /**
     * 根据ID删除数据
     * @param tBdzxxId
     */
    public void deleteById(String tBdzxxId)throws  Throwable;
    /**
     * 批量删除
     * @param ids
     */
    public void deleteBatchIds(String ids)throws  Throwable;

}

package com.kylin.electricassistsys.service.newlyadded;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.kylin.electricassistsys.pojo.newlyadded.ResourceManagement;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/23 15:06
 * @Description: 资源管理数据持久接口类
 */
public interface ResourceManagementSevice  extends IService<ResourceManagement> {
    /**
     * 220kv间隔管理
     * @return
     */
    public List<ResourceManagement> selectPage220Kv(Page page, ResourceManagement resourceManagement);
    /**
     * 110kv间隔管理
     * @return
     */
    public List<ResourceManagement> selectPage110Kv(Page page, ResourceManagement resourceManagement);
    /**
     * 35kv间隔管理
     * @return
     */
    public List<ResourceManagement> selectPage35Kv(Page page, ResourceManagement resourceManagement);
    /**
     * 10kv间隔管理
     * @return
     */
    public List<ResourceManagement> selectPage10Kv(Page page, ResourceManagement resourceManagement);

    /**
     * 根据ID删除数据
     * @param tBdzxxId
     */
    public void deleteById(String tBdzxxId);
}

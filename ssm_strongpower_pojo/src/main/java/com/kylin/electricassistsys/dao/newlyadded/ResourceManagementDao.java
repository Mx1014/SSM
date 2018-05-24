package com.kylin.electricassistsys.dao.newlyadded;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.annotation.MyBatisRepository;
import com.kylin.electricassistsys.pojo.newlyadded.ResourceManagement;
import  java.util.*;
/**
 * @Auther: cwx
 * @Date: 2018/5/23 14:30
 * @Description: 资源管理数据持久接口类
 */
@MyBatisRepository
public interface ResourceManagementDao extends BaseMapper<ResourceManagement> {
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

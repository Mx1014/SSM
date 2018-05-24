package com.kylin.electricassistsys.service.impl.newlyadded;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.newlyadded.ResourceManagementDao;
import com.kylin.electricassistsys.pojo.newlyadded.ResourceManagement;
import com.kylin.electricassistsys.service.newlyadded.ResourceManagementSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/23 15:12
 * @Description: 资源管理数据实现类
 */
@Service
@Transactional
public class ResourceManagementServiceImp  extends ServiceImpl<ResourceManagementDao,ResourceManagement>implements ResourceManagementSevice {
    @Autowired
     private ResourceManagementDao resourceManagementDao;
    @Override
    public List<ResourceManagement> selectPage220Kv(Page page, ResourceManagement resourceManagement) {
        return resourceManagementDao.selectPage220Kv(page,resourceManagement);
    }

    @Override
    public List<ResourceManagement> selectPage110Kv(Page page,ResourceManagement resourceManagement) {
        return resourceManagementDao.selectPage110Kv(page,resourceManagement);
    }
    @Override
    public List<ResourceManagement> selectPage35Kv(Page page,ResourceManagement resourceManagement) {
        return resourceManagementDao.selectPage35Kv(page,resourceManagement);
    }
    @Override
    public List<ResourceManagement> selectPage10Kv(Page page,ResourceManagement resourceManagement) {
        return resourceManagementDao.selectPage10Kv(page,resourceManagement);
    }
    /**
     * 根据ID删除数据
     * @param tBdzxxId
     */
    public void deleteById(String tBdzxxId){
        resourceManagementDao.deleteById(tBdzxxId);
    }
}

package com.kylin.electricassistsys.server.impl.newlyadded;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.newlyadded.ResourceManagementDataApi;
import com.kylin.electricassistsys.dto.newlyadded.ResourceManagementDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.newlyadded.ResourceManagement;
import com.kylin.electricassistsys.service.newlyadded.ResourceManagementSevice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/23 15:31
 * @Description:资源管理数据业务处理类
 */
@Service
public class ResourceManagementDataServerImpl implements ResourceManagementDataApi {
    @Resource
    private ResourceManagementSevice resourceManagementSevice;
    @Override
    public Page<ResourceManagementDto> selectPage220Kv(Page page, ResourceManagementDto dto)throws  Throwable {
        Page pagepojo = new Page();
        ResourceManagement resourceManagement= new ResourceManagement();
        MyBeanUtils.copyProperties(dto,resourceManagement);
        MyBeanUtils.toPageBean(page, pagepojo, new ResourceManagement());
        pagepojo.setRecords(MyBeanUtils.copyPropertiesList(resourceManagementSevice.selectPage220Kv(pagepojo,resourceManagement),ResourceManagementDto.class));
        return pagepojo;    }


    @Override
    public Page<ResourceManagementDto> selectPage110Kv(Page page,ResourceManagementDto dto)throws  Throwable {
        Page pagepojo = new Page();
        ResourceManagement resourceManagement= new ResourceManagement();
        MyBeanUtils.copyProperties(dto,resourceManagement);
        MyBeanUtils.toPageBean(page, pagepojo, new ResourceManagement());
        pagepojo.setRecords(MyBeanUtils.copyPropertiesList(resourceManagementSevice.selectPage110Kv(pagepojo,resourceManagement),ResourceManagementDto.class));
        return pagepojo;    }

    @Override
    public Page<ResourceManagementDto> selectPage35Kv(Page page,ResourceManagementDto dto)throws  Throwable {
        Page pagepojo = new Page();
        ResourceManagement resourceManagement= new ResourceManagement();
        MyBeanUtils.copyProperties(dto,resourceManagement);
        MyBeanUtils.toPageBean(page, pagepojo, new ResourceManagement());
        pagepojo.setRecords(MyBeanUtils.copyPropertiesList(resourceManagementSevice.selectPage35Kv(pagepojo,resourceManagement),ResourceManagementDto.class));
        return pagepojo;    }

    @Override
    public Page<ResourceManagementDto> selectPage10Kv(Page page,ResourceManagementDto dto)throws  Throwable {
        Page pagepojo = new Page();
        ResourceManagement resourceManagement= new ResourceManagement();
        MyBeanUtils.copyProperties(dto,resourceManagement);
        MyBeanUtils.toPageBean(page, pagepojo, new ResourceManagement());
        pagepojo.setRecords(MyBeanUtils.copyPropertiesList(resourceManagementSevice.selectPage10Kv(pagepojo,resourceManagement),ResourceManagementDto.class));
        return pagepojo;    }

    /**
     * 根据id进行删除数据
     * @param id
     */
    @Override
    public void deleteById(String id)throws  Throwable {

        resourceManagementSevice.deleteById(id);
    }

    /**
     * 批量删除
     * @param ids
     */
    public void deleteBatchIds(String ids)throws  Throwable{
        String[] idsArr = ids.split(",");
        List<String> idsList = Arrays.asList(idsArr);
        for(int i=0;i<idsList.size();i++){
          resourceManagementSevice.deleteById(idsList.get(i));

        }

    }
}

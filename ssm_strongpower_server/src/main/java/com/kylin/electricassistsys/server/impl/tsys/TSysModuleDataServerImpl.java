package com.kylin.electricassistsys.server.impl.tsys;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tsys.TSysModuleDataApi;
import com.kylin.electricassistsys.dto.tsys.TSysModuleDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tsys.TSysModule;
import com.kylin.electricassistsys.service.tsys.TSysModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TSysModuleDataServerImpl implements TSysModuleDataApi {
    @Autowired
    private TSysModuleService tSysModuleService;

    public void delete(String id) {
        tSysModuleService.deleteById(id);
    }

    public void insert(TSysModuleDto tSysModuleDto) {
        TSysModule tSysModule = new TSysModule();
        MyBeanUtils.copyProperties(tSysModuleDto,tSysModule);
        tSysModuleService.insert(tSysModule);
    }

    public List<TSysModuleDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSysModule());
        return MyBeanUtils.copyPropertiesList(tSysModuleService.selectList(entityWrapper), TSysModuleDto.class);
    }

    public void update(TSysModuleDto tSysModuleDto) {
        TSysModule tSysModule = new TSysModule();
        MyBeanUtils.copyProperties(tSysModuleDto,tSysModule);
        tSysModuleService.updateById(tSysModule);
    }

    public Page<TSysModuleDto> getPages(Page<TSysModuleDto> page,TSysModuleDto tSysModuleDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TSysModule tSysModule = new TSysModule();
        MyBeanUtils.copyProperties(tSysModuleDto,tSysModule);
        entityWrapper.setEntity(tSysModule);
        Page<TSysModule> pagepojo = new Page<TSysModule>();
        MyBeanUtils.toPageBean(page, pagepojo, new TSysModule());
        MyBeanUtils.toPageBean(tSysModuleService.selectPage(pagepojo,entityWrapper), page, new TSysModuleDto());
        return page;
    }
}

package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ddsb.TDdsbBdzDto;
import com.kylin.electricassistsys.dto.tsys.TSysYwdwDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ddsb.TDdsbBdz;
import com.kylin.electricassistsys.pojo.tsys.TSysYwdw;
import com.kylin.electricassistsys.service.tsys.TSysYwdwService;
import com.kylin.electricassistsys.testdata.api.TDdsbBdzDataApi;
import com.kylin.electricassistsys.testdata.api.TSysYwdwDataApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TSysYwdwDataServerImpl implements TSysYwdwDataApi {
    @Autowired
    private TSysYwdwService tSysYwdwService;

    public void insert(TSysYwdwDto tSysYwdwDto) {
        TSysYwdw tSysYwdw = new TSysYwdw();
        MyBeanUtils.copyProperties(tSysYwdwDto,tSysYwdw);
        tSysYwdwService.insert(tSysYwdw);
    }

    public List<TSysYwdwDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSysYwdw());
        return MyBeanUtils.copyPropertiesList(tSysYwdwService.selectList(entityWrapper), TSysYwdwDto.class);
    }

    public void update(TSysYwdwDto tSysYwdwDto) {
        TSysYwdw tSysYwdw = new TSysYwdw();
        MyBeanUtils.copyProperties(tSysYwdwDto,tSysYwdw);
        tSysYwdwService.insertOrUpdate(tSysYwdw);
    }

    public Page<TSysYwdwDto> getPages(Page<TSysYwdwDto> page) {
        Page<TSysYwdw> pagepojo = new Page<TSysYwdw>();
        MyBeanUtils.toPageBean(page, pagepojo, new TDdsbBdz());
        MyBeanUtils.toPageBean(tSysYwdwService.selectPage(pagepojo), page, new TSysYwdwDto());
        return page;
    }
}

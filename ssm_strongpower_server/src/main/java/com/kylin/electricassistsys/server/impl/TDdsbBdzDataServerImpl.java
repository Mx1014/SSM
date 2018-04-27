package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ddsb.TDdsbBdzDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ddsb.TDdsbBdz;
import com.kylin.electricassistsys.service.ddsb.TDdsbBdzService;
import com.kylin.electricassistsys.testdata.api.TDdsbBdzDataApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TDdsbBdzDataServerImpl implements TDdsbBdzDataApi {
    @Autowired
    private TDdsbBdzService tDdsbBdzService;

    public List<TDdsbBdzDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TDdsbBdz());
        return MyBeanUtils.copyPropertiesList(tDdsbBdzService.selectList(entityWrapper), TDdsbBdzDto.class);
    }

    public Page<TDdsbBdzDto> getPages(Page<TDdsbBdzDto> page) {
        Page<TDdsbBdz> pagepojo = new Page<TDdsbBdz>();
        MyBeanUtils.toPageBean(page, pagepojo, new TDdsbBdz());
        MyBeanUtils.toPageBean(tDdsbBdzService.selectPage(pagepojo), page, new TDdsbBdzDto());
        return page;
    }
}

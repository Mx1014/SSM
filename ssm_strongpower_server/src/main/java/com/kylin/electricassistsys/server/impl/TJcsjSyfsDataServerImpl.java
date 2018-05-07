package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGqlxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjSyfsDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjFqGqlx;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjSyfs;
import com.kylin.electricassistsys.service.jcsj.TJcsjFqGqlxService;
import com.kylin.electricassistsys.service.jcsj.TJcsjSyfsService;
import com.kylin.electricassistsys.testdata.api.TJcsjFqGqlxDataApi;
import com.kylin.electricassistsys.testdata.api.TJcsjSyfsDataApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TJcsjSyfsDataServerImpl implements TJcsjSyfsDataApi {
    @Autowired
    private TJcsjSyfsService tJcsjSyfsService;


    public List<TJcsjSyfsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjSyfs());
        return MyBeanUtils.copyPropertiesList(tJcsjSyfsService.selectList(entityWrapper), TJcsjSyfsDto.class);
    }
}

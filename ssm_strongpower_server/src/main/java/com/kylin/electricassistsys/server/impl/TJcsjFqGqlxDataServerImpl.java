package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGqlxDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjFqGqlx;
import com.kylin.electricassistsys.service.jcsj.TJcsjFqGqlxService;
import com.kylin.electricassistsys.data.api.TJcsjFqGqlxDataApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TJcsjFqGqlxDataServerImpl implements TJcsjFqGqlxDataApi {
    @Autowired
    private TJcsjFqGqlxService tJcsjFqGqlxService;


    public List<TJcsjFqGqlxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjFqGqlx());
        return MyBeanUtils.copyPropertiesList(tJcsjFqGqlxService.selectList(entityWrapper), TJcsjFqGqlxDto.class);
    }

    public void update(TJcsjFqGqlxDto tJcsjFqGqlxDto) {
        TJcsjFqGqlx tJcsjFqGqlx = new TJcsjFqGqlx();
        MyBeanUtils.copyProperties(tJcsjFqGqlxDto, tJcsjFqGqlx);
        tJcsjFqGqlxService.updateById(tJcsjFqGqlx);
    }

    public void insert(TJcsjFqGqlxDto tJcsjFqGqlxDto) {
        TJcsjFqGqlx tJcsjFqGqlx = new TJcsjFqGqlx();
        MyBeanUtils.copyProperties(tJcsjFqGqlxDto, tJcsjFqGqlx);
        tJcsjFqGqlxService.insert(tJcsjFqGqlx);
    }

    public void delete(String id) {
        tJcsjFqGqlxService.deleteById(id);
    }

    public Page<TJcsjFqGqlxDto> getPages(Page<TJcsjFqGqlxDto> page, TJcsjFqGqlxDto tJcsjFqGqlxDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjFqGqlx tJcsjFqGqlx = new TJcsjFqGqlx();
        MyBeanUtils.copyProperties(tJcsjFqGqlxDto,tJcsjFqGqlx);
        entityWrapper.setEntity(tJcsjFqGqlx);
        Page<TJcsjFqGqlx> pagepojo = new Page<TJcsjFqGqlx>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjFqGqlx());
        MyBeanUtils.toPageBean(tJcsjFqGqlxService.selectPage(pagepojo,entityWrapper), page, new TJcsjFqGqlxDto());
        return page;
    }

}

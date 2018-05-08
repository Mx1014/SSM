package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGdfqDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjFqGdfq;
import com.kylin.electricassistsys.service.jcsj.TJcsjFqGdfqService;
import com.kylin.electricassistsys.data.api.TJcsjFqGdfqDataApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TJcsjFqGdfqDataServerImpl implements TJcsjFqGdfqDataApi {
    @Autowired
    private TJcsjFqGdfqService tJcsjFqGdfqService;


    public List<TJcsjFqGdfqDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjFqGdfq());
        return MyBeanUtils.copyPropertiesList(tJcsjFqGdfqService.selectList(entityWrapper), TJcsjFqGdfqDto.class);
    }

    public void update(TJcsjFqGdfqDto tJcsjFqGdfqDto) {
        TJcsjFqGdfq tJcsjFqGdfq = new TJcsjFqGdfq();
        MyBeanUtils.copyProperties(tJcsjFqGdfqDto, tJcsjFqGdfq);
        tJcsjFqGdfqService.updateById(tJcsjFqGdfq);
    }

    public void insert(TJcsjFqGdfqDto tJcsjFqGdfqDto) {
        TJcsjFqGdfq tJcsjFqGdfq = new TJcsjFqGdfq();
        MyBeanUtils.copyProperties(tJcsjFqGdfqDto, tJcsjFqGdfq);
        tJcsjFqGdfqService.insert(tJcsjFqGdfq);
    }

    public void delete(String id) {
        tJcsjFqGdfqService.deleteById(id);
    }

    public Page<TJcsjFqGdfqDto> getPages(Page<TJcsjFqGdfqDto> page, TJcsjFqGdfqDto tJcsjFqGdfqDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjFqGdfq tJcsjFqGdfq = new TJcsjFqGdfq();
        MyBeanUtils.copyProperties(tJcsjFqGdfqDto,tJcsjFqGdfq);
        entityWrapper.setEntity(tJcsjFqGdfq);
        Page<TJcsjFqGdfq> pagepojo = new Page<TJcsjFqGdfq>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjFqGdfq());
        MyBeanUtils.toPageBean(tJcsjFqGdfqService.selectPage(pagepojo,entityWrapper), page, new TJcsjFqGdfqDto());
        return page;
    }

}

package com.kylin.electricassistsys.server.impl.tsys;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsys.TSysDanweiDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ddsb.TDdsbBdz;
import com.kylin.electricassistsys.pojo.tsys.TSysDanwei;
import com.kylin.electricassistsys.service.tsys.TSysDanweiService;
import com.kylin.electricassistsys.data.api.tsys.TSysDanweiDataApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TSysDanweiDataServerImpl implements TSysDanweiDataApi {
    @Autowired
    private TSysDanweiService tSysDanweiService;

    public List<TSysDanweiDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSysDanwei());
        return MyBeanUtils.copyPropertiesList(tSysDanweiService.selectList(entityWrapper), TSysDanweiDto.class);
    }

    public Page<TSysDanweiDto> getPages(Page<TSysDanweiDto> page) {
        Page<TSysDanwei> pagepojo = new Page<TSysDanwei>();
        MyBeanUtils.toPageBean(page, pagepojo, new TDdsbBdz());
        MyBeanUtils.toPageBean(tSysDanweiService.selectPage(pagepojo), page, new TSysDanweiDto());
        return page;
    }
}

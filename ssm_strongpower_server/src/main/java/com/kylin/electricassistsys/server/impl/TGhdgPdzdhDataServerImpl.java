package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TGhdgPdzdhDataApi;
import com.kylin.electricassistsys.dto.ghdg.TGhdgPdzdhDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgPdzdhSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgPdzdh;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgPdzdhSel;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxx;
import com.kylin.electricassistsys.service.ghdg.TGhdgPdzdhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
@Service
public class TGhdgPdzdhDataServerImpl implements TGhdgPdzdhDataApi {
    @Autowired
    private TGhdgPdzdhService tGhdgPdzdhService;


    public List<TGhdgPdzdhDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSbsjBdzxx());
        return MyBeanUtils.copyPropertiesList(tGhdgPdzdhService.selectList(entityWrapper), TGhdgPdzdhDto.class);
    }

    public Page<TGhdgPdzdhSelDto> getAllList(Page page, TGhdgPdzdhSelDto tGhdgPdzdhSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgPdzdhSel tGhdgPdzdhSel = new TGhdgPdzdhSel();
        MyBeanUtils.copyProperties(tGhdgPdzdhSelDto, tGhdgPdzdhSel);
        entityWrapper.setEntity(tGhdgPdzdhSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tGhdgPdzdhSel);
        System.out.println(entityWrapper.getSqlSegment());
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgPdzdhSel());
        MyBeanUtils.toPageBean(tGhdgPdzdhService.selectPage(pagepojo, entityWrapper), page, tGhdgPdzdhSelDto);
        return page;
    }

    public void update(TGhdgPdzdhDto tGhdgPdzdhDto) {
        TGhdgPdzdh tGhdgPdzdh = new TGhdgPdzdh();
        MyBeanUtils.copyProperties(tGhdgPdzdhDto, tGhdgPdzdh);
        tGhdgPdzdhService.updateById(tGhdgPdzdh);
    }

    public void insert(TGhdgPdzdhDto tGhdgPdzdhDto) {
        TGhdgPdzdh tGhdgPdzdh = new TGhdgPdzdh();
        MyBeanUtils.copyProperties(tGhdgPdzdhDto, tGhdgPdzdh);
        tGhdgPdzdhService.insert(tGhdgPdzdh);
    }

    public void delete(String id) {
        tGhdgPdzdhService.deleteById(id);
    }

    public Page<TGhdgPdzdhDto> getPages(Page<TGhdgPdzdhDto> page, TGhdgPdzdhDto tGhdgPdzdhDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgPdzdh tGhdgPdzdh = new TGhdgPdzdh();
        MyBeanUtils.copyProperties(tGhdgPdzdhDto, tGhdgPdzdh);
        entityWrapper.setEntity(tGhdgPdzdh);
        Page<TGhdgPdzdh> pagepojo = new Page<TGhdgPdzdh>();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgPdzdh());
        MyBeanUtils.toPageBean(tGhdgPdzdhService.selectPage(pagepojo, entityWrapper), page, new TGhdgPdzdhDto());
        return page;
    }
}

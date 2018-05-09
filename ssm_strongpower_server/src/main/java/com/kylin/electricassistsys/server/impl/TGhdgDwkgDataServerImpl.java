package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TGhdgDwkgDataApi;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgDwkg;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgDwkgSel;
import com.kylin.electricassistsys.service.ghdg.TGhdgDwkgService;
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
public class TGhdgDwkgDataServerImpl implements TGhdgDwkgDataApi {
    @Autowired
    private TGhdgDwkgService tGhdgDwkgService;


    public List<TGhdgDwkgDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TGhdgDwkg());
        return MyBeanUtils.copyPropertiesList(tGhdgDwkgService.selectList(entityWrapper), TGhdgDwkgDto.class);
    }

    public Page<TGhdgDwkgSelDto> getAllList(Page page, TGhdgDwkgSelDto tGhdgDwkgSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgDwkgSel tGhdgDwkgSel = new TGhdgDwkgSel();
        MyBeanUtils.copyProperties(tGhdgDwkgSelDto, tGhdgDwkgSel);
        entityWrapper.setEntity(tGhdgDwkgSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tGhdgDwkgSel);
        System.out.println(entityWrapper.getSqlSegment());
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgDwkgSel());
        MyBeanUtils.toPageBean(tGhdgDwkgService.selectPage(pagepojo, entityWrapper), page, tGhdgDwkgSelDto);
        return page;
    }

    public void update(TGhdgDwkgDto tGhdgDwkgDto) {
        TGhdgDwkg tGhdgDwkg = new TGhdgDwkg();
        MyBeanUtils.copyProperties(tGhdgDwkgDto, tGhdgDwkg);
        tGhdgDwkgService.updateById(tGhdgDwkg);
    }

    public void insert(TGhdgDwkgDto tGhdgDwkgDto) {
        TGhdgDwkg tGhdgDwkg = new TGhdgDwkg();
        MyBeanUtils.copyProperties(tGhdgDwkgDto, tGhdgDwkg);
        tGhdgDwkgService.insert(tGhdgDwkg);
    }

    public void delete(String id) {
        tGhdgDwkgService.deleteById(id);
    }

    public Page<TGhdgDwkgDto> getPages(Page<TGhdgDwkgDto> page, TGhdgDwkgDto tGhdgDwkgDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgDwkg tGhdgDwkg = new TGhdgDwkg();
        MyBeanUtils.copyProperties(tGhdgDwkgDto, tGhdgDwkg);
        entityWrapper.setEntity(tGhdgDwkg);
        Page<TGhdgDwkg> pagepojo = new Page<TGhdgDwkg>();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgDwkg());
        MyBeanUtils.toPageBean(tGhdgDwkgService.selectPage(pagepojo, entityWrapper), page, new TGhdgDwkgDto());
        return page;
    }
}

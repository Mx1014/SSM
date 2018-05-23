package com.kylin.electricassistsys.server.impl.ghdg;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.ghdg.TGhdgDwpbsbDataApi;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgDwpbsb;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgDwpbsbSel;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxx;
import com.kylin.electricassistsys.service.ghdg.TGhdgDwpbsbService;
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
public class TGhdgDwpbsbDataServerImpl implements TGhdgDwpbsbDataApi {
    @Autowired
    private TGhdgDwpbsbService tGhdgDwpbsbService;


    public List<TGhdgDwpbsbDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSbsjBdzxx());
        return MyBeanUtils.copyPropertiesList(tGhdgDwpbsbService.selectList(entityWrapper), TGhdgDwpbsbDto.class);
    }

    public Page<TGhdgDwpbsbSelDto> getAllList(Page page, TGhdgDwpbsbSelDto tGhdgDwpbsbSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgDwpbsbSel tGhdgDwpbsbSel = new TGhdgDwpbsbSel();
        MyBeanUtils.copyProperties(tGhdgDwpbsbSelDto, tGhdgDwpbsbSel);
        entityWrapper.setEntity(tGhdgDwpbsbSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tGhdgDwpbsbSel);
        System.out.println(entityWrapper.getSqlSegment());
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgDwpbsbSel());
        MyBeanUtils.toPageBean(tGhdgDwpbsbService.selectPage(pagepojo, entityWrapper), page, tGhdgDwpbsbSelDto);
        return page;
    }

    public void update(TGhdgDwpbsbDto tGhdgDwpbsbDto) {
        TGhdgDwpbsb tGhdgDwpbsb = new TGhdgDwpbsb();
        MyBeanUtils.copyProperties(tGhdgDwpbsbDto, tGhdgDwpbsb);
        tGhdgDwpbsbService.updateById(tGhdgDwpbsb);
    }

    public void insert(TGhdgDwpbsbDto tGhdgDwpbsbDto) {
        TGhdgDwpbsb tGhdgDwpbsb = new TGhdgDwpbsb();
        MyBeanUtils.copyProperties(tGhdgDwpbsbDto, tGhdgDwpbsb);
        tGhdgDwpbsbService.insert(tGhdgDwpbsb);
    }

    public void delete(String id) {
        tGhdgDwpbsbService.deleteById(id);
    }

    public Page<TGhdgDwpbsbDto> getPages(Page<TGhdgDwpbsbDto> page, TGhdgDwpbsbDto tGhdgDwpbsbDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgDwpbsb tGhdgDwpbsb = new TGhdgDwpbsb();
        MyBeanUtils.copyProperties(tGhdgDwpbsbDto, tGhdgDwpbsb);
        entityWrapper.setEntity(tGhdgDwpbsb);
        Page<TGhdgDwpbsb> pagepojo = new Page<TGhdgDwpbsb>();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgDwpbsb());
        MyBeanUtils.toPageBean(tGhdgDwpbsbService.selectPage(pagepojo, entityWrapper), page, new TGhdgDwpbsbDto());
        return page;
    }
}

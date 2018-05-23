package com.kylin.electricassistsys.server.impl.ghdg;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.ghdg.TGhdgDwyxzbDataApi;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwyxzbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwyxzbSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgDwyxzb;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgDwyxzbSel;
import com.kylin.electricassistsys.service.ghdg.TGhdgDwyxzbService;
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
public class TGhdgDwyxzbDataServerImpl implements TGhdgDwyxzbDataApi {
    @Autowired
    private TGhdgDwyxzbService tGhdgDwyxzbService;


    public List<TGhdgDwyxzbDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TGhdgDwyxzb());
        return MyBeanUtils.copyPropertiesList(tGhdgDwyxzbService.selectList(entityWrapper), TGhdgDwyxzbDto.class);
    }

    public Page<TGhdgDwyxzbSelDto> getAllList(Page page, TGhdgDwyxzbSelDto tGhdgDwyxzbSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgDwyxzbSel tGhdgDwyxzbSel = new TGhdgDwyxzbSel();
        MyBeanUtils.copyProperties(tGhdgDwyxzbSelDto, tGhdgDwyxzbSel);
        entityWrapper.setEntity(tGhdgDwyxzbSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tGhdgDwyxzbSel);
        System.out.println(entityWrapper.getSqlSegment());
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgDwyxzbSel());
        MyBeanUtils.toPageBean(tGhdgDwyxzbService.selectPage(pagepojo, entityWrapper), page, tGhdgDwyxzbSelDto);
        return page;
    }

    public void update(TGhdgDwyxzbDto tGhdgDwyxzbDto) {
        TGhdgDwyxzb tGhdgDwyxzb = new TGhdgDwyxzb();
        MyBeanUtils.copyProperties(tGhdgDwyxzbDto, tGhdgDwyxzb);
        tGhdgDwyxzbService.updateById(tGhdgDwyxzb);
    }

    public void insert(TGhdgDwyxzbDto tGhdgDwyxzbDto) {
        TGhdgDwyxzb tGhdgDwyxzb = new TGhdgDwyxzb();
        MyBeanUtils.copyProperties(tGhdgDwyxzbDto, tGhdgDwyxzb);
        tGhdgDwyxzbService.insert(tGhdgDwyxzb);
    }

    public void delete(String id) {
        tGhdgDwyxzbService.deleteById(id);
    }

    public Page<TGhdgDwyxzbDto> getPages(Page<TGhdgDwyxzbDto> page, TGhdgDwyxzbDto tGhdgDwyxzbDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgDwyxzb tGhdgDwyxzb = new TGhdgDwyxzb();
        MyBeanUtils.copyProperties(tGhdgDwyxzbDto, tGhdgDwyxzb);
        entityWrapper.setEntity(tGhdgDwyxzb);
        Page<TGhdgDwyxzb> pagepojo = new Page<TGhdgDwyxzb>();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgDwyxzb());
        MyBeanUtils.toPageBean(tGhdgDwyxzbService.selectPage(pagepojo, entityWrapper), page, new TGhdgDwyxzbDto());
        return page;
    }
}

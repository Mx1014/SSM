package com.kylin.electricassistsys.server.impl.ghdg;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.ghdg.TGhdgJmfbDataApi;
import com.kylin.electricassistsys.dto.ghdg.TGhdgJmfbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgJmfbSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgJmfb;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgJmfbSel;
import com.kylin.electricassistsys.service.ghdg.TGhdgJmfbService;
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
public class TGhdgJmfbDataServerImpl implements TGhdgJmfbDataApi {
    @Autowired
    private TGhdgJmfbService tGhdgJmfbService;


    public List<TGhdgJmfbDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TGhdgJmfb());
        return MyBeanUtils.copyPropertiesList(tGhdgJmfbService.selectList(entityWrapper), TGhdgJmfbDto.class);
    }

    public Page<TGhdgJmfbSelDto> getAllList(Page page, TGhdgJmfbSelDto tGhdgJmfbSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgJmfbSel tGhdgJmfbSel = new TGhdgJmfbSel();
        MyBeanUtils.copyProperties(tGhdgJmfbSelDto, tGhdgJmfbSel);
        entityWrapper.setEntity(tGhdgJmfbSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tGhdgJmfbSel);
        System.out.println(entityWrapper.getSqlSegment());
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgJmfbSel());
        MyBeanUtils.toPageBean(tGhdgJmfbService.selectPage(pagepojo, entityWrapper), page, tGhdgJmfbSelDto);
        return page;
    }

    public void update(TGhdgJmfbDto tGhdgJmfbDto) {
        TGhdgJmfb tGhdgJmfb = new TGhdgJmfb();
        MyBeanUtils.copyProperties(tGhdgJmfbDto, tGhdgJmfb);
        tGhdgJmfbService.updateById(tGhdgJmfb);
    }

    public void insert(TGhdgJmfbDto tGhdgJmfbDto) {
        TGhdgJmfb tGhdgJmfb = new TGhdgJmfb();
        MyBeanUtils.copyProperties(tGhdgJmfbDto, tGhdgJmfb);
        tGhdgJmfbService.insert(tGhdgJmfb);
    }

    public void delete(String id) {
        tGhdgJmfbService.deleteById(id);
    }

    public Page<TGhdgJmfbDto> getPages(Page<TGhdgJmfbDto> page, TGhdgJmfbDto tGhdgJmfbDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgJmfb tGhdgJmfb = new TGhdgJmfb();
        MyBeanUtils.copyProperties(tGhdgJmfbDto, tGhdgJmfb);
        entityWrapper.setEntity(tGhdgJmfb);
        Page<TGhdgJmfb> pagepojo = new Page<TGhdgJmfb>();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgJmfb());
        MyBeanUtils.toPageBean(tGhdgJmfbService.selectPage(pagepojo, entityWrapper), page, new TGhdgJmfbDto());
        return page;
    }
}

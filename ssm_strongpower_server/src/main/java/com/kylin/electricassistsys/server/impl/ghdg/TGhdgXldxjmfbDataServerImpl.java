package com.kylin.electricassistsys.server.impl.ghdg;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.ghdg.TGhdgXldxjmfbDataApi;
import com.kylin.electricassistsys.dto.ghdg.TGhdgXldxjmfbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgXldxjmfbSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgXldxjmfb;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgXldxjmfbSel;
import com.kylin.electricassistsys.service.ghdg.TGhdgXldxjmfbService;
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
public class TGhdgXldxjmfbDataServerImpl implements TGhdgXldxjmfbDataApi {
    @Autowired
    private TGhdgXldxjmfbService tGhdgXldxjmfbService;


    public List<TGhdgXldxjmfbDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TGhdgXldxjmfb());
        return MyBeanUtils.copyPropertiesList(tGhdgXldxjmfbService.selectList(entityWrapper), TGhdgXldxjmfbDto.class);
    }

    public Page<TGhdgXldxjmfbSelDto> getAllList(Page page, TGhdgXldxjmfbSelDto tGhdgXldxjmfbSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgXldxjmfbSel tGhdgXldxjmfbSel = new TGhdgXldxjmfbSel();
        MyBeanUtils.copyProperties(tGhdgXldxjmfbSelDto, tGhdgXldxjmfbSel);
        entityWrapper.setEntity(tGhdgXldxjmfbSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tGhdgXldxjmfbSel);
        System.out.println(entityWrapper.getSqlSegment());
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgXldxjmfbSel());
        MyBeanUtils.toPageBean(tGhdgXldxjmfbService.selectPage(pagepojo, entityWrapper), page, tGhdgXldxjmfbSelDto);
        return page;
    }

    public void update(TGhdgXldxjmfbDto tGhdgXldxjmfbDto) {
        TGhdgXldxjmfb tGhdgXldxjmfb = new TGhdgXldxjmfb();
        MyBeanUtils.copyProperties(tGhdgXldxjmfbDto, tGhdgXldxjmfb);
        tGhdgXldxjmfbService.updateById(tGhdgXldxjmfb);
    }

    public void insert(TGhdgXldxjmfbDto tGhdgXldxjmfbDto) {
        TGhdgXldxjmfb tGhdgXldxjmfb = new TGhdgXldxjmfb();
        MyBeanUtils.copyProperties(tGhdgXldxjmfbDto, tGhdgXldxjmfb);
        tGhdgXldxjmfbService.insert(tGhdgXldxjmfb);
    }

    public void delete(String id) {
        tGhdgXldxjmfbService.deleteById(id);
    }

    public Page<TGhdgXldxjmfbDto> getPages(Page<TGhdgXldxjmfbDto> page, TGhdgXldxjmfbDto tGhdgXldxjmfbDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgXldxjmfb tGhdgXldxjmfb = new TGhdgXldxjmfb();
        MyBeanUtils.copyProperties(tGhdgXldxjmfbDto, tGhdgXldxjmfb);
        entityWrapper.setEntity(tGhdgXldxjmfb);
        Page<TGhdgXldxjmfb> pagepojo = new Page<TGhdgXldxjmfb>();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgXldxjmfb());
        MyBeanUtils.toPageBean(tGhdgXldxjmfbService.selectPage(pagepojo, entityWrapper), page, new TGhdgXldxjmfbDto());
        return page;
    }
}

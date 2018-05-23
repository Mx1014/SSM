package com.kylin.electricassistsys.server.impl.ghdg;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.ghdg.TGhdgDczjbDataApi;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDczjbDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgDczjb;
import com.kylin.electricassistsys.service.ghdg.TGhdgDczjbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TGhdgDczjbDataServerImpl implements TGhdgDczjbDataApi {
    @Autowired
    private TGhdgDczjbService tGhdgDczjbService;


    public List<TGhdgDczjbDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TGhdgDczjb());
        return MyBeanUtils.copyPropertiesList(tGhdgDczjbService.selectList(entityWrapper), TGhdgDczjbDto.class);
    }

    public void update(TGhdgDczjbDto tGhdgDczjbDto) {
        TGhdgDczjb tGhdgDczjb = new TGhdgDczjb();
        MyBeanUtils.copyProperties(tGhdgDczjbDto, tGhdgDczjb);
        tGhdgDczjbService.updateById(tGhdgDczjb);
    }

    public void insert(TGhdgDczjbDto tGhdgDczjbDto) {
        TGhdgDczjb tGhdgDczjb = new TGhdgDczjb();
        MyBeanUtils.copyProperties(tGhdgDczjbDto, tGhdgDczjb);
        tGhdgDczjbService.insert(tGhdgDczjb);
    }

    public void delete(String id) {
        tGhdgDczjbService.deleteById(id);
    }

    public Page<TGhdgDczjbDto> getPages(Page<TGhdgDczjbDto> page, TGhdgDczjbDto tGhdgDczjbDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TGhdgDczjb tGhdgDczjb = new TGhdgDczjb();
        MyBeanUtils.copyProperties(tGhdgDczjbDto, tGhdgDczjb);
        //entityWrapper.setEntity(tGhdgDczjb);
        entityWrapper.where(tGhdgDczjb.gettDczjbLx()!=null&&tGhdgDczjb.gettDczjbLx()!="","T_DCZJB_LX LIKE {0}","%"+tGhdgDczjb.gettDczjbLx()+"%");
        Page<TGhdgDczjb> pagepojo = new Page<TGhdgDczjb>();
        MyBeanUtils.toPageBean(page, pagepojo, new TGhdgDczjb());
        MyBeanUtils.toPageBean(tGhdgDczjbService.selectPage(pagepojo, entityWrapper), page, new TGhdgDczjbDto());
        return page;
    }

}

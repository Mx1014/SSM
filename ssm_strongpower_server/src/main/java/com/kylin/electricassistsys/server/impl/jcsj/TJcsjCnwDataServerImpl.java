package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjCnwDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCnwDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjCnw;
import com.kylin.electricassistsys.service.jcsj.TJcsjCnwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TJcsjCnwDataServerImpl implements TJcsjCnwDataApi {
    @Autowired
    private TJcsjCnwService tJcsjCnwService;


    public List<TJcsjCnwDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjCnw());
        return MyBeanUtils.copyPropertiesList(tJcsjCnwService.selectList(entityWrapper), TJcsjCnwDto.class);
    }

    public void update(TJcsjCnwDto tJcsjCnwDto) {
        TJcsjCnw tJcsjCnw = new TJcsjCnw();
        MyBeanUtils.copyProperties(tJcsjCnwDto, tJcsjCnw);
        tJcsjCnwService.updateById(tJcsjCnw);
    }

    public void insert(TJcsjCnwDto tJcsjCnwDto) {
        TJcsjCnw tJcsjCnw = new TJcsjCnw();
        MyBeanUtils.copyProperties(tJcsjCnwDto, tJcsjCnw);
        tJcsjCnwService.insert(tJcsjCnw);
    }

    public void delete(String id) {
        tJcsjCnwService.deleteById(id);
    }

    public Page<TJcsjCnwDto> getPages(Page<TJcsjCnwDto> page, TJcsjCnwDto tJcsjCnwDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjCnw tJcsjCnw = new TJcsjCnw();
        MyBeanUtils.copyProperties(tJcsjCnwDto, tJcsjCnw);
        //entityWrapper.setEntity(tJcsjCnw);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjCnw);
        //entityWrapper.where(tJcsjCnw.gettCnwName()!=null&&tJcsjCnw.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjCnw.gettCnwName()+"%");
        Page<TJcsjCnw> pagepojo = new Page<TJcsjCnw>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjCnw());
        MyBeanUtils.toPageBean(tJcsjCnwService.selectPage(pagepojo, entityWrapper), page, new TJcsjCnwDto());
        return page;
    }

}

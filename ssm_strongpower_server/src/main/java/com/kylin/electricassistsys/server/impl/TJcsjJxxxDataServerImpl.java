package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjJxxxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjJxxxDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjJxxx;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxx;
import com.kylin.electricassistsys.service.jcsj.TJcsjJxxxService;
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
public class TJcsjJxxxDataServerImpl implements TJcsjJxxxDataApi {
    @Autowired
    private TJcsjJxxxService tJcsjJxxxService;


    public List<TJcsjJxxxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjJxxx());
        return MyBeanUtils.copyPropertiesList(tJcsjJxxxService.selectList(entityWrapper), TJcsjJxxxDto.class);
    }

    public void update(TJcsjJxxxDto tJcsjJxxxDto) {
        TJcsjJxxx tJcsjJxxx = new TJcsjJxxx();
        MyBeanUtils.copyProperties(tJcsjJxxxDto, tJcsjJxxx);
        tJcsjJxxxService.updateById(tJcsjJxxx);
    }

    public void insert(TJcsjJxxxDto tJcsjJxxxDto) {
        TJcsjJxxx tJcsjJxxx = new TJcsjJxxx();
        MyBeanUtils.copyProperties(tJcsjJxxxDto, tJcsjJxxx);
        tJcsjJxxxService.insert(tJcsjJxxx);
    }

    public void delete(String id) {
        tJcsjJxxxService.deleteById(id);
    }

    public Page<TJcsjJxxxDto> getPages(Page<TJcsjJxxxDto> page, TJcsjJxxxDto tJcsjJxxxDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjJxxx tJcsjJxxx = new TJcsjJxxx();
        MyBeanUtils.copyProperties(tJcsjJxxxDto, tJcsjJxxx);
        entityWrapper.setEntity(tJcsjJxxx);
        Page<TJcsjJxxx> pagepojo = new Page<TJcsjJxxx>();
        MyBeanUtils.toPageBean(page, pagepojo, new TSbsjBdzxx());
        MyBeanUtils.toPageBean(tJcsjJxxxService.selectPage(pagepojo, entityWrapper), page, new TJcsjJxxxDto());
        return page;
    }
}

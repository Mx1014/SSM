package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjAzxsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjAzxsDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjAzxs;
import com.kylin.electricassistsys.service.jcsj.TJcsjAzxsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjAzxsDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 安装形式操作Api实现
 */
@Service
public class TJcsjAzxsDataServerImpl implements TJcsjAzxsDataApi {
    @Autowired
    private TJcsjAzxsService tJcsjAzxsService;


    public List<TJcsjAzxsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjAzxs());
        return MyBeanUtils.copyPropertiesList(tJcsjAzxsService.selectList(entityWrapper), TJcsjAzxsDto.class);
    }

    public void update(TJcsjAzxsDto tJcsjAzxsDto) {
        TJcsjAzxs tJcsjAzxs = new TJcsjAzxs();
        MyBeanUtils.copyProperties(tJcsjAzxsDto, tJcsjAzxs);
        tJcsjAzxsService.updateById(tJcsjAzxs);
    }

    public void insert(TJcsjAzxsDto tJcsjAzxsDto) {
        TJcsjAzxs tJcsjAzxs = new TJcsjAzxs();
        MyBeanUtils.copyProperties(tJcsjAzxsDto, tJcsjAzxs);
        tJcsjAzxsService.insert(tJcsjAzxs);
    }

    public void delete(String id) {
        tJcsjAzxsService.deleteById(id);
    }

    public Page<TJcsjAzxsDto> getPages(Page<TJcsjAzxsDto> page, TJcsjAzxsDto tJcsjAzxsDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjAzxs tJcsjAzxs = new TJcsjAzxs();
        MyBeanUtils.copyProperties(tJcsjAzxsDto, tJcsjAzxs);
        //entityWrapper.setEntity(tJcsjAzxs);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjAzxs);
        //entityWrapper.where(tJcsjAzxs.gettCnwName()!=null&&tJcsjAzxs.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjAzxs.gettCnwName()+"%");
        Page<TJcsjAzxs> pagepojo = new Page<TJcsjAzxs>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjAzxs());
        MyBeanUtils.toPageBean(tJcsjAzxsService.selectPage(pagepojo, entityWrapper), page, new TJcsjAzxsDto());
        return page;
    }

}

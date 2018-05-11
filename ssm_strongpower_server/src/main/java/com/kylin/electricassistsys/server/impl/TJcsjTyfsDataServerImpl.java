package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjTyfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjTyfsDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjTyfs;
import com.kylin.electricassistsys.service.jcsj.TJcsjTyfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjTyfsDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 调压方式操作Api实现
 */
@Service
public class TJcsjTyfsDataServerImpl implements TJcsjTyfsDataApi {
    @Autowired
    private TJcsjTyfsService tJcsjTyfsService;


    public List<TJcsjTyfsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjTyfs());
        return MyBeanUtils.copyPropertiesList(tJcsjTyfsService.selectList(entityWrapper), TJcsjTyfsDto.class);
    }

    public void update(TJcsjTyfsDto tJcsjTyfsDto) {
        TJcsjTyfs tJcsjTyfs = new TJcsjTyfs();
        MyBeanUtils.copyProperties(tJcsjTyfsDto, tJcsjTyfs);
        tJcsjTyfsService.updateById(tJcsjTyfs);
    }

    public void insert(TJcsjTyfsDto tJcsjTyfsDto) {
        TJcsjTyfs tJcsjTyfs = new TJcsjTyfs();
        MyBeanUtils.copyProperties(tJcsjTyfsDto, tJcsjTyfs);
        tJcsjTyfsService.insert(tJcsjTyfs);
    }

    public void delete(String id) {
        tJcsjTyfsService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjTyfsService.deleteBatchIds(idsList);
    }

    public Page<TJcsjTyfsDto> getPages(Page<TJcsjTyfsDto> page, TJcsjTyfsDto tJcsjTyfsDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjTyfs tJcsjTyfs = new TJcsjTyfs();
        MyBeanUtils.copyProperties(tJcsjTyfsDto, tJcsjTyfs);
        //entityWrapper.setEntity(tJcsjTyfs);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjTyfs);
        //entityWrapper.where(tJcsjTyfs.gettCnwName()!=null&&tJcsjTyfs.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjTyfs.gettCnwName()+"%");
        Page<TJcsjTyfs> pagepojo = new Page<TJcsjTyfs>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjTyfs());
        MyBeanUtils.toPageBean(tJcsjTyfsService.selectPage(pagepojo, entityWrapper), page, new TJcsjTyfsDto());
        return page;
    }

}

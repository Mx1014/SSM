package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjGypdzzlxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjGypdzzlxDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjGypdzzlx;
import com.kylin.electricassistsys.service.jcsj.TJcsjGypdzzlxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjGypdzzlxDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 高压配电装置类型操作Api实现
 */
@Service
public class TJcsjGypdzzlxDataServerImpl implements TJcsjGypdzzlxDataApi {
    @Autowired
    private TJcsjGypdzzlxService tJcsjGypdzzlxService;


    public List<TJcsjGypdzzlxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjGypdzzlx());
        return MyBeanUtils.copyPropertiesList(tJcsjGypdzzlxService.selectList(entityWrapper), TJcsjGypdzzlxDto.class);
    }

    public void update(TJcsjGypdzzlxDto tJcsjGypdzzlxDto) {
        TJcsjGypdzzlx tJcsjGypdzzlx = new TJcsjGypdzzlx();
        MyBeanUtils.copyProperties(tJcsjGypdzzlxDto, tJcsjGypdzzlx);
        tJcsjGypdzzlxService.updateById(tJcsjGypdzzlx);
    }

    public void insert(TJcsjGypdzzlxDto tJcsjGypdzzlxDto) {
        TJcsjGypdzzlx tJcsjGypdzzlx = new TJcsjGypdzzlx();
        MyBeanUtils.copyProperties(tJcsjGypdzzlxDto, tJcsjGypdzzlx);
        tJcsjGypdzzlxService.insert(tJcsjGypdzzlx);
    }

    public void delete(String id) {
        tJcsjGypdzzlxService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjGypdzzlxService.deleteBatchIds(idsList);
    }

    public Page<TJcsjGypdzzlxDto> getPages(Page<TJcsjGypdzzlxDto> page, TJcsjGypdzzlxDto tJcsjGypdzzlxDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjGypdzzlx tJcsjGypdzzlx = new TJcsjGypdzzlx();
        MyBeanUtils.copyProperties(tJcsjGypdzzlxDto, tJcsjGypdzzlx);
        //entityWrapper.setEntity(tJcsjGypdzzlx);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjGypdzzlx);
        //entityWrapper.where(tJcsjGypdzzlx.gettCnwName()!=null&&tJcsjGypdzzlx.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjGypdzzlx.gettCnwName()+"%");
        Page<TJcsjGypdzzlx> pagepojo = new Page<TJcsjGypdzzlx>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjGypdzzlx());
        MyBeanUtils.toPageBean(tJcsjGypdzzlxService.selectPage(pagepojo, entityWrapper), page, new TJcsjGypdzzlxDto());
        return page;
    }

}

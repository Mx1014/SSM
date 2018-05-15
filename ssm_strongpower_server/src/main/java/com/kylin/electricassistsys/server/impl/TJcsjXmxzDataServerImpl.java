package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjXmxzDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjXmxzDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjXmxz;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjXmxzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjXmxzDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 项目性质操作Api实现
 */
@Service
public class TJcsjXmxzDataServerImpl implements TJcsjXmxzDataApi {
    @Autowired
    private TJcsjXmxzService tJcsjXmxzService;


    public List<TJcsjXmxzDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjXmxz());
        return MyBeanUtils.copyPropertiesList(tJcsjXmxzService.selectList(entityWrapper), TJcsjXmxzDto.class);
    }

    public void update(TJcsjXmxzDto tJcsjXmxzDto) {
        TJcsjXmxz tJcsjXmxz = new TJcsjXmxz();
        MyBeanUtils.copyProperties(tJcsjXmxzDto, tJcsjXmxz);
        tJcsjXmxzService.updateById(tJcsjXmxz);
    }

    public void insert(TJcsjXmxzDto tJcsjXmxzDto) {
        TJcsjXmxz tJcsjXmxz = new TJcsjXmxz();
        MyBeanUtils.copyProperties(tJcsjXmxzDto, tJcsjXmxz);
        tJcsjXmxz.settXmxzId(UUIDKey.getKey());
        tJcsjXmxzService.insert(tJcsjXmxz);
    }

    public void delete(String id) {
        tJcsjXmxzService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjXmxzService.deleteBatchIds(idsList);
    }

    public Page<TJcsjXmxzDto> getPages(Page<TJcsjXmxzDto> page, TJcsjXmxzDto tJcsjXmxzDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjXmxz tJcsjXmxz = new TJcsjXmxz();
        MyBeanUtils.copyProperties(tJcsjXmxzDto, tJcsjXmxz);
        //entityWrapper.setEntity(tJcsjXmxz);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjXmxz);
        //entityWrapper.where(tJcsjXmxz.gettCnwName()!=null&&tJcsjXmxz.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjXmxz.gettCnwName()+"%");
        Page<TJcsjXmxz> pagepojo = new Page<TJcsjXmxz>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjXmxz());
        MyBeanUtils.toPageBean(tJcsjXmxzService.selectPage(pagepojo, entityWrapper), page, new TJcsjXmxzDto());
        return page;
    }

}

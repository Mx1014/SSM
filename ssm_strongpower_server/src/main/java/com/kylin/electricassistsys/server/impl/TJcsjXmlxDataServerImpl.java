package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjXmlxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjXmlxDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjXmlx;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjXmlxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjXmlxDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 项目类型操作Api实现
 */
@Service
public class TJcsjXmlxDataServerImpl implements TJcsjXmlxDataApi {
    @Autowired
    private TJcsjXmlxService tJcsjXmlxService;


    public List<TJcsjXmlxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjXmlx());
        return MyBeanUtils.copyPropertiesList(tJcsjXmlxService.selectList(entityWrapper), TJcsjXmlxDto.class);
    }

    public void update(TJcsjXmlxDto tJcsjXmlxDto) {
        TJcsjXmlx tJcsjXmlx = new TJcsjXmlx();
        MyBeanUtils.copyProperties(tJcsjXmlxDto, tJcsjXmlx);
        tJcsjXmlxService.updateById(tJcsjXmlx);
    }

    public void insert(TJcsjXmlxDto tJcsjXmlxDto) {
        TJcsjXmlx tJcsjXmlx = new TJcsjXmlx();
        MyBeanUtils.copyProperties(tJcsjXmlxDto, tJcsjXmlx);
        tJcsjXmlx.settXmlxId(UUIDKey.getKey());
        tJcsjXmlxService.insert(tJcsjXmlx);
    }

    public void delete(String id) {
        tJcsjXmlxService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjXmlxService.deleteBatchIds(idsList);
    }

    public Page<TJcsjXmlxDto> getPages(Page<TJcsjXmlxDto> page, TJcsjXmlxDto tJcsjXmlxDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjXmlx tJcsjXmlx = new TJcsjXmlx();
        MyBeanUtils.copyProperties(tJcsjXmlxDto, tJcsjXmlx);
        //entityWrapper.setEntity(tJcsjXmlx);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjXmlx);
        //entityWrapper.where(tJcsjXmlx.gettCnwName()!=null&&tJcsjXmlx.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjXmlx.gettCnwName()+"%");
        Page<TJcsjXmlx> pagepojo = new Page<TJcsjXmlx>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjXmlx());
        MyBeanUtils.toPageBean(tJcsjXmlxService.selectPage(pagepojo, entityWrapper), page, new TJcsjXmlxDto());
        return page;
    }

}

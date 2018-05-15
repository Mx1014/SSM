package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjCsByqcsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsByqcsDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsByqcsSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjCsByqcs;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjCsByqcsSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjCsByqcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjCsByqcsDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 变压器参数操作Api实现
 */
@Service
public class TJcsjCsByqcsDataServerImpl implements TJcsjCsByqcsDataApi {
    @Autowired
    private TJcsjCsByqcsService tJcsjCsByqcsService;


    public List<TJcsjCsByqcsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjCsByqcs());
        return MyBeanUtils.copyPropertiesList(tJcsjCsByqcsService.selectList(entityWrapper), TJcsjCsByqcsDto.class);
    }

    public void update(TJcsjCsByqcsDto tJcsjCsByqcsDto) {
        TJcsjCsByqcs tJcsjCsByqcs = new TJcsjCsByqcs();
        MyBeanUtils.copyProperties(tJcsjCsByqcsDto, tJcsjCsByqcs);
        tJcsjCsByqcsService.updateById(tJcsjCsByqcs);
    }

    public void insert(TJcsjCsByqcsDto tJcsjCsByqcsDto) {
        TJcsjCsByqcs tJcsjCsByqcs = new TJcsjCsByqcs();
        MyBeanUtils.copyProperties(tJcsjCsByqcsDto, tJcsjCsByqcs);
        tJcsjCsByqcs.settByqcsId(UUIDKey.getKey());
        tJcsjCsByqcsService.insert(tJcsjCsByqcs);
    }

    public void delete(String id) {
        tJcsjCsByqcsService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjCsByqcsService.deleteBatchIds(idsList);
    }

    public Page<TJcsjCsByqcsSelDto> getPages(Page<TJcsjCsByqcsSelDto> page, TJcsjCsByqcsSelDto tJcsjCsByqcsSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjCsByqcsSel tJcsjCsByqcsSel = new TJcsjCsByqcsSel();
        MyBeanUtils.copyProperties(tJcsjCsByqcsSelDto, tJcsjCsByqcsSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjCsByqcsSel);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjCsByqcsSel());
        MyBeanUtils.toPageBean(tJcsjCsByqcsService.selectPage(pagepojo, entityWrapper), page, new TJcsjCsByqcsSelDto());
        return page;
    }

}

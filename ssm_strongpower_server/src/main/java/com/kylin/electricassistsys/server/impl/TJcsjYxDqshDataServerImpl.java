package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjYxDqshDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxDqshDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxDqshSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjYxDqsh;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjYxDqshSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjYxDqshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjYxDqshDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 地区经济和社会信息操作Api实现
 */
@Service
public class TJcsjYxDqshDataServerImpl implements TJcsjYxDqshDataApi {
    @Autowired
    private TJcsjYxDqshService tJcsjYxDqshService;


    public List<TJcsjYxDqshDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjYxDqsh());
        return MyBeanUtils.copyPropertiesList(tJcsjYxDqshService.selectList(entityWrapper), TJcsjYxDqshDto.class);
    }

    public void update(TJcsjYxDqshDto tJcsjYxDqshDto) {
        TJcsjYxDqsh tJcsjYxDqsh = new TJcsjYxDqsh();
        MyBeanUtils.copyProperties(tJcsjYxDqshDto, tJcsjYxDqsh);
        tJcsjYxDqshService.updateById(tJcsjYxDqsh);
    }

    public void insert(TJcsjYxDqshDto tJcsjYxDqshDto) {
        TJcsjYxDqsh tJcsjYxDqsh = new TJcsjYxDqsh();
        MyBeanUtils.copyProperties(tJcsjYxDqshDto, tJcsjYxDqsh);
        tJcsjYxDqsh.settDqshId(UUIDKey.getKey());
        tJcsjYxDqshService.insert(tJcsjYxDqsh);
    }

    public void delete(String id) {
        tJcsjYxDqshService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjYxDqshService.deleteBatchIds(idsList);
    }

    public Page<TJcsjYxDqshSelDto> getPages(Page<TJcsjYxDqshSelDto> page, TJcsjYxDqshSelDto tJcsjYxDqshSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjYxDqshSel tJcsjYxDqshSel = new TJcsjYxDqshSel();
        MyBeanUtils.copyProperties(tJcsjYxDqshSelDto, tJcsjYxDqshSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjYxDqshSel);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjYxDqshSel());
        MyBeanUtils.toPageBean(tJcsjYxDqshService.selectPage(pagepojo, entityWrapper), page, new TJcsjYxDqshSelDto());
        return page;
    }

}

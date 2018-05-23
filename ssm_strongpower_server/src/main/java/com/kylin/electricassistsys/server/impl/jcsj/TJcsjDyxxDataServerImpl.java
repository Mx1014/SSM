package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjDyxxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDyxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDyxxSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjDyxx;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjDyxxSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjDyxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjDyxxDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 电源信息操作Api实现
 */
@Service
public class TJcsjDyxxDataServerImpl implements TJcsjDyxxDataApi {
    @Autowired
    private TJcsjDyxxService tJcsjDyxxService;


    public List<TJcsjDyxxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjDyxx());
        return MyBeanUtils.copyPropertiesList(tJcsjDyxxService.selectList(entityWrapper), TJcsjDyxxDto.class);
    }

    public void update(TJcsjDyxxDto tJcsjDyxxDto) {
        TJcsjDyxx tJcsjDyxx = new TJcsjDyxx();
        MyBeanUtils.copyProperties(tJcsjDyxxDto, tJcsjDyxx);
        tJcsjDyxxService.updateById(tJcsjDyxx);
    }

    public void insert(TJcsjDyxxDto tJcsjDyxxDto) {
        TJcsjDyxx tJcsjDyxx = new TJcsjDyxx();
        MyBeanUtils.copyProperties(tJcsjDyxxDto, tJcsjDyxx);
        tJcsjDyxx.settDyxxId(UUIDKey.getKey());
        tJcsjDyxxService.insert(tJcsjDyxx);
    }

    public void delete(String id) {
        tJcsjDyxxService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjDyxxService.deleteBatchIds(idsList);
    }

    public Page<TJcsjDyxxSelDto> getPages(Page<TJcsjDyxxSelDto> page, TJcsjDyxxSelDto tJcsjDyxxSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjDyxxSel tJcsjDyxxSel = new TJcsjDyxxSel();
        MyBeanUtils.copyProperties(tJcsjDyxxSelDto, tJcsjDyxxSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjDyxxSel);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjDyxxSel());
        MyBeanUtils.toPageBean(tJcsjDyxxService.selectPage(pagepojo, entityWrapper), page, new TJcsjDyxxSelDto());
        return page;
    }

}

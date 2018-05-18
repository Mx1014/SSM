package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjDylxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDylxDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjDylx;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjDylxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjDylxDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 电源类型操作Api实现
 */
@Service
public class TJcsjDylxDataServerImpl implements TJcsjDylxDataApi {
    @Autowired
    private TJcsjDylxService tJcsjDylxService;


    public List<TJcsjDylxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjDylx());
        return MyBeanUtils.copyPropertiesList(tJcsjDylxService.selectList(entityWrapper), TJcsjDylxDto.class);
    }

    public void update(TJcsjDylxDto tJcsjDylxDto) {
        TJcsjDylx tJcsjDylx = new TJcsjDylx();
        MyBeanUtils.copyProperties(tJcsjDylxDto, tJcsjDylx);
        tJcsjDylx.settDylxId(UUIDKey.getKey());
        tJcsjDylxService.updateById(tJcsjDylx);
    }

    public void insert(TJcsjDylxDto tJcsjDylxDto) {
        TJcsjDylx tJcsjDylx = new TJcsjDylx();
        MyBeanUtils.copyProperties(tJcsjDylxDto, tJcsjDylx);
        tJcsjDylxService.insert(tJcsjDylx);
    }

    public void delete(String id) {
        tJcsjDylxService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjDylxService.deleteBatchIds(idsList);
    }

    public Page<TJcsjDylxDto> getPages(Page<TJcsjDylxDto> page, TJcsjDylxDto tJcsjDylxDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjDylx tJcsjDylx = new TJcsjDylx();
        MyBeanUtils.copyProperties(tJcsjDylxDto, tJcsjDylx);
        //entityWrapper.setEntity(tJcsjDylx);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjDylx);
        //entityWrapper.where(tJcsjDylx.gettCnwName()!=null&&tJcsjDylx.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjDylx.gettCnwName()+"%");
        Page<TJcsjDylx> pagepojo = new Page<TJcsjDylx>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjDylx());
        MyBeanUtils.toPageBean(tJcsjDylxService.selectPage(pagepojo, entityWrapper), page, new TJcsjDylxDto());
        return page;
    }

}

package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjZllxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZllxDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjZllx;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjZllxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjZllxDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 资料类型操作Api实现
 */
@Service
public class TJcsjZllxDataServerImpl implements TJcsjZllxDataApi {
    @Autowired
    private TJcsjZllxService tJcsjZllxService;


    public List<TJcsjZllxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjZllx());
        return MyBeanUtils.copyPropertiesList(tJcsjZllxService.selectList(entityWrapper), TJcsjZllxDto.class);
    }

    public void update(TJcsjZllxDto tJcsjZllxDto) {
        TJcsjZllx tJcsjZllx = new TJcsjZllx();
        MyBeanUtils.copyProperties(tJcsjZllxDto, tJcsjZllx);
        tJcsjZllxService.updateById(tJcsjZllx);
    }

    public void insert(TJcsjZllxDto tJcsjZllxDto) {
        TJcsjZllx tJcsjZllx = new TJcsjZllx();
        MyBeanUtils.copyProperties(tJcsjZllxDto, tJcsjZllx);
        tJcsjZllx.settZllxId(UUIDKey.getKey());
        tJcsjZllxService.insert(tJcsjZllx);
    }

    public void delete(String id) {
        tJcsjZllxService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjZllxService.deleteBatchIds(idsList);
    }

    public Page<TJcsjZllxDto> getPages(Page<TJcsjZllxDto> page, TJcsjZllxDto tJcsjZllxDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjZllx tJcsjZllx = new TJcsjZllx();
        MyBeanUtils.copyProperties(tJcsjZllxDto, tJcsjZllx);
        //entityWrapper.setEntity(tJcsjZllx);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjZllx);
        //entityWrapper.where(tJcsjZllx.gettCnwName()!=null&&tJcsjZllx.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjZllx.gettCnwName()+"%");
        Page<TJcsjZllx> pagepojo = new Page<TJcsjZllx>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjZllx());
        MyBeanUtils.toPageBean(tJcsjZllxService.selectPage(pagepojo, entityWrapper), page, new TJcsjZllxDto());
        return page;
    }

}

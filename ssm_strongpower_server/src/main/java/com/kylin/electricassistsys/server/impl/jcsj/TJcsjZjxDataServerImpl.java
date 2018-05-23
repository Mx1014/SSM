package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjZjxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZjxDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjZjx;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjZjxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjZjxDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 主接线操作Api实现
 */
@Service
public class TJcsjZjxDataServerImpl implements TJcsjZjxDataApi {
    @Autowired
    private TJcsjZjxService tJcsjZjxService;


    public List<TJcsjZjxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjZjx());
        return MyBeanUtils.copyPropertiesList(tJcsjZjxService.selectList(entityWrapper), TJcsjZjxDto.class);
    }

    public void update(TJcsjZjxDto tJcsjZjxDto) {
        TJcsjZjx tJcsjZjx = new TJcsjZjx();
        MyBeanUtils.copyProperties(tJcsjZjxDto, tJcsjZjx);
        tJcsjZjxService.updateById(tJcsjZjx);
    }

    public void insert(TJcsjZjxDto tJcsjZjxDto) {
        TJcsjZjx tJcsjZjx = new TJcsjZjx();
        MyBeanUtils.copyProperties(tJcsjZjxDto, tJcsjZjx);
        tJcsjZjx.settZjxId(UUIDKey.getKey());
        tJcsjZjxService.insert(tJcsjZjx);
    }

    public void delete(String id) {
        tJcsjZjxService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjZjxService.deleteBatchIds(idsList);
    }

    public Page<TJcsjZjxDto> getPages(Page<TJcsjZjxDto> page, TJcsjZjxDto tJcsjZjxDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjZjx tJcsjZjx = new TJcsjZjx();
        MyBeanUtils.copyProperties(tJcsjZjxDto, tJcsjZjx);
        //entityWrapper.setEntity(tJcsjZjx);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjZjx);
        //entityWrapper.where(tJcsjZjx.gettCnwName()!=null&&tJcsjZjx.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjZjx.gettCnwName()+"%");
        Page<TJcsjZjx> pagepojo = new Page<TJcsjZjx>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjZjx());
        MyBeanUtils.toPageBean(tJcsjZjxService.selectPage(pagepojo, entityWrapper), page, new TJcsjZjxDto());
        return page;
    }

}

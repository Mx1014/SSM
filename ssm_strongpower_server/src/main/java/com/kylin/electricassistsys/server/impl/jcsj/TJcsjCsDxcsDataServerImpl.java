package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjCsDxcsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsDxcsDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjCsDxcs;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjCsDxcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjCsDxcsDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 导线参数操作Api实现
 */
@Service
public class TJcsjCsDxcsDataServerImpl implements TJcsjCsDxcsDataApi {
    @Autowired
    private TJcsjCsDxcsService tJcsjCsDxcsService;


    public List<TJcsjCsDxcsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjCsDxcs());
        return MyBeanUtils.copyPropertiesList(tJcsjCsDxcsService.selectList(entityWrapper), TJcsjCsDxcsDto.class);
    }

    public void update(TJcsjCsDxcsDto tJcsjCsDxcsDto) {
        TJcsjCsDxcs tJcsjCsDxcs = new TJcsjCsDxcs();
        MyBeanUtils.copyProperties(tJcsjCsDxcsDto, tJcsjCsDxcs);
        tJcsjCsDxcsService.updateById(tJcsjCsDxcs);
    }

    public void insert(TJcsjCsDxcsDto tJcsjCsDxcsDto) {
        TJcsjCsDxcs tJcsjCsDxcs = new TJcsjCsDxcs();
        MyBeanUtils.copyProperties(tJcsjCsDxcsDto, tJcsjCsDxcs);
        tJcsjCsDxcs.settDxcsDxid(UUIDKey.getKey());
        tJcsjCsDxcsService.insert(tJcsjCsDxcs);
    }

    public void delete(String id) {
        tJcsjCsDxcsService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjCsDxcsService.deleteBatchIds(idsList);
    }

    public Page<TJcsjCsDxcsDto> getPages(Page<TJcsjCsDxcsDto> page, TJcsjCsDxcsDto tJcsjCsDxcsDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjCsDxcs tJcsjCsDxcs = new TJcsjCsDxcs();
        MyBeanUtils.copyProperties(tJcsjCsDxcsDto, tJcsjCsDxcs);
        //entityWrapper.setEntity(tJcsjCsDxcs);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjCsDxcs);
        //entityWrapper.where(tJcsjCsDxcs.gettCnwName()!=null&&tJcsjCsDxcs.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjCsDxcs.gettCnwName()+"%");
        Page<TJcsjCsDxcs> pagepojo = new Page<TJcsjCsDxcs>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjCsDxcs());
        MyBeanUtils.toPageBean(tJcsjCsDxcsService.selectPage(pagepojo, entityWrapper), page, new TJcsjCsDxcsDto());
        return page;
    }

}

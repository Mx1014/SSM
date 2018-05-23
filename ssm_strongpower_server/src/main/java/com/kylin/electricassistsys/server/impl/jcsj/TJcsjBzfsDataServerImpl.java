package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjBzfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjBzfsDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjBzfs;
import com.kylin.electricassistsys.service.jcsj.TJcsjBzfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjBzfsDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 布置方式操作Api实现
 */
@Service
public class TJcsjBzfsDataServerImpl implements TJcsjBzfsDataApi {
    @Autowired
    private TJcsjBzfsService tJcsjBzfsService;


    public List<TJcsjBzfsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjBzfs());
        return MyBeanUtils.copyPropertiesList(tJcsjBzfsService.selectList(entityWrapper), TJcsjBzfsDto.class);
    }

    public void update(TJcsjBzfsDto tJcsjBzfsDto) {
        TJcsjBzfs tJcsjBzfs = new TJcsjBzfs();
        MyBeanUtils.copyProperties(tJcsjBzfsDto, tJcsjBzfs);
        tJcsjBzfsService.updateById(tJcsjBzfs);
    }

    public void insert(TJcsjBzfsDto tJcsjBzfsDto) {
        TJcsjBzfs tJcsjBzfs = new TJcsjBzfs();
        MyBeanUtils.copyProperties(tJcsjBzfsDto, tJcsjBzfs);
        tJcsjBzfsService.insert(tJcsjBzfs);
    }

    public void delete(String id) {
        tJcsjBzfsService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjBzfsService.deleteBatchIds(idsList);
    }

    public Page<TJcsjBzfsDto> getPages(Page<TJcsjBzfsDto> page, TJcsjBzfsDto tJcsjBzfsDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjBzfs tJcsjBzfs = new TJcsjBzfs();
        MyBeanUtils.copyProperties(tJcsjBzfsDto, tJcsjBzfs);
        //entityWrapper.setEntity(tJcsjBzfs);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjBzfs);
        //entityWrapper.where(tJcsjBzfs.gettCnwName()!=null&&tJcsjBzfs.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjBzfs.gettCnwName()+"%");
        Page<TJcsjBzfs> pagepojo = new Page<TJcsjBzfs>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjBzfs());
        MyBeanUtils.toPageBean(tJcsjBzfsService.selectPage(pagepojo, entityWrapper), page, new TJcsjBzfsDto());
        return page;
    }

}

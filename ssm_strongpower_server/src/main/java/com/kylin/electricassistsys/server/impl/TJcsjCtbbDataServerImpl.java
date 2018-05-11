package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjCtbbDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCtbbDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjCtbb;
import com.kylin.electricassistsys.service.jcsj.TJcsjCtbbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjCtbbDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: CT变比操作Api实现
 */
@Service
public class TJcsjCtbbDataServerImpl implements TJcsjCtbbDataApi {
    @Autowired
    private TJcsjCtbbService tJcsjCtbbService;


    public List<TJcsjCtbbDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjCtbb());
        return MyBeanUtils.copyPropertiesList(tJcsjCtbbService.selectList(entityWrapper), TJcsjCtbbDto.class);
    }

    public void update(TJcsjCtbbDto tJcsjCtbbDto) {
        TJcsjCtbb tJcsjCtbb = new TJcsjCtbb();
        MyBeanUtils.copyProperties(tJcsjCtbbDto, tJcsjCtbb);
        tJcsjCtbbService.updateById(tJcsjCtbb);
    }

    public void insert(TJcsjCtbbDto tJcsjCtbbDto) {
        TJcsjCtbb tJcsjCtbb = new TJcsjCtbb();
        MyBeanUtils.copyProperties(tJcsjCtbbDto, tJcsjCtbb);
        tJcsjCtbbService.insert(tJcsjCtbb);
    }

    public void delete(String id) {
        tJcsjCtbbService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjCtbbService.deleteBatchIds(idsList);
    }

    public Page<TJcsjCtbbDto> getPages(Page<TJcsjCtbbDto> page, TJcsjCtbbDto tJcsjCtbbDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjCtbb tJcsjCtbb = new TJcsjCtbb();
        MyBeanUtils.copyProperties(tJcsjCtbbDto, tJcsjCtbb);
        //entityWrapper.setEntity(tJcsjCtbb);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjCtbb);
        //entityWrapper.where(tJcsjCtbb.gettCnwName()!=null&&tJcsjCtbb.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjCtbb.gettCnwName()+"%");
        Page<TJcsjCtbb> pagepojo = new Page<TJcsjCtbb>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjCtbb());
        MyBeanUtils.toPageBean(tJcsjCtbbService.selectPage(pagepojo, entityWrapper), page, new TJcsjCtbbDto());
        return page;
    }

}

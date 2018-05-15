package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjMpbbDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjMpbbDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjMpbb;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjMpbbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjMpbbDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 铭牌变比操作Api实现
 */
@Service
public class TJcsjMpbbDataServerImpl implements TJcsjMpbbDataApi {
    @Autowired
    private TJcsjMpbbService tJcsjMpbbService;


    public List<TJcsjMpbbDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjMpbb());
        return MyBeanUtils.copyPropertiesList(tJcsjMpbbService.selectList(entityWrapper), TJcsjMpbbDto.class);
    }

    public void update(TJcsjMpbbDto tJcsjMpbbDto) {
        TJcsjMpbb tJcsjMpbb = new TJcsjMpbb();
        MyBeanUtils.copyProperties(tJcsjMpbbDto, tJcsjMpbb);
        tJcsjMpbbService.updateById(tJcsjMpbb);
    }

    public void insert(TJcsjMpbbDto tJcsjMpbbDto) {
        TJcsjMpbb tJcsjMpbb = new TJcsjMpbb();
        MyBeanUtils.copyProperties(tJcsjMpbbDto, tJcsjMpbb);
        tJcsjMpbb.settMpbbId(UUIDKey.getKey());
        tJcsjMpbbService.insert(tJcsjMpbb);
    }

    public void delete(String id) {
        tJcsjMpbbService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjMpbbService.deleteBatchIds(idsList);
    }

    public Page<TJcsjMpbbDto> getPages(Page<TJcsjMpbbDto> page, TJcsjMpbbDto tJcsjMpbbDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjMpbb tJcsjMpbb = new TJcsjMpbb();
        MyBeanUtils.copyProperties(tJcsjMpbbDto, tJcsjMpbb);
        //entityWrapper.setEntity(tJcsjMpbb);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjMpbb);
        //entityWrapper.where(tJcsjMpbb.gettCnwName()!=null&&tJcsjMpbb.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjMpbb.gettCnwName()+"%");
        Page<TJcsjMpbb> pagepojo = new Page<TJcsjMpbb>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjMpbb());
        MyBeanUtils.toPageBean(tJcsjMpbbService.selectPage(pagepojo, entityWrapper), page, new TJcsjMpbbDto());
        return page;
    }

}

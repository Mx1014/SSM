package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjYxLsfhdlDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxLsfhdlDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjYxLsfhdlSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjYxLsfhdl;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjYxLsfhdlSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjYxLsfhdlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjYxLsfhdlDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 历史负荷电量信息操作Api实现
 */
@Service
public class TJcsjYxLsfhdlDataServerImpl implements TJcsjYxLsfhdlDataApi {
    @Autowired
    private TJcsjYxLsfhdlService tJcsjYxLsfhdlService;


    public List<TJcsjYxLsfhdlDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjYxLsfhdl());
        return MyBeanUtils.copyPropertiesList(tJcsjYxLsfhdlService.selectList(entityWrapper), TJcsjYxLsfhdlDto.class);
    }

    public void update(TJcsjYxLsfhdlDto tJcsjYxLsfhdlDto) {
        TJcsjYxLsfhdl tJcsjYxLsfhdl = new TJcsjYxLsfhdl();
        MyBeanUtils.copyProperties(tJcsjYxLsfhdlDto, tJcsjYxLsfhdl);
        tJcsjYxLsfhdlService.updateById(tJcsjYxLsfhdl);
    }

    public void insert(TJcsjYxLsfhdlDto tJcsjYxLsfhdlDto) {
        TJcsjYxLsfhdl tJcsjYxLsfhdl = new TJcsjYxLsfhdl();
        MyBeanUtils.copyProperties(tJcsjYxLsfhdlDto, tJcsjYxLsfhdl);
        tJcsjYxLsfhdl.settLsfhdlId(UUIDKey.getKey());
        tJcsjYxLsfhdlService.insert(tJcsjYxLsfhdl);
    }

    public void delete(String id) {
        tJcsjYxLsfhdlService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjYxLsfhdlService.deleteBatchIds(idsList);
    }

    public Page<TJcsjYxLsfhdlSelDto> getPages(Page<TJcsjYxLsfhdlSelDto> page, TJcsjYxLsfhdlSelDto tJcsjYxLsfhdlSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjYxLsfhdlSel tJcsjYxLsfhdlSel = new TJcsjYxLsfhdlSel();
        MyBeanUtils.copyProperties(tJcsjYxLsfhdlSelDto, tJcsjYxLsfhdlSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjYxLsfhdlSel);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjYxLsfhdlSel());
        MyBeanUtils.toPageBean(tJcsjYxLsfhdlService.selectPage(pagepojo, entityWrapper), page, new TJcsjYxLsfhdlSelDto());
        return page;
    }

}

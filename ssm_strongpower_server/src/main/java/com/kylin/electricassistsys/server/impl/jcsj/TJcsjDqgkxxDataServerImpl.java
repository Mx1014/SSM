package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjDqgkxxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDqgkxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjDqgkxxSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjDqgkxx;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjDqgkxxSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjDqgkxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjDqgkxxDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 地区概况信息操作Api实现
 */
@Service
public class TJcsjDqgkxxDataServerImpl implements TJcsjDqgkxxDataApi {
    @Autowired
    private TJcsjDqgkxxService tJcsjDqgkxxService;


    public List<TJcsjDqgkxxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjDqgkxx());
        return MyBeanUtils.copyPropertiesList(tJcsjDqgkxxService.selectList(entityWrapper), TJcsjDqgkxxDto.class);
    }

    public void update(TJcsjDqgkxxDto tJcsjDqgkxxDto) {
        TJcsjDqgkxx tJcsjDqgkxx = new TJcsjDqgkxx();
        MyBeanUtils.copyProperties(tJcsjDqgkxxDto, tJcsjDqgkxx);
        tJcsjDqgkxxService.updateById(tJcsjDqgkxx);
    }

    public void insert(TJcsjDqgkxxDto tJcsjDqgkxxDto) {
        TJcsjDqgkxx tJcsjDqgkxx = new TJcsjDqgkxx();
        MyBeanUtils.copyProperties(tJcsjDqgkxxDto, tJcsjDqgkxx);
        tJcsjDqgkxx.settDqgkxxId(UUIDKey.getKey());
        tJcsjDqgkxxService.insert(tJcsjDqgkxx);
    }

    public void delete(String id) {
        tJcsjDqgkxxService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjDqgkxxService.deleteBatchIds(idsList);
    }

    public Page<TJcsjDqgkxxSelDto> getPages(Page<TJcsjDqgkxxSelDto> page, TJcsjDqgkxxSelDto tJcsjDqgkxxSelDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjDqgkxxSel tJcsjDqgkxxSel = new TJcsjDqgkxxSel();
        MyBeanUtils.copyProperties(tJcsjDqgkxxSelDto, tJcsjDqgkxxSel);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjDqgkxxSel);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjDqgkxxSel());
        MyBeanUtils.toPageBean(tJcsjDqgkxxService.selectPage(pagepojo, entityWrapper), page, new TJcsjDqgkxxSelDto());
        return page;
    }

}

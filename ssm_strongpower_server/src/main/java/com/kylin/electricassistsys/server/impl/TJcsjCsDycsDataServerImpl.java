package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsDycsDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjCsDycs;
import com.kylin.electricassistsys.service.jcsj.TJcsjCsDycsService;
import com.kylin.electricassistsys.testdata.api.TJcsjCsDycsDataApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
@Service
public class TJcsjCsDycsDataServerImpl implements TJcsjCsDycsDataApi {
    @Autowired
    private TJcsjCsDycsService tJcsjCsDycsService;

    public List<TJcsjCsDycsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjCsDycs());
        return MyBeanUtils.copyPropertiesList(tJcsjCsDycsService.selectList(entityWrapper), TJcsjCsDycsDto.class);
    }

    public void update(TJcsjCsDycsDto tJcsjCsDycsDto) {
        TJcsjCsDycs tJcsjCsDycs = new TJcsjCsDycs();
        MyBeanUtils.copyProperties(tJcsjCsDycsDto, tJcsjCsDycs);
        tJcsjCsDycsService.updateById(tJcsjCsDycs);

    }

    public void insert(TJcsjCsDycsDto tJcsjCsDycsDto) {
        TJcsjCsDycs tJcsjCsDycs = new TJcsjCsDycs();
        MyBeanUtils.copyProperties(tJcsjCsDycsDto, tJcsjCsDycs);
        tJcsjCsDycsService.insert(tJcsjCsDycs);
    }

    public void delete(String id) {
        tJcsjCsDycsService.deleteById(id);
    }

    public Page<TJcsjCsDycsDto> getPages(Page<TJcsjCsDycsDto> page, TJcsjCsDycsDto tJcsjCsDycsDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjCsDycs tJcsjCsDycs = new TJcsjCsDycs();
        MyBeanUtils.copyProperties(tJcsjCsDycsDto,tJcsjCsDycs);
        entityWrapper.setEntity(tJcsjCsDycs);
        Page<TJcsjCsDycs> pagepojo = new Page<TJcsjCsDycs>();
        MyBeanUtils.toPageBean(tJcsjCsDycsService.selectPage(pagepojo,entityWrapper), page, new TJcsjCsDycsDto());
        return page;
    }
}

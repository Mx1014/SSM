package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjSyfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjSyfsDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjSyfs;
import com.kylin.electricassistsys.service.jcsj.TJcsjSyfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Auther: whq
 * @ClassName: TJcsjSyfsDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 使用方式操作Api实现
 */
@Service
public class TJcsjSyfsDataServerImpl implements TJcsjSyfsDataApi {
    @Autowired
    private TJcsjSyfsService tJcsjSyfsService;


    public List<TJcsjSyfsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjSyfs());
        return MyBeanUtils.copyPropertiesList(tJcsjSyfsService.selectList(entityWrapper), TJcsjSyfsDto.class);
    }

    public void update(TJcsjSyfsDto tJcsjSyfsDto) {
        TJcsjSyfs tJcsjSyfs = new TJcsjSyfs();
        MyBeanUtils.copyProperties(tJcsjSyfsDto, tJcsjSyfs);
        tJcsjSyfsService.updateById(tJcsjSyfs);
    }

    public void insert(TJcsjSyfsDto tJcsjSyfsDto) {
        TJcsjSyfs tJcsjSyfs = new TJcsjSyfs();
        MyBeanUtils.copyProperties(tJcsjSyfsDto, tJcsjSyfs);
        tJcsjSyfsService.insert(tJcsjSyfs);
    }

    public void delete(String id) {
        tJcsjSyfsService.deleteById(id);
    }

    public Page<TJcsjSyfsDto> getPages(Page<TJcsjSyfsDto> page, TJcsjSyfsDto tJcsjSyfsDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjSyfs tJcsjSyfs = new TJcsjSyfs();
        MyBeanUtils.copyProperties(tJcsjSyfsDto, tJcsjSyfs);
        //entityWrapper.setEntity(tJcsjSyfs);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjSyfs);
        //entityWrapper.where(tJcsjSyfs.gettCnwName()!=null&&tJcsjSyfs.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjSyfs.gettCnwName()+"%");
        Page<TJcsjSyfs> pagepojo = new Page<TJcsjSyfs>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjSyfs());
        MyBeanUtils.toPageBean(tJcsjSyfsService.selectPage(pagepojo, entityWrapper), page, new TJcsjSyfsDto());
        return page;
    }

}

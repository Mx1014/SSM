package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjJsfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjJsfsDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjJsfs;
import com.kylin.electricassistsys.service.jcsj.TJcsjJsfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjJsfsDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 架设方式操作Api实现
 */
@Service
public class TJcsjJsfsDataServerImpl implements TJcsjJsfsDataApi {
    @Autowired
    private TJcsjJsfsService tJcsjJsfsService;


    public List<TJcsjJsfsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjJsfs());
        return MyBeanUtils.copyPropertiesList(tJcsjJsfsService.selectList(entityWrapper), TJcsjJsfsDto.class);
    }

    public void update(TJcsjJsfsDto tJcsjJsfsDto) {
        TJcsjJsfs tJcsjJsfs = new TJcsjJsfs();
        MyBeanUtils.copyProperties(tJcsjJsfsDto, tJcsjJsfs);
        tJcsjJsfsService.updateById(tJcsjJsfs);
    }

    public void insert(TJcsjJsfsDto tJcsjJsfsDto) {
        TJcsjJsfs tJcsjJsfs = new TJcsjJsfs();
        MyBeanUtils.copyProperties(tJcsjJsfsDto, tJcsjJsfs);
        tJcsjJsfsService.insert(tJcsjJsfs);
    }

    public void delete(String id) {
        tJcsjJsfsService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjJsfsService.deleteBatchIds(idsList);
    }

    public Page<TJcsjJsfsDto> getPages(Page<TJcsjJsfsDto> page, TJcsjJsfsDto tJcsjJsfsDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjJsfs tJcsjJsfs = new TJcsjJsfs();
        MyBeanUtils.copyProperties(tJcsjJsfsDto, tJcsjJsfs);
        //entityWrapper.setEntity(tJcsjJsfs);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjJsfs);
        //entityWrapper.where(tJcsjJsfs.gettCnwName()!=null&&tJcsjJsfs.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjJsfs.gettCnwName()+"%");
        Page<TJcsjJsfs> pagepojo = new Page<TJcsjJsfs>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjJsfs());
        MyBeanUtils.toPageBean(tJcsjJsfsService.selectPage(pagepojo, entityWrapper), page, new TJcsjJsfsDto());
        return page;
    }

}

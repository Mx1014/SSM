package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjFsfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFsfsDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjFsfs;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjFsfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TJcsjFsfsDataServerImpl
 * @Date: 2018/5/10 9:03
 * @Description: 敷设方式操作Api实现
 */
@Service
public class TJcsjFsfsDataServerImpl implements TJcsjFsfsDataApi {
    @Autowired
    private TJcsjFsfsService tJcsjFsfsService;


    public List<TJcsjFsfsDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjFsfs());
        return MyBeanUtils.copyPropertiesList(tJcsjFsfsService.selectList(entityWrapper), TJcsjFsfsDto.class);
    }

    public void update(TJcsjFsfsDto tJcsjFsfsDto) {
        TJcsjFsfs tJcsjFsfs = new TJcsjFsfs();
        MyBeanUtils.copyProperties(tJcsjFsfsDto, tJcsjFsfs);
        tJcsjFsfsService.updateById(tJcsjFsfs);
    }

    public void insert(TJcsjFsfsDto tJcsjFsfsDto) {
        TJcsjFsfs tJcsjFsfs = new TJcsjFsfs();
        MyBeanUtils.copyProperties(tJcsjFsfsDto, tJcsjFsfs);
        tJcsjFsfs.settFsfsId(UUIDKey.getKey());
        tJcsjFsfsService.insert(tJcsjFsfs);
    }

    public void delete(String id) {
        tJcsjFsfsService.deleteById(id);
    }

    public void batchDelete(String ids) {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjFsfsService.deleteBatchIds(idsList);
    }

    public Page<TJcsjFsfsDto> getPages(Page<TJcsjFsfsDto> page, TJcsjFsfsDto tJcsjFsfsDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjFsfs tJcsjFsfs = new TJcsjFsfs();
        MyBeanUtils.copyProperties(tJcsjFsfsDto, tJcsjFsfs);
        //entityWrapper.setEntity(tJcsjFsfs);
        entityWrapper = EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper, tJcsjFsfs);
        //entityWrapper.where(tJcsjFsfs.gettCnwName()!=null&&tJcsjFsfs.gettCnwName()!="","T_CNW LIKE {0}","%"+tJcsjFsfs.gettCnwName()+"%");
        Page<TJcsjFsfs> pagepojo = new Page<TJcsjFsfs>();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjFsfs());
        MyBeanUtils.toPageBean(tJcsjFsfsService.selectPage(pagepojo, entityWrapper), page, new TJcsjFsfsDto());
        return page;
    }

}

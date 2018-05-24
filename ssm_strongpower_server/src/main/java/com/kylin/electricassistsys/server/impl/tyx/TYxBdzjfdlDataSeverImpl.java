package com.kylin.electricassistsys.server.impl.tyx;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tyx.TYxBdzjfdlDataApi;
import com.kylin.electricassistsys.dto.tyx.TYxBdzjfdlDto;
import com.kylin.electricassistsys.dto.tyx.TYxBdzjfdlSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tyx.TYxBdzjfdl;
import com.kylin.electricassistsys.pojo.tyx.TYxBdzjfdlSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.tyx.TYxBdzjfdlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/22 10:48
 * @Description:变电站运行数据接口类实现类
 */
@Service
public class TYxBdzjfdlDataSeverImpl implements TYxBdzjfdlDataApi {
    @Resource
    private TYxBdzjfdlService tYxBdzjfdlService;


    /**
     * 查詢所以的數據
     * @return
     */
    @Override
    public List<TYxBdzjfdlDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TYxBdzjfdl());
        return MyBeanUtils.copyPropertiesList(tYxBdzjfdlService.selectList(entityWrapper), TYxBdzjfdlDto.class);
    }

    /**
     * 查询变电站运行数据进行分页
     * @param dto
     * @return
     */
    @Override
    public Page<TYxBdzjfdlSelDto> selectPage(Page page, TYxBdzjfdlSelDto dto) throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TYxBdzjfdlSel tj= new TYxBdzjfdlSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TYxBdzjfdlSel());
        MyBeanUtils.toPageBean(tYxBdzjfdlService.selectPage(pagepojo, entityWrapper), page, new TYxBdzjfdlSelDto());
        return page;
    }
    /**
     *添加变电站运行数据接口
     * @param dto
     */
    @Override
    public void insert(TYxBdzjfdlDto dto) throws Throwable {
        TYxBdzjfdl zb= new TYxBdzjfdl();
        MyBeanUtils.copyProperties(dto,zb);
        zb.settJfdlId(UUIDKey.getKey());
        tYxBdzjfdlService.insert(zb);

    }
    /**
     * 更新变电站运行数据接口
     * @param dto
     */
    @Override
    public void update(TYxBdzjfdlDto dto) throws Throwable {
        TYxBdzjfdl zb= new TYxBdzjfdl();
        MyBeanUtils.copyProperties(dto,zb);
        tYxBdzjfdlService.updateAllColumnById(zb);
    }
    /**
     *删除根据id变电站运行数据接口
     */
    @Override
    public void delete(String id) throws Throwable {
        tYxBdzjfdlService.deleteById(id);
    }
    /**
     * 根据id进行批量删除 变电站运行数据接口
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids) throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tYxBdzjfdlService.deleteBatchIds(idsList);
    }
}

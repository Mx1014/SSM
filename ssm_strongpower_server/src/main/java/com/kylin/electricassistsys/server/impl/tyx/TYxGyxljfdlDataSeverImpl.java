package com.kylin.electricassistsys.server.impl.tyx;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tyx.TYxGyxljfdlDataApi;
import com.kylin.electricassistsys.dto.tyx.TYxGyxljfdlDto;
import com.kylin.electricassistsys.dto.tyx.TYxGyxljfdlSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tyx.TYxGyxljfdl;
import com.kylin.electricassistsys.pojo.tyx.TYxGyxljfdlSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.tyx.TYxGyxljfdlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/24 15:57
 * @Description:高压线路电量信息业务处理类
 */
@Service
public class TYxGyxljfdlDataSeverImpl implements TYxGyxljfdlDataApi {
     @Resource
    private TYxGyxljfdlService tYxGyxljfdlService;

    /**
     * 返回所有的高压线路电量信息數據
     * @return
     */
    public List<TYxGyxljfdlDto> getList()throws Throwable{
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TYxGyxljfdl());
        return MyBeanUtils.copyPropertiesList(tYxGyxljfdlService.selectList(entityWrapper), TYxGyxljfdlDto.class);

    }
    /**
     * 查询变高压线路电量信息进行分页
     * @param dto
     * @return
     */
    public Page<TYxGyxljfdlSelDto> selectPage(Page page, TYxGyxljfdlSelDto dto)throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TYxGyxljfdlSel tj= new TYxGyxljfdlSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TYxGyxljfdlSel());
        MyBeanUtils.toPageBean(tYxGyxljfdlService.selectPage(pagepojo, entityWrapper), page, new TYxGyxljfdlSelDto());
        return page;
    }

    /**
     *添加变高压线路电量信息接口
     * @param dto
     */
    public void insert(TYxGyxljfdlDto dto)throws Throwable {
        TYxGyxljfdl zb= new TYxGyxljfdl();
        MyBeanUtils.copyProperties(dto,zb);
        zb.settJfdlId(UUIDKey.getKey());
        tYxGyxljfdlService.insert(zb);
    }

    /**
     * 更新变高压线路电量信息接口
     * @param dto
     */
    public void update(TYxGyxljfdlDto dto)throws Throwable {
        TYxGyxljfdl zb= new TYxGyxljfdl();
        MyBeanUtils.copyProperties(dto,zb);
        tYxGyxljfdlService.updateAllColumnById(zb);
    }

    /**
     *删除根据id高压线路电量信息接口
     */
    public void delete(String id)throws Throwable {
        tYxGyxljfdlService.deleteById(id);

    }

    /**
     * 根据id进行批量删除 变高压线路电量信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tYxGyxljfdlService.deleteBatchIds(idsList);

    }

}

package com.kylin.electricassistsys.server.impl.tjisuan;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tjisuan.TJisuanXlnDataApi;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanXlnDto;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanXlnSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tjisuan.TJisuanXln;
import com.kylin.electricassistsys.pojo.tjisuan.TJisuanXlnSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.tjisuan.TJisuanXlnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/18 16:05
 * @Description: 中压线路N-1校验接口業務實現類
 */
@Service
public class TJisuanXlnDataServerImpl implements TJisuanXlnDataApi {
    @Resource
    private TJisuanXlnService tJisuanXlnService;
    /**
     * 查詢所以的數據
     * @return
     */
    @Override
    public List<TJisuanXlnDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJisuanXln());
        return MyBeanUtils.copyPropertiesList(tJisuanXlnService.selectList(entityWrapper), TJisuanXlnDto.class);
    }

    /**
     * 查询中压线路信息进行分页
     * @param dto
     * @return
     */
    @Override
    public Page<TJisuanXlnSelDto> selectPage(Page page, TJisuanXlnSelDto dto) throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJisuanXlnSel tj= new TJisuanXlnSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJisuanXlnSel());
        MyBeanUtils.toPageBean(tJisuanXlnService.selectPage(pagepojo, entityWrapper), page, new TJisuanXlnSelDto());
        return page;
    }
    /**
     *添加中压线路信息接口
     * @param dto
     */
    @Override
    public void insert(TJisuanXlnDto dto) throws Throwable {
        TJisuanXln zb= new TJisuanXln();
        MyBeanUtils.copyProperties(dto,zb);
        zb.setNid(UUIDKey.getKey());
        tJisuanXlnService.insert(zb);

    }
    /**
     * 更新中压线路信息接口
     * @param dto
     */
    @Override
    public void update(TJisuanXlnDto dto) throws Throwable {
        TJisuanXln zb= new TJisuanXln();
        MyBeanUtils.copyProperties(dto,zb);
        tJisuanXlnService.updateAllColumnById(zb);
    }
    /**
     *删除根据id中压线路信息接口
     */
    @Override
    public void delete(String id) throws Throwable {
        tJisuanXlnService.deleteById(id);
    }
    /**
     * 根据id进行批量删除 中压线路信息接口
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids) throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJisuanXlnService.deleteBatchIds(idsList);

    }
}

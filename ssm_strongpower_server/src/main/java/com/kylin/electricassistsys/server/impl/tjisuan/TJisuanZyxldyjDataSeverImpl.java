package com.kylin.electricassistsys.server.impl.tjisuan;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tjisuan.TJisuanZyxldyjDataApi;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanZyxldyjDto;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanZyxldyjSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tjisuan.TJisuanZyxldyj;
import com.kylin.electricassistsys.pojo.tjisuan.TJisuanZyxldyjSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.tjisuan.TJisuanZyxldyjService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/22 14:22
 * @Description: 中压线路电压降 接口业务实现类
 */
@Service
public class TJisuanZyxldyjDataSeverImpl  implements TJisuanZyxldyjDataApi {
   @Resource
    private TJisuanZyxldyjService tJisuanZyxldyjService;
    /**
     * 查詢中压线路电压降所以的數據
     * @return
     */
    @Override
    public List<TJisuanZyxldyjDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJisuanZyxldyj());
        return MyBeanUtils.copyPropertiesList(tJisuanZyxldyjService.selectList(entityWrapper), TJisuanZyxldyjDto.class);
    }

    /**
     * 查询中压线路电压降进行分页
     * @param dto
     * @return
     */
    @Override
    public Page<TJisuanZyxldyjSelDto> selectPage(Page page, TJisuanZyxldyjSelDto dto) throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJisuanZyxldyjSel tj= new TJisuanZyxldyjSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJisuanZyxldyjSel());
        MyBeanUtils.toPageBean(tJisuanZyxldyjService.selectPage(pagepojo, entityWrapper), page, new TJisuanZyxldyjSel());
        return page;
    }
    /**
     *添加中压线路电压降接口
     * @param dto
     */
    @Override
    public void insert(TJisuanZyxldyjDto dto) throws Throwable {
        TJisuanZyxldyj zb= new TJisuanZyxldyj();
        MyBeanUtils.copyProperties(dto,zb);
        zb.setId(UUIDKey.getKey());
        tJisuanZyxldyjService.insert(zb);

    }
    /**
     * 更新中压线路电压降接口
     * @param dto
     */
    @Override
    public void update(TJisuanZyxldyjDto dto) throws Throwable {
        TJisuanZyxldyj zb= new TJisuanZyxldyj();
        MyBeanUtils.copyProperties(dto,zb);
        tJisuanZyxldyjService.updateAllColumnById(zb);
    }
    /**
     *删除根据id中压线路电压降接口
     */
    @Override
    public void delete(String id) throws Throwable {
        tJisuanZyxldyjService.deleteById(id);
    }
    /**
     * 根据id进行批量删除 中压线路电压降接口
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids) throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJisuanZyxldyjService.deleteBatchIds(idsList);

    }
}

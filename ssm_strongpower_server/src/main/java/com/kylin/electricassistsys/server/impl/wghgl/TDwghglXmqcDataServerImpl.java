package com.kylin.electricassistsys.server.impl.wghgl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.wghgl.TDwghglXmqcDataApi;
import com.kylin.electricassistsys.dto.wghgl.TDwghglXmqcDto;
import com.kylin.electricassistsys.dto.wghgl.TDwghglXmqcSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.wghgl.TDwghglXmqc;
import com.kylin.electricassistsys.pojo.wghgl.TDwghglXmqcSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.wghgl.TDwghglXmqcService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 17:19
 * @Description: 10kV电网新建工程接口業務出來類
 */
@Service
public class TDwghglXmqcDataServerImpl  implements TDwghglXmqcDataApi {
    @Resource
    private TDwghglXmqcService  tDwghglXmqcService;
    
    /**
     * 查詢所以的數據
     * @return
     */
    @Override
    public List<TDwghglXmqcDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TDwghglXmqc());
        return MyBeanUtils.copyPropertiesList(tDwghglXmqcService.selectList(entityWrapper), TDwghglXmqcDto.class);
    }

    /**
     * 查询10kV电网新建工程进行分页
     * @param dto
     * @return
     */
    @Override
    public Page<TDwghglXmqcSelDto> selectPage(Page page, TDwghglXmqcSelDto dto) throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TDwghglXmqcSel tj= new TDwghglXmqcSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TDwghglXmqcSel());
        MyBeanUtils.toPageBean(tDwghglXmqcService.selectPage(pagepojo, entityWrapper), page, new TDwghglXmqcSelDto());
        return page;
    }
    /**
     *添加10kV电网新建工程接口
     * @param dto
     */
    @Override
    public void insert(TDwghglXmqcDto dto) throws Throwable {
        TDwghglXmqc zb= new TDwghglXmqc();
        MyBeanUtils.copyProperties(dto,zb);
        zb.settXmqcId(UUIDKey.getKey());
        tDwghglXmqcService.insert(zb);

    }
    /**
     * 更新10kV电网新建工程接口
     * @param dto
     */
    @Override
    public void update(TDwghglXmqcDto dto) throws Throwable {
        TDwghglXmqc zb= new TDwghglXmqc();
        MyBeanUtils.copyProperties(dto,zb);
        tDwghglXmqcService.updateAllColumnById(zb);
    }
    /**
     *删除根据id10kV电网新建工程接口
     */
    @Override
    public void delete(String id) throws Throwable {
        tDwghglXmqcService.deleteById(id);
    }
    /**
     * 根据id进行批量删除 10kV电网新建工程接口
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids) throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tDwghglXmqcService.deleteBatchIds(idsList);

    }
}

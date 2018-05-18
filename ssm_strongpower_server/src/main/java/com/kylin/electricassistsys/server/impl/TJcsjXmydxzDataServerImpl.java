package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjXmydxzDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjXmydxzDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjXmydxz;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjXmydxzService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/5/17 10:08
 * @Description: 项目用电性质接口实现类
 */
@Service
public class TJcsjXmydxzDataServerImpl implements TJcsjXmydxzDataApi {
    @Resource
    private TJcsjXmydxzService  tJcsjZyyhxxService;
    /**
     *查询项目用电性质对象列表接口
     * @param
     * @return
     */
    @Override
    public List<TJcsjXmydxzDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJcsjXmydxz());
        return MyBeanUtils.copyPropertiesList(tJcsjZyyhxxService.selectList(entityWrapper), TJcsjXmydxzDto.class);
    }

    /**
     * 查询项目用电性质接口进行分页
     * @param dto
     * @return
     */
    @Override
    public Page<TJcsjXmydxzDto> selectPage(Page page, TJcsjXmydxzDto dto) throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjXmydxz tj= new TJcsjXmydxz();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjXmydxz());
        MyBeanUtils.toPageBean(tJcsjZyyhxxService.selectPage(pagepojo, entityWrapper), page, new TJcsjXmydxz());
        System.out.print(page.toString());
        return page;
    }
    /**
     *添加项目用电性质接口
     * @param dto
     */
    @Override
    public void insert(TJcsjXmydxzDto dto) throws Throwable {
        TJcsjXmydxz obj= new TJcsjXmydxz();
        MyBeanUtils.copyProperties(dto,obj);
        obj.settXmydxzId(UUIDKey.getKey());
        tJcsjZyyhxxService.insert(obj);

    }
    /**
     * 更新项目用电性质接口
     * @param dto
     */
    @Override
    public void update(TJcsjXmydxzDto dto) throws Throwable {
        TJcsjXmydxz zb= new TJcsjXmydxz();
        MyBeanUtils.copyProperties(dto,zb);
        tJcsjZyyhxxService.updateAllColumnById(zb);
    }
    /**
     *删除根据id项目用电性质接口
     */
    @Override
    public void delete(String id) throws Throwable {
        tJcsjZyyhxxService.deleteById(id);
    }
    /**
     * 根据id进行批量删除 项目用电性质接口
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids) throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjZyyhxxService.deleteBatchIds(idsList);
    }
}

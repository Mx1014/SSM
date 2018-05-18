package com.kylin.electricassistsys.server.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TSbsjDyxlxxDataApi;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjDyxlxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjDyxlxxSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjDyxlxx;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjDyxlxxSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.tsbsj.TSbsjDyxlxxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 15:55
 * @Description: 低壓綫路信息接口類實現類
 */
@Service
public class TSbsjDyxlxxDataServerImpl  implements TSbsjDyxlxxDataApi {
    @Resource
      private TSbsjDyxlxxService tSbsjDyxlxxService;

    /**
     * 返回所有低壓綫路信息的數據
     * @return
     */
    public List<TSbsjDyxlxxDto> getList()throws Throwable{
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSbsjDyxlxx());
        return MyBeanUtils.copyPropertiesList(tSbsjDyxlxxService.selectList(entityWrapper), TSbsjDyxlxxDto.class);
    }
    /**
     * 查询低壓綫路信息信息进行分页
     * @param dto
     * @return
     */
    public Page<TSbsjDyxlxxSelDto> selectPage(Page page, TSbsjDyxlxxSelDto dto)throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TSbsjDyxlxxSel tj= new TSbsjDyxlxxSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TSbsjDyxlxxSel());
        MyBeanUtils.toPageBean(tSbsjDyxlxxService.selectPage(pagepojo, entityWrapper), page, new TSbsjDyxlxxSel());
        return page;

    }

    /**
     *添加低壓綫路信息信息接口
     * @param dto
     */
    public void insert(TSbsjDyxlxxDto dto)throws Throwable {
        TSbsjDyxlxx jd= new TSbsjDyxlxx();
        MyBeanUtils.copyProperties(dto,jd);
        jd.settDyxlxxId(UUIDKey.getKey());
        tSbsjDyxlxxService.insert(jd);

    }

    /**
     * 更新低壓綫路信息信息接口
     * @param dto
     */
    public void update(TSbsjDyxlxxDto dto)throws Throwable {
        TSbsjDyxlxx jd= new TSbsjDyxlxx();
        MyBeanUtils.copyProperties(dto,jd);
        tSbsjDyxlxxService.updateAllColumnById(jd);

    }

    /**
     *删除根据id低壓綫路信息接口
     */
    public void delete(String id)throws Throwable {
        tSbsjDyxlxxService.deleteById(id);
    }

    /**
     * 根据id进行批量删除 低壓綫路信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tSbsjDyxlxxService.deleteBatchIds(idsList);
    }



}

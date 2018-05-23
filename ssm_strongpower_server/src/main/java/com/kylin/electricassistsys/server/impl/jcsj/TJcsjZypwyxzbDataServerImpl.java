package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjZypwyxzbDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZypwyxzbDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZypwyxzbSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjZypwyxzb;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjZypwyxzbSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjZypwyxzbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * TJcsjZypwyxzbSel
 * 查询中压配网运行指标及分析接口业务实现类
 */
@Service
public class TJcsjZypwyxzbDataServerImpl  implements TJcsjZypwyxzbDataApi {
     @Resource
   private TJcsjZypwyxzbService  tJcsjZypwyxzbService;

    /**
     * 查询中压配网运行指标及分析進行分頁
     * @param dto
     * @return
     */
    @Override
    public Page<TJcsjZypwyxzbSelDto> selectPage(Page page,TJcsjZypwyxzbSelDto dto)throws Throwable  {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjZypwyxzbSel tj= new TJcsjZypwyxzbSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjZypwyxzbSel());
        MyBeanUtils.toPageBean(tJcsjZypwyxzbService.selectPage(pagepojo, entityWrapper), page, new TJcsjZypwyxzbSel());
        System.out.print(page.toString());
        return page;
    }

    /**
     *添加中压配网运行指标数据
     * @param dto
     */
    @Override
    public void insert(TJcsjZypwyxzbDto dto)throws Throwable  {
        TJcsjZypwyxzb zb= new TJcsjZypwyxzb();
        MyBeanUtils.copyProperties(dto,zb);
        zb.settZypwyxzbId(UUIDKey.getKey());
        tJcsjZypwyxzbService.insert(zb);
    }

    /**
     * 中压配网运行指标数据
     * @param dto
     */
    @Override
    public void update(TJcsjZypwyxzbDto dto)throws Throwable  {
        TJcsjZypwyxzb zb= new TJcsjZypwyxzb();
        MyBeanUtils.copyProperties(dto,zb);
        tJcsjZypwyxzbService.updateAllColumnById(zb);
    }
    /**
     *删除根据id中压配网运行指标数据
     */
    @Override
     public void delete(String id)throws Throwable  {
        tJcsjZypwyxzbService.deleteById(id);
     }
    /**
     * 根据id进行批量删除 中压配网运行指标数据
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids)throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjZypwyxzbService.deleteBatchIds(idsList);
    }


}

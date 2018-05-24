package com.kylin.electricassistsys.server.impl.tsbsj;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TSbsjZyllxxxDataApi;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjZyllxxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjZyllxxxSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjZyyhxxSel;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjZyllxxx;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjZyllxxxSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.tsbsj.TSbsjZyllxxxService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 14:02
 * @Description:中压线路信息接口業務實現類
 */
@Service
public class TSbsjZyllxxxDataSeverImpl implements TSbsjZyllxxxDataApi {
    @Resource
    private TSbsjZyllxxxService  tSbsjZyllxxxService;

    /**
     * 查詢所以的數據
     * @return
     */
    @Override
    public List<TSbsjZyllxxxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSbsjZyllxxx());
        return MyBeanUtils.copyPropertiesList(tSbsjZyllxxxService.selectList(entityWrapper), TSbsjZyllxxxDto.class);
    }

    /**
     * 查询中压线路信息进行分页
     * @param dto
     * @return
     */
    @Override
    public Page<TSbsjZyllxxxSelDto> selectPage(Page page, TSbsjZyllxxxSelDto dto) throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TSbsjZyllxxxSel tj= new TSbsjZyllxxxSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjZyyhxxSel());
        MyBeanUtils.toPageBean(tSbsjZyllxxxService.selectPage(pagepojo, entityWrapper), page, new TSbsjZyllxxxSelDto());
        return page;
    }
    /**
     *添加中压线路信息接口
     * @param dto
     */
    @Override
    public void insert(TSbsjZyllxxxDto dto) throws Throwable {
        TSbsjZyllxxx zb= new TSbsjZyllxxx();
        MyBeanUtils.copyProperties(dto,zb);
        zb.settZyllxxxId(UUIDKey.getKey());
        tSbsjZyllxxxService.insert(zb);

    }
    /**
     * 更新中压线路信息接口
     * @param dto
     */
    @Override
    public void update(TSbsjZyllxxxDto dto) throws Throwable {
        TSbsjZyllxxx zb= new TSbsjZyllxxx();
        MyBeanUtils.copyProperties(dto,zb);
        tSbsjZyllxxxService.updateAllColumnById(zb);
    }
    /**
     *删除根据id中压线路信息接口
     */
    @Override
    public void delete(String id) throws Throwable {
        tSbsjZyllxxxService.deleteById(id);
    }
    /**
     * 根据id进行批量删除 中压线路信息接口
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids) throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tSbsjZyllxxxService.deleteBatchIds(idsList);

    }
}

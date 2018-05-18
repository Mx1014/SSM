package com.kylin.electricassistsys.server.impl.tsbsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tsbsj.TSbsjByqxxDataApi;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjByqxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjByqxxSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjByqxx;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjByqxxSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.tsbsj.TSbsjByqxxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/18 14:49
 * @Description:变压器信息接口业务实现类
 */
@Service
public class TSbsjByqxxDataServerImpl implements TSbsjByqxxDataApi {
    @Resource
    private TSbsjByqxxService tSbsjByqxxService;
    /**
     * 返回所有的數據
     * @return
     */
    public List<TSbsjByqxxDto> getList()throws Throwable{
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSbsjByqxx());
        return MyBeanUtils.copyPropertiesList(tSbsjByqxxService.selectList(entityWrapper), TSbsjByqxxDto.class);

    }
    /**
     * 查询变压器信息进行分页
     * @param dto
     * @return
     */
    public Page<TSbsjByqxxSelDto> selectPage(Page page, TSbsjByqxxSelDto dto)throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TSbsjByqxxSel tj= new TSbsjByqxxSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TSbsjByqxxSel());
        MyBeanUtils.toPageBean(tSbsjByqxxService.selectPage(pagepojo, entityWrapper), page, new TSbsjByqxxSel());
        return page;
    }

    /**
     *添加变压器信息接口
     * @param dto
     */
    public void insert(TSbsjByqxxDto dto)throws Throwable {
        TSbsjByqxx zb= new TSbsjByqxx();
        MyBeanUtils.copyProperties(dto,zb);
        zb.settByqxxId(UUIDKey.getKey());
        tSbsjByqxxService.insert(zb);
    }
    /**
     * 更新变压器信息接口
     * @param dto
     */
    public void update(TSbsjByqxxDto dto)throws Throwable {
        TSbsjByqxx zb= new TSbsjByqxx();
        MyBeanUtils.copyProperties(dto,zb);
        tSbsjByqxxService.updateAllColumnById(zb);
    }

    /**
     *删除根据id中压线鏈路路信息接口
     */
    public void delete(String id)throws Throwable {
        tSbsjByqxxService.deleteById(id);
    }

    /**
     * 根据id进行批量删除 变压器信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tSbsjByqxxService.deleteBatchIds(idsList);
    }
}

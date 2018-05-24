package com.kylin.electricassistsys.server.impl.tsbsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tsbsj.TSbyxxxGyxlyxxxDataApi;
import com.kylin.electricassistsys.dto.tsbsj.TSbyxxxGyxlyxxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbyxxxGyxlyxxxSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tsbsj.TSbyxxxGyxlyxxx;
import com.kylin.electricassistsys.pojo.tsbsj.TSbyxxxGyxlyxxxSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.tsbsj.TSbyxxxGyxlyxxxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/22 16:45
 * @Description:高压线路信息列表接口实现类
 */
@Service
public class TSbyxxxGyxlyxxxDataServerImpl implements TSbyxxxGyxlyxxxDataApi {
    @Resource
    private TSbyxxxGyxlyxxxService tSbyxxxGyxlyxxxService;

    /**
     * 查詢所以的數據
     * @return
     */
    @Override
    public List<TSbyxxxGyxlyxxxDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSbyxxxGyxlyxxx());
        return MyBeanUtils.copyPropertiesList(tSbyxxxGyxlyxxxService.selectList(entityWrapper), TSbyxxxGyxlyxxxDto.class);
    }

    /**
     * 查询中压线路信息进行分页
     * @param dto
     * @return
     */
    @Override
    public Page<TSbyxxxGyxlyxxxSelDto> selectPage(Page page, TSbyxxxGyxlyxxxSelDto dto) throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TSbyxxxGyxlyxxxSel tj= new TSbyxxxGyxlyxxxSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TSbyxxxGyxlyxxxSel());
        MyBeanUtils.toPageBean(tSbyxxxGyxlyxxxService.selectPage(pagepojo, entityWrapper), page, new TSbyxxxGyxlyxxxSelDto());
        return page;
    }
    /**
     *添加中压线路信息接口
     * @param dto
     */
    @Override
    public void insert(TSbyxxxGyxlyxxxDto dto) throws Throwable {
        TSbyxxxGyxlyxxx zb= new TSbyxxxGyxlyxxx();
        MyBeanUtils.copyProperties(dto,zb);
        zb.settGyxlyxxxId(UUIDKey.getKey());
        tSbyxxxGyxlyxxxService.insert(zb);

    }
    /**
     * 更新中压线路信息接口
     * @param dto
     */
    @Override
    public void update(TSbyxxxGyxlyxxxDto dto) throws Throwable {
        TSbyxxxGyxlyxxx zb= new TSbyxxxGyxlyxxx();
        MyBeanUtils.copyProperties(dto,zb);
        tSbyxxxGyxlyxxxService.updateAllColumnById(zb);
    }
    /**
     *删除根据id中压线路信息接口
     */
    @Override
    public void delete(String id) throws Throwable {
        tSbyxxxGyxlyxxxService.deleteById(id);
    }
    /**
     * 根据id进行批量删除 中压线路信息接口
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids) throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tSbyxxxGyxlyxxxService.deleteBatchIds(idsList);

    }

}

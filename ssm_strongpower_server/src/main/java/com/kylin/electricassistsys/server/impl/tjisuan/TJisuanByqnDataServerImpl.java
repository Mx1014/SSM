package com.kylin.electricassistsys.server.impl.tjisuan;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tjisuan.TJisuanByqnDataApi;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanByqnDto;
import com.kylin.electricassistsys.dto.tjisuan.TJisuanByqnSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.tjisuan.TJisuanByqn;
import com.kylin.electricassistsys.pojo.tjisuan.TJisuanByqnSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.tjisuan.TJisuanByqnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/21 16:19
 * @Description: 變壓器N-1信息接口業務實現類
 */
@Service
public class TJisuanByqnDataServerImpl  implements TJisuanByqnDataApi {
    @Resource
    private TJisuanByqnService tJisuanByqnService;

    /**
     * 查詢所以的數據
     * @return
     */
    @Override
    public List<TJisuanByqnDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TJisuanByqn());
        return MyBeanUtils.copyPropertiesList(tJisuanByqnService.selectList(entityWrapper), TJisuanByqnDto.class);
    }

    /**
     * 查询中變壓器N-1信息进行分页
     * @param dto
     * @return
     */
    @Override
    public Page<TJisuanByqnSelDto> selectPage(Page page, TJisuanByqnSelDto dto) throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJisuanByqnSel tj= new TJisuanByqnSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJisuanByqnSel());
        MyBeanUtils.toPageBean(tJisuanByqnService.selectPage(pagepojo, entityWrapper), page, new TJisuanByqnSelDto());
        return page;
    }
    /**
     *添加中變壓器N-1信息接口
     * @param dto
     */
    @Override
    public void insert(TJisuanByqnDto dto) throws Throwable {
        TJisuanByqn zb= new TJisuanByqn();
        MyBeanUtils.copyProperties(dto,zb);
        zb.setNid(UUIDKey.getKey());
        tJisuanByqnService.insert(zb);

    }
    /**
     * 更新中變壓器N-1信息接口
     * @param dto
     */
    @Override
    public void update(TJisuanByqnDto dto) throws Throwable {
        TJisuanByqn zb= new TJisuanByqn();
        MyBeanUtils.copyProperties(dto,zb);
        tJisuanByqnService.updateAllColumnById(zb);
    }
    /**
     *删除根据id中變壓器N-1信息接口
     */
    @Override
    public void delete(String id) throws Throwable {
        tJisuanByqnService.deleteById(id);
    }
    /**
     * 根据id进行批量删除 中變壓器N-1信息接口
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids) throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJisuanByqnService.deleteBatchIds(idsList);

    }
}

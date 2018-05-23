package com.kylin.electricassistsys.server.impl.jcsj;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjZyyhxxDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZyyhxxDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZyyhxxSelDto;
import com.kylin.electricassistsys.entitywrapperutils.EntityWrapperUtil;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjZyyhxx;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjZyyhxxSel;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.jcsj.TJcsjZyyhxxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 10:08
 * @Description: 用户重要信息接口实现类
 */
@Service
public class TJcsjZyyhxxDataServerImpl implements TJcsjZyyhxxDataApi {
    @Resource
    private TJcsjZyyhxxService  tJcsjZyyhxxService;
    /**
     * 查询用户重要信息接口进行分页
     * @param dto
     * @return
     */
    @Override
    public Page<TJcsjZyyhxxSelDto> selectPage(Page page, TJcsjZyyhxxSelDto dto) throws Throwable {
        EntityWrapper entityWrapper = new EntityWrapper();
        TJcsjZyyhxxSel tj= new TJcsjZyyhxxSel();
        MyBeanUtils.copyProperties(dto,tj);
        entityWrapper= EntityWrapperUtil.getEntityWrapperWithCondition(entityWrapper,tj);
        Page pagepojo = new Page();
        MyBeanUtils.toPageBean(page, pagepojo, new TJcsjZyyhxxSel());
        MyBeanUtils.toPageBean(tJcsjZyyhxxService.selectPage(pagepojo, entityWrapper), page, new TJcsjZyyhxxSel());
        System.out.print(page.toString());
        return page;
    }
    /**
     *添加用户重要信息接口
     * @param dto
     */
    @Override
    public void insert(TJcsjZyyhxxDto dto) throws Throwable {
        TJcsjZyyhxx zb= new TJcsjZyyhxx();
        MyBeanUtils.copyProperties(dto,zb);
        zb.settZyyhxxId(UUIDKey.getKey());
        tJcsjZyyhxxService.insert(zb);

    }
    /**
     * 更新用户重要信息接口
     * @param dto
     */
    @Override
    public void update(TJcsjZyyhxxDto dto) throws Throwable {
        TJcsjZyyhxx zb= new TJcsjZyyhxx();
        MyBeanUtils.copyProperties(dto,zb);
        tJcsjZyyhxxService.updateAllColumnById(zb);
    }
    /**
     *删除根据id用户重要信息接口
     */
    @Override
    public void delete(String id) throws Throwable {
        tJcsjZyyhxxService.deleteById(id);
    }
    /**
     * 根据id进行批量删除 用户重要信息接口
     * @param ids
     */
    @Override
    public void deleteBatchIds(String ids) throws Throwable {
        String[] idsArr = ids.split(",");
        List idsList = Arrays.asList(idsArr);
        tJcsjZyyhxxService.deleteBatchIds(idsList);
    }
}

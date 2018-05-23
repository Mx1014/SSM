package com.kylin.electricassistsys.data.api.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDczjbDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TGhdgDczjbDataApi
 * @Date: 2018/5/9 16:17
 * @Description: 电厂装机容量表Api
 */
public interface TGhdgDczjbDataApi {
    /**
     * 功能描述:获取电厂装机容量表实体集合
     * @param: 无
     * @return: 电厂装机容量表实体集合
     * @auther: whq
     * @date: 2018/5/9 16:02
     */
    public List<TGhdgDczjbDto> getList();
    /**
     * 功能描述:更新电厂装机容量表实体
     * @param: 电厂装机容量表实体
     * @return: 无
     * @auther: whq
     * @date: 2018/5/9 16:03
     */
    public void update(TGhdgDczjbDto tGhdgDczjbDto);
    /**
     * 功能描述: 保存电厂装机容量表实体
     * @param: 电厂装机容量表实体
     * @return: 无
     * @auther: whq
     * @date: 2018/5/9 16:05
     */
    public void insert(TGhdgDczjbDto tGhdgDczjbDto);
    /**
     * 功能描述: 删除电厂装机容量表实体
     * @param: 实体id
     * @return: 无
     * @auther: whq
     * @date: 2018/5/9 16:07
     */
    public void delete(String id);

    /**
     * 功能描述:
     *
     * @param: 
     * @return: 
     * @auther: whq
     * @date: 2018/5/9 16:11
     */
    public Page<TGhdgDczjbDto> getPages(Page<TGhdgDczjbDto> page, TGhdgDczjbDto tGhdgDczjbDto);
}

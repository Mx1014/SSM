package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgSelDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TGhdgDwkgDataApi
 * @Date: 2018/5/9 16:21
 * @Description: 
 */
public interface TGhdgDwkgDataApi {
    /**
     * 功能描述:
     * @param: 无
     * @return: 实体集合
     * @auther: whq
     * @date: 2018/5/9 15:51
     */
    public List<TGhdgDwkgDto> getList();

    public Page getAllList(Page page, TGhdgDwkgSelDto tGhdgDwkgSelDto);

    public void update(TGhdgDwkgDto tGhdgDwkgDto);

    public void insert(TGhdgDwkgDto tGhdgDwkgDto);

    public void delete(String id);

    public Page<TGhdgDwkgDto> getPages(Page<TGhdgDwkgDto> page, TGhdgDwkgDto tGhdgDwkgDto);
}

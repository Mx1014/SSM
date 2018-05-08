package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjJxxxDto;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/5/8 09:05
 * @Description:
 */
public interface TJcsjJxxxDataApi {
    public List<TJcsjJxxxDto> getList();

    public void update(TJcsjJxxxDto tJcsjJxxxDto);

    public void insert(TJcsjJxxxDto tJcsjJxxxDto);

    public void delete(String id);

    public Page<TJcsjJxxxDto> getPages(Page<TJcsjJxxxDto> page, TJcsjJxxxDto tJcsjJxxxDto);
}

package com.kylin.electricassistsys.testdata.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGqlxDto;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/5/7 11:28
 * @Description:
 */
public interface TJcsjFqGqlxDataApi {
    public List<TJcsjFqGqlxDto> getList();

    public void update(TJcsjFqGqlxDto tJcsjFqGqlxDto);

    public void insert(TJcsjFqGqlxDto tJcsjFqGqlxDto);

    public void delete(String id);

    public Page<TJcsjFqGqlxDto> getPages(Page<TJcsjFqGqlxDto> page, TJcsjFqGqlxDto tJcsjFqGqlxDto);
}

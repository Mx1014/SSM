package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCnwDto;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/5/7 11:28
 * @Description:
 */
public interface TJcsjCnwDataApi {
    public List<TJcsjCnwDto> getList();

    public void update(TJcsjCnwDto tJcsjCnwDto);

    public void insert(TJcsjCnwDto tJcsjCnwDto);

    public void delete(String id);

    public Page<TJcsjCnwDto> getPages(Page<TJcsjCnwDto> page, TJcsjCnwDto tJcsjCnwDto);
}

package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjFqGdfqDto;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/5/7 09:04
 * @Description:
 */
public interface TJcsjFqGdfqDataApi {
    public List<TJcsjFqGdfqDto> getList();

    public void update(TJcsjFqGdfqDto tJcsjFqGdfqDto);

    public void insert(TJcsjFqGdfqDto tJcsjFqGdfqDto);

    public void delete(String id);

    public Page<TJcsjFqGdfqDto> getPages(Page<TJcsjFqGdfqDto> page, TJcsjFqGdfqDto tJcsjFqGdfqDto);
}

package com.kylin.electricassistsys.testdata.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ddsb.TDdsbBdzDto;

import java.util.List;

public interface TDdsbBdzDataApi {

    public List<TDdsbBdzDto> getList();

    public Page<TDdsbBdzDto> getPages(Page<TDdsbBdzDto> page);

}

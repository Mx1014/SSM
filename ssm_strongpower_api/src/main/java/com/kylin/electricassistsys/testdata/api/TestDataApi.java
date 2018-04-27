package com.kylin.electricassistsys.testdata.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.TestDataDto;

import java.util.List;
public interface TestDataApi {

    public void add(String id);

    public List<TestDataDto> getList();

    public Page<TestDataDto>getPages(Page<TestDataDto>page);

}

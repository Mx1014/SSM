package com.kylin.electricassistsys.testdata.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsDycsDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TJcsjCsDycsDataApi {
    public List<TJcsjCsDycsDto> getList();

    public void update(TJcsjCsDycsDto tJcsjCsDycsDto);

    public void insert(TJcsjCsDycsDto tJcsjCsDycsDto);

    public void delete(String id);

    public Page<TJcsjCsDycsDto> getPages(Page<TJcsjCsDycsDto> page, TJcsjCsDycsDto tJcsjCsDycsDto);
}

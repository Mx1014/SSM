package com.kylin.electricassistsys.testdata.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjBdzxxDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TSbsjBdzxxDataApi {
    public List<TSbsjBdzxxDto> getList();

    public void update(TSbsjBdzxxDto tSbsjBdzxxDto);

    public void insert(TSbsjBdzxxDto tSbsjBdzxxDto);
    public void delete(String id);

    public Page<TSbsjBdzxxDto> getPages(Page<TSbsjBdzxxDto> page, TSbsjBdzxxDto tSbsjBdzxxDto);
}

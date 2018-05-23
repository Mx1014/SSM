package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjBdzxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjBdzxxSelDto;

import java.util.List;
import java.util.Map;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TSbsjBdzxxDataApi {
    public List<TSbsjBdzxxDto> getList();

    public Page getAllList(Page page, TSbsjBdzxxSelDto tSbsjBdzxxSelDto);

    public void update(TSbsjBdzxxDto tSbsjBdzxxDto);

    public void insert(TSbsjBdzxxDto tSbsjBdzxxDto);

    public void delete(String id);

    public Page<TSbsjBdzxxDto> getPages(Page<TSbsjBdzxxDto> page, TSbsjBdzxxDto tSbsjBdzxxDto);
}

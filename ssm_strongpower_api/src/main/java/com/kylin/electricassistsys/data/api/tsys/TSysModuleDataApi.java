package com.kylin.electricassistsys.data.api.tsys;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsys.TSysDanweiDto;
import com.kylin.electricassistsys.dto.tsys.TSysModuleDto;
import com.kylin.electricassistsys.dto.tsys.TSysYwdwDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TSysModuleDataApi {

    public List<TSysModuleDto> getList();

    public void update(TSysModuleDto tSysModuleDto);

    public void insert(TSysModuleDto tSysModuleDto);

    public void delete(String id);

    public Page<TSysModuleDto> getPages(Page<TSysModuleDto> page, TSysModuleDto tSysModuleDto);
}

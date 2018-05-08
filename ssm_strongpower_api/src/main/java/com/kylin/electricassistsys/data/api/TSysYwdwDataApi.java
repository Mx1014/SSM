package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsys.TSysYwdwDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TSysYwdwDataApi {

    public List<TSysYwdwDto> getList();

    public void update(TSysYwdwDto tSysYwdwDto);

    public void insert(TSysYwdwDto tSysYwdwDto);
    public void delete(String id);

    public Page<TSysYwdwDto> getPages(Page<TSysYwdwDto> page,TSysYwdwDto tSysYwdwDto);
}

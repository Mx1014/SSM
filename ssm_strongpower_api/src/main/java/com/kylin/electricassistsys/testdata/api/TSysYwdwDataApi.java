package com.kylin.electricassistsys.testdata.api;

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

    public Page<TSysYwdwDto> getPages(Page<TSysYwdwDto> page);
}

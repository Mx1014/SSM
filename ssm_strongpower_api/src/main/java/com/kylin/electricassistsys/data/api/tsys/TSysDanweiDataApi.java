package com.kylin.electricassistsys.data.api.tsys;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ddsb.TDdsbBdzDto;
import com.kylin.electricassistsys.dto.tsys.TSysDanweiDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TSysDanweiDataApi {

    public List<TSysDanweiDto> getList();

    public Page<TSysDanweiDto> getPages(Page<TSysDanweiDto> page);
}

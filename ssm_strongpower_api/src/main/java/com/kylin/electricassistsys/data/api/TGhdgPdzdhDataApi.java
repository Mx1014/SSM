package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgPdzdhDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgPdzdhSelDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TGhdgPdzdhDataApi {
    public List<TGhdgPdzdhDto> getList();

    public Page getAllList(Page page, TGhdgPdzdhSelDto tGhdgPdzdhSelDto);

    public void update(TGhdgPdzdhDto tGhdgPdzdhDto);

    public void insert(TGhdgPdzdhDto tGhdgPdzdhDto);

    public void delete(String id);

    public Page<TGhdgPdzdhDto> getPages(Page<TGhdgPdzdhDto> page, TGhdgPdzdhDto tGhdgPdzdhDto);
}

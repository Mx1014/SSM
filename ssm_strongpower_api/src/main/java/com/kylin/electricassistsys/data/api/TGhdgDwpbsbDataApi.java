package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbSelDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TGhdgDwpbsbDataApi {
    public List<TGhdgDwpbsbDto> getList();

    public Page getAllList(Page page, TGhdgDwpbsbSelDto tGhdgDwpbsbSelDto);

    public void update(TGhdgDwpbsbDto tGhdgDwpbsbDto);

    public void insert(TGhdgDwpbsbDto tGhdgDwpbsbDto);

    public void delete(String id);

    public Page<TGhdgDwpbsbDto> getPages(Page<TGhdgDwpbsbDto> page, TGhdgDwpbsbDto tGhdgDwpbsbDto);
}

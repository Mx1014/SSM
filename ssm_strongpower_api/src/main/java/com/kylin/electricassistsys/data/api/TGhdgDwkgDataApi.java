package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgSelDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TGhdgDwkgDataApi {
    public List<TGhdgDwkgDto> getList();

    public Page getAllList(Page page, TGhdgDwkgSelDto tGhdgDwkgSelDto);

    public void update(TGhdgDwkgDto tGhdgDwkgDto);

    public void insert(TGhdgDwkgDto tGhdgDwkgDto);

    public void delete(String id);

    public Page<TGhdgDwkgDto> getPages(Page<TGhdgDwkgDto> page, TGhdgDwkgDto tGhdgDwkgDto);
}

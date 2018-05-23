package com.kylin.electricassistsys.data.api.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbSelDto;

import java.util.List;

/**
 * @Auther: whq
 * @ClassName: TGhdgDwpbsbDataApi
 * @Date: 2018/5/9 16:19
 * @Description:电网配变设备Api
 */
public interface TGhdgDwpbsbDataApi {
    public List<TGhdgDwpbsbDto> getList();

    public Page getAllList(Page page, TGhdgDwpbsbSelDto tGhdgDwpbsbSelDto);

    public void update(TGhdgDwpbsbDto tGhdgDwpbsbDto);

    public void insert(TGhdgDwpbsbDto tGhdgDwpbsbDto);

    public void delete(String id);

    public Page<TGhdgDwpbsbDto> getPages(Page<TGhdgDwpbsbDto> page, TGhdgDwpbsbDto tGhdgDwpbsbDto);
}

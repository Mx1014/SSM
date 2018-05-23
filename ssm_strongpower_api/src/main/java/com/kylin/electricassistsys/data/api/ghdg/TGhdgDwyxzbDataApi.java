package com.kylin.electricassistsys.data.api.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwyxzbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwyxzbSelDto;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/5/8 13:33
 * @Description:
 */
public interface TGhdgDwyxzbDataApi {
    public List<TGhdgDwyxzbDto> getList();

    public Page getAllList(Page page, TGhdgDwyxzbSelDto tGhdgDwyxzbSelDto);

    public void update(TGhdgDwyxzbDto tGhdgDwyxzbDto);

    public void insert(TGhdgDwyxzbDto tGhdgDwyxzbDto);

    public void delete(String id);

    public Page<TGhdgDwyxzbDto> getPages(Page<TGhdgDwyxzbDto> page, TGhdgDwyxzbDto tGhdgDwyxzbDto);
}

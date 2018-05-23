package com.kylin.electricassistsys.data.api.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgJmfbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgJmfbSelDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TGhdgJmfbDataApi {
    public List<TGhdgJmfbDto> getList();

    public Page getAllList(Page page, TGhdgJmfbSelDto tGhdgJmfbSelDto);

    public void update(TGhdgJmfbDto tGhdgJmfbDto);

    public void insert(TGhdgJmfbDto tGhdgJmfbDto);

    public void delete(String id);

    public Page<TGhdgJmfbDto> getPages(Page<TGhdgJmfbDto> page, TGhdgJmfbDto tGhdgJmfbDto);
}

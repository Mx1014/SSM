package com.kylin.electricassistsys.data.api.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgXldxjmfbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgXldxjmfbSelDto;

import java.util.List;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public interface TGhdgXldxjmfbDataApi {
    public List<TGhdgXldxjmfbDto> getList();

    public Page getAllList(Page page, TGhdgXldxjmfbSelDto tGhdgXldxjmfbSelDto);

    public void update(TGhdgXldxjmfbDto tGhdgXldxjmfbDto);

    public void insert(TGhdgXldxjmfbDto tGhdgXldxjmfbDto);

    public void delete(String id);

    public Page<TGhdgXldxjmfbDto> getPages(Page<TGhdgXldxjmfbDto> page, TGhdgXldxjmfbDto tGhdgXldxjmfbDto);
}

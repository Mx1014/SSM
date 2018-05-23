package com.kylin.electricassistsys.data.api.ddsb;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ddsb.TDdsbBdzDto;

import java.util.List;
/**
 * @Auther: whq
 * @Date: 2018/5/9 16:02
 * @Description:
 */
public interface TDdsbBdzDataApi {

    public List<TDdsbBdzDto> getList();

    public Page<TDdsbBdzDto> getPages(Page<TDdsbBdzDto> page);

}

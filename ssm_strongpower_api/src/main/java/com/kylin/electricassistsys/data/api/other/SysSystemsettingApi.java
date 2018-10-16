package com.kylin.electricassistsys.data.api.other;

import com.kylin.electricassistsys.dto.other.SysSystemsettingDto;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/10/11 17:28
 * @Description:
 */
public interface SysSystemsettingApi {
    /**
     * 获取系统参数
     * @param
     */
    public List<SysSystemsettingDto> selectSystemsettingResult();
    /**
     * 设置或修改系统参数
     * @param dto
     */
    public void saveOrUpdate(SysSystemsettingDto dto)throws Throwable ;
}

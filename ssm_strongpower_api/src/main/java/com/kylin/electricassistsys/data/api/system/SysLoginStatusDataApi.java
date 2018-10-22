package com.kylin.electricassistsys.data.api.system;

import com.kylin.electricassistsys.dto.system.SysLoginStatusDto;

/**
 * @Auther: whq
 * @Date: 2018/10/22 14:52
 * @Description:
 */
public interface SysLoginStatusDataApi {
    public SysLoginStatusDto selectSysLoginStatusBySessionId(String sessionId);
}

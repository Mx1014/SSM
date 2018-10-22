package com.kylin.electricassistsys.server.impl.system;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.kylin.electricassistsys.data.api.system.SysLoginStatusDataApi;
import com.kylin.electricassistsys.dto.system.SysLoginStatusDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.system.SysLoginStatus;
import com.kylin.electricassistsys.service.system.SysLoginStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: whq
 * @Date: 2018/10/22 14:56
 * @Description:
 */
@Service
public class SysLoginStatusDataServerImpl implements SysLoginStatusDataApi {
    @Autowired
    private SysLoginStatusService sysLoginStatusService;

    public SysLoginStatusDto selectSysLoginStatusBySessionId(String sessionId) {
        EntityWrapper entityWrapper = new EntityWrapper();
        SysLoginStatus sysLoginStatus = new SysLoginStatus();
        SysLoginStatusDto sysLoginStatusDto = new SysLoginStatusDto();
        sysLoginStatus.setSessionId(sessionId);
        entityWrapper.setEntity(sysLoginStatus);
        MyBeanUtils.copyProperties(sysLoginStatusService.selectOne(entityWrapper), sysLoginStatusDto);
        return sysLoginStatusDto;
    }
}

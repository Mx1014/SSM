package com.kylin.electricassistsys.server.impl;

import com.kylin.electricassistsys.data.api.TSystemLogApi;
import com.kylin.electricassistsys.dto.system.TSystemLogDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.system.TSystemLog;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.system.TSystemLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统日志业务处理方法类
 */
@Service
public class TSystemLogServerImpl implements TSystemLogApi {
    /**
     * 这个是日志的service访问接口
     */
     @Resource
    private TSystemLogService tSystemLogService;

    public void insertSystemLog(TSystemLogDto systemLogDto){
        TSystemLog syslog= new TSystemLog();
        syslog.setId(UUIDKey.getKey());
        syslog.setUserOperationTime(UUIDKey.getDate());
        MyBeanUtils.copyProperties(systemLogDto,syslog);
        tSystemLogService.insert(syslog);

    }
}

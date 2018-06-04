package com.kylin.electricassistsys.server.impl.tsys;

import com.kylin.electricassistsys.data.api.tsys.TSystemLogApi;
import com.kylin.electricassistsys.dto.system.TSystemLogDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.system.TSystemLog;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.system.TSystemLogService;
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

    public void insertSystem(TSystemLogDto systemLogDto){
        TSystemLog syslog= new TSystemLog();
        MyBeanUtils.copyProperties(systemLogDto,syslog);
        syslog.setId(UUIDKey.getKey());
        syslog.setUserOperationTime(UUIDKey.getDate());
        tSystemLogService.insert(syslog);
    }
}

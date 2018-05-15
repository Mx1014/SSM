package com.kylin.electricassistsys.service.system;

import com.kylin.electricassistsys.pojo.system.TSystemLog;

/**
 * <p>
 * 用户操作日志记录表 服务类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-05-10
 */

public interface TSystemLogService {
    /**
     * 添加系统日志信息
     * @param log
     */
    public void insertSystem(TSystemLog log);

}

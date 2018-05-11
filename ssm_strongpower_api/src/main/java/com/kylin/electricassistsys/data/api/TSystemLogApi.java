package com.kylin.electricassistsys.data.api;

import com.kylin.electricassistsys.dto.system.TSystemLogDto;

/**
 * 系统日志记录接口
 * cwx
 * 2018/5/10
 */
public interface TSystemLogApi {
    /**
     *添加日志记录信息
     */
    public void insertSystemLog(TSystemLogDto systemLogDto);

}

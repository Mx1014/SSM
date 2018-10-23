package com.kylin.electricassistsys.data.api.tsys;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.system.TSystemLogDto;
import com.kylin.electricassistsys.dto.tsys.TSysYwdwDto;

import java.util.List;

/**
 * 系统日志记录接口
 * cwx
 * 2018/5/10
 */
public interface TSystemLogApi {
    /**
     * 添加日志记录信息
     */
    public void insertSystem(TSystemLogDto systemLogDto);

    public List<TSystemLogDto> getList();

    public void update(TSystemLogDto tSystemLogDto);

    public void delete(String id);

    public Page<TSystemLogDto> getPages(Page<TSystemLogDto> page, TSystemLogDto tSystemLogDto);

}

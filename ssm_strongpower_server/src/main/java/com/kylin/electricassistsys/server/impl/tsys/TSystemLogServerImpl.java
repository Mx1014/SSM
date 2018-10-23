package com.kylin.electricassistsys.server.impl.tsys;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.tsys.TSystemLogApi;
import com.kylin.electricassistsys.dto.system.TSystemLogDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.system.TSystemLog;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.system.TSystemLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public void insertSystem(TSystemLogDto systemLogDto) {
        TSystemLog syslog = new TSystemLog();
        MyBeanUtils.copyProperties(systemLogDto, syslog);
        syslog.setId(UUIDKey.getKey());
        syslog.setUserOperationTime(UUIDKey.getDate());
        tSystemLogService.insert(syslog);
    }

    public List<TSystemLogDto> getList() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new TSystemLog());
        return MyBeanUtils.copyPropertiesList(tSystemLogService.selectList(entityWrapper), TSystemLogDto.class);
    }

    public void update(TSystemLogDto tSystemLogDto) {

    }

    public void delete(String id) {
        tSystemLogService.deleteById(id);
    }

    public Page<TSystemLogDto> getPages(Page<TSystemLogDto> page, TSystemLogDto tSystemLogDto) {
        EntityWrapper entityWrapper = new EntityWrapper();
        TSystemLog tSysYwdw = new TSystemLog();
        MyBeanUtils.copyProperties(tSystemLogDto, tSysYwdw);
        entityWrapper.setEntity(tSysYwdw);
        Page<TSystemLog> pagepojo = new Page<TSystemLog>();
        MyBeanUtils.toPageBean(page, pagepojo, new TSystemLog());
        MyBeanUtils.toPageBean(tSystemLogService.selectPage(pagepojo, entityWrapper), page, new TSystemLogDto());
        return page;
    }
}

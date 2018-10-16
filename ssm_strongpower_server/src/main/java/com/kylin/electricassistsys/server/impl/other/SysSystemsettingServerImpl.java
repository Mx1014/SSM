package com.kylin.electricassistsys.server.impl.other;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.kylin.electricassistsys.data.api.other.SysSystemsettingApi;
import com.kylin.electricassistsys.dto.other.SysSystemsettingDto;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.pojo.other.SysSystemsetting;
import com.kylin.electricassistsys.server.impl.tools.UUIDKey;
import com.kylin.electricassistsys.service.other.SysSystemsettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/10/12 08:49
 * @Description:
 */
@Service
public class SysSystemsettingServerImpl implements SysSystemsettingApi {
    @Autowired
    private SysSystemsettingService sysSystemsettingService;

    @Override
    public List<SysSystemsettingDto> selectSystemsettingResult() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(new SysSystemsetting());
        return MyBeanUtils.copyPropertiesList(sysSystemsettingService.selectList(entityWrapper), SysSystemsetting.class);
    }

    public void saveOrUpdate(SysSystemsettingDto dto) throws Throwable {
        SysSystemsetting sysSystemsetting = new SysSystemsetting();
        MyBeanUtils.copyProperties(dto, sysSystemsetting);
        if (sysSystemsetting.getSysSystemsettingId() == null) {
            sysSystemsetting.setSysSystemsettingId(UUIDKey.getKey());
        }
        sysSystemsettingService.insertOrUpdate(sysSystemsetting);
    }
}

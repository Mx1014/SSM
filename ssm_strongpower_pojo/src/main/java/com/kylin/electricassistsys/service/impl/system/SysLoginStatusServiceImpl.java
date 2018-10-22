package com.kylin.electricassistsys.service.impl.system;

import com.kylin.electricassistsys.pojo.system.SysLoginStatus;
import com.kylin.electricassistsys.dao.system.SysLoginStatusDao;
import com.kylin.electricassistsys.service.system.SysLoginStatusService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2018-10-22
 */
@Service
@Transactional
public class SysLoginStatusServiceImpl extends ServiceImpl<SysLoginStatusDao, SysLoginStatus> implements SysLoginStatusService {

}

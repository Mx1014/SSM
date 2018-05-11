package com.kylin.electricassistsys.service.impl.system;

import com.kylin.electricassistsys.pojo.system.TSystemLog;
import com.kylin.electricassistsys.dao.system.TSystemLogDao;
import com.kylin.electricassistsys.service.system.TSystemLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 用户操作日志记录表 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-05-10
 */
@Service
@Transactional
public class TSystemLogServiceImap extends ServiceImpl<TSystemLogDao, TSystemLog> implements TSystemLogService {

}

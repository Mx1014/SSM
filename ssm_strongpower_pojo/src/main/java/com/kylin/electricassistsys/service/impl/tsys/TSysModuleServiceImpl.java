package com.kylin.electricassistsys.service.impl.tsys;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsys.TSysModuleDao;
import com.kylin.electricassistsys.pojo.tsys.TSysModule;
import com.kylin.electricassistsys.service.tsys.TSysModuleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2018-10-23
 */
@Service
@Transactional
public class TSysModuleServiceImpl extends ServiceImpl<TSysModuleDao, TSysModule> implements TSysModuleService {

}

package com.kylin.electricassistsys.service.impl.tsbsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsbsj.TSbguanlianDao;
import com.kylin.electricassistsys.pojo.tsbsj.TSbguanlian;
import com.kylin.electricassistsys.service.tsbsj.TSbguanlianService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 设备关联表 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TSbguanlianServiceImap extends ServiceImpl<TSbguanlianDao, TSbguanlian> implements TSbguanlianService {

}

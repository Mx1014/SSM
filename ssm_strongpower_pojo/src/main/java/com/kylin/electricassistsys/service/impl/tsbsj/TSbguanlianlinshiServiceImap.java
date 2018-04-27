package com.kylin.electricassistsys.service.impl.tsbsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsbsj.TSbguanlianlinshiDao;
import com.kylin.electricassistsys.pojo.tsbsj.TSbguanlianlinshi;
import com.kylin.electricassistsys.service.tsbsj.TSbguanlianlinshiService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 设备关联表临时 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TSbguanlianlinshiServiceImap extends ServiceImpl<TSbguanlianlinshiDao, TSbguanlianlinshi> implements TSbguanlianlinshiService {

}

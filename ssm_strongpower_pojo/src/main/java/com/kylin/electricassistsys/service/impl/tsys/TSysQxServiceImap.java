package com.kylin.electricassistsys.service.impl.tsys;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsys.TSysQxDao;
import com.kylin.electricassistsys.pojo.tsys.TSysQx;
import com.kylin.electricassistsys.service.tsys.TSysQxService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TSysQxServiceImap extends ServiceImpl<TSysQxDao, TSysQx> implements TSysQxService {

}

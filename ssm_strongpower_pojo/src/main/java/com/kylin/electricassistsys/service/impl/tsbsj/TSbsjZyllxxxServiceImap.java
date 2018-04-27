package com.kylin.electricassistsys.service.impl.tsbsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsbsj.TSbsjZyllxxxDao;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjZyllxxx;
import com.kylin.electricassistsys.service.tsbsj.TSbsjZyllxxxService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 中压线路信息 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TSbsjZyllxxxServiceImap extends ServiceImpl<TSbsjZyllxxxDao, TSbsjZyllxxx> implements TSbsjZyllxxxService {

}

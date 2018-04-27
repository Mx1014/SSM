package com.kylin.electricassistsys.service.impl.tsbsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsbsj.TSbsjByqxxDao;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjByqxx;
import com.kylin.electricassistsys.service.tsbsj.TSbsjByqxxService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 变压器信息 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TSbsjByqxxServiceImap extends ServiceImpl<TSbsjByqxxDao, TSbsjByqxx> implements TSbsjByqxxService {

}

package com.kylin.electricassistsys.service.impl.tyx;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tyx.TYxYxsjByqDao;
import com.kylin.electricassistsys.pojo.tyx.TYxYxsjByq;
import com.kylin.electricassistsys.service.tyx.TYxYxsjByqService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 变压器运行数据表 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TYxYxsjByqServiceImap extends ServiceImpl<TYxYxsjByqDao, TYxYxsjByq> implements TYxYxsjByqService {

}

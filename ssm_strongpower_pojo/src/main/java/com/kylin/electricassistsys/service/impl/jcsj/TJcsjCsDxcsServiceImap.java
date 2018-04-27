package com.kylin.electricassistsys.service.impl.jcsj;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.jcsj.TJcsjCsDxcsDao;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjCsDxcs;
import com.kylin.electricassistsys.service.jcsj.TJcsjCsDxcsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 导线参数 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TJcsjCsDxcsServiceImap extends ServiceImpl<TJcsjCsDxcsDao, TJcsjCsDxcs> implements TJcsjCsDxcsService {

}

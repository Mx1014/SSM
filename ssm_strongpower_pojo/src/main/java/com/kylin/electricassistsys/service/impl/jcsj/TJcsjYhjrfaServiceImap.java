package com.kylin.electricassistsys.service.impl.jcsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.jcsj.TJcsjYhjrfaDao;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjYhjrfa;
import com.kylin.electricassistsys.service.jcsj.TJcsjYhjrfaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 用户接入方案 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TJcsjYhjrfaServiceImap extends ServiceImpl<TJcsjYhjrfaDao, TJcsjYhjrfa> implements TJcsjYhjrfaService {

}

package com.kylin.electricassistsys.service.impl.jcsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.jcsj.TJcsjZllxDao;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjZllx;
import com.kylin.electricassistsys.service.jcsj.TJcsjZllxService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 资料类型 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TJcsjZllxServiceImap extends ServiceImpl<TJcsjZllxDao, TJcsjZllx> implements TJcsjZllxService {

}

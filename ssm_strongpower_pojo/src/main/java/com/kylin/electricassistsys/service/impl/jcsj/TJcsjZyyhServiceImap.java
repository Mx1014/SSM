package com.kylin.electricassistsys.service.impl.jcsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.jcsj.TJcsjZyyhDao;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjZyyh;
import com.kylin.electricassistsys.service.jcsj.TJcsjZyyhService;
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
public class TJcsjZyyhServiceImap extends ServiceImpl<TJcsjZyyhDao, TJcsjZyyh> implements TJcsjZyyhService {

}

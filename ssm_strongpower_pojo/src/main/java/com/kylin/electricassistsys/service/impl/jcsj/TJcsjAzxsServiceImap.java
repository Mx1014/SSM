package com.kylin.electricassistsys.service.impl.jcsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.jcsj.TJcsjAzxsDao;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjAzxs;
import com.kylin.electricassistsys.service.jcsj.TJcsjAzxsService;
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
public class TJcsjAzxsServiceImap extends ServiceImpl<TJcsjAzxsDao, TJcsjAzxs> implements TJcsjAzxsService {

}

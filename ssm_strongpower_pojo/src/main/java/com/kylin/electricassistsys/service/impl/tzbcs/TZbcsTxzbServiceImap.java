package com.kylin.electricassistsys.service.impl.tzbcs;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tzbcs.TZbcsTxzbDao;
import com.kylin.electricassistsys.pojo.tzbcs.TZbcsTxzb;
import com.kylin.electricassistsys.service.tzbcs.TZbcsTxzbService;
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
public class TZbcsTxzbServiceImap extends ServiceImpl<TZbcsTxzbDao, TZbcsTxzb> implements TZbcsTxzbService {

}

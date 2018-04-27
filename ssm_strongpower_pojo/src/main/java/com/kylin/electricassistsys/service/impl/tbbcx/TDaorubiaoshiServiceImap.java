package com.kylin.electricassistsys.service.impl.tbbcx;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tbbcx.TDaorubiaoshiDao;
import com.kylin.electricassistsys.pojo.tbbcx.TDaorubiaoshi;
import com.kylin.electricassistsys.service.tbbcx.TDaorubiaoshiService;
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
public class TDaorubiaoshiServiceImap extends ServiceImpl<TDaorubiaoshiDao, TDaorubiaoshi> implements TDaorubiaoshiService {

}

package com.kylin.electricassistsys.service.impl.tjisuan;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tjisuan.TJcmbEmailDao;
import com.kylin.electricassistsys.pojo.tjisuan.TJcmbEmail;
import com.kylin.electricassistsys.service.tjisuan.TJcmbEmailService;
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
public class TJcmbEmailServiceImap extends ServiceImpl<TJcmbEmailDao, TJcmbEmail> implements TJcmbEmailService {

}

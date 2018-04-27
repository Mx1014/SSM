package com.kylin.electricassistsys.service.impl.tjisuan;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tjisuan.TJisuanByqnDao;
import com.kylin.electricassistsys.pojo.tjisuan.TJisuanByqn;
import com.kylin.electricassistsys.service.tjisuan.TJisuanByqnService;
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
public class TJisuanByqnServiceImap extends ServiceImpl<TJisuanByqnDao, TJisuanByqn> implements TJisuanByqnService {

}

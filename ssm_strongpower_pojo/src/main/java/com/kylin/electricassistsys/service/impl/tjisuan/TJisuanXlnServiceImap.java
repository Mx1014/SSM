package com.kylin.electricassistsys.service.impl.tjisuan;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tjisuan.TJisuanXlnDao;
import com.kylin.electricassistsys.pojo.tjisuan.TJisuanXln;
import com.kylin.electricassistsys.service.tjisuan.TJisuanXlnService;
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
public class TJisuanXlnServiceImap extends ServiceImpl<TJisuanXlnDao, TJisuanXln> implements TJisuanXlnService {

}

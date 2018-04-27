package com.kylin.electricassistsys.service.impl.tjisuan;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tjisuan.TJisuanZyxldyjDao;
import com.kylin.electricassistsys.pojo.tjisuan.TJisuanZyxldyj;
import com.kylin.electricassistsys.service.tjisuan.TJisuanZyxldyjService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 计算电压降 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TJisuanZyxldyjServiceImap extends ServiceImpl<TJisuanZyxldyjDao, TJisuanZyxldyj> implements TJisuanZyxldyjService {

}

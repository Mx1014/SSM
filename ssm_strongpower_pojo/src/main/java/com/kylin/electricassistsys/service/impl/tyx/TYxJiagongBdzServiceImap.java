package com.kylin.electricassistsys.service.impl.tyx;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tyx.TYxJiagongBdzDao;
import com.kylin.electricassistsys.pojo.tyx.TYxJiagongBdz;
import com.kylin.electricassistsys.service.tyx.TYxJiagongBdzService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 变电站加工后的运行表 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TYxJiagongBdzServiceImap extends ServiceImpl<TYxJiagongBdzDao, TYxJiagongBdz> implements TYxJiagongBdzService {

}

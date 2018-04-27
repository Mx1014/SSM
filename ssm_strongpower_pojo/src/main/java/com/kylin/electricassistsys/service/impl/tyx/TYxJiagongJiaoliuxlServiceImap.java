package com.kylin.electricassistsys.service.impl.tyx;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tyx.TYxJiagongJiaoliuxlDao;
import com.kylin.electricassistsys.pojo.tyx.TYxJiagongJiaoliuxl;
import com.kylin.electricassistsys.service.tyx.TYxJiagongJiaoliuxlService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 交流线路加工后的运行表 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TYxJiagongJiaoliuxlServiceImap extends ServiceImpl<TYxJiagongJiaoliuxlDao, TYxJiagongJiaoliuxl> implements TYxJiagongJiaoliuxlService {

}

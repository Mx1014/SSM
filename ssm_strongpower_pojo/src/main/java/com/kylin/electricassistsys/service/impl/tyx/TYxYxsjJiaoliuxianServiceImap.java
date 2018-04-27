package com.kylin.electricassistsys.service.impl.tyx;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tyx.TYxYxsjJiaoliuxianDao;
import com.kylin.electricassistsys.pojo.tyx.TYxYxsjJiaoliuxian;
import com.kylin.electricassistsys.service.tyx.TYxYxsjJiaoliuxianService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 交流线路运行数据表 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TYxYxsjJiaoliuxianServiceImap extends ServiceImpl<TYxYxsjJiaoliuxianDao, TYxYxsjJiaoliuxian> implements TYxYxsjJiaoliuxianService {

}

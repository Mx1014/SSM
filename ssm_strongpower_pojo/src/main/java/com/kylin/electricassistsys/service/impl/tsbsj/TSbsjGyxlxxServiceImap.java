package com.kylin.electricassistsys.service.impl.tsbsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsbsj.TSbsjGyxlxxDao;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjGyxlxx;
import com.kylin.electricassistsys.service.tsbsj.TSbsjGyxlxxService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 高压线路信息 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TSbsjGyxlxxServiceImap extends ServiceImpl<TSbsjGyxlxxDao, TSbsjGyxlxx> implements TSbsjGyxlxxService {

}

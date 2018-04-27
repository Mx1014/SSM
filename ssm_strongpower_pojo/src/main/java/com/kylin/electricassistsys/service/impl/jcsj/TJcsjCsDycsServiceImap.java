package com.kylin.electricassistsys.service.impl.jcsj;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.jcsj.TJcsjCsDycsDao;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjCsDycs;
import com.kylin.electricassistsys.service.jcsj.TJcsjCsDycsService;
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
public class TJcsjCsDycsServiceImap extends ServiceImpl<TJcsjCsDycsDao, TJcsjCsDycs> implements TJcsjCsDycsService {

}

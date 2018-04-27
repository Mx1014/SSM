package com.kylin.electricassistsys.service.impl.jcsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.jcsj.TJcsjGdgsjcsjDao;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjGdgsjcsj;
import com.kylin.electricassistsys.service.jcsj.TJcsjGdgsjcsjService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 供电公司基础数据 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TJcsjGdgsjcsjServiceImap extends ServiceImpl<TJcsjGdgsjcsjDao, TJcsjGdgsjcsj> implements TJcsjGdgsjcsjService {

}

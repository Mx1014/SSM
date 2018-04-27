package com.kylin.electricassistsys.service.impl.wghgl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.wghgl.TDwghglGybdzDao;
import com.kylin.electricassistsys.pojo.wghgl.TDwghglGybdz;
import com.kylin.electricassistsys.service.wghgl.TDwghglGybdzService;
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
public class TDwghglGybdzServiceImap extends ServiceImpl<TDwghglGybdzDao, TDwghglGybdz> implements TDwghglGybdzService {

}

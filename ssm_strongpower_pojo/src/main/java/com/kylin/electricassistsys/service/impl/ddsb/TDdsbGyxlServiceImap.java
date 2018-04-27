package com.kylin.electricassistsys.service.impl.ddsb;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.ddsb.TDdsbGyxlDao;
import com.kylin.electricassistsys.pojo.ddsb.TDdsbGyxl;
import com.kylin.electricassistsys.service.ddsb.TDdsbGyxlService;
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
public class TDdsbGyxlServiceImap extends ServiceImpl<TDdsbGyxlDao, TDdsbGyxl> implements TDdsbGyxlService {

}

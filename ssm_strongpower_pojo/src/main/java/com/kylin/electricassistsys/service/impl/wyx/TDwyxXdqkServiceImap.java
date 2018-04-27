package com.kylin.electricassistsys.service.impl.wyx;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.wyx.TDwyxXdqkDao;
import com.kylin.electricassistsys.pojo.wyx.TDwyxXdqk;
import com.kylin.electricassistsys.service.wyx.TDwyxXdqkService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 拉闸/限电情况 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TDwyxXdqkServiceImap extends ServiceImpl<TDwyxXdqkDao, TDwyxXdqk> implements TDwyxXdqkService {

}

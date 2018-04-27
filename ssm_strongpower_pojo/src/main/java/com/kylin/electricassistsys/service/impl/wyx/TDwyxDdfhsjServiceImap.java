package com.kylin.electricassistsys.service.impl.wyx;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.wyx.TDwyxDdfhsjDao;
import com.kylin.electricassistsys.pojo.wyx.TDwyxDdfhsj;
import com.kylin.electricassistsys.service.wyx.TDwyxDdfhsjService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 调度8760运行 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TDwyxDdfhsjServiceImap extends ServiceImpl<TDwyxDdfhsjDao, TDwyxDdfhsj> implements TDwyxDdfhsjService {

}

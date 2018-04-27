package com.kylin.electricassistsys.service.impl.tsbsj;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsbsj.TSbsjByqlsDao;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjByqls;
import com.kylin.electricassistsys.service.tsbsj.TSbsjByqlsService;
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
public class TSbsjByqlsServiceImap extends ServiceImpl<TSbsjByqlsDao, TSbsjByqls> implements TSbsjByqlsService {

}

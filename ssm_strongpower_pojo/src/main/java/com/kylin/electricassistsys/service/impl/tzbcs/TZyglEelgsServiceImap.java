package com.kylin.electricassistsys.service.impl.tzbcs;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tzbcs.TZyglEelgsDao;
import com.kylin.electricassistsys.pojo.tzbcs.TZyglEelgs;
import com.kylin.electricassistsys.service.tzbcs.TZyglEelgsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 间隔管理 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TZyglEelgsServiceImap extends ServiceImpl<TZyglEelgsDao, TZyglEelgs> implements TZyglEelgsService {

}

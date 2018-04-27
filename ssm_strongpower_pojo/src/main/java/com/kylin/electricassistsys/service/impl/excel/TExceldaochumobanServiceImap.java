package com.kylin.electricassistsys.service.impl.excel;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.excel.TExceldaochumobanDao;
import com.kylin.electricassistsys.pojo.excel.TExceldaochumoban;
import com.kylin.electricassistsys.service.excel.TExceldaochumobanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 导出模板 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TExceldaochumobanServiceImap extends ServiceImpl<TExceldaochumobanDao, TExceldaochumoban> implements TExceldaochumobanService {

}

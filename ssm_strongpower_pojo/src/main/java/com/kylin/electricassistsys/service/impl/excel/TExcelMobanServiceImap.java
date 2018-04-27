package com.kylin.electricassistsys.service.impl.excel;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.excel.TExcelMobanDao;
import com.kylin.electricassistsys.pojo.excel.TExcelMoban;
import com.kylin.electricassistsys.service.excel.TExcelMobanService;
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
public class TExcelMobanServiceImap extends ServiceImpl<TExcelMobanDao, TExcelMoban> implements TExcelMobanService {

}

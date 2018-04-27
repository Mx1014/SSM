package com.kylin.electricassistsys.service.impl.excel;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.excel.TExceljiucuomobanDao;
import com.kylin.electricassistsys.pojo.excel.TExceljiucuomoban;
import com.kylin.electricassistsys.service.excel.TExceljiucuomobanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 纠错模板 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TExceljiucuomobanServiceImap extends ServiceImpl<TExceljiucuomobanDao, TExceljiucuomoban> implements TExceljiucuomobanService {

}

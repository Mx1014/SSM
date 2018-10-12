package com.kylin.electricassistsys.service.impl.other;

import com.kylin.electricassistsys.dao.other.PieDataDao;
import com.kylin.electricassistsys.pojo.other.PieData;
import com.kylin.electricassistsys.service.other.PieDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/10/12 08:53
 * @Description:
 */
@Service
@Transactional
public class PieDataServiceImpl implements PieDataService {
    @Autowired
    private PieDataDao pieDataDao;

    @Override
    public List<PieData> selectBdzTypeResult() {
        return pieDataDao.selectBdzTypeResult();
    }

    @Override
    public List<PieData> selectXlxxGyZyResult() {
        return pieDataDao.selectXlxxGyZyResult();
    }
}

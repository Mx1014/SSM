package com.kylin.electricassistsys.service.other;

import com.kylin.electricassistsys.pojo.other.PieData;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/10/11 17:30
 * @Description:
 */
public interface PieDataService {
    public List<PieData> selectBdzTypeResult();

    public List<PieData> selectXlxxGyZyResult();
}

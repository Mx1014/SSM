package com.kylin.electricassistsys.dao.other;

import com.kylin.electricassistsys.annotation.MyBatisRepository;
import com.kylin.electricassistsys.pojo.other.PieData;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/23 14:30
 * @Description: 资源管理数据持久接口类
 */
@MyBatisRepository
public interface PieDataDao {
    public List<PieData> selectBdzTypeResult();
    public List<PieData> selectXlxxGyZyResult();
}

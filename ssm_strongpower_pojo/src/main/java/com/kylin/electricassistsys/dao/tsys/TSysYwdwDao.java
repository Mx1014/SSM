package com.kylin.electricassistsys.dao.tsys;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.kylin.electricassistsys.annotation.MyBatisRepository;
import com.kylin.electricassistsys.pojo.tsys.TSysYwdw;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
	
@MyBatisRepository
public interface TSysYwdwDao extends BaseMapper<TSysYwdw> {
    /**
     * 根据id删除数据
     * @param id
     */
    public void deleteById(String id);

}

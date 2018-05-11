package com.kylin.electricassistsys.dao.system;

import com.kylin.electricassistsys.annotation.MyBatisRepository;
import com.kylin.electricassistsys.pojo.system.TSystemLog;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 用户操作日志记录表 Mapper 接口
 * </p>
 *
 * @author 陈文旭
 * @since 2018-05-10
 */
@MyBatisRepository
public interface TSystemLogDao extends BaseMapper<TSystemLog> {

}

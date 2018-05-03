package com.kylin.electricassistsys.dao.tsbsj;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.kylin.electricassistsys.annotation.MyBatisRepository;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxx;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxxSel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 变电站信息 Mapper 接口
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */

@MyBatisRepository
public interface TSbsjBdzxxDao extends BaseMapper<TSbsjBdzxx> {
    /**
     * 功能描述:查询结果集封装成map
     * @param:
     * @return: Map
     * @auther: whq
     * @date: 2018/5/3 14:09
     */
    public List<TSbsjBdzxxSel> getList(Pagination page);
}

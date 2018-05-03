package com.kylin.electricassistsys.service.tsbsj;


import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.IService;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxx;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxxSel;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 变电站信息 服务类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public interface TSbsjBdzxxService extends IService<TSbsjBdzxx> {
    /**
     * 功能描述: 获取变电站信息列表
     * @param:
     * @return: map
     * @auther: whq
     * @date: 2018/5/3 14:12
     */
    public Page<TSbsjBdzxxSel> getList(Page page);
}

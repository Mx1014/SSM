package com.kylin.electricassistsys.service.impl.tsbsj;


import com.baomidou.mybatisplus.mapper.SqlHelper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsbsj.TSbsjBdzxxDao;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxx;
import com.kylin.electricassistsys.pojo.tsbsj.TSbsjBdzxxSel;
import com.kylin.electricassistsys.service.tsbsj.TSbsjBdzxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 变电站信息 服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TSbsjBdzxxServiceImap extends ServiceImpl<TSbsjBdzxxDao, TSbsjBdzxx> implements TSbsjBdzxxService {
    @Autowired
    private TSbsjBdzxxDao tSbsjBdzxxDao;


    public Page<TSbsjBdzxxSel> getList(Page page) {
        //return tSbsjBdzxxDao.getList();
        page.setRecords(tSbsjBdzxxDao.getList(page));
        return page;
    }
}

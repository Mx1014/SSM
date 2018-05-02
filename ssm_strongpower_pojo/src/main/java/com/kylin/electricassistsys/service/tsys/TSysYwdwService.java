package com.kylin.electricassistsys.service.tsys;


import com.baomidou.mybatisplus.service.IService;
import com.kylin.electricassistsys.pojo.tsys.TSysYwdw;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public interface TSysYwdwService extends IService<TSysYwdw> {
    /**
     * 根据id删除数据
     * @param id
     */
    public void deleteById(String id);

}

package com.kylin.electricassistsys.data.api.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjDyxlxxDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjDyxlxxSelDto;

import java.util.List;

/**
 * @Auther: cwx
 * @Date: 2018/5/17 15:52
 * @Description:低壓綫路信息接口類
 */
public interface TSbsjDyxlxxDataApi {

    /**
     * 返回所有低壓綫路信息的數據
     * @return
     */
    public List<TSbsjDyxlxxDto> getList()throws Throwable;
    /**
     * 查询低壓綫路信息信息进行分页
     * @param dto
     * @return
     */
    public Page<TSbsjDyxlxxSelDto> selectPage(Page page, TSbsjDyxlxxSelDto dto)throws Throwable ;

    /**
     *添加低壓綫路信息信息接口
     * @param dto
     */
    public void insert(TSbsjDyxlxxDto dto)throws Throwable ;

    /**
     * 更新低壓綫路信息信息接口
     * @param dto
     */
    public void update(TSbsjDyxlxxDto dto)throws Throwable ;

    /**
     *删除根据id低壓綫路信息接口
     */
    public void delete(String id)throws Throwable ;

    /**
     * 根据id进行批量删除 低壓綫路信息接口
     * @param ids
     */
    public void deleteBatchIds(String ids)throws Throwable ;
}

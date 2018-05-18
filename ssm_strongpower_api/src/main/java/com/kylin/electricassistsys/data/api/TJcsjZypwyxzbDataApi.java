package com.kylin.electricassistsys.data.api;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZypwyxzbDto;
import com.kylin.electricassistsys.dto.jcsj.TJcsjZypwyxzbSelDto;

/**
 *中压配网运行指标及分析接口
 * cwx
 */
public interface TJcsjZypwyxzbDataApi {
            /**
             * 查询中压配网运行指标及分析接口
             * @param dto
             * @return
             */
         public Page<TJcsjZypwyxzbSelDto> selectPage(Page page, TJcsjZypwyxzbSelDto dto)throws Throwable ;

            /**
             *添加中压配网运行指标数据
             * @param dto
             */
         public void insert(TJcsjZypwyxzbDto dto)throws Throwable ;

        /**
         * 更新中压配网运行指标数据
         * @param dto
         */
         public void update(TJcsjZypwyxzbDto dto)throws Throwable ;

        /**
         *删除根据id中压配网运行指标数据
         */
      public void delete(String id)throws Throwable ;

        /**
         * 根据id进行批量删除 中压配网运行指标数据
         * @param ids
         */
    public void deleteBatchIds(String ids)throws Throwable ;


}

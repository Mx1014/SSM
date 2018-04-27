package com.kylin.electricassistsys.tools;

import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

/**
 * 获取mybatis的SqlSessionFactory重写方法
 * cwx
 */
public class SqlSessionFactory extends MybatisSqlSessionFactoryBean {
    private static Logger logger = LoggerFactory.getLogger(SqlSessionFactory.class);
    private String mapperLocations = null;

    public void setMapperLocations(String mapperLocations) {
        logger.info("开始设置mapper");
        this.mapperLocations = mapperLocations;

        try {
            PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
            Resource[] e = resourcePatternResolver.getResources(this.mapperLocations);
            if (e != null) {
                logger.debug("resources.length=" + e.length);
            }

            super.setMapperLocations(e);
        } catch (IOException arg3) {
            arg3.printStackTrace();
            logger.error("mapper加载错误", arg3);
        }

    }
}

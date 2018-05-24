package com.kylin.electricassistsys.entitywrapperutils;

import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @Auther: whq
 * @Date: 2018/5/7 13:22
 * @Description:
 */
public class EntityWrapperUtil {
    private static final Logger logger = LoggerFactory.getLogger(EntityWrapperUtil.class);

    /*public static EntityWrapper getEntityWrapperWithCondition(EntityWrapper entityWrapper, Object bean) {
        try {
            Class clazz = bean.getClass();//获取class
            String className = clazz.getName();// 获取类名称
            // String[] nameArr = className.substring(className.lastIndexOf("."));
            className = className.substring(className.lastIndexOf(".") + 1);
            className = underScoreName(className);
            if (className.endsWith("_SEL")) {
                className = className.substring(0, className.lastIndexOf("_SEL"));
            }
            System.out.println("Table name:" + className);
            Field[] field = bean.getClass().getDeclaredFields(); //获取实体类的所有属性，返回Field数组
            for (int j = 0; j < field.length; j++) { //遍历所有属性
                String name = field[j].getName(); //获取属性的名字
                String fieldName = underScoreName(name);
                field[j].setAccessible(true);
                Object object = field[j].get(bean);
                if (!name.equals("serialVersionUID") && object != null && object != "") {
                    System.out.println("Table field name:" + fieldName);
                    System.out.println("attribute name:" + name);
                    System.out.println("attribute value:" + object);
                    if (fieldName.endsWith("_NAME")) {
                        entityWrapper.where(className + "." + fieldName + " like {0}", "%" + object + "%");
                    } else {
                        entityWrapper.where(className + "." + fieldName + " = {0}", object);
                    }

                }

                // name = name.substring(0, 1).toUpperCase() + name.substring(1); //将属性的首字符大写，方便构造get，set方法
                // String type = field[j].getGenericType().toString(); //获取属性的类型
                *//*if (type.equals("class java.lang.String")) { //如果type是类类型，则前面包含"class "，后面跟类名
                }
                if (type.equals("class java.lang.Integer")) {
                }
                if (type.equals("class java.lang.Short")) {
                }
                if (type.equals("class java.lang.Double")) {
                }
                if (type.equals("class java.lang.Boolean")) {
                }
                if (type.equals("class java.util.Date")) {
                }*//*
            }
            return entityWrapper;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("封装EntityWrapper失败", e);
        }
        return entityWrapper;
    }*/

    /**
     * 功能描述: 根据实体获取数据库表名称
     *
     * @param: bean 实体对象
     * @return: 数据库表名称
     * @auther: whq
     * @date: 2018/5/24 10:57
     */
    public static String getTableName(Object bean) {
        Class clazz = bean.getClass();//获取class
        String tableName = clazz.getName();// 获取类名称
        tableName = tableName.substring(tableName.lastIndexOf(".") + 1);
        tableName = underScoreName(tableName);
        if (tableName.endsWith("_SEL")) {
            tableName = tableName.substring(0, tableName.lastIndexOf("_SEL"));
        }
        return tableName;
    }

    /**
     * 功能描述: 获取mybatis动态查询条件对象
     *
     * @param: entityWrapper：查询条件对象 bean：条件实体类对象
     * @return: mybatis动态查询条件对象
     * @auther: whq
     * @date: 2018/5/24 10:58
     */
    public static EntityWrapper getEntityWrapperWithCondition(EntityWrapper entityWrapper, Object bean) {
        String tableName = null;
        try {
            Class clazz = bean.getClass();//获取class
            // 判断类上是否注解TableName注解
            boolean clzHasAnno = clazz.isAnnotationPresent(TableName.class);
            if (clzHasAnno) {
                // 获取类上的注解
                TableName annotationTableName = (TableName) clazz.getAnnotation(TableName.class);
                // 获取注解上的属性值
                tableName = annotationTableName.value();
                if (tableName == null || "".equals(tableName)) {
                    //注解未获取到表名根据实体获取表名
                    tableName = getTableName(bean);
                }
            } else {
                //没有TableName注解根据实体获取表名
                tableName = getTableName(bean);
            }
            Field[] field = bean.getClass().getDeclaredFields(); //获取实体类的所有属性，返回Field数组
            for (int j = 0; j < field.length; j++) { //遍历所有属性
                String name = field[j].getName(); //获取属性的名字
                String fieldName = underScoreName(name);
                field[j].setAccessible(true);
                Object object = field[j].get(bean);
                if (!name.equals("serialVersionUID") && object != null && object != "") {
                    if (fieldName.endsWith("_NAME")) {
                        entityWrapper.where(tableName + "." + fieldName + " like {0}", "%" + object + "%");
                    } else {
                        entityWrapper.where(tableName + "." + fieldName + " = {0}", object);
                    }

                }
            }
            return entityWrapper;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("封装EntityWrapper失败", e);
        }
        return entityWrapper;
    }

    /**
     * 功能描述: 将类名、属性名转换成数据库中的表名、字段名称
     *
     * @param: 属性、类名
     * @return: 字段、表名
     * @auther: whq
     * @date: 2018/5/24 11:03
     */
    public static String underScoreName(String name) {
        StringBuilder result = new StringBuilder();
        if (name != null && name.length() > 0) {
            result.append(name.substring(0, 1).toUpperCase());
            for (int i = 1; i < name.length(); i++) {
                String s = name.substring(i, i + 1);
                if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {
                    result.append("_");
                }
                result.append(s.toUpperCase());
            }
        }
        return result.toString();
    }
}

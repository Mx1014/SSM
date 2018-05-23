package com.kylin.electricassistsys.entitywrapperutils;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * @Auther: whq
 * @Date: 2018/5/7 13:22
 * @Description:
 */
public class EntityWrapperUtil {
    private static final Logger logger = LoggerFactory.getLogger(EntityWrapperUtil.class);

    public static EntityWrapper getEntityWrapperWithCondition(EntityWrapper entityWrapper, Object bean) {
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
                /*if (type.equals("class java.lang.String")) { //如果type是类类型，则前面包含"class "，后面跟类名
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
                }*/
            }
            return entityWrapper;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("封装EntityWrapper失败", e);
        }
        return entityWrapper;
    }

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

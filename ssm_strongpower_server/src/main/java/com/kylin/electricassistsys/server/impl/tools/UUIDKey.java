package com.kylin.electricassistsys.server.impl.tools;

import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.*;

/**
 * 生成主键ID
 * cwx
 */
public class UUIDKey {
    /**
     * 生成主键id--32位字符
     * @return
     */
    public static String getKey(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    /**
     * 获取当前的时间返回string
     * @return
     */
    public static String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(new Date());
        return date;
    }
}

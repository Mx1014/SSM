package com.kylin.electricassistsys.tools.constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: cwx
 * @Date: 2018/5/25 16:46
 * @Description: URL请求常量类
 */
public class URLConstants {
    /**
     * 全局日志
     */
    public static final Logger LOG = LoggerFactory.getLogger(URLConstants.class);
    /**
     * 请求url地址路径
     */
    public static final String URL="http://127.0.0.1:8089/hunt-web/";
    /**
     * 登录请求接口
     */
    public static final String LOGIN=URL+"system/login";




}

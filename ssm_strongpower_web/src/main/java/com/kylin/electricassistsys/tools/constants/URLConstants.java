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
     * 请求项目IP地址
     */
    public static final String DOMAINIP ="127.0.0.1";
    /**
     * 请求项目名称
     */
    public static final String HTTPPROJECT= "hunt-web";

     public static final String HTTPPROST="8089";
    /**
     * 请求url地址路径
     */
    public static final String URL="http://"+DOMAINIP+":"+HTTPPROST+"/"+HTTPPROJECT+"/";
    /**
     * 登录请求接口
     */
    public static final String LOGIN=URL+"system/login";

    public static final String USERMENU=URL+"selectuserrolemenu/selectUserRoleMenuList";




}

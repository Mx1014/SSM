package com.kylin.electricassistsys.tools.sqlfilter;


import com.kylin.electricassistsys.rsas.RSATools;
import com.kylin.electricassistsys.tools.json.FastjsonUtils;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 验证参数合法性
 * cwx
 * 2018/5/8
 */
public class SqlRegular {

    public static boolean ForMap(Map<String, Object>map){
        try {
            for (Object value : map.values()) {
                boolean fals=sqlValidateRegex(value+"");
                if(fals){
                    return  true;
                }
            }
        }catch (Exception e){
            return false;
        }
        return false;

    }

    /**
     * 将request中的值放转换为string
     * @param request
     * @return
     * @throws IOException
     */
    public static String getBody(HttpServletRequest request) throws IOException {
        String body = null;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
            throw ex;
        }finally {
            if(null != bufferedReader){
                bufferedReader.close();
            }
        }
        body = stringBuilder.toString();
        boolean d= SqlRegular.jsonRegex(body);
        //请求头类型
        if(d) {
            String type = request.getContentType();
            body = FastjsonUtils.fastjsonString(body, type);
            return body;
        }
       int i =  body.length();
        if(i>=117 || i ==128 ){
            System.out.print(body.length());
            body= RSATools.decryptDataOnJava(body);
            return body;
         }
        return body;
    }

    /**
     * 将post解析过后的request进行封装改写
     * @param request
     * @param body
     * @return
     */
    public static ServletRequest getRequest(ServletRequest request , String body) throws IOException,ServletException {
            request.setCharacterEncoding("UTF-8");
            String enctype = request.getContentType();
            if (StringUtils.isNotEmpty(enctype) && enctype.contains("application/json")){
                return new PostServletRequest((HttpServletRequest) request,body);
            }
        return request;
    }

    /**
     * 获取用户真实IP地址，不使用request.getRemoteAddr();的原因是有可能用户使用了代理软件方式避免真实IP地址,
     *
     * 可是，如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值，究竟哪个才是真正的用户端的真实IP呢？
     * 答案是取X-Forwarded-For中第一个非unknown的有效IP字符串。
     *
     * 如：X-Forwarded-For：192.168.1.110, 192.168.1.120, 192.168.1.130,
     * 192.168.1.100
     *
     * 用户真实IP为： 192.168.1.110
     *
     * @param request
     * @return
     */
    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }



    /**
     * 验证get请求中的参数合法合法
     * @param req
     * @return
     */
    protected  static String  EnumerationString(HttpServletRequest req ){
        Enumeration params = req.getParameterNames();
        //获得所有请求参数名
        String sql = "";
        while (params.hasMoreElements()) {
            //得到参数名
            String name = params.nextElement().toString();
            //System.out.println("name===========================" + name + "--");
            //得到参数对应值
            String[] value = req.getParameterValues(name);
            for (int i = 0; i < value.length; i++) {
                sql = sql + value[i];
            }
        }
        return sql;
    }
    public  static boolean sqlValidateRegex(String str){
        String reg = "(?:')|(?:--)|(/\\*(?:.|[\\n\\r])*?\\*/)|"+ "(\\b(select|update|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)\\b)";
        Pattern sqlPattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
        if (sqlPattern.matcher(str).find()) {
            return true;
        }
        return false;
    }

    /**
     * 判斷數據是否是json格式
     * @param str
     * @return
     */
    public static boolean jsonRegex(String str){
        try {
        JSONObject.fromObject(str);
            return true;
        }catch (Exception e){
        return false;
        }

    }


    //参数校验效验
    protected static boolean sqlValidate(String str) {
        str = str.toLowerCase();//统一转为小写
        String badStr = "'|and|exec|execute|insert|create|drop|table|from|grant|use|group_concat|column_name|" +
                "information_schema.columns|table_schema|union|where|select|delete|update|order|by|count|*|" +
                "chr|mid|master|truncate|char|declare|or|like|//|/|%|#";//过滤掉的sql关键字，可以手动添加
        String[] badStrs = badStr.split("|");
        for (int i = 0; i < badStrs.length; i++) {
            if (str.indexOf(badStrs[i]) !=-1) {
                return true;
            }
        }
        return false;
    }
}

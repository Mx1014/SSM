package com.kylin.electricassistsys.tools.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.*;
import java.util.Map.Entry;

/**
 * @Auther: cwx
 * @Date: 2018/5/25 14:24
 * @Description: 远程请求访问类
 */
public class HttpClientUtils {
    /**
     * 远程请求url地址进行查询数据
     * @param url 第3方的url
     * @param map 参数数封装
     * @return
     */
    public static  Map<String ,Object> doPost(String url, Map<String,Object> map){
            Map<String ,Object>params= new HashMap<String,Object>();
            HttpClient httpClient =null;
            HttpPost httpPost = null;
            String result = null;
            try{
               httpClient = new SSLClient();
                httpPost = new HttpPost(url);
                //设置参数
                List<NameValuePair> list = new ArrayList<NameValuePair>();
                Iterator iterator = map.entrySet().iterator();
                while(iterator.hasNext()){
                    Entry<String,Object> elem = (Entry<String, Object>) iterator.next();
                    list.add(new BasicNameValuePair(elem.getKey(),elem.getValue().toString()));
                }
                if(list.size() > 0){
                    UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,"utf-8");
                    httpPost.setEntity(entity);
                }
                HttpResponse response = httpClient.execute(httpPost);
                int code = response.getStatusLine().getStatusCode();
                if(code==200){
                    CookieStore cookiestore=  ((SSLClient) httpClient).getCookieStore();
                    /**
                     * 獲取cookie中的值
                     */
                    List<Cookie>listCookie=  cookiestore.getCookies();
                    for(Cookie cookie:listCookie ){
                        params.put(cookie.getName(),cookie.getValue());
                    }
                    HttpEntity resEntity = response.getEntity();
                    if(resEntity != null){
                        result = EntityUtils.toString(resEntity,"utf-8");
                        params.put("result",result);
                    }
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
            return params;
    }

    public static void main(String []arge){
        String url="http://127.0.0.1:8089/system/login";
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("loginName","admin");
        map.put("password","111111");
        map.put("platform",1);
        HttpClientUtils http= new HttpClientUtils();
        Map str=  http.doPost(url,map);
        System.out.println(str.toString());

    }


}

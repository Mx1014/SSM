package com.kylin.electricassistsys.tools.httpclient;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;



/**
 * @Auther: cwx
 * @Date: 2018/5/25 14:24
 * @Description: 远程请求访问类
 */
public class HttpClientUtils {



    /**
     * post请求（用于请求json格式的参数）
     * @param url
     * @param params
     * @return
     */
    public static String doPost(String url, String params)  {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);// 创建httpPost
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");
        String charSet = "UTF-8";
        StringEntity entity = new StringEntity(params, charSet);
        httpPost.setEntity(entity);
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpPost);
            StatusLine status = response.getStatusLine();
            int state = status.getStatusCode();
            if (state == HttpStatus.SC_OK) {
                HttpEntity responseEntity = response.getEntity();

                String jsonString = EntityUtils.toString(responseEntity);
                return jsonString;
            }
            else{

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void main(String []arge){
        JSONObject json=new JSONObject();
        json.put("loginName","admin2");
        json.put("password","111111");
        json.put("platforms","1");
        JSONObject map1=new JSONObject();
        map1.put("id",2);
        HttpClientUtilsJsonObject http= new HttpClientUtilsJsonObject();
    //  String str=  http.doPost(URLConstants.LOGIN,json.toJSONString());
     //  String str2=  http.doPost(URLConstants.USERMENU,map1.toJSONString());
     //  System.out.println(str.toString());
     //   System.out.println("DDDD----"+str2.toString());
    }

   // shiro-session-0a2baafb-2467-4e6e-a01f-013676751a6d
}

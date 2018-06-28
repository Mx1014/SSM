package com.kylin.electricassistsys.tools.httpclient;

import com.alibaba.fastjson.JSONObject;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.tools.IPHelper;
import com.kylin.electricassistsys.tools.json.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.*;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: cwx
 * @Date: 2018/5/31 11:54
 * @Description:
 */
public class HttpClientUtilsJsonObject {

   private static final Logger LOG = LogManager.getLogger(HttpClientUtilsJsonObject.class);
    /** 请求网站的编码，这个地方，我默认 写的是UTF-8*/
    private static final String DEFALUT_ENCODE = "UTF-8";
    public static CloseableHttpClient httpClient = null;
    public static HttpClientContext context = null;
    public static CookieStore cookieStore = null;
    public static RequestConfig requestConfig = null;
    /**
     * 用户的JSessionId
     */
    public static String theJSessionId;
    static {
        init();
    }
    private static void init() {
        context = HttpClientContext.create();
        cookieStore = new BasicCookieStore();
        // 配置超时时间（连接服务端超时1秒，请求数据返回超时2秒）
        requestConfig = RequestConfig.custom().setConnectTimeout(1200000).setSocketTimeout(600000)
                .setConnectionRequestTimeout(600000).build();
        // 设置默认跳转以及存储cookie
        httpClient = HttpClientBuilder.create().setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy())
                .setRedirectStrategy(new DefaultRedirectStrategy()).setDefaultRequestConfig(requestConfig)
                .setDefaultCookieStore(cookieStore).build();
    }

    /**
     * 发送get请求
     *
     * @param url
     * @return response
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String get(String url)  {
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            //设定请求的参数
            response= httpClient.execute(httpget, context);

            return copyResponse2Str(response);
        } catch(Exception e){
            LOG.debug("请求失败\t"+url);
        }finally {
            try {
                if(response != null){
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 将返回的Response转化成String对象
     * @param response 返回的Response
     * @return
     */
    private static String copyResponse2Str(CloseableHttpResponse response){
        try {
            int code = response.getStatusLine().getStatusCode();
            //当请求的code返回值不是400的情况
            if((code == HttpStatus.SC_MOVED_TEMPORARILY )
                    || (code == HttpStatus.SC_MOVED_PERMANENTLY)
                    || (code == HttpStatus.SC_SEE_OTHER)
                    || (code == HttpStatus.SC_TEMPORARY_REDIRECT)) {
                return null;
            }else{
                return copyInputStream2Str(response.getEntity().getContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 将InputStream转化为String类型的数据
     * @param in
     * @return
     */
    private static String copyInputStream2Str(InputStream in){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in,DEFALUT_ENCODE));
            String line = null;
            StringBuffer sb = new StringBuffer();
            while((line = reader.readLine()) != null){
                sb.append(line);
            }
            return sb.toString();
        } catch (Exception e) {
            LOG.debug("获取字符串失败");
        }
        return null;
    }

    /**
     * 发送post请求，不带参数 的post
     * @param url
     * @return
     */
    public static String post(String url){
        return post(url, null);
    }

    /**
     * 发从post 请求
     * @param url
     * @param parameters
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String post(String url, Map<String,Object> parameters){
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpResponse response = null;
        try {
            //设定请求的参数
            setRequestParamter(parameters, httpPost);
            //发送请求
            response = httpClient.execute(httpPost, context);
            return copyResponse2Str(response);
        }catch(Exception e){
            LOG.debug("请求失败\t"+url);
        }finally {
            try {
                if(response != null){
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    /**
     * post请求（用于请求json格式的参数）
     * @param url
     * @param params
     * @return
     */
    public static JSONResult doPost(String url, Map<String,Object> params, String jSessionId)  {
        HttpPost httpPost = new HttpPost(url);// 创建httpPost
        String charSet = "UTF-8";
        JSONObject jsonObject = new JSONObject();
        String param= jsonObject.toJSONString(params);
        StringEntity entity = new StringEntity(param, charSet);
        httpPost.setEntity(entity);
        CloseableHttpResponse response = null;
        Map<String,String> header = new HashMap<String,String>();
      /*  if (!StringUtils.equals(theJSessionId, jSessionId)) {
            theJSessionId = jSessionId;
            header.put("Cookie", "JSESSIONID="+theJSessionId);
           *//* header.put("Cookie", "Admin-Token:"+theJSessionId);*//*
        }*/
        theJSessionId = jSessionId;
        header.put("Cookie", "JSESSIONID="+theJSessionId);
       //设置 header
        Header headerss[] = buildHeader(header);
        if(headerss != null && headerss.length > 0){
            httpPost.setHeaders(headerss);
        }
        try {
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-Type", "application/json");
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
            String ipAddress = IPHelper.getIpAddress(request);
            httpPost.setHeader("X-Forwarded-For", ipAddress);
            response = httpClient.execute(httpPost,context);
            Map<Object,Object>map =  printCookies();
            String data= copyResponse2Str(response);
            map.put("user_result",data);
            return JsonUtils.strJsonAndMap(map);
        }catch (Exception e){
            System.err.println(e);
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
        }
        return null;
    }

    /**
     * 组装请求头 手动添加JSessionId到请求头文件中发送过去
     * @param params
     * @return
     */
    public static Header[] buildHeader(Map<String,String> params){
        Header[] headers = null;
        if(params != null && params.size() > 0){
            headers = new BasicHeader[params.size()];
            int i  = 0;
            for (Map.Entry<String, String> entry:params.entrySet()) {
                headers[i] = new BasicHeader(entry.getKey(),entry.getValue());
                i++;
            }
        }
        return headers;
    }


    /**
     * 设定POST请求的参数
     * @param parameters
     * @param httpPost
     * @throws UnsupportedEncodingException
     */
    private static void setRequestParamter(Map<String, Object> parameters, HttpPost httpPost)
            throws UnsupportedEncodingException {
        List<NameValuePair> nvps;
        //添加参数
        if(parameters != null && parameters.size()>0){
            nvps = new ArrayList<NameValuePair>();
            for(Map.Entry<String, Object> map:parameters.entrySet()){
                NameValuePair param = new BasicNameValuePair(map.getKey(), map.getValue().toString());
                nvps.add(param);
            }
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, DEFALUT_ENCODE));
        }
    }
    /**
     * 将 http://www.yellowcong.com?age=7&name=8
     * 这种age=7&name=8  转化为map数据
     * @param parameters
     * @return
     */
    @SuppressWarnings("unused")
    private static List<NameValuePair> toNameValuePairList(String parameters) {
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        String[] paramList = parameters.split("&");
        for (String parm : paramList) {
            int index = -1;
            for (int i = 0; i < parm.length(); i++) {
                index = parm.indexOf("=");
                break;
            }
            String key = parm.substring(0, index);
            String value = parm.substring(++index, parm.length());
            nvps.add(new BasicNameValuePair(key, value));
        }
        System.out.println(nvps.toString());
        return nvps;
    }

    /**
     * 手动增加cookie
     * @param name
     * @param value
     * @param domain
     * @param path
     */
    public void addCookie(String name, String value, String domain, String path) {
        BasicClientCookie cookie = new BasicClientCookie(name, value);
        cookie.setDomain(domain);
        cookie.setPath(path);
        cookieStore.addCookie(cookie);
    }


    /**
     * 把结果console出来
     *
     * @param httpResponse
     * @throws ParseException
     * @throws IOException
     */
    public static void printResponse(HttpResponse httpResponse) throws ParseException, IOException {
        // 获取响应消息实体
        HttpEntity entity = httpResponse.getEntity();
        // 响应状态
        System.out.println("status:" + httpResponse.getStatusLine());
        System.out.println("headers:");
        HeaderIterator iterator = httpResponse.headerIterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }
    }

    /**
     * 把当前cookie从控制台输出出来
     *
     */
    public static Map<Object,Object> printCookies() {
        Map<Object,Object>map = new HashMap<>();
        cookieStore = context.getCookieStore();
        List<Cookie> cookies = cookieStore.getCookies();
        for (Cookie cookie : cookies) {
            map.put(cookie.getName(),cookie.getValue());
            System.out.println("key:" + cookie.getName() + "  value:" + cookie.getValue());
        }
        return map;
    }

    /**
     * 检查cookie的键值是否包含传参
     *
     * @param key
     * @return
     */
    public static boolean checkCookie(String key) {
        cookieStore = context.getCookieStore();
        List<Cookie> cookies = cookieStore.getCookies();
        boolean res = false;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(key)) {
                res = true;
                break;
            }
        }
        return res;
    }
    /**
     * 直接把Response内的Entity内容转换成String
     *
     * @param httpResponse
     * @return
     * @throws ParseException
     * @throws IOException
     */
    public static String toString(CloseableHttpResponse httpResponse) throws ParseException, IOException {
        // 获取响应消息实体
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null)
            return EntityUtils.toString(entity);
        else
            return null;
    }
}

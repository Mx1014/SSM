package com.kylin.electricassistsys.tools.json;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.rsas.RSATools;
import com.kylin.electricassistsys.tools.sqlfilter.SqlRegular;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * json转换方法类
 * cwx
 * 2018/5/14
 */
public class JsonUtils {

    private static final Logger LOGGER = LogManager.getLogger(JsonUtils.class);
    /**
     * 将实体类转换成实体类
     * @param obj
     * @return
     */
    public static Map<String, Object> transBean2Map(Object obj) {
        if (obj == null) {
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);
                    map.put(key, value);
                }
            }
        } catch (Exception e) {
            LOGGER.error("transBean2Map Error {}" ,e);
        }
        return map;

    }

    /**
     * 将json字符串转为Map结构
     * 如果json复杂，结果可能是map嵌套map
     * @param jsonStr 入参，json格式字符串
     * @return 返回一个map
     */
    public static Map<String, Object> json2Map(String jsonStr) {
        Map<String, Object> map = new HashMap<>();
        if(jsonStr != null && !"".equals(jsonStr)){
            //最外层解析
            JSONObject json = JSONObject.fromObject(jsonStr);
            for (Object k : json.keySet()) {
                Object v = json.get(k);
                //如果内层还是数组的话，继续解析
                if (v instanceof JSONArray) {
                    List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
                    Iterator<JSONObject> it = ((JSONArray) v).iterator();
                    while (it.hasNext()) {
                        JSONObject json2 = it.next();
                        list.add(json2Map(json2.toString()));
                    }
                    map.put(k.toString(), list);
                } else {
                    map.put(k.toString(), v);
                }
            }
            return map;
        }else{
            return null;
        }
    }

    /**
     * 將json字符串轉化為map取出對應的數據在返回
     * @param maps
     * @returnStr
     */
    public static JSONResult strJsonAndMap(Map<Object,Object>maps ){
        JSONResult result =null;
         String str= maps.get("user_result").toString();
        JSONObject  jasonObject = JSONObject.fromObject(str);
        Map map= (Map)jasonObject;
        String code= valueOfStr((Object)map.get("code"));
        if(code.equals("10000")){
            String JSESSIONID="";
            boolean flag=maps.containsKey("JSESSIONID");
           if(flag){
               JSESSIONID  =   RSATools.encryptedDataOnJava(maps.get("JSESSIONID").toString());
             }
            String data= valueOfStr((Object)map.get("data"));
            result=JSONResult.success(data);
            if(JSESSIONID.length()>0){
            result.setUserRedisreQequestId(JSESSIONID);
            }
            return result;
        }else{
            String msg= (String)map.get("msg");
            return  result=JSONResult.failure(msg);
        }
    }

    /**
     * 類型轉換成string
     * @param obj
     * @return
     */
    public static String valueOfStr(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }

    /**
     * 驗證支付攢是否json格式
     * @param json
     * @return
     */
    public static boolean isGoodJson(String json) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(json);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    public static void main(String []arge){
        String jsonp = "{\n" +
                "\"data\": [\n" +
                "        {\n" +
                "            \"IR_SRCNAME\": \"车主之家\",\n" +
                "                \"IR_SITENAME\": \"车主之家\",\n" +
                "                \"IR_AUTHORS\": null,\n" +
                "                \"IR_URLTITLE\": \"2017年4月份高尔夫销量11798台, 同比下降20.24%\",\n" +
                "                \"IR_URLNAME\": \"http://news.16888.com/a/2017/0521/8172148.html\",\n" +
                "                \"IR_ABSTRACT\": \" 2017年4月份高尔夫销量11798台 \",\n" +
                "                \"IR_URLTIME\": \"2017/05/21 23:35:00\",\n" +
                "                \"IR_HKEYBBSNUM\": \"18093721078864168420-0\",\n" +
                "                \"IR_CHANNEL\": \"新闻_汽车新闻\", \n" +
                "                \"COMPANY_RISK_CONN\": \"汽车之家股份有限公司_财务风险\\偿债能力\\营运资本_18;\",\n" +
                "                \"ZFM\": \"负面\"\n" +
                "        }\n" +
                "    ],\n" +
                "        \"path\": \"/cloud/wsu/queryByKeyword!update.action\",\n" +
                "                \"rstcode\": \"0000\",\n" +
                "                \"rstcount\": 19476,\n" +
                "                \"cmpname\": \"汽车之家股份有限公司\",\n" +
                "                \"shortname\": \"汽车之家\",\n" +
                "                \"rstmsg\": \"查询成功\"\n" +
                "    }\n";
        Map <String,Object>map=JsonUtils.json2Map(jsonp);
       boolean f= SqlRegular.ForMap(map);
        System.out.println(f);

        System.out.print(map.toString());
    }
}

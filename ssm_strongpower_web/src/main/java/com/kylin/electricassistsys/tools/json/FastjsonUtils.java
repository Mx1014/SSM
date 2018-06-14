package com.kylin.electricassistsys.tools.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kylin.electricassistsys.rsas.RSATools;
import org.apache.logging.log4j.util.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: cwx
 * @Date: 2018/6/8 11:09
 * @Description:
 */
public class FastjsonUtils {
    //JSESSIONID在前台进行加密发送到后台，后台解密到req中
    public static  final  String JSESSIONID="userRedisreQequestId";
    /**
     * 修改req中的某一个值进行解密
     * @param body
     * @param type
     * @return
     */
    public static String fastjsonString(String body,String type) {
        Map<String, Object> paramMap = new HashMap<>();
        if (type != null && type.startsWith("application/json")) {
            JSONObject jsonObject = JSONObject.parseObject(body);
            if (jsonObject != null) {
                for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
                    String key=entry.getKey();
                    Object value=entry.getValue();
                    if(Strings.isNotEmpty(key)&& key.equals(JSESSIONID)){
                        if(value.toString().length()>110){
                            paramMap.put(key, RSATools.decryptDataOnJava(JsonUtils.valueOfStr(value)));
                        }
                    }else {
                        paramMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        } else if(type != null && type.startsWith("text/plain")) {
            String[] kvs = body.split("&");
            for (String kv : kvs) {
                String[] lf = kv.split("=");
                String key = lf[0];
                Object value = lf[1];
                if (Strings.isNotEmpty(key) && key.equals(JSESSIONID)) {
                    paramMap.put(key, RSATools.decryptDataOnJava(JsonUtils.valueOfStr(value)));
                } else {
                    paramMap.put(lf[0], lf[1]);
                }
            }
        }
            return  JSON.toJSONString(paramMap);
    }
}

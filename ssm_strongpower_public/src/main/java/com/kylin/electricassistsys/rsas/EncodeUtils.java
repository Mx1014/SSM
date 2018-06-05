package com.kylin.electricassistsys.rsas;

/**
 * @Auther: cwx
 * @Date: 2018/6/5 11:16
 * @Description: base64 加密和解密
 */
public class EncodeUtils {

    /**
     * 对字符串进行base64解密
     * @param data
     * @return
     */
    public static byte[] base64Decode(String data){
        byte[] arr =org.bouncycastle.util.encoders.Base64.decode(data.getBytes());
        return arr;
    }

    /**
     * 对字符串进行base64加密
     * @param data
     * @return
     */
    public static String base64Encode(byte [] data){
        byte[] arr =org.bouncycastle.util.encoders.Base64.encode(data);
        return  new String(arr);
    }
}

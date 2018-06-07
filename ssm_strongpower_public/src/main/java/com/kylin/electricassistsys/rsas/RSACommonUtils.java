package com.kylin.electricassistsys.rsas;

import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * @Auther: cwx
 * @Date: 2018/6/5 11:25
 * @Description:
 */
public class RSACommonUtils {

    private static Logger logger = LoggerFactory.getLogger(RSACommonUtils.class);


    private static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCfZocST4QLE8RFX+8n59yMVO0HXjQeq2rK+boDzfuZS6YcXMbAP4VAs0QPnaX+79CtleFFFnLYthC3vCPhXQqltfRLFQBu+/tkMRsU5Ht/LQzblxn2FrqfDUKCM06KhUPatO2k107xzWchn4/F6gbuZbJfhSlYDaGC9GNZH66SpwIDAQAB";   //需要生成自己的一对公私钥
    private static String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJ9mhxJPhAsTxEVf7yfn3IxU7QdeNB6rasr5ugPN+5lLphxcxsA/hUCzRA+dpf7v0K2V4UUWcti2ELe8I+FdCqW19EsVAG77+2QxGxTke38tDNuXGfYWup8NQoIzToqFQ9q07aTXTvHNZyGfj8XqBu5lsl+FKVgNoYL0Y1kfrpKnAgMBAAECgYBotkWM9cdcL4QDvt" +
            "2wbVQoq7F54ZyDeUASTrKvxSS+sz9P6nJ14ER9GEZhq8JcEtYW8hql8/VF/3RD/" +
            "sfjR+exolkQ9rlTvUx3+9PBboLDYdPq8pVvX3t05fZ4bFrH6aeHBdZR14b90AS2Ez8HMTtgL1HNb/moosnH3AJejDpegQJBANYEP2tTNuwDyx/Dt+Xv9Is+wYFXt1JV46XAa79fSW9UHPKYEAAyuFK78qrsoMI4oDHeDH3rdisLo3OAswO4vncCQQC+q4AwDKFqRz80ncKLKXbElUxaHXk5x8V0/4RAlkvJU+WLKyByx4R60fbxFjQRN+1VSIjFsfNRJf7dkB9yIOlRAkEAqanWaQwgRzy+pCDxwgzXrigDGbn" +
            "jMBe9ECMaiC1PNz3UcRHR5YZQD+7F83ECBNcFUGM7PfwTww5H9wI5aKLmAwJAMI3Z0eKVhEvqY4q9DNUdQohGbjhNM5KUzOt4kT30xKsRrDPqSnBWYzRurwwZbD0SugIDmlxresGzOlbGOzj4UQJAXSx5ZNFXxsPsrzk90FEN9" +
            "GiZ6ppzD690S6oyKHWEeADxD4yzAw9ipRUooIcS2fi6t1KT3SPrEDenE4b1gykskw==";
    public static enum CharSet {
        UTF8 {
            public String getName() {
                return "UTF-8";
            }
        };
        public abstract String getName();
    }

    /**
     * 创建公钥  私钥
     * @return
     */
    public static Map<String, Object> createRSAKey() {
        Map<String, Object> keyMap = null;
        try {
            keyMap = RSAUtils.genKeyPair();
            System.out.print("");
            logger.info("公钥-->"+RSAUtils.getPublicKey(keyMap));
            logger.info("私钥-->"+RSAUtils.getPrivateKey(keyMap));
        } catch (Exception e) {
// TODO Auto-generated catch block
            logger.info("获取公私钥失败，错误信息"+e.getMessage());
            e.printStackTrace();
        }
        return keyMap;
    }


    /**
     * 根据公钥加密
     * @param content 需加密内容
     * @param charSet 字符集编码格式
     * @return
     */
    public static String encryptByPublicKey(String content, CharSet charSet) {
        byte[] b=null;
        try {
            b = encrypt(content.getBytes(charSet.getName()),true);
        } catch (UnsupportedEncodingException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("不支持的编码格式，错误信息"+e.getMessage());
        }
        return bytesToString(b);
    }

    /**
     * 根据私钥加密
     * @param content
     * @return
     */
    public static String encryptByPrivateKey(String content) {
        byte[] b=null;
        try {
            b = encrypt(content.getBytes( CharSet.UTF8.getName()),false);
        } catch (UnsupportedEncodingException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("不支持的编码格式，错误信息"+e.getMessage());
        }
        return bytesToString(b);
    }


    /**
     * 根据私钥解密字符串
     * @param content  学解密内容
     * @param charSet  字符集编码格式
     * @return
     */
    public  static String decryptByPrivateKey(String content, CharSet charSet) {

        byte[] b = decrypt(stringToBytes(content),false);
        try {
            return new String(b, charSet.getName());
        } catch (UnsupportedEncodingException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("不支持的编码格式，错误信息"+e.getMessage());
        }
        return null;
    }

    /**
     * 根据公钥解密字符串
     * @param content
     * @return
     */
    public  static String decryptByPublicKey(String content) {

        byte[] b = decrypt(stringToBytes(content),true);
        try {
            return new String(b, CharSet.UTF8.getName());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            logger.info("不支持的编码格式，错误信息"+e.getMessage());
        }
        return null;
    }


    /**
     * 字符串转换成为字节数组
     * @param decrytString
     * @return
     */
    private  static byte[] stringToBytes(String decrytString) {
        char[] charHex=decrytString.toCharArray();
        byte[] clone=null;
        try {
            clone = Hex.decodeHex(charHex);
        } catch (Exception e) {
            logger.info("字符串转换字节数组失败，错误信息"+e.getMessage());
            e.printStackTrace();
        }
        return clone;
    }


    /**
     * 字节数组转换为字符串
     * @param encrytpByte
     * @return
     */
    private  static String bytesToString(byte[] encrytpByte) {
        char[] charHex=Hex.encodeHex(encrytpByte);
        return new String(charHex);
    }


    /**
     * 加密
     * @param data
     * @return
     */
    private static byte[] encrypt(byte[] data,boolean isPublicKey) {
        try {

            if(isPublicKey){
                return RSAUtils.encryptByPublicKey(data, publicKey);
            }
            return RSAUtils.encryptByPrivateKey(data, privateKey);
        } catch (Exception e) {

            logger.info("加密失败，错误信息"+e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密
     * @param data
     * @return
     */
    private static byte[] decrypt(byte[] data,boolean isPublicKey) {

        try {
            if(isPublicKey){
                return RSAUtils.decryptByPublicKey(data, publicKey);
            }
            return RSAUtils.decryptByPrivateKey(data, privateKey);
        } catch (Exception e) {

            logger.info("私钥解密失败，错误信息"+e.getMessage());
            e.printStackTrace();
        }

        return null;
    }



    public static void main(String[] args) throws Exception {
             String data = "陈文旭";
            data = RSAUtil.encryptedDataOnJava(data, RSACommonUtils.publicKey);
            System.out.println("加密数据：" + data);
            data = "LPNmbGWgz/iJE2wDh2senv74yB6tyzFC5z5WBe+ullHWP3bfhmBRRG72t2B62CMSoHz420hbloaPF4FBt0PuOzGuq97p7J9Gh825zYIwCDOQCFgYkbk1KTsMYlqM0ojWrTyabB218N/Oeai3UIOdyBN4ZGZu2XlikiJ/mDHrEQw=";
            System.out.println("解密数据：" + RSAUtil.decryptDataOnJava(data, RSACommonUtils.privateKey));
    // RSAUtilsLieTouToPuHui.createRSAKey();
     //   RSACommonUtils.createRSAKey();
       String kk="32cad896726f8a98b79dba66876c7cf835d8b4de46858747a4a949daf4f637689b8dbdcdb8197b6d3383e1f25849c4692cd8da69c074bce02a47e8220bec30cb03be01db04ff9045d7cb9b824437e35d38fae50c717755c72170021766b77efad7b8159aee9cf98842ddf018a669b19416b8494a5e0eda6be1b1cd4dd3e074c5";
        /*测试信息*/
     //   String mis="XJ9yB3lskbvMWhSDmYrvDJJ+BfS3JmOCHGzejkkIW6LkbQ4tmzTp+RKR4w2HSLbdEkh0V4dqbTsUDbwNX5CdKU0WFHp+Z8o8tGU9JOK5HtNz+ydbRBSZqWcjNy9KLoywuNvq+SPSpo8pWN+jXKocg6PWRTV3y4PxheyocvwNnA4=";
     // String   kk= RSACommonUtils.encryptByPrivateKey("陈文旭") ;
       // String nameRsa = new String(RSAUtil.("陈文旭",RSAUtil.getPublicRSAKey(RSACommonUtils.publicKey)),"UTF-8");
        System.out.println("#############################" );
       // System.out.println(nameRsa );
        System.out.println("#############################" );
        System.out.println(kk );
        System.out.println(RSACommonUtils.decryptByPublicKey(kk));

    }

}

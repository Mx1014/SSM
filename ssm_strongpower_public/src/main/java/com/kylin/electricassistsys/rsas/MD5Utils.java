package com.kylin.electricassistsys.rsas;

import org.apache.shiro.crypto.hash.Md5Hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Auther: cwx
 * @Date: 2018/6/5 15:26
 * @Description:
 * md5加密
 */
public class MD5Utils {

    /**
     * 生成密码
     *
     * @param password 密码
     * @param salt     密码盐
     * @return
     */
    public static String createPassword(String password, String salt, int hashIterations) {
        Md5Hash md5Hash = new Md5Hash(password.trim(), salt, hashIterations);
        return md5Hash.toString();
    }


    /**
     * 生成32位md5码 加盐后的md5
     * @param LoginName
     * @return
     */
    public static String md5LoginName(String LoginName) {

        try {
            // 得到一个信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(LoginName.getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;// 加盐
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }

            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
    public static void main(String[] arg){
       System.err.println(md5LoginName("admin123456"));
    }
}

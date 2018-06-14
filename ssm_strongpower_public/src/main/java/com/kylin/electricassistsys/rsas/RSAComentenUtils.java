package com.kylin.electricassistsys.rsas;

/**
 * @Auther: cwx
 * @Date: 2018/6/6 09:31
 * @Description: 初始化RSA
 */
public class RSAComentenUtils {

    public static void main(String[] args) throws Exception {
        testJavaRsa();
    }
    /*
     * 测试自己封装java端加密和解密的方法
     */

    static void testJavaRsa() {
      //  String data="";
       String data = "shiro-session-410a7460-eba1-4d14-8a4c-bee53f8844c6";
       String datas ="dYZxwee0PXXs5UWPu6rJTuLYBNjTD4WiQDxekEEvhTuD+A7yuS8fi5XdbR5clIWJf0HWfSKmOCUX4rE5T8ZQYD/5Nv81TMP+75UkU61Ok4mC1Yfm+GMq3GqTJDihSpws2fxEGFNE1Ze5DJ9HoWciN78/q4Y40lBhUH+xdBM9PiU=";
       data = RSATools.encryptedDataOnJava(data);
       System.out.println("加密数据：" + data);

        System.out.println("解密数据：" + RSATools.decryptDataOnJava(data));
    }

    static void testFrontEncrptAndAfterDecrypt() {
        String PRIVATEKEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIn2zWqU7K/2qm5pOpq5bp9R+3MTnStWTfJU9nC/Vo7UKH9dITPvrELCTK+qlqpx5Fes+l0GY7n6u4n4jyiw4ejsvkZYQ5ww477yLOn2FcoEGuZEwPgSCmfTST0OFUgQqn+/J11k9L92jEHyieE3qmhMkMt0UsVUSJwx/nZxo30ZAgMBAAECgYBD3YHigeuEC4R+14iaf8jo2j0kuGtB3Cxvnlez0otTqw1YyYkBsU49cLKkXvfKVEgM0Ow/QltgKvSBxCE31PrrDka5TygVMqqA/IM7NrDvjUcGLjyoeNmLA8660fWcDxUTlAGN5kxIvUATayVwKVflpWPWu0FPKsWrZustnEo+4QJBAMCmYsWqAKWYMVRXFP3/XGRfio8DV793TOckyBSN9eh8UhgoZyT3u7oeHmDJEwm4aNMHlg1Pcdc6tNsvi1FRCiUCQQC3VNzfF4xOtUgX7vWPL8YVljLuXmy12iVYmg6ofu9l31nwM9FLQ1TRFglvF5LWrIXTQb07PgGd5DJMAQWGsqLlAkAPE7Z9M73TN+L8b8hDzJ1leZi1cpSGdoa9PEKwYR/SrxAZtefEm+LEQSEtf+8OfrEtetWCeyo0pvKKiOEFXytFAkEAgynL/DC0yXsZYUYtmYvshHU5ayFTVagFICbYZeSrEo+BoUDxdI9vl0fU6A5NmBlGhaZ65G+waG5jLc1tTrlvoQJAXBEoPcBNAosiZHQfYBwHqU6mJ9/ZacJh3MtJzGGebfEwJgtln5b154iANqNWXpySBLvkK+Boq7FYRiD83pqmUg==";
        String data = "FBGU7sQfpSfCgB2hqFuIqkivEUHVRHD8JFdyxYeWqQHsTj9UEuVmvi28n1fOHRwW+3aZD3ttdzfUHWiXD2NErcX/CYs5BtSXT7RcJfWWcXvegq5BBDEAJCADWCRdYnblN+SLUC+ctDXcLw4xmjwAajowSzhCfY/lU3TdnJjO488=";
        System.out.println("解密数据：" + RSATools.decryptDataOnJava(data));
    }



}

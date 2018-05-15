package com.kylin.electricassistsys.fileupload;


import com.kylin.electricassistsys.properties.PropertiesUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 文件上传公共方法类
 * cwx
 * 2018.5.11
 */
public class FileUploads {
    //单文件上传
    public static Map<String,String> queryFileData(
            MultipartFile file,
            HttpServletRequest request) {
        Map<String,String >map=new HashMap<String,String>();
        // MultipartFile是对当前上传的文件的封装，当要同时上传多个文件时，可以给定多个MultipartFile参数(数组)
        if (!file.isEmpty()) {
            File fileDir = new File( setDate());
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
            String type = file.getOriginalFilename().substring(
                    file.getOriginalFilename().indexOf("."));// 取文件格式后缀名
            String filename = System.currentTimeMillis() + type;// 取当前时间戳作为文件名
           String path=setDate();
           path+=File.separator+filename;
            File destFile = new File(path);
            try {
                // FileUtils.copyInputStreamToFile()这个方法里对IO进行了自动操作，不需要额外的再去关闭IO流
                FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);// 复制临时文件到指定目录下
            } catch (IOException e) {
                e.printStackTrace();
            }
            String getpath = getDate();
            getpath+=File.separator+filename;
            map.put("code","0000");
            map.put("msg","上传成功");
            map.put("data",getpath);
            return map;
        } else {
            map.put("code","0001");
            map.put("msg","上传失败");
            return map;
        }
    }
    //多文件上传
    public static Map<String,Object>queryFileDatas(
            MultipartFile[] files,
            HttpServletRequest request) {
        Map<String,Object>map= new HashMap<String,Object>();
        List<String>list=new ArrayList<String>();
        if (files != null) {
            File fileDir = new File(PropertiesUtil.getUrlValue(PropertiesUtil.FILE_UPLOAD_PATH,"savePicUrl"));
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
            for (int i = 0; i < files.length; i++) {
                String type = files[i].getOriginalFilename().substring(
                        files[i].getOriginalFilename().indexOf("."));// 取文件格式后缀名
                String filename = System.currentTimeMillis() + type;// 取当前时间戳作为文件名
                String path =setDate();;// 存放位置
                path+=File.separator+filename;
                File destFile = new File(path);
                try {
                    FileUtils.copyInputStreamToFile(files[i].getInputStream(),
                            destFile);// 复制临时文件到指定目录下
                    String getpath = getDate();
                    getpath+=File.separator+filename;
                    list.add(getpath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            map.put("code","0000");
            map.put("msg","上传成功");
            map.put("data",list);
            return map;
        } else {
            map.put("code","0001");
            map.put("msg","上传失败");
            return map;
        }
    }

    /**
     * 获取文件目录按天存
     * 这个获取Linux上的配置路径
     * @return
     */
       public static String setDate(){
       String savePicUrl= PropertiesUtil.getUrlValue(PropertiesUtil.FILE_UPLOAD_PATH,"savePicUrl");
        DateFormat df= new SimpleDateFormat("yyyy-MM");
          String month=df.format(new Date());
           DateFormat date= new SimpleDateFormat("dd");
           String dates=date.format(new Date());
           month=savePicUrl+File.separator+month+File.separator+dates;
           System.out.print(month);
        return month;
        }

    /**
     * 获取文件目录按天存
     * 获取http文件请求
     * @return
     */
    public static String getDate(){
        String savePicUrl= PropertiesUtil.getUrlValue(PropertiesUtil.FILE_UPLOAD_PATH,"getPicUrl");
        DateFormat df= new SimpleDateFormat("yyyy-MM");
        String month=df.format(new Date());
        DateFormat date= new SimpleDateFormat("dd");
        String dates=date.format(new Date());
        month=savePicUrl+File.separator+month+File.separator+dates;
        System.out.print(month);
        return month;
    }
       public static void  main(String []arge){
           setDate();

       }

}

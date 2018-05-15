package com.kylin.electricassistsys.controller;


import com.kylin.electricassistsys.fileupload.FileUploads;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

/**
 * @Auther: whq
 * @ClassName: FileUpload
 * @Date: 2018/5/11 13:17
 * @Description:
 */
@RequestMapping("file")
@Controller
public class FileUpload {
    /**
     * 文件上传功能
     *
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
       Map <String,String>map= FileUploads.queryFileData(file,request);
       System.out.print(map.toString());
        return "ok!";
    }

    /**
     * 多文件上传
     * @param file
     * @param request
     * @return
     * @throws IOException
     * @Auther:cwx
     * @Date 2018/5/14
     */
    @RequestMapping(value = "/uploads", method = RequestMethod.POST)
    @ResponseBody
    public String uploads(MultipartFile[] file, HttpServletRequest request) throws IOException {
      Map<String,Object>map=  FileUploads.queryFileDatas(file,request);
      System.out.print(map.toString());
        return "ok!";
    }


}

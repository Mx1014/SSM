package com.kylin.electricassistsys.controller.system;

import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.tools.CaptchaImgCreater;
import com.kylin.electricassistsys.tools.constants.URLConstants;
import com.kylin.electricassistsys.tools.httpclient.HttpClientUtilsJsonObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: whq
 * @Date: 2018/6/29 10:33
 * @Description:
 */
@Controller
@RequestMapping(value = "system")
public class CaptchaController {
    @RequestMapping(value = "/captchImg", method = RequestMethod.GET)
    public void getCaptchImg(HttpServletRequest request, HttpServletResponse response) {
        CaptchaImgCreater captchaImgCreater = new CaptchaImgCreater(response, request);
        try {
            captchaImgCreater.createRandImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.kylin.electricassistsys.tools.sqlfilter;


import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 防止sql注入
 * 2018-4-16
 * cwx
 */

public class SqlFilter implements Filter{
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String param = "";
        //验证参数的合法信息
        boolean falg =false;
        Enumeration params=null;
        String method = "GET";
        ServletRequest requestWrapper = null;
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        Gson gson = new Gson();
        Map<String, Object> map = new HashMap<String, Object>();
        if(req instanceof HttpServletRequest) {
            method = ((HttpServletRequest) req).getMethod();
        }
        if("POST".equalsIgnoreCase(method)){
            String body = SqlRegular.getBody((HttpServletRequest)request);
            map = gson.fromJson(body, map.getClass());
            req =(HttpServletRequest)SqlRegular.getRequest(req,body);
            falg=  SqlRegular.ForMap(map);
        }
        if("GET".equalsIgnoreCase(method)){
            params=req.getParameterNames();
            param= SqlRegular.EnumerationString(params,req);
            falg= SqlRegular.sqlValidateRegex(param);
        }
        if(falg){
            //设置转发到那个页面
             res.sendRedirect("index.jsp");
          }else{
            chain.doFilter(req, res);
        }

    }
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    public void destroy() {

    }

    }
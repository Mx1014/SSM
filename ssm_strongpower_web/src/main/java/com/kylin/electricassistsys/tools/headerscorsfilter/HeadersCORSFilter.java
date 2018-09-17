package com.kylin.electricassistsys.tools.headerscorsfilter;

import org.apache.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: whq
 * @Date: 2018/7/18 14:38
 * @Description:
 */
public class HeadersCORSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {

            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;
           /* System.out.println("*************************************");
            System.out.println(request.getSession());
            System.out.println(request.getRequestURL());
            System.out.println(request.getCookies());
            System.out.println(request.changeSessionId());
            System.out.println("*************************************");*/
            /*HTTP动词篡改导致的认证旁路解决方案*/
            String requestUrl = request.getRequestURI();
            if(requestUrl.indexOf(".")>0){
                response.setContentType("text/html;charset=UTF-8");
                response.setCharacterEncoding("UTF-8");
                response.setStatus(403);
                response.getWriter().print("对不起，您的请求非法，系统拒绝响应!");
                return;
            }
            String method = request.getMethod();
            if (!"GET".equals(method) && !"POST".equals(method) && !"HEAD".equals(method)&&!"DELETE".equals(method)) {
                response.setContentType("text/html;charset=UTF-8");
                response.setCharacterEncoding("UTF-8");
                response.setStatus(403);
                response.getWriter().print("对不起，您的请求非法，系统拒绝响应!");
                return;
            }
            //解决跨域
            response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
            response.setHeader("Access-Control-Allow-Credentials", "true");


            //跨域 Header

            response.setHeader("Access-Control-Allow-Methods", "*");

            response.setHeader("Access-Control-Allow-Headers", "Content-Type,XFILENAME,XFILECATEGORY,XFILESIZE");
            response.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");


            // 浏览器是会先发一次options请求，如果请求通过，则继续发送正式的post请求

            // 配置options的请求返回

            if (request.getMethod().equals("OPTIONS")) {

                response.setStatus(HttpStatus.SC_OK);

                // hresp.setContentLength(0);

                response.getWriter().write("OPTIONS returns OK");

                return;

            }
           /* response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
            response.setHeader("Access-Control-Allow-Headers", "Content-Type,XFILENAME,XFILECATEGORY,XFILESIZE");*/
            filterChain.doFilter(servletRequest, servletResponse);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}

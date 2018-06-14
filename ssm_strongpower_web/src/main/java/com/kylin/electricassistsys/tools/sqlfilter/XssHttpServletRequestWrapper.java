package com.kylin.electricassistsys.tools.sqlfilter;

import org.apache.commons.lang.StringEscapeUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Map;

/**
 * 防止脚本注入
 * cwx
 */
public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {
    private Map<String, String[]> parameterMap; // 所有参数的Map集合
    public XssHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
        this.parameterMap = request.getParameterMap();
        renewParameterMap(request);
    }
    private void renewParameterMap(HttpServletRequest req) {
        String s =req.getParameter("userRedisreQequestId");
        String queryString = req.getQueryString();
        if (queryString != null && queryString.trim().length() > 0) {
            String[] params = queryString.split("&");
            System.err.print("进行了参数修改....");
            for (int i = 0; i < params.length; i++) {
                int splitIndex = params[i].indexOf("=");
                if (splitIndex == -1) {
                    continue;
                }
                String key = params[i].substring(0, splitIndex);
                if (!this.parameterMap.containsKey(key)) {
                    if (splitIndex < params[i].length()) {
                        String value = params[i].substring(splitIndex + 1);
                        this.parameterMap.put(key, new String[] { value });
                    }
                }
            }
        }
    }
    @Override
    public String getHeader(String name) {
        return StringEscapeUtils.escapeHtml(super.getHeader(name));
    }
    @Override
    public String getQueryString() {
        return StringEscapeUtils.escapeHtml(super.getQueryString());
    }
    @Override
    public String getParameter(String name) {
        return StringEscapeUtils.escapeHtml(super.getParameter(name));
    }
    @Override
    public String[] getParameterValues(String name) {
        String[] values = super.getParameterValues(name);
        System.err.print("进行了参数修改....");
        if(values != null) {
            int length = values.length;
            String[] escapseValues = new String[length];
            for(int i = 0; i < length; i++){
                escapseValues[i] = StringEscapeUtils.escapeHtml(values[i]);
            }
            return escapseValues;
        }
        return super.getParameterValues(name);
    }

    /**
     * 自定义的一个简单修改原参数的方法，即：给原来的参数值前面添加了一个修改标志的字符串
     *
     * @param string
     *            原参数值
     * @return 修改之后的值
     */
    private String modify(String string) {

        return "Modified: " + string;
    }
}
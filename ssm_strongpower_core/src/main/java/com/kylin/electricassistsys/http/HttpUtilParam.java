package com.kylin.electricassistsys.http;

import org.springframework.stereotype.Component;

/**
 * @Auther: whq
 * @Date: 2018/7/31 16:51
 * @Description:
 */
@Component
public class HttpUtilParam {
    public String domainip;
    public String httpproject;
    public String httpprost;

    public String getDomainip() {
        return domainip;
    }

    public void setDomainip(String domainip) {
        this.domainip = domainip;
    }

    public String getHttpproject() {
        return httpproject;
    }

    public void setHttpproject(String httpproject) {
        this.httpproject = httpproject;
    }

    public String getHttpprost() {
        return httpprost;
    }

    public void setHttpprost(String httpprost) {
        this.httpprost = httpprost;
    }

    @Override
    public String toString() {
        return "http://" + domainip + ":" + httpprost + "/" + httpproject + "/";
    }
}

package com.kylin.electricassistsys.pojo.jcsj;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjBfsj extends Model<TJcsjBfsj> {

    private static final long serialVersionUID = 1L;

    private String tBfsjId;
    private String tBfsjName;
    private String tBfsjUrl;
    private String tBfsjData;
    private String tBfsjUser;


    public String gettBfsjId() {
        return tBfsjId;
    }

    public void settBfsjId(String tBfsjId) {
        this.tBfsjId = tBfsjId;
    }

    public String gettBfsjName() {
        return tBfsjName;
    }

    public void settBfsjName(String tBfsjName) {
        this.tBfsjName = tBfsjName;
    }

    public String gettBfsjUrl() {
        return tBfsjUrl;
    }

    public void settBfsjUrl(String tBfsjUrl) {
        this.tBfsjUrl = tBfsjUrl;
    }

    public String gettBfsjData() {
        return tBfsjData;
    }

    public void settBfsjData(String tBfsjData) {
        this.tBfsjData = tBfsjData;
    }

    public String gettBfsjUser() {
        return tBfsjUser;
    }

    public void settBfsjUser(String tBfsjUser) {
        this.tBfsjUser = tBfsjUser;
    }

    @Override
    protected Serializable pkVal() {
        return this.tBfsjId;
    }

    @Override
    public String toString() {
        return "TJcsjBfsj{" +
        "tBfsjId=" + tBfsjId +
        ", tBfsjName=" + tBfsjName +
        ", tBfsjUrl=" + tBfsjUrl +
        ", tBfsjData=" + tBfsjData +
        ", tBfsjUser=" + tBfsjUser +
        "}";
    }
}

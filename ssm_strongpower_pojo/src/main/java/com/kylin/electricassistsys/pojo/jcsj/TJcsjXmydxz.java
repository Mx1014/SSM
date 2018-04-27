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
public class TJcsjXmydxz extends Model<TJcsjXmydxz> {

    private static final long serialVersionUID = 1L;

    private String tXmydxzId;
    private String tXmydxzName;
    private String tXmydxzIndex;
    private String tXmydxzRemark;


    public String gettXmydxzId() {
        return tXmydxzId;
    }

    public void settXmydxzId(String tXmydxzId) {
        this.tXmydxzId = tXmydxzId;
    }

    public String gettXmydxzName() {
        return tXmydxzName;
    }

    public void settXmydxzName(String tXmydxzName) {
        this.tXmydxzName = tXmydxzName;
    }

    public String gettXmydxzIndex() {
        return tXmydxzIndex;
    }

    public void settXmydxzIndex(String tXmydxzIndex) {
        this.tXmydxzIndex = tXmydxzIndex;
    }

    public String gettXmydxzRemark() {
        return tXmydxzRemark;
    }

    public void settXmydxzRemark(String tXmydxzRemark) {
        this.tXmydxzRemark = tXmydxzRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tXmydxzId;
    }

    @Override
    public String toString() {
        return "TJcsjXmydxz{" +
        "tXmydxzId=" + tXmydxzId +
        ", tXmydxzName=" + tXmydxzName +
        ", tXmydxzIndex=" + tXmydxzIndex +
        ", tXmydxzRemark=" + tXmydxzRemark +
        "}";
    }
}

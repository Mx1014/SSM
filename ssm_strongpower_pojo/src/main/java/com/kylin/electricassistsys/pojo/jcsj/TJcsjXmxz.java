package com.kylin.electricassistsys.pojo.jcsj;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjXmxz extends Model<TJcsjXmxz> {

    private static final long serialVersionUID = 1L;
    @TableId("T_XMXZ_ID")
    private String tXmxzId;
    private String tXmxzName;
    private String tXmxzPx;
    private String tXmxzRemark;


    public String gettXmxzId() {
        return tXmxzId;
    }

    public void settXmxzId(String tXmxzId) {
        this.tXmxzId = tXmxzId;
    }

    public String gettXmxzName() {
        return tXmxzName;
    }

    public void settXmxzName(String tXmxzName) {
        this.tXmxzName = tXmxzName;
    }

    public String gettXmxzPx() {
        return tXmxzPx;
    }

    public void settXmxzPx(String tXmxzPx) {
        this.tXmxzPx = tXmxzPx;
    }

    public String gettXmxzRemark() {
        return tXmxzRemark;
    }

    public void settXmxzRemark(String tXmxzRemark) {
        this.tXmxzRemark = tXmxzRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tXmxzId;
    }

    @Override
    public String toString() {
        return "TJcsjXmxz{" +
        "tXmxzId=" + tXmxzId +
        ", tXmxzName=" + tXmxzName +
        ", tXmxzPx=" + tXmxzPx +
        ", tXmxzRemark=" + tXmxzRemark +
        "}";
    }
}

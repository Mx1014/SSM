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
public class TJcsjJcmb extends Model<TJcsjJcmb> {

    private static final long serialVersionUID = 1L;

    private String tJcmbId;
    private String tJcmbPid;
    private String tJcmbName;
    private String tJcmbRemark;


    public String gettJcmbId() {
        return tJcmbId;
    }

    public void settJcmbId(String tJcmbId) {
        this.tJcmbId = tJcmbId;
    }

    public String gettJcmbPid() {
        return tJcmbPid;
    }

    public void settJcmbPid(String tJcmbPid) {
        this.tJcmbPid = tJcmbPid;
    }

    public String gettJcmbName() {
        return tJcmbName;
    }

    public void settJcmbName(String tJcmbName) {
        this.tJcmbName = tJcmbName;
    }

    public String gettJcmbRemark() {
        return tJcmbRemark;
    }

    public void settJcmbRemark(String tJcmbRemark) {
        this.tJcmbRemark = tJcmbRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tJcmbId;
    }

    @Override
    public String toString() {
        return "TJcsjJcmb{" +
        "tJcmbId=" + tJcmbId +
        ", tJcmbPid=" + tJcmbPid +
        ", tJcmbName=" + tJcmbName +
        ", tJcmbRemark=" + tJcmbRemark +
        "}";
    }
}

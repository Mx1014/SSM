package com.kylin.electricassistsys.pojo.wghgl;

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
public class TDwghglKyxmxx extends Model<TDwghglKyxmxx> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String tKyxmId;
    /**
     * 规划库id
     */
    private String tKyxmGhkid;
    /**
     * 间隔
     */
    private String tKyxmJg;
    /**
     * 附件
     */
    private String tKyxmFj;
    /**
     * 备注
     */
    private String tKyxmRemark;
    /**
     * 变电站id
     */
    private String tKyxmBdzid;
    /**
     * 间隔使用状态
     */
    private String tKyxmZt;
    /**
     * 项目id
     */
    private String tKyxmXmid;


    public String gettKyxmId() {
        return tKyxmId;
    }

    public void settKyxmId(String tKyxmId) {
        this.tKyxmId = tKyxmId;
    }

    public String gettKyxmGhkid() {
        return tKyxmGhkid;
    }

    public void settKyxmGhkid(String tKyxmGhkid) {
        this.tKyxmGhkid = tKyxmGhkid;
    }

    public String gettKyxmJg() {
        return tKyxmJg;
    }

    public void settKyxmJg(String tKyxmJg) {
        this.tKyxmJg = tKyxmJg;
    }

    public String gettKyxmFj() {
        return tKyxmFj;
    }

    public void settKyxmFj(String tKyxmFj) {
        this.tKyxmFj = tKyxmFj;
    }

    public String gettKyxmRemark() {
        return tKyxmRemark;
    }

    public void settKyxmRemark(String tKyxmRemark) {
        this.tKyxmRemark = tKyxmRemark;
    }

    public String gettKyxmBdzid() {
        return tKyxmBdzid;
    }

    public void settKyxmBdzid(String tKyxmBdzid) {
        this.tKyxmBdzid = tKyxmBdzid;
    }

    public String gettKyxmZt() {
        return tKyxmZt;
    }

    public void settKyxmZt(String tKyxmZt) {
        this.tKyxmZt = tKyxmZt;
    }

    public String gettKyxmXmid() {
        return tKyxmXmid;
    }

    public void settKyxmXmid(String tKyxmXmid) {
        this.tKyxmXmid = tKyxmXmid;
    }

    @Override
    protected Serializable pkVal() {
        return this.tKyxmId;
    }

    @Override
    public String toString() {
        return "TDwghglKyxmxx{" +
        "tKyxmId=" + tKyxmId +
        ", tKyxmGhkid=" + tKyxmGhkid +
        ", tKyxmJg=" + tKyxmJg +
        ", tKyxmFj=" + tKyxmFj +
        ", tKyxmRemark=" + tKyxmRemark +
        ", tKyxmBdzid=" + tKyxmBdzid +
        ", tKyxmZt=" + tKyxmZt +
        ", tKyxmXmid=" + tKyxmXmid +
        "}";
    }
}

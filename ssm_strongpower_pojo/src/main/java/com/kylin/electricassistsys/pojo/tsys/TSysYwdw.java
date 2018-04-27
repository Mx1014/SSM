package com.kylin.electricassistsys.pojo.tsys;

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
public class TSysYwdw extends Model<TSysYwdw> {

    private static final long serialVersionUID = 1L;

    private String tSysId;
    private String tSysSx;
    private String tSysDwmz;
    private Long tSysPx;
    private String tSysZt;
    private String tSysBz;


    public String gettSysId() {
        return tSysId;
    }

    public void settSysId(String tSysId) {
        this.tSysId = tSysId;
    }

    public String gettSysSx() {
        return tSysSx;
    }

    public void settSysSx(String tSysSx) {
        this.tSysSx = tSysSx;
    }

    public String gettSysDwmz() {
        return tSysDwmz;
    }

    public void settSysDwmz(String tSysDwmz) {
        this.tSysDwmz = tSysDwmz;
    }

    public Long gettSysPx() {
        return tSysPx;
    }

    public void settSysPx(Long tSysPx) {
        this.tSysPx = tSysPx;
    }

    public String gettSysZt() {
        return tSysZt;
    }

    public void settSysZt(String tSysZt) {
        this.tSysZt = tSysZt;
    }

    public String gettSysBz() {
        return tSysBz;
    }

    public void settSysBz(String tSysBz) {
        this.tSysBz = tSysBz;
    }

    @Override
    protected Serializable pkVal() {
        return this.tSysId;
    }

    @Override
    public String toString() {
        return "TSysYwdw{" +
        "tSysId=" + tSysId +
        ", tSysSx=" + tSysSx +
        ", tSysDwmz=" + tSysDwmz +
        ", tSysPx=" + tSysPx +
        ", tSysZt=" + tSysZt +
        ", tSysBz=" + tSysBz +
        "}";
    }
}

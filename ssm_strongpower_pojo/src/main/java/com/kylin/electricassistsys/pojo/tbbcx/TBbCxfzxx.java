package com.kylin.electricassistsys.pojo.tbbcx;

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
public class TBbCxfzxx extends Model<TBbCxfzxx> {

    private static final long serialVersionUID = 1L;

    private String tId;
    private String tYear;
    private String tXmmc;
    private String tXmwz;
    private String tZjrl;
    private String tFhdx;
    private String tFhjb;
    private String tYdsj;
    private String tJrxtfa;
    private String tPid;


    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettYear() {
        return tYear;
    }

    public void settYear(String tYear) {
        this.tYear = tYear;
    }

    public String gettXmmc() {
        return tXmmc;
    }

    public void settXmmc(String tXmmc) {
        this.tXmmc = tXmmc;
    }

    public String gettXmwz() {
        return tXmwz;
    }

    public void settXmwz(String tXmwz) {
        this.tXmwz = tXmwz;
    }

    public String gettZjrl() {
        return tZjrl;
    }

    public void settZjrl(String tZjrl) {
        this.tZjrl = tZjrl;
    }

    public String gettFhdx() {
        return tFhdx;
    }

    public void settFhdx(String tFhdx) {
        this.tFhdx = tFhdx;
    }

    public String gettFhjb() {
        return tFhjb;
    }

    public void settFhjb(String tFhjb) {
        this.tFhjb = tFhjb;
    }

    public String gettYdsj() {
        return tYdsj;
    }

    public void settYdsj(String tYdsj) {
        this.tYdsj = tYdsj;
    }

    public String gettJrxtfa() {
        return tJrxtfa;
    }

    public void settJrxtfa(String tJrxtfa) {
        this.tJrxtfa = tJrxtfa;
    }

    public String gettPid() {
        return tPid;
    }

    public void settPid(String tPid) {
        this.tPid = tPid;
    }

    @Override
    protected Serializable pkVal() {
        return this.tId;
    }

    @Override
    public String toString() {
        return "TBbCxfzxx{" +
        "tId=" + tId +
        ", tYear=" + tYear +
        ", tXmmc=" + tXmmc +
        ", tXmwz=" + tXmwz +
        ", tZjrl=" + tZjrl +
        ", tFhdx=" + tFhdx +
        ", tFhjb=" + tFhjb +
        ", tYdsj=" + tYdsj +
        ", tJrxtfa=" + tJrxtfa +
        ", tPid=" + tPid +
        "}";
    }
}

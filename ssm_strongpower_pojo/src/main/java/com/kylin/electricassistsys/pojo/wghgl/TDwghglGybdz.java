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
public class TDwghglGybdz extends Model<TDwghglGybdz> {

    private static final long serialVersionUID = 1L;

    private String tGybdzId;
    private String tDwghglId;
    private String tGybdzName;
    private String tGybdzType;
    private String tGybdzDydj;
    private String tGybdzSsqy;
    private String tGybdzGqlx;
    private String tGybdzYwdw;
    private String tGybdzBtysj;
    private String tGybdzBdzs;
    private String tGybdzBdrl;
    private String tGybdzZbts;
    private String tGybdzWgbcrl;
    private String tGybdzGyjg;
    private String tGybdzXmtz;
    private String tGybdzJsfs;


    public String gettGybdzId() {
        return tGybdzId;
    }

    public void settGybdzId(String tGybdzId) {
        this.tGybdzId = tGybdzId;
    }

    public String gettDwghglId() {
        return tDwghglId;
    }

    public void settDwghglId(String tDwghglId) {
        this.tDwghglId = tDwghglId;
    }

    public String gettGybdzName() {
        return tGybdzName;
    }

    public void settGybdzName(String tGybdzName) {
        this.tGybdzName = tGybdzName;
    }

    public String gettGybdzType() {
        return tGybdzType;
    }

    public void settGybdzType(String tGybdzType) {
        this.tGybdzType = tGybdzType;
    }

    public String gettGybdzDydj() {
        return tGybdzDydj;
    }

    public void settGybdzDydj(String tGybdzDydj) {
        this.tGybdzDydj = tGybdzDydj;
    }

    public String gettGybdzSsqy() {
        return tGybdzSsqy;
    }

    public void settGybdzSsqy(String tGybdzSsqy) {
        this.tGybdzSsqy = tGybdzSsqy;
    }

    public String gettGybdzGqlx() {
        return tGybdzGqlx;
    }

    public void settGybdzGqlx(String tGybdzGqlx) {
        this.tGybdzGqlx = tGybdzGqlx;
    }

    public String gettGybdzYwdw() {
        return tGybdzYwdw;
    }

    public void settGybdzYwdw(String tGybdzYwdw) {
        this.tGybdzYwdw = tGybdzYwdw;
    }

    public String gettGybdzBtysj() {
        return tGybdzBtysj;
    }

    public void settGybdzBtysj(String tGybdzBtysj) {
        this.tGybdzBtysj = tGybdzBtysj;
    }

    public String gettGybdzBdzs() {
        return tGybdzBdzs;
    }

    public void settGybdzBdzs(String tGybdzBdzs) {
        this.tGybdzBdzs = tGybdzBdzs;
    }

    public String gettGybdzBdrl() {
        return tGybdzBdrl;
    }

    public void settGybdzBdrl(String tGybdzBdrl) {
        this.tGybdzBdrl = tGybdzBdrl;
    }

    public String gettGybdzZbts() {
        return tGybdzZbts;
    }

    public void settGybdzZbts(String tGybdzZbts) {
        this.tGybdzZbts = tGybdzZbts;
    }

    public String gettGybdzWgbcrl() {
        return tGybdzWgbcrl;
    }

    public void settGybdzWgbcrl(String tGybdzWgbcrl) {
        this.tGybdzWgbcrl = tGybdzWgbcrl;
    }

    public String gettGybdzGyjg() {
        return tGybdzGyjg;
    }

    public void settGybdzGyjg(String tGybdzGyjg) {
        this.tGybdzGyjg = tGybdzGyjg;
    }

    public String gettGybdzXmtz() {
        return tGybdzXmtz;
    }

    public void settGybdzXmtz(String tGybdzXmtz) {
        this.tGybdzXmtz = tGybdzXmtz;
    }

    public String gettGybdzJsfs() {
        return tGybdzJsfs;
    }

    public void settGybdzJsfs(String tGybdzJsfs) {
        this.tGybdzJsfs = tGybdzJsfs;
    }

    @Override
    protected Serializable pkVal() {
        return this.tGybdzId;
    }

    @Override
    public String toString() {
        return "TDwghglGybdz{" +
        "tGybdzId=" + tGybdzId +
        ", tDwghglId=" + tDwghglId +
        ", tGybdzName=" + tGybdzName +
        ", tGybdzType=" + tGybdzType +
        ", tGybdzDydj=" + tGybdzDydj +
        ", tGybdzSsqy=" + tGybdzSsqy +
        ", tGybdzGqlx=" + tGybdzGqlx +
        ", tGybdzYwdw=" + tGybdzYwdw +
        ", tGybdzBtysj=" + tGybdzBtysj +
        ", tGybdzBdzs=" + tGybdzBdzs +
        ", tGybdzBdrl=" + tGybdzBdrl +
        ", tGybdzZbts=" + tGybdzZbts +
        ", tGybdzWgbcrl=" + tGybdzWgbcrl +
        ", tGybdzGyjg=" + tGybdzGyjg +
        ", tGybdzXmtz=" + tGybdzXmtz +
        ", tGybdzJsfs=" + tGybdzJsfs +
        "}";
    }
}

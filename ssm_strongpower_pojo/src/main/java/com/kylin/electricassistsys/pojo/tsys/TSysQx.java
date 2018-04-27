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
public class TSysQx extends Model<TSysQx> {

    private static final long serialVersionUID = 1L;

    private String tQxid;
    private String tPQxid;
    private String tQxname;
    private String tUrl;
    private String tTxurl;
    private String tQxlx;
    private Double tQxindex;
    private String tModelname;
    private String tState;
    private String tModetype;
    private String tableid;
    private String tKey;
    private String tValue;


    public String gettQxid() {
        return tQxid;
    }

    public void settQxid(String tQxid) {
        this.tQxid = tQxid;
    }

    public String gettPQxid() {
        return tPQxid;
    }

    public void settPQxid(String tPQxid) {
        this.tPQxid = tPQxid;
    }

    public String gettQxname() {
        return tQxname;
    }

    public void settQxname(String tQxname) {
        this.tQxname = tQxname;
    }

    public String gettUrl() {
        return tUrl;
    }

    public void settUrl(String tUrl) {
        this.tUrl = tUrl;
    }

    public String gettTxurl() {
        return tTxurl;
    }

    public void settTxurl(String tTxurl) {
        this.tTxurl = tTxurl;
    }

    public String gettQxlx() {
        return tQxlx;
    }

    public void settQxlx(String tQxlx) {
        this.tQxlx = tQxlx;
    }

    public Double gettQxindex() {
        return tQxindex;
    }

    public void settQxindex(Double tQxindex) {
        this.tQxindex = tQxindex;
    }

    public String gettModelname() {
        return tModelname;
    }

    public void settModelname(String tModelname) {
        this.tModelname = tModelname;
    }

    public String gettState() {
        return tState;
    }

    public void settState(String tState) {
        this.tState = tState;
    }

    public String gettModetype() {
        return tModetype;
    }

    public void settModetype(String tModetype) {
        this.tModetype = tModetype;
    }

    public String getTableid() {
        return tableid;
    }

    public void setTableid(String tableid) {
        this.tableid = tableid;
    }

    public String gettKey() {
        return tKey;
    }

    public void settKey(String tKey) {
        this.tKey = tKey;
    }

    public String gettValue() {
        return tValue;
    }

    public void settValue(String tValue) {
        this.tValue = tValue;
    }

    @Override
    protected Serializable pkVal() {
        return this.tQxid;
    }

    @Override
    public String toString() {
        return "TSysQx{" +
        "tQxid=" + tQxid +
        ", tPQxid=" + tPQxid +
        ", tQxname=" + tQxname +
        ", tUrl=" + tUrl +
        ", tTxurl=" + tTxurl +
        ", tQxlx=" + tQxlx +
        ", tQxindex=" + tQxindex +
        ", tModelname=" + tModelname +
        ", tState=" + tState +
        ", tModetype=" + tModetype +
        ", tableid=" + tableid +
        ", tKey=" + tKey +
        ", tValue=" + tValue +
        "}";
    }
}

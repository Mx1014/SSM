package com.kylin.electricassistsys.pojo.ghdg;

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
public class TGhdgYxnf extends Model<TGhdgYxnf> {

    private static final long serialVersionUID = 1L;

    private String tYxnfId;
    private String tYxnfBh;
    private String tYxnfLx;
    private String tYxnfDydj;
    private String tYxnfNx;
    private String tYxnfZb;
    private String tYxnfDlq;
    private String tYxnfJkcd;
    private String tYxnfDlcd;


    public String gettYxnfId() {
        return tYxnfId;
    }

    public void settYxnfId(String tYxnfId) {
        this.tYxnfId = tYxnfId;
    }

    public String gettYxnfBh() {
        return tYxnfBh;
    }

    public void settYxnfBh(String tYxnfBh) {
        this.tYxnfBh = tYxnfBh;
    }

    public String gettYxnfLx() {
        return tYxnfLx;
    }

    public void settYxnfLx(String tYxnfLx) {
        this.tYxnfLx = tYxnfLx;
    }

    public String gettYxnfDydj() {
        return tYxnfDydj;
    }

    public void settYxnfDydj(String tYxnfDydj) {
        this.tYxnfDydj = tYxnfDydj;
    }

    public String gettYxnfNx() {
        return tYxnfNx;
    }

    public void settYxnfNx(String tYxnfNx) {
        this.tYxnfNx = tYxnfNx;
    }

    public String gettYxnfZb() {
        return tYxnfZb;
    }

    public void settYxnfZb(String tYxnfZb) {
        this.tYxnfZb = tYxnfZb;
    }

    public String gettYxnfDlq() {
        return tYxnfDlq;
    }

    public void settYxnfDlq(String tYxnfDlq) {
        this.tYxnfDlq = tYxnfDlq;
    }

    public String gettYxnfJkcd() {
        return tYxnfJkcd;
    }

    public void settYxnfJkcd(String tYxnfJkcd) {
        this.tYxnfJkcd = tYxnfJkcd;
    }

    public String gettYxnfDlcd() {
        return tYxnfDlcd;
    }

    public void settYxnfDlcd(String tYxnfDlcd) {
        this.tYxnfDlcd = tYxnfDlcd;
    }

    @Override
    protected Serializable pkVal() {
        return this.tYxnfId;
    }

    @Override
    public String toString() {
        return "TGhdgYxnf{" +
        "tYxnfId=" + tYxnfId +
        ", tYxnfBh=" + tYxnfBh +
        ", tYxnfLx=" + tYxnfLx +
        ", tYxnfDydj=" + tYxnfDydj +
        ", tYxnfNx=" + tYxnfNx +
        ", tYxnfZb=" + tYxnfZb +
        ", tYxnfDlq=" + tYxnfDlq +
        ", tYxnfJkcd=" + tYxnfJkcd +
        ", tYxnfDlcd=" + tYxnfDlcd +
        "}";
    }
}

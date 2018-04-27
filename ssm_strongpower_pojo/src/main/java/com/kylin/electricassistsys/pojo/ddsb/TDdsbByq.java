package com.kylin.electricassistsys.pojo.ddsb;

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
public class TDdsbByq extends Model<TDdsbByq> {

    private static final long serialVersionUID = 1L;

    private String tByqId;
    private String tByqSblx;
    private String tByqSbbh;
    private String tByqSbname;
    private String tByqGlsb;
    private String tByqGllx;
    private String tByqBz;
    private String tByqGlsbname;


    public String gettByqId() {
        return tByqId;
    }

    public void settByqId(String tByqId) {
        this.tByqId = tByqId;
    }

    public String gettByqSblx() {
        return tByqSblx;
    }

    public void settByqSblx(String tByqSblx) {
        this.tByqSblx = tByqSblx;
    }

    public String gettByqSbbh() {
        return tByqSbbh;
    }

    public void settByqSbbh(String tByqSbbh) {
        this.tByqSbbh = tByqSbbh;
    }

    public String gettByqSbname() {
        return tByqSbname;
    }

    public void settByqSbname(String tByqSbname) {
        this.tByqSbname = tByqSbname;
    }

    public String gettByqGlsb() {
        return tByqGlsb;
    }

    public void settByqGlsb(String tByqGlsb) {
        this.tByqGlsb = tByqGlsb;
    }

    public String gettByqGllx() {
        return tByqGllx;
    }

    public void settByqGllx(String tByqGllx) {
        this.tByqGllx = tByqGllx;
    }

    public String gettByqBz() {
        return tByqBz;
    }

    public void settByqBz(String tByqBz) {
        this.tByqBz = tByqBz;
    }

    public String gettByqGlsbname() {
        return tByqGlsbname;
    }

    public void settByqGlsbname(String tByqGlsbname) {
        this.tByqGlsbname = tByqGlsbname;
    }

    @Override
    protected Serializable pkVal() {
        return this.tByqId;
    }

    @Override
    public String toString() {
        return "TDdsbByq{" +
        "tByqId=" + tByqId +
        ", tByqSblx=" + tByqSblx +
        ", tByqSbbh=" + tByqSbbh +
        ", tByqSbname=" + tByqSbname +
        ", tByqGlsb=" + tByqGlsb +
        ", tByqGllx=" + tByqGllx +
        ", tByqBz=" + tByqBz +
        ", tByqGlsbname=" + tByqGlsbname +
        "}";
    }
}

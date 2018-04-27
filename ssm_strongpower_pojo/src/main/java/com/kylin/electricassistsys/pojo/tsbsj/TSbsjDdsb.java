package com.kylin.electricassistsys.pojo.tsbsj;

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
public class TSbsjDdsb extends Model<TSbsjDdsb> {

    private static final long serialVersionUID = 1L;

    private String tTdsbId;
    private String tTdsbDydj;
    private String tTdsbSbbm;
    private String tTdsbSbname;
    private String tTdsbLx;
    private String tTdsbRq;
    private String tTdsbBz;
    private String tTdsbSbbdz;
    private String tTdsbGlsbname;
    private String tTdsbGlbdz;


    public String gettTdsbId() {
        return tTdsbId;
    }

    public void settTdsbId(String tTdsbId) {
        this.tTdsbId = tTdsbId;
    }

    public String gettTdsbDydj() {
        return tTdsbDydj;
    }

    public void settTdsbDydj(String tTdsbDydj) {
        this.tTdsbDydj = tTdsbDydj;
    }

    public String gettTdsbSbbm() {
        return tTdsbSbbm;
    }

    public void settTdsbSbbm(String tTdsbSbbm) {
        this.tTdsbSbbm = tTdsbSbbm;
    }

    public String gettTdsbSbname() {
        return tTdsbSbname;
    }

    public void settTdsbSbname(String tTdsbSbname) {
        this.tTdsbSbname = tTdsbSbname;
    }

    public String gettTdsbLx() {
        return tTdsbLx;
    }

    public void settTdsbLx(String tTdsbLx) {
        this.tTdsbLx = tTdsbLx;
    }

    public String gettTdsbRq() {
        return tTdsbRq;
    }

    public void settTdsbRq(String tTdsbRq) {
        this.tTdsbRq = tTdsbRq;
    }

    public String gettTdsbBz() {
        return tTdsbBz;
    }

    public void settTdsbBz(String tTdsbBz) {
        this.tTdsbBz = tTdsbBz;
    }

    public String gettTdsbSbbdz() {
        return tTdsbSbbdz;
    }

    public void settTdsbSbbdz(String tTdsbSbbdz) {
        this.tTdsbSbbdz = tTdsbSbbdz;
    }

    public String gettTdsbGlsbname() {
        return tTdsbGlsbname;
    }

    public void settTdsbGlsbname(String tTdsbGlsbname) {
        this.tTdsbGlsbname = tTdsbGlsbname;
    }

    public String gettTdsbGlbdz() {
        return tTdsbGlbdz;
    }

    public void settTdsbGlbdz(String tTdsbGlbdz) {
        this.tTdsbGlbdz = tTdsbGlbdz;
    }

    @Override
    protected Serializable pkVal() {
        return this.tTdsbId;
    }

    @Override
    public String toString() {
        return "TSbsjDdsb{" +
        "tTdsbId=" + tTdsbId +
        ", tTdsbDydj=" + tTdsbDydj +
        ", tTdsbSbbm=" + tTdsbSbbm +
        ", tTdsbSbname=" + tTdsbSbname +
        ", tTdsbLx=" + tTdsbLx +
        ", tTdsbRq=" + tTdsbRq +
        ", tTdsbBz=" + tTdsbBz +
        ", tTdsbSbbdz=" + tTdsbSbbdz +
        ", tTdsbGlsbname=" + tTdsbGlsbname +
        ", tTdsbGlbdz=" + tTdsbGlbdz +
        "}";
    }
}

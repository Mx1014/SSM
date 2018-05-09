package com.kylin.electricassistsys.dto.ghdg;


import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TGhdgDwkgSelDto extends BaseDto {
    private String tDwkgId;
    private String tDwkgGqlx;
    private String tDwkgDydj;
    private String tDwkgKgzss;
    private String tDwkgHwgss;
    private String tDwkgDlfzxss;
    private String tDwkgZskgss;
    private String tDwkgKgts;
    private String tDwkgDlq;
    private String tDwkgFhkg;
    /**
     * 供区类型中文
     */
    private String tGqlxName;
    /**
     * 电压参数中文
     */
    private String tDycsName;

    public String gettGqlxName() {
        return tGqlxName;
    }

    public void settGqlxName(String tGqlxName) {
        this.tGqlxName = tGqlxName;
    }

    public String gettDycsName() {
        return tDycsName;
    }

    public void settDycsName(String tDycsName) {
        this.tDycsName = tDycsName;
    }


    public String gettDwkgId() {
        return tDwkgId;
    }

    public void settDwkgId(String tDwkgId) {
        this.tDwkgId = tDwkgId;
    }

    public String gettDwkgGqlx() {
        return tDwkgGqlx;
    }

    public void settDwkgGqlx(String tDwkgGqlx) {
        this.tDwkgGqlx = tDwkgGqlx;
    }

    public String gettDwkgDydj() {
        return tDwkgDydj;
    }

    public void settDwkgDydj(String tDwkgDydj) {
        this.tDwkgDydj = tDwkgDydj;
    }

    public String gettDwkgKgzss() {
        return tDwkgKgzss;
    }

    public void settDwkgKgzss(String tDwkgKgzss) {
        this.tDwkgKgzss = tDwkgKgzss;
    }

    public String gettDwkgHwgss() {
        return tDwkgHwgss;
    }

    public void settDwkgHwgss(String tDwkgHwgss) {
        this.tDwkgHwgss = tDwkgHwgss;
    }

    public String gettDwkgDlfzxss() {
        return tDwkgDlfzxss;
    }

    public void settDwkgDlfzxss(String tDwkgDlfzxss) {
        this.tDwkgDlfzxss = tDwkgDlfzxss;
    }

    public String gettDwkgZskgss() {
        return tDwkgZskgss;
    }

    public void settDwkgZskgss(String tDwkgZskgss) {
        this.tDwkgZskgss = tDwkgZskgss;
    }

    public String gettDwkgKgts() {
        return tDwkgKgts;
    }

    public void settDwkgKgts(String tDwkgKgts) {
        this.tDwkgKgts = tDwkgKgts;
    }

    public String gettDwkgDlq() {
        return tDwkgDlq;
    }

    public void settDwkgDlq(String tDwkgDlq) {
        this.tDwkgDlq = tDwkgDlq;
    }

    public String gettDwkgFhkg() {
        return tDwkgFhkg;
    }

    public void settDwkgFhkg(String tDwkgFhkg) {
        this.tDwkgFhkg = tDwkgFhkg;
    }


    @Override
    public String toString() {
        return "TGhdgDwkg{" +
        "tDwkgId=" + tDwkgId +
        ", tDwkgGqlx=" + tDwkgGqlx +
        ", tDwkgDydj=" + tDwkgDydj +
        ", tDwkgKgzss=" + tDwkgKgzss +
        ", tDwkgHwgss=" + tDwkgHwgss +
        ", tDwkgDlfzxss=" + tDwkgDlfzxss +
        ", tDwkgZskgss=" + tDwkgZskgss +
        ", tDwkgKgts=" + tDwkgKgts +
        ", tDwkgDlq=" + tDwkgDlq +
        ", tDwkgFhkg=" + tDwkgFhkg +
        "}";
    }
}

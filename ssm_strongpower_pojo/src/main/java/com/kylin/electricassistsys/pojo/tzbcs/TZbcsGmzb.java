package com.kylin.electricassistsys.pojo.tzbcs;

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
public class TZbcsGmzb extends Model<TZbcsGmzb> {

    private static final long serialVersionUID = 1L;

    private String tGmzbId;
    private String tGmzbGqlx;
    private String tGmzbBdzzs;
    private String tGmzbDzs;
    private String tGmzbZqgm;
    private String tGmzbXzgm;
    private String tGmzbXzbdzrl;
    private String tGmzbZjgs;
    private String tGmzbZxjgs;
    private String tGmzbSyjgs;
    private String tGmzbXlzts;
    private String tGmzbXlzcd;
    private String tGmzbDlxlcd;


    public String gettGmzbId() {
        return tGmzbId;
    }

    public void settGmzbId(String tGmzbId) {
        this.tGmzbId = tGmzbId;
    }

    public String gettGmzbGqlx() {
        return tGmzbGqlx;
    }

    public void settGmzbGqlx(String tGmzbGqlx) {
        this.tGmzbGqlx = tGmzbGqlx;
    }

    public String gettGmzbBdzzs() {
        return tGmzbBdzzs;
    }

    public void settGmzbBdzzs(String tGmzbBdzzs) {
        this.tGmzbBdzzs = tGmzbBdzzs;
    }

    public String gettGmzbDzs() {
        return tGmzbDzs;
    }

    public void settGmzbDzs(String tGmzbDzs) {
        this.tGmzbDzs = tGmzbDzs;
    }

    public String gettGmzbZqgm() {
        return tGmzbZqgm;
    }

    public void settGmzbZqgm(String tGmzbZqgm) {
        this.tGmzbZqgm = tGmzbZqgm;
    }

    public String gettGmzbXzgm() {
        return tGmzbXzgm;
    }

    public void settGmzbXzgm(String tGmzbXzgm) {
        this.tGmzbXzgm = tGmzbXzgm;
    }

    public String gettGmzbXzbdzrl() {
        return tGmzbXzbdzrl;
    }

    public void settGmzbXzbdzrl(String tGmzbXzbdzrl) {
        this.tGmzbXzbdzrl = tGmzbXzbdzrl;
    }

    public String gettGmzbZjgs() {
        return tGmzbZjgs;
    }

    public void settGmzbZjgs(String tGmzbZjgs) {
        this.tGmzbZjgs = tGmzbZjgs;
    }

    public String gettGmzbZxjgs() {
        return tGmzbZxjgs;
    }

    public void settGmzbZxjgs(String tGmzbZxjgs) {
        this.tGmzbZxjgs = tGmzbZxjgs;
    }

    public String gettGmzbSyjgs() {
        return tGmzbSyjgs;
    }

    public void settGmzbSyjgs(String tGmzbSyjgs) {
        this.tGmzbSyjgs = tGmzbSyjgs;
    }

    public String gettGmzbXlzts() {
        return tGmzbXlzts;
    }

    public void settGmzbXlzts(String tGmzbXlzts) {
        this.tGmzbXlzts = tGmzbXlzts;
    }

    public String gettGmzbXlzcd() {
        return tGmzbXlzcd;
    }

    public void settGmzbXlzcd(String tGmzbXlzcd) {
        this.tGmzbXlzcd = tGmzbXlzcd;
    }

    public String gettGmzbDlxlcd() {
        return tGmzbDlxlcd;
    }

    public void settGmzbDlxlcd(String tGmzbDlxlcd) {
        this.tGmzbDlxlcd = tGmzbDlxlcd;
    }

    @Override
    protected Serializable pkVal() {
        return this.tGmzbId;
    }

    @Override
    public String toString() {
        return "TZbcsGmzb{" +
        "tGmzbId=" + tGmzbId +
        ", tGmzbGqlx=" + tGmzbGqlx +
        ", tGmzbBdzzs=" + tGmzbBdzzs +
        ", tGmzbDzs=" + tGmzbDzs +
        ", tGmzbZqgm=" + tGmzbZqgm +
        ", tGmzbXzgm=" + tGmzbXzgm +
        ", tGmzbXzbdzrl=" + tGmzbXzbdzrl +
        ", tGmzbZjgs=" + tGmzbZjgs +
        ", tGmzbZxjgs=" + tGmzbZxjgs +
        ", tGmzbSyjgs=" + tGmzbSyjgs +
        ", tGmzbXlzts=" + tGmzbXlzts +
        ", tGmzbXlzcd=" + tGmzbXlzcd +
        ", tGmzbDlxlcd=" + tGmzbDlxlcd +
        "}";
    }
}

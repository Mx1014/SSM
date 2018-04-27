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
public class TZbcsPdzdh extends Model<TZbcsPdzdh> {

    private static final long serialVersionUID = 1L;

    private String tPdzdhId;
    private String tPdzdhGqlx;
    private String tPdzdhZnfbs;
    private String tPdzdhJzs;
    private String tPdzdhJdchqs;
    private String tPdzdhGzzsqs;
    private String tPdzdhKxzdhfgl;
    private String tPdzdhPdzdyybl;
    private String tPdzdhPdzdeybl;
    private String tPdzdhPdzdsybl;


    public String gettPdzdhId() {
        return tPdzdhId;
    }

    public void settPdzdhId(String tPdzdhId) {
        this.tPdzdhId = tPdzdhId;
    }

    public String gettPdzdhGqlx() {
        return tPdzdhGqlx;
    }

    public void settPdzdhGqlx(String tPdzdhGqlx) {
        this.tPdzdhGqlx = tPdzdhGqlx;
    }

    public String gettPdzdhZnfbs() {
        return tPdzdhZnfbs;
    }

    public void settPdzdhZnfbs(String tPdzdhZnfbs) {
        this.tPdzdhZnfbs = tPdzdhZnfbs;
    }

    public String gettPdzdhJzs() {
        return tPdzdhJzs;
    }

    public void settPdzdhJzs(String tPdzdhJzs) {
        this.tPdzdhJzs = tPdzdhJzs;
    }

    public String gettPdzdhJdchqs() {
        return tPdzdhJdchqs;
    }

    public void settPdzdhJdchqs(String tPdzdhJdchqs) {
        this.tPdzdhJdchqs = tPdzdhJdchqs;
    }

    public String gettPdzdhGzzsqs() {
        return tPdzdhGzzsqs;
    }

    public void settPdzdhGzzsqs(String tPdzdhGzzsqs) {
        this.tPdzdhGzzsqs = tPdzdhGzzsqs;
    }

    public String gettPdzdhKxzdhfgl() {
        return tPdzdhKxzdhfgl;
    }

    public void settPdzdhKxzdhfgl(String tPdzdhKxzdhfgl) {
        this.tPdzdhKxzdhfgl = tPdzdhKxzdhfgl;
    }

    public String gettPdzdhPdzdyybl() {
        return tPdzdhPdzdyybl;
    }

    public void settPdzdhPdzdyybl(String tPdzdhPdzdyybl) {
        this.tPdzdhPdzdyybl = tPdzdhPdzdyybl;
    }

    public String gettPdzdhPdzdeybl() {
        return tPdzdhPdzdeybl;
    }

    public void settPdzdhPdzdeybl(String tPdzdhPdzdeybl) {
        this.tPdzdhPdzdeybl = tPdzdhPdzdeybl;
    }

    public String gettPdzdhPdzdsybl() {
        return tPdzdhPdzdsybl;
    }

    public void settPdzdhPdzdsybl(String tPdzdhPdzdsybl) {
        this.tPdzdhPdzdsybl = tPdzdhPdzdsybl;
    }

    @Override
    protected Serializable pkVal() {
        return this.tPdzdhId;
    }

    @Override
    public String toString() {
        return "TZbcsPdzdh{" +
        "tPdzdhId=" + tPdzdhId +
        ", tPdzdhGqlx=" + tPdzdhGqlx +
        ", tPdzdhZnfbs=" + tPdzdhZnfbs +
        ", tPdzdhJzs=" + tPdzdhJzs +
        ", tPdzdhJdchqs=" + tPdzdhJdchqs +
        ", tPdzdhGzzsqs=" + tPdzdhGzzsqs +
        ", tPdzdhKxzdhfgl=" + tPdzdhKxzdhfgl +
        ", tPdzdhPdzdyybl=" + tPdzdhPdzdyybl +
        ", tPdzdhPdzdeybl=" + tPdzdhPdzdeybl +
        ", tPdzdhPdzdsybl=" + tPdzdhPdzdsybl +
        "}";
    }
}

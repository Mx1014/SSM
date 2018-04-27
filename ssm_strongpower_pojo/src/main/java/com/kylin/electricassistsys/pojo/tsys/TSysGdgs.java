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
public class TSysGdgs extends Model<TSysGdgs> {

    private static final long serialVersionUID = 1L;

    private String tGdgsId;
    private String tGdgsPId;
    private String tGdgsDwmc;
    private Double tGdgsPx;
    private String tGdgsZt;
    private String tGdgsBz;


    public String gettGdgsId() {
        return tGdgsId;
    }

    public void settGdgsId(String tGdgsId) {
        this.tGdgsId = tGdgsId;
    }

    public String gettGdgsPId() {
        return tGdgsPId;
    }

    public void settGdgsPId(String tGdgsPId) {
        this.tGdgsPId = tGdgsPId;
    }

    public String gettGdgsDwmc() {
        return tGdgsDwmc;
    }

    public void settGdgsDwmc(String tGdgsDwmc) {
        this.tGdgsDwmc = tGdgsDwmc;
    }

    public Double gettGdgsPx() {
        return tGdgsPx;
    }

    public void settGdgsPx(Double tGdgsPx) {
        this.tGdgsPx = tGdgsPx;
    }

    public String gettGdgsZt() {
        return tGdgsZt;
    }

    public void settGdgsZt(String tGdgsZt) {
        this.tGdgsZt = tGdgsZt;
    }

    public String gettGdgsBz() {
        return tGdgsBz;
    }

    public void settGdgsBz(String tGdgsBz) {
        this.tGdgsBz = tGdgsBz;
    }

    @Override
    protected Serializable pkVal() {
        return this.tGdgsId;
    }

    @Override
    public String toString() {
        return "TSysGdgs{" +
        "tGdgsId=" + tGdgsId +
        ", tGdgsPId=" + tGdgsPId +
        ", tGdgsDwmc=" + tGdgsDwmc +
        ", tGdgsPx=" + tGdgsPx +
        ", tGdgsZt=" + tGdgsZt +
        ", tGdgsBz=" + tGdgsBz +
        "}";
    }
}

package com.kylin.electricassistsys.dto.tjisuan;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJisuanByqnSelDto extends BaseDto {
    private String nid;
    private String byqid;
    private String jg;
    private String jsnf;
    private String remark;
    private String sdbl;
    /**
     * 供区类型
     */
    private String tByqxxGqlx;
    /**
     *区域
     */
    private String tByqxxQy;
    /**
     *变电站
     */
    private String tByqxxBdz;
    /**
     *使用方式
     */
    private String tByqxxSyfs;
    /**
     *变压器中文名字
     */
    private String tByqxxName;

    public String gettByqxxGqlx() {
        return tByqxxGqlx;
    }

    public void settByqxxGqlx(String tByqxxGqlx) {
        this.tByqxxGqlx = tByqxxGqlx;
    }

    public String gettByqxxQy() {
        return tByqxxQy;
    }

    public void settByqxxQy(String tByqxxQy) {
        this.tByqxxQy = tByqxxQy;
    }

    public String gettByqxxBdz() {
        return tByqxxBdz;
    }

    public void settByqxxBdz(String tByqxxBdz) {
        this.tByqxxBdz = tByqxxBdz;
    }

    public String gettByqxxSyfs() {
        return tByqxxSyfs;
    }

    public void settByqxxSyfs(String tByqxxSyfs) {
        this.tByqxxSyfs = tByqxxSyfs;
    }

    public String gettByqxxName() {
        return tByqxxName;
    }

    public void settByqxxName(String tByqxxName) {
        this.tByqxxName = tByqxxName;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getByqid() {
        return byqid;
    }

    public void setByqid(String byqid) {
        this.byqid = byqid;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getJsnf() {
        return jsnf;
    }

    public void setJsnf(String jsnf) {
        this.jsnf = jsnf;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSdbl() {
        return sdbl;
    }

    public void setSdbl(String sdbl) {
        this.sdbl = sdbl;
    }


    @Override
    public String toString() {
        return "TJisuanByqn{" +
        "nid=" + nid +
        ", byqid=" + byqid +
        ", jg=" + jg +
        ", jsnf=" + jsnf +
        ", remark=" + remark +
        ", sdbl=" + sdbl +
        "}";
    }
}

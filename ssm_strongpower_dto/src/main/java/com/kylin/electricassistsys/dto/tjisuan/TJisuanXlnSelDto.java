package com.kylin.electricassistsys.dto.tjisuan;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 中压线路N-1校验
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJisuanXlnSelDto extends BaseDto {
    private String nid;
    private String xlid;
    private String jg;
    private String jsnf;
    private String remark;
    /**
     *供区类型
     */
    private String tZyxlGqlx;
    /**
     * 区域
     */
    private String tZyxlQy;
    /**
     * 变电站
     */
    private String tZyxlBdz;
    /**
     * 使用方式
     */
    private String tZyxlSyfs;
    /**
     * 变电站中文
     */
    private String tZyllxxxXlmc;


    public String gettZyxlGqlx() {
        return tZyxlGqlx;
    }

    public void settZyxlGqlx(String tZyxlGqlx) {
        this.tZyxlGqlx = tZyxlGqlx;
    }

    public String gettZyxlQy() {
        return tZyxlQy;
    }

    public void settZyxlQy(String tZyxlQy) {
        this.tZyxlQy = tZyxlQy;
    }

    public String gettZyxlBdz() {
        return tZyxlBdz;
    }

    public void settZyxlBdz(String tZyxlBdz) {
        this.tZyxlBdz = tZyxlBdz;
    }

    public String gettZyxlSyfs() {
        return tZyxlSyfs;
    }

    public void settZyxlSyfs(String tZyxlSyfs) {
        this.tZyxlSyfs = tZyxlSyfs;
    }

    public String gettZyllxxxXlmc() {
        return tZyllxxxXlmc;
    }

    public void settZyllxxxXlmc(String tZyllxxxXlmc) {
        this.tZyllxxxXlmc = tZyllxxxXlmc;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getXlid() {
        return xlid;
    }

    public void setXlid(String xlid) {
        this.xlid = xlid;
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

    @Override
    public String toString() {
        return "TJisuanXln{" +
        "nid=" + nid +
        ", xlid=" + xlid +
        ", jg=" + jg +
        ", jsnf=" + jsnf +
        ", remark=" + remark +
        "}";
    }
}

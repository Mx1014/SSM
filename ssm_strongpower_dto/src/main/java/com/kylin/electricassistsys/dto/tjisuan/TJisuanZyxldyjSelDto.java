package com.kylin.electricassistsys.dto.tjisuan;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 中压线路电压降
 * 计算电压降
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJisuanZyxldyjSelDto extends BaseDto {


    private String id;
    private String xlid;
    private String nf;
    private Double value;
    private String remark;
    /**
     *供区类型
     */
    private String tZyxlGqlx;
    /**
     *区域
     */
    private String tZyxlQy;
    /**
     *变电站
     */
    private String tZyxlBdz;
    /**
     *使用方式
     */
    private String tZyxlSyfs;
    /**
     *线路名称
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXlid() {
        return xlid;
    }

    public void setXlid(String xlid) {
        this.xlid = xlid;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TJisuanZyxldyj{" +
        "id=" + id +
        ", xlid=" + xlid +
        ", nf=" + nf +
        ", value=" + value +
        ", remark=" + remark +
        "}";
    }
}

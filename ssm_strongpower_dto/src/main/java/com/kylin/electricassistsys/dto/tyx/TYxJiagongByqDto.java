package com.kylin.electricassistsys.dto.tyx;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 变压器加工后的运行表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TYxJiagongByqDto extends BaseDto {


    private String jgid;
    private String jgnf;
    private String byqid;
    private Double yougong;
    private Double wugong;
    private Double dianliu;
    private String tqtype;
    private String cmtype;
    private String zdfhfssk;
    private String remark;


    public String getJgid() {
        return jgid;
    }

    public void setJgid(String jgid) {
        this.jgid = jgid;
    }

    public String getJgnf() {
        return jgnf;
    }

    public void setJgnf(String jgnf) {
        this.jgnf = jgnf;
    }

    public String getByqid() {
        return byqid;
    }

    public void setByqid(String byqid) {
        this.byqid = byqid;
    }

    public Double getYougong() {
        return yougong;
    }

    public void setYougong(Double yougong) {
        this.yougong = yougong;
    }

    public Double getWugong() {
        return wugong;
    }

    public void setWugong(Double wugong) {
        this.wugong = wugong;
    }

    public Double getDianliu() {
        return dianliu;
    }

    public void setDianliu(Double dianliu) {
        this.dianliu = dianliu;
    }

    public String getTqtype() {
        return tqtype;
    }

    public void setTqtype(String tqtype) {
        this.tqtype = tqtype;
    }

    public String getCmtype() {
        return cmtype;
    }

    public void setCmtype(String cmtype) {
        this.cmtype = cmtype;
    }

    public String getZdfhfssk() {
        return zdfhfssk;
    }

    public void setZdfhfssk(String zdfhfssk) {
        this.zdfhfssk = zdfhfssk;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "TYxJiagongByq{" +
                "jgid=" + jgid +
                ", jgnf=" + jgnf +
                ", byqid=" + byqid +
                ", yougong=" + yougong +
                ", wugong=" + wugong +
                ", dianliu=" + dianliu +
                ", tqtype=" + tqtype +
                ", cmtype=" + cmtype +
                ", zdfhfssk=" + zdfhfssk +
                ", remark=" + remark +
                "}";
    }
}

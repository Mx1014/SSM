package com.kylin.electricassistsys.pojo.tyx;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 交流线路加工后的运行表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TYxJiagongJiaoliuxl extends Model<TYxJiagongJiaoliuxl> {

    private static final long serialVersionUID = 1L;

    private String jgid;
    private String jgnf;
    private String xlid;
    private Double yougong;
    private Double wugong;
    private Double dianliu;
    private String tqtype;
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

    public String getXlid() {
        return xlid;
    }

    public void setXlid(String xlid) {
        this.xlid = xlid;
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
    protected Serializable pkVal() {
        return this.jgid;
    }

    @Override
    public String toString() {
        return "TYxJiagongJiaoliuxl{" +
        "jgid=" + jgid +
        ", jgnf=" + jgnf +
        ", xlid=" + xlid +
        ", yougong=" + yougong +
        ", wugong=" + wugong +
        ", dianliu=" + dianliu +
        ", tqtype=" + tqtype +
        ", zdfhfssk=" + zdfhfssk +
        ", remark=" + remark +
        "}";
    }
}

package com.kylin.electricassistsys.dto.tyx;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TYxJiagongZyxlnDto {

    private static final long serialVersionUID = 1L;

    private String jgid;
    private String jgnf;
    private String xlid;
    private Double yougong;
    private Double wugong;
    private Double dianliu;
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
        return "TYxJiagongZyxln{" +
        "jgid=" + jgid +
        ", jgnf=" + jgnf +
        ", xlid=" + xlid +
        ", yougong=" + yougong +
        ", wugong=" + wugong +
        ", dianliu=" + dianliu +
        ", zdfhfssk=" + zdfhfssk +
        ", remark=" + remark +
        "}";
    }
}

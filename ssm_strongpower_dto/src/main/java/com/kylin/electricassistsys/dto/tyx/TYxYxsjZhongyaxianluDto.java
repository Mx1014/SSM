package com.kylin.electricassistsys.dto.tyx;

/**
 * <p>
 * 中压线路运行数据表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TYxYxsjZhongyaxianluDto  {

    private static final long serialVersionUID = 1L;

    private String yxid;
    private String yxtype;
    private Double yxvalue;
    private String yxnf;
    private String tqshijian;
    private String sbid;
    private String bdzid;
    private String remark;
    private String tqtype;


    public String getYxid() {
        return yxid;
    }

    public void setYxid(String yxid) {
        this.yxid = yxid;
    }

    public String getYxtype() {
        return yxtype;
    }

    public void setYxtype(String yxtype) {
        this.yxtype = yxtype;
    }

    public Double getYxvalue() {
        return yxvalue;
    }

    public void setYxvalue(Double yxvalue) {
        this.yxvalue = yxvalue;
    }

    public String getYxnf() {
        return yxnf;
    }

    public void setYxnf(String yxnf) {
        this.yxnf = yxnf;
    }

    public String getTqshijian() {
        return tqshijian;
    }

    public void setTqshijian(String tqshijian) {
        this.tqshijian = tqshijian;
    }

    public String getSbid() {
        return sbid;
    }

    public void setSbid(String sbid) {
        this.sbid = sbid;
    }

    public String getBdzid() {
        return bdzid;
    }

    public void setBdzid(String bdzid) {
        this.bdzid = bdzid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTqtype() {
        return tqtype;
    }

    public void setTqtype(String tqtype) {
        this.tqtype = tqtype;
    }


    @Override
    public String toString() {
        return "TYxYxsjZhongyaxianlu{" +
        "yxid=" + yxid +
        ", yxtype=" + yxtype +
        ", yxvalue=" + yxvalue +
        ", yxnf=" + yxnf +
        ", tqshijian=" + tqshijian +
        ", sbid=" + sbid +
        ", bdzid=" + bdzid +
        ", remark=" + remark +
        ", tqtype=" + tqtype +
        "}";
    }
}

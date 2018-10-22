package com.kylin.electricassistsys.dto.tyx;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 交流线路运行数据表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TYxYxsjJiaoliuxianDto extends BaseDto {


    private String yxid;
    private String yxtype;
    private Double yxvalue;
    private String yxnf;
    private String tqtype;
    private String tqshijian;
    private String sbid;
    private String bdzid;
    private String remark;


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

    public String getTqtype() {
        return tqtype;
    }

    public void setTqtype(String tqtype) {
        this.tqtype = tqtype;
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


    @Override
    public String toString() {
        return "TYxYxsjJiaoliuxian{" +
                "yxid=" + yxid +
                ", yxtype=" + yxtype +
                ", yxvalue=" + yxvalue +
                ", yxnf=" + yxnf +
                ", tqtype=" + tqtype +
                ", tqshijian=" + tqshijian +
                ", sbid=" + sbid +
                ", bdzid=" + bdzid +
                ", remark=" + remark +
                "}";
    }
}

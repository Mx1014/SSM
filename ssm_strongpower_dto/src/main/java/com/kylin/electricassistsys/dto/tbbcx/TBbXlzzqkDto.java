package com.kylin.electricassistsys.dto.tbbcx;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TBbXlzzqkDto extends BaseDto {


    private String tId;
    private String tYear;
    private String tXlmc;
    private String tDq;
    private String tDw;
    private String tFzl;
    private String tZzyy;
    private String tJjfa;
    private String tRemark;
    private String tPid;


    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettYear() {
        return tYear;
    }

    public void settYear(String tYear) {
        this.tYear = tYear;
    }

    public String gettXlmc() {
        return tXlmc;
    }

    public void settXlmc(String tXlmc) {
        this.tXlmc = tXlmc;
    }

    public String gettDq() {
        return tDq;
    }

    public void settDq(String tDq) {
        this.tDq = tDq;
    }

    public String gettDw() {
        return tDw;
    }

    public void settDw(String tDw) {
        this.tDw = tDw;
    }

    public String gettFzl() {
        return tFzl;
    }

    public void settFzl(String tFzl) {
        this.tFzl = tFzl;
    }

    public String gettZzyy() {
        return tZzyy;
    }

    public void settZzyy(String tZzyy) {
        this.tZzyy = tZzyy;
    }

    public String gettJjfa() {
        return tJjfa;
    }

    public void settJjfa(String tJjfa) {
        this.tJjfa = tJjfa;
    }

    public String gettRemark() {
        return tRemark;
    }

    public void settRemark(String tRemark) {
        this.tRemark = tRemark;
    }

    public String gettPid() {
        return tPid;
    }

    public void settPid(String tPid) {
        this.tPid = tPid;
    }


    @Override
    public String toString() {
        return "TBbXlzzqk{" +
                "tId=" + tId +
                ", tYear=" + tYear +
                ", tXlmc=" + tXlmc +
                ", tDq=" + tDq +
                ", tDw=" + tDw +
                ", tFzl=" + tFzl +
                ", tZzyy=" + tZzyy +
                ", tJjfa=" + tJjfa +
                ", tRemark=" + tRemark +
                ", tPid=" + tPid +
                "}";
    }
}

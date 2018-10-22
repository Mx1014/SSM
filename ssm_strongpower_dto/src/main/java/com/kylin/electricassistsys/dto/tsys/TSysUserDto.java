package com.kylin.electricassistsys.dto.tsys;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSysUserDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    private String uId;
    private String dId;
    private String uName;
    private String uSex;
    private String uEmail;
    private String uAddress;
    private String uPhone;
    private String uQq;
    private String uTelnumber;
    private String uCreatedate;
    private String uState;
    private String uRemark;
    private String uYwdw;


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuQq() {
        return uQq;
    }

    public void setuQq(String uQq) {
        this.uQq = uQq;
    }

    public String getuTelnumber() {
        return uTelnumber;
    }

    public void setuTelnumber(String uTelnumber) {
        this.uTelnumber = uTelnumber;
    }

    public String getuCreatedate() {
        return uCreatedate;
    }

    public void setuCreatedate(String uCreatedate) {
        this.uCreatedate = uCreatedate;
    }

    public String getuState() {
        return uState;
    }

    public void setuState(String uState) {
        this.uState = uState;
    }

    public String getuRemark() {
        return uRemark;
    }

    public void setuRemark(String uRemark) {
        this.uRemark = uRemark;
    }

    public String getuYwdw() {
        return uYwdw;
    }

    public void setuYwdw(String uYwdw) {
        this.uYwdw = uYwdw;
    }


    @Override
    public String toString() {
        return "TSysUser{" +
                "uId=" + uId +
                ", dId=" + dId +
                ", uName=" + uName +
                ", uSex=" + uSex +
                ", uEmail=" + uEmail +
                ", uAddress=" + uAddress +
                ", uPhone=" + uPhone +
                ", uQq=" + uQq +
                ", uTelnumber=" + uTelnumber +
                ", uCreatedate=" + uCreatedate +
                ", uState=" + uState +
                ", uRemark=" + uRemark +
                ", uYwdw=" + uYwdw +
                "}";
    }
}

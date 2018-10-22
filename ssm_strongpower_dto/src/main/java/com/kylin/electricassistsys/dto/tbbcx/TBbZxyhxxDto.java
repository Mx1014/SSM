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
public class TBbZxyhxxDto extends BaseDto {


    /**
     * 编号
     */
    private String tId;
    /**
     * 用户名称
     */
    private String tYhmc;
    /**
     * 电压等级
     */
    private String tDydj;
    /**
     * 所属区域
     */
    private String tSsqy;
    /**
     * 负荷级别
     */
    private String tFhjb;
    /**
     * 电源来源1
     */
    private String tDyly1;
    /**
     * 电源来源2
     */
    private String tDyly2;
    /**
     * 保安电源设备
     */
    private String tBadysb;
    /**
     * 新增设备名称
     */
    private String tXzsbmc;
    /**
     * 新增变电站容量
     */
    private String tXzbdzrl;
    /**
     * 主变型号
     */
    private String tZbxh;
    /**
     * 线路长度及型号
     */
    private String tXlcdandxh;
    /**
     * 无功容量及构成
     */
    private String tWgrlandgc;
    /**
     * 变更时间
     */
    private String tBgsj;


    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettYhmc() {
        return tYhmc;
    }

    public void settYhmc(String tYhmc) {
        this.tYhmc = tYhmc;
    }

    public String gettDydj() {
        return tDydj;
    }

    public void settDydj(String tDydj) {
        this.tDydj = tDydj;
    }

    public String gettSsqy() {
        return tSsqy;
    }

    public void settSsqy(String tSsqy) {
        this.tSsqy = tSsqy;
    }

    public String gettFhjb() {
        return tFhjb;
    }

    public void settFhjb(String tFhjb) {
        this.tFhjb = tFhjb;
    }

    public String gettDyly1() {
        return tDyly1;
    }

    public void settDyly1(String tDyly1) {
        this.tDyly1 = tDyly1;
    }

    public String gettDyly2() {
        return tDyly2;
    }

    public void settDyly2(String tDyly2) {
        this.tDyly2 = tDyly2;
    }

    public String gettBadysb() {
        return tBadysb;
    }

    public void settBadysb(String tBadysb) {
        this.tBadysb = tBadysb;
    }

    public String gettXzsbmc() {
        return tXzsbmc;
    }

    public void settXzsbmc(String tXzsbmc) {
        this.tXzsbmc = tXzsbmc;
    }

    public String gettXzbdzrl() {
        return tXzbdzrl;
    }

    public void settXzbdzrl(String tXzbdzrl) {
        this.tXzbdzrl = tXzbdzrl;
    }

    public String gettZbxh() {
        return tZbxh;
    }

    public void settZbxh(String tZbxh) {
        this.tZbxh = tZbxh;
    }

    public String gettXlcdandxh() {
        return tXlcdandxh;
    }

    public void settXlcdandxh(String tXlcdandxh) {
        this.tXlcdandxh = tXlcdandxh;
    }

    public String gettWgrlandgc() {
        return tWgrlandgc;
    }

    public void settWgrlandgc(String tWgrlandgc) {
        this.tWgrlandgc = tWgrlandgc;
    }

    public String gettBgsj() {
        return tBgsj;
    }

    public void settBgsj(String tBgsj) {
        this.tBgsj = tBgsj;
    }


    @Override
    public String toString() {
        return "TBbZxyhxx{" +
                "tId=" + tId +
                ", tYhmc=" + tYhmc +
                ", tDydj=" + tDydj +
                ", tSsqy=" + tSsqy +
                ", tFhjb=" + tFhjb +
                ", tDyly1=" + tDyly1 +
                ", tDyly2=" + tDyly2 +
                ", tBadysb=" + tBadysb +
                ", tXzsbmc=" + tXzsbmc +
                ", tXzbdzrl=" + tXzbdzrl +
                ", tZbxh=" + tZbxh +
                ", tXlcdandxh=" + tXlcdandxh +
                ", tWgrlandgc=" + tWgrlandgc +
                ", tBgsj=" + tBgsj +
                "}";
    }
}

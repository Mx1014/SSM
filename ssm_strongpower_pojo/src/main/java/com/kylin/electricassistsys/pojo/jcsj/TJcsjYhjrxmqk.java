package com.kylin.electricassistsys.pojo.jcsj;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjYhjrxmqk extends Model<TJcsjYhjrxmqk> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String tXmqkId;
    /**
     * 用户接入方案编号
     */
    private String tXmqkYhjrid;
    /**
     * 期数
     */
    private String tXmqkQishu;
    /**
     * 用电设备容量
     */
    private String tXmqkYdsbrl;
    /**
     * 有功负荷
     */
    private String tXmqkYgfh;
    /**
     * 一级负荷
     */
    private String tXmqkYjfh;
    /**
     * 二级负荷
     */
    private String tXmqkEjfh;
    /**
     * 三级负荷
     */
    private String tXmqkSjfh;
    /**
     * 保安负荷及保安方式
     */
    private String tXmqkBafhandbafs;
    /**
     * 用电时间
     */
    private String tXmqkYdsj;
    /**
     * 备注
     */
    private String tXmqkRemark;


    public String gettXmqkId() {
        return tXmqkId;
    }

    public void settXmqkId(String tXmqkId) {
        this.tXmqkId = tXmqkId;
    }

    public String gettXmqkYhjrid() {
        return tXmqkYhjrid;
    }

    public void settXmqkYhjrid(String tXmqkYhjrid) {
        this.tXmqkYhjrid = tXmqkYhjrid;
    }

    public String gettXmqkQishu() {
        return tXmqkQishu;
    }

    public void settXmqkQishu(String tXmqkQishu) {
        this.tXmqkQishu = tXmqkQishu;
    }

    public String gettXmqkYdsbrl() {
        return tXmqkYdsbrl;
    }

    public void settXmqkYdsbrl(String tXmqkYdsbrl) {
        this.tXmqkYdsbrl = tXmqkYdsbrl;
    }

    public String gettXmqkYgfh() {
        return tXmqkYgfh;
    }

    public void settXmqkYgfh(String tXmqkYgfh) {
        this.tXmqkYgfh = tXmqkYgfh;
    }

    public String gettXmqkYjfh() {
        return tXmqkYjfh;
    }

    public void settXmqkYjfh(String tXmqkYjfh) {
        this.tXmqkYjfh = tXmqkYjfh;
    }

    public String gettXmqkEjfh() {
        return tXmqkEjfh;
    }

    public void settXmqkEjfh(String tXmqkEjfh) {
        this.tXmqkEjfh = tXmqkEjfh;
    }

    public String gettXmqkSjfh() {
        return tXmqkSjfh;
    }

    public void settXmqkSjfh(String tXmqkSjfh) {
        this.tXmqkSjfh = tXmqkSjfh;
    }

    public String gettXmqkBafhandbafs() {
        return tXmqkBafhandbafs;
    }

    public void settXmqkBafhandbafs(String tXmqkBafhandbafs) {
        this.tXmqkBafhandbafs = tXmqkBafhandbafs;
    }

    public String gettXmqkYdsj() {
        return tXmqkYdsj;
    }

    public void settXmqkYdsj(String tXmqkYdsj) {
        this.tXmqkYdsj = tXmqkYdsj;
    }

    public String gettXmqkRemark() {
        return tXmqkRemark;
    }

    public void settXmqkRemark(String tXmqkRemark) {
        this.tXmqkRemark = tXmqkRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tXmqkId;
    }

    @Override
    public String toString() {
        return "TJcsjYhjrxmqk{" +
        "tXmqkId=" + tXmqkId +
        ", tXmqkYhjrid=" + tXmqkYhjrid +
        ", tXmqkQishu=" + tXmqkQishu +
        ", tXmqkYdsbrl=" + tXmqkYdsbrl +
        ", tXmqkYgfh=" + tXmqkYgfh +
        ", tXmqkYjfh=" + tXmqkYjfh +
        ", tXmqkEjfh=" + tXmqkEjfh +
        ", tXmqkSjfh=" + tXmqkSjfh +
        ", tXmqkBafhandbafs=" + tXmqkBafhandbafs +
        ", tXmqkYdsj=" + tXmqkYdsj +
        ", tXmqkRemark=" + tXmqkRemark +
        "}";
    }
}

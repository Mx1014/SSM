package com.kylin.electricassistsys.pojo.tzbcs;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 间隔管理
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TZyglEelgs extends Model<TZyglEelgs> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String tEelgsId;
    /**
     * 变电站Id
     */
    private String tEelgsBdzid;
    /**
     * 间隔 名称
     */
    private String tEelgsJgmc;
    /**
     * 使用状态
     */
    private String tEelgsSyzt;
    /**
     * 接线名称编号
     */
    private String tEelgsJxmc;
    /**
     * 电压等级
     */
    private String tEelgsDydj;
    /**
     * 去年最大负荷
     */
    private String tEelgsQnzdfh;
    /**
     * 负载率
     */
    private String tEelgsFzl;
    /**
     * 时间
     */
    private String tEelgsSj;
    /**
     * 备注
     */
    private String tEelgsBz;
    /**
     * 线路编号
     */
    private String tEelgsNum;
    /**
     * 提取类型
     */
    private String tEelgsType;
    /**
     * Open变电站Id
     */
    private String facId;


    public String gettEelgsId() {
        return tEelgsId;
    }

    public void settEelgsId(String tEelgsId) {
        this.tEelgsId = tEelgsId;
    }

    public String gettEelgsBdzid() {
        return tEelgsBdzid;
    }

    public void settEelgsBdzid(String tEelgsBdzid) {
        this.tEelgsBdzid = tEelgsBdzid;
    }

    public String gettEelgsJgmc() {
        return tEelgsJgmc;
    }

    public void settEelgsJgmc(String tEelgsJgmc) {
        this.tEelgsJgmc = tEelgsJgmc;
    }

    public String gettEelgsSyzt() {
        return tEelgsSyzt;
    }

    public void settEelgsSyzt(String tEelgsSyzt) {
        this.tEelgsSyzt = tEelgsSyzt;
    }

    public String gettEelgsJxmc() {
        return tEelgsJxmc;
    }

    public void settEelgsJxmc(String tEelgsJxmc) {
        this.tEelgsJxmc = tEelgsJxmc;
    }

    public String gettEelgsDydj() {
        return tEelgsDydj;
    }

    public void settEelgsDydj(String tEelgsDydj) {
        this.tEelgsDydj = tEelgsDydj;
    }

    public String gettEelgsQnzdfh() {
        return tEelgsQnzdfh;
    }

    public void settEelgsQnzdfh(String tEelgsQnzdfh) {
        this.tEelgsQnzdfh = tEelgsQnzdfh;
    }

    public String gettEelgsFzl() {
        return tEelgsFzl;
    }

    public void settEelgsFzl(String tEelgsFzl) {
        this.tEelgsFzl = tEelgsFzl;
    }

    public String gettEelgsSj() {
        return tEelgsSj;
    }

    public void settEelgsSj(String tEelgsSj) {
        this.tEelgsSj = tEelgsSj;
    }

    public String gettEelgsBz() {
        return tEelgsBz;
    }

    public void settEelgsBz(String tEelgsBz) {
        this.tEelgsBz = tEelgsBz;
    }

    public String gettEelgsNum() {
        return tEelgsNum;
    }

    public void settEelgsNum(String tEelgsNum) {
        this.tEelgsNum = tEelgsNum;
    }

    public String gettEelgsType() {
        return tEelgsType;
    }

    public void settEelgsType(String tEelgsType) {
        this.tEelgsType = tEelgsType;
    }

    public String getFacId() {
        return facId;
    }

    public void setFacId(String facId) {
        this.facId = facId;
    }

    @Override
    protected Serializable pkVal() {
        return this.tEelgsId;
    }

    @Override
    public String toString() {
        return "TZyglEelgs{" +
        "tEelgsId=" + tEelgsId +
        ", tEelgsBdzid=" + tEelgsBdzid +
        ", tEelgsJgmc=" + tEelgsJgmc +
        ", tEelgsSyzt=" + tEelgsSyzt +
        ", tEelgsJxmc=" + tEelgsJxmc +
        ", tEelgsDydj=" + tEelgsDydj +
        ", tEelgsQnzdfh=" + tEelgsQnzdfh +
        ", tEelgsFzl=" + tEelgsFzl +
        ", tEelgsSj=" + tEelgsSj +
        ", tEelgsBz=" + tEelgsBz +
        ", tEelgsNum=" + tEelgsNum +
        ", tEelgsType=" + tEelgsType +
        ", facId=" + facId +
        "}";
    }
}

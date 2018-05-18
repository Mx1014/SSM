package com.kylin.electricassistsys.pojo.tsbsj;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 低壓綫路信息基本類
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSbsjDyxlxxSel extends Model<TSbsjDyxlxxSel> {

    private static final long serialVersionUID = 1L;

    /**
     * 标示
     */
    private String tDyxlxxId;
    /**
     * 年份
     */
    private String tDyxlxxNf;
    /**
     * 所属区域
     */
    private String tDyxlxxScqy;
    /**
     * 线路条数
     */
    private Double tDyxlxxXlts;
    /**
     * 绝缘线条数
     */
    private Double tDyxlxxJyxts;
    /**
     * 裸导线条数
     */
    private Double tDyxlxxLdxts;
    /**
     * 绝缘线长度
     */
    private Double tDyxlxxJyxcd;
    /**
     * 裸导线长度
     */
    private Double tDyxlxxLdxcd;
    /**
     * 备注
     */
    private String tDyxlxxBz;
    /**
     * 线路长度
     */
    private Double tDyxlxxXlcd;
    /**
     * 运维单位
     */
    private String tDyxlxxYwdw;
    /**
     * 供区类型
     */
    private String tDyxlxxGqlx;
    /**
     * 电缆型号
     */
    private String tDyxlxxDlxh;
    /**
     * 分段数
     */
    private String tDyxlxxFds;
    /**
     * 分段长度
     */
    private String tDyxlxxFdcd;
    /**
     * 敷设方式
     */
    private String tDyxlxxFsfs;
    /**
     * 供区类型中文
     */
    private String tGqlxName;
    /**
     *所属区域中文
     */
    private String tGdfqName;
    /**
     *运维单位中文
     */
    private String tSysDwmz;
    /**
     *敷设方式
     */
    private String tFsfsName;


    public String gettDyxlxxId() {
        return tDyxlxxId;
    }

    public void settDyxlxxId(String tDyxlxxId) {
        this.tDyxlxxId = tDyxlxxId;
    }

    public String gettDyxlxxNf() {
        return tDyxlxxNf;
    }

    public void settDyxlxxNf(String tDyxlxxNf) {
        this.tDyxlxxNf = tDyxlxxNf;
    }

    public String gettDyxlxxScqy() {
        return tDyxlxxScqy;
    }

    public void settDyxlxxScqy(String tDyxlxxScqy) {
        this.tDyxlxxScqy = tDyxlxxScqy;
    }

    public Double gettDyxlxxXlts() {
        return tDyxlxxXlts;
    }

    public void settDyxlxxXlts(Double tDyxlxxXlts) {
        this.tDyxlxxXlts = tDyxlxxXlts;
    }

    public Double gettDyxlxxJyxts() {
        return tDyxlxxJyxts;
    }

    public void settDyxlxxJyxts(Double tDyxlxxJyxts) {
        this.tDyxlxxJyxts = tDyxlxxJyxts;
    }

    public Double gettDyxlxxLdxts() {
        return tDyxlxxLdxts;
    }

    public void settDyxlxxLdxts(Double tDyxlxxLdxts) {
        this.tDyxlxxLdxts = tDyxlxxLdxts;
    }

    public Double gettDyxlxxJyxcd() {
        return tDyxlxxJyxcd;
    }

    public void settDyxlxxJyxcd(Double tDyxlxxJyxcd) {
        this.tDyxlxxJyxcd = tDyxlxxJyxcd;
    }

    public Double gettDyxlxxLdxcd() {
        return tDyxlxxLdxcd;
    }

    public void settDyxlxxLdxcd(Double tDyxlxxLdxcd) {
        this.tDyxlxxLdxcd = tDyxlxxLdxcd;
    }

    public String gettDyxlxxBz() {
        return tDyxlxxBz;
    }

    public void settDyxlxxBz(String tDyxlxxBz) {
        this.tDyxlxxBz = tDyxlxxBz;
    }

    public Double gettDyxlxxXlcd() {
        return tDyxlxxXlcd;
    }

    public void settDyxlxxXlcd(Double tDyxlxxXlcd) {
        this.tDyxlxxXlcd = tDyxlxxXlcd;
    }

    public String gettDyxlxxYwdw() {
        return tDyxlxxYwdw;
    }

    public void settDyxlxxYwdw(String tDyxlxxYwdw) {
        this.tDyxlxxYwdw = tDyxlxxYwdw;
    }

    public String gettDyxlxxGqlx() {
        return tDyxlxxGqlx;
    }

    public void settDyxlxxGqlx(String tDyxlxxGqlx) {
        this.tDyxlxxGqlx = tDyxlxxGqlx;
    }

    public String gettDyxlxxDlxh() {
        return tDyxlxxDlxh;
    }

    public void settDyxlxxDlxh(String tDyxlxxDlxh) {
        this.tDyxlxxDlxh = tDyxlxxDlxh;
    }

    public String gettDyxlxxFds() {
        return tDyxlxxFds;
    }

    public void settDyxlxxFds(String tDyxlxxFds) {
        this.tDyxlxxFds = tDyxlxxFds;
    }

    public String gettDyxlxxFdcd() {
        return tDyxlxxFdcd;
    }

    public void settDyxlxxFdcd(String tDyxlxxFdcd) {
        this.tDyxlxxFdcd = tDyxlxxFdcd;
    }

    public String gettDyxlxxFsfs() {
        return tDyxlxxFsfs;
    }

    public void settDyxlxxFsfs(String tDyxlxxFsfs) {
        this.tDyxlxxFsfs = tDyxlxxFsfs;
    }

    @Override
    protected Serializable pkVal() {
        return this.tDyxlxxId;
    }

    @Override
    public String toString() {
        return "TSbsjDyxlxx{" +
        "tDyxlxxId=" + tDyxlxxId +
        ", tDyxlxxNf=" + tDyxlxxNf +
        ", tDyxlxxScqy=" + tDyxlxxScqy +
        ", tDyxlxxXlts=" + tDyxlxxXlts +
        ", tDyxlxxJyxts=" + tDyxlxxJyxts +
        ", tDyxlxxLdxts=" + tDyxlxxLdxts +
        ", tDyxlxxJyxcd=" + tDyxlxxJyxcd +
        ", tDyxlxxLdxcd=" + tDyxlxxLdxcd +
        ", tDyxlxxBz=" + tDyxlxxBz +
        ", tDyxlxxXlcd=" + tDyxlxxXlcd +
        ", tDyxlxxYwdw=" + tDyxlxxYwdw +
        ", tDyxlxxGqlx=" + tDyxlxxGqlx +
        ", tDyxlxxDlxh=" + tDyxlxxDlxh +
        ", tDyxlxxFds=" + tDyxlxxFds +
        ", tDyxlxxFdcd=" + tDyxlxxFdcd +
        ", tDyxlxxFsfs=" + tDyxlxxFsfs +
        "}";
    }
}

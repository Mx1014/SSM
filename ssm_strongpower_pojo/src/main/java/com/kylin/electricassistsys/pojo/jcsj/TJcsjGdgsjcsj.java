package com.kylin.electricassistsys.pojo.jcsj;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 供电公司基础数据
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjGdgsjcsj extends Model<TJcsjGdgsjcsj> {

    private static final long serialVersionUID = 1L;

    private String tGdgsjcsjId;
    /**
     * 年份
     */
    private String tGdgsjcsjTjnf;
    /**
     * 行政面积
     */
    private String tGdgsjcsjXzmj;
    /**
     * 供电面积
     */
    private String tGdgsjcsjGdmj;
    /**
     * 供电人口
     */
    private String tGdgsjcsjGdrk;
    /**
     * 供电分区
     */
    private String tGdgsjcsjGdfq;
    /**
     * 全社会供电量
     */
    private String tGdgsjcsjQshgdl;
    /**
     * 网供电量
     */
    private String tGdgsjcsjWgdl;
    /**
     * 最大负荷
     */
    private String tGdgsjcsjZdfh;
    /**
     * 容载比
     */
    private String tGdgsjcsjRzb;
    /**
     * 售电量
     */
    private String tGdgsjcsjSdl;
    /**
     * 供电可靠率
     */
    private String tGdgsjcsjGdkkl;
    /**
     * 电压合格率
     */
    private String tGdgsjcsjDyhgl;
    /**
     * 线损率
     */
    private String tGdgsjcsjXsl;
    /**
     * 一户一表数
     */
    private String tGdgsjcsjYhybs;
    /**
     * 一户一表率
     */
    private String tGdgsjcsjYhybl;
    /**
     * 供电户数
     */
    private String tGdgsjcsjGdhs;
    /**
     * 变电站座数
     */
    private String tGdgsjcsjBdzzs;
    /**
     * 主变台数
     */
    private String tGdgsjcsjZbts;
    /**
     * 主变容量
     */
    private String tGdgsjcsjZbrl;
    /**
     * 线路回数
     */
    private String tGdgsjcsjXlhs;
    /**
     * 线路长度
     */
    private String tGdgsjcsjXlcd;
    /**
     * 供电公司(运维单位)
     */
    private String tGdgsjcsjYwdw;
    /**
     * 供电公司PID
     */
    private String tGdgsjcsjPid;
    /**
     * 夏季最大负荷
     */
    private String tGdgsjcsjXjzdfh;
    /**
     * 冬季最大负荷
     */
    private String tGdgsjcsjDjzdfh;
    /**
     * 最高气温
     */
    private String tGdgsjcsjZgqw;
    /**
     * 最低气温
     */
    private String tGdgsjcsjZdqw;
    /**
     * 电压等级
     */
    private String tGdgsjcsjDydj;
    /**
     * 低压用户数
     */
    private String tGdgsjcsjDyyhs;
    /**
     * 二级以上用户数
     */
    private String tGdgsjcsjEjysyhs;
    /**
     * 用户年平均故障停电时间（分钟）
     */
    private String tGdgsjcsjGztdsj;
    /**
     * 用户年平均与安排停电时间（分钟）
     */
    private String tGdgsjcsjAptdsj;
    /**
     * 光纤通信长度（km）
     */
    private String tGdgsjcsjGqtxcd;
    /**
     * 光纤通信设备数（套）
     */
    private String tGdgsjcsjGqtxsbs;
    /**
     * 无线公网数
     */
    private String tGdgsjcsjWxgws;
    /**
     * 载波终端数
     */
    private String tGdgsjcsjZbzds;
    /**
     * 无线专网基站数（套）
     */
    private String tGdgsjcsjWxzwjzs;
    /**
     * 无线专网终端数（套）
     */
    private String tGdgsjcsjWxzwzds;


    public String gettGdgsjcsjId() {
        return tGdgsjcsjId;
    }

    public void settGdgsjcsjId(String tGdgsjcsjId) {
        this.tGdgsjcsjId = tGdgsjcsjId;
    }

    public String gettGdgsjcsjTjnf() {
        return tGdgsjcsjTjnf;
    }

    public void settGdgsjcsjTjnf(String tGdgsjcsjTjnf) {
        this.tGdgsjcsjTjnf = tGdgsjcsjTjnf;
    }

    public String gettGdgsjcsjXzmj() {
        return tGdgsjcsjXzmj;
    }

    public void settGdgsjcsjXzmj(String tGdgsjcsjXzmj) {
        this.tGdgsjcsjXzmj = tGdgsjcsjXzmj;
    }

    public String gettGdgsjcsjGdmj() {
        return tGdgsjcsjGdmj;
    }

    public void settGdgsjcsjGdmj(String tGdgsjcsjGdmj) {
        this.tGdgsjcsjGdmj = tGdgsjcsjGdmj;
    }

    public String gettGdgsjcsjGdrk() {
        return tGdgsjcsjGdrk;
    }

    public void settGdgsjcsjGdrk(String tGdgsjcsjGdrk) {
        this.tGdgsjcsjGdrk = tGdgsjcsjGdrk;
    }

    public String gettGdgsjcsjGdfq() {
        return tGdgsjcsjGdfq;
    }

    public void settGdgsjcsjGdfq(String tGdgsjcsjGdfq) {
        this.tGdgsjcsjGdfq = tGdgsjcsjGdfq;
    }

    public String gettGdgsjcsjQshgdl() {
        return tGdgsjcsjQshgdl;
    }

    public void settGdgsjcsjQshgdl(String tGdgsjcsjQshgdl) {
        this.tGdgsjcsjQshgdl = tGdgsjcsjQshgdl;
    }

    public String gettGdgsjcsjWgdl() {
        return tGdgsjcsjWgdl;
    }

    public void settGdgsjcsjWgdl(String tGdgsjcsjWgdl) {
        this.tGdgsjcsjWgdl = tGdgsjcsjWgdl;
    }

    public String gettGdgsjcsjZdfh() {
        return tGdgsjcsjZdfh;
    }

    public void settGdgsjcsjZdfh(String tGdgsjcsjZdfh) {
        this.tGdgsjcsjZdfh = tGdgsjcsjZdfh;
    }

    public String gettGdgsjcsjRzb() {
        return tGdgsjcsjRzb;
    }

    public void settGdgsjcsjRzb(String tGdgsjcsjRzb) {
        this.tGdgsjcsjRzb = tGdgsjcsjRzb;
    }

    public String gettGdgsjcsjSdl() {
        return tGdgsjcsjSdl;
    }

    public void settGdgsjcsjSdl(String tGdgsjcsjSdl) {
        this.tGdgsjcsjSdl = tGdgsjcsjSdl;
    }

    public String gettGdgsjcsjGdkkl() {
        return tGdgsjcsjGdkkl;
    }

    public void settGdgsjcsjGdkkl(String tGdgsjcsjGdkkl) {
        this.tGdgsjcsjGdkkl = tGdgsjcsjGdkkl;
    }

    public String gettGdgsjcsjDyhgl() {
        return tGdgsjcsjDyhgl;
    }

    public void settGdgsjcsjDyhgl(String tGdgsjcsjDyhgl) {
        this.tGdgsjcsjDyhgl = tGdgsjcsjDyhgl;
    }

    public String gettGdgsjcsjXsl() {
        return tGdgsjcsjXsl;
    }

    public void settGdgsjcsjXsl(String tGdgsjcsjXsl) {
        this.tGdgsjcsjXsl = tGdgsjcsjXsl;
    }

    public String gettGdgsjcsjYhybs() {
        return tGdgsjcsjYhybs;
    }

    public void settGdgsjcsjYhybs(String tGdgsjcsjYhybs) {
        this.tGdgsjcsjYhybs = tGdgsjcsjYhybs;
    }

    public String gettGdgsjcsjYhybl() {
        return tGdgsjcsjYhybl;
    }

    public void settGdgsjcsjYhybl(String tGdgsjcsjYhybl) {
        this.tGdgsjcsjYhybl = tGdgsjcsjYhybl;
    }

    public String gettGdgsjcsjGdhs() {
        return tGdgsjcsjGdhs;
    }

    public void settGdgsjcsjGdhs(String tGdgsjcsjGdhs) {
        this.tGdgsjcsjGdhs = tGdgsjcsjGdhs;
    }

    public String gettGdgsjcsjBdzzs() {
        return tGdgsjcsjBdzzs;
    }

    public void settGdgsjcsjBdzzs(String tGdgsjcsjBdzzs) {
        this.tGdgsjcsjBdzzs = tGdgsjcsjBdzzs;
    }

    public String gettGdgsjcsjZbts() {
        return tGdgsjcsjZbts;
    }

    public void settGdgsjcsjZbts(String tGdgsjcsjZbts) {
        this.tGdgsjcsjZbts = tGdgsjcsjZbts;
    }

    public String gettGdgsjcsjZbrl() {
        return tGdgsjcsjZbrl;
    }

    public void settGdgsjcsjZbrl(String tGdgsjcsjZbrl) {
        this.tGdgsjcsjZbrl = tGdgsjcsjZbrl;
    }

    public String gettGdgsjcsjXlhs() {
        return tGdgsjcsjXlhs;
    }

    public void settGdgsjcsjXlhs(String tGdgsjcsjXlhs) {
        this.tGdgsjcsjXlhs = tGdgsjcsjXlhs;
    }

    public String gettGdgsjcsjXlcd() {
        return tGdgsjcsjXlcd;
    }

    public void settGdgsjcsjXlcd(String tGdgsjcsjXlcd) {
        this.tGdgsjcsjXlcd = tGdgsjcsjXlcd;
    }

    public String gettGdgsjcsjYwdw() {
        return tGdgsjcsjYwdw;
    }

    public void settGdgsjcsjYwdw(String tGdgsjcsjYwdw) {
        this.tGdgsjcsjYwdw = tGdgsjcsjYwdw;
    }

    public String gettGdgsjcsjPid() {
        return tGdgsjcsjPid;
    }

    public void settGdgsjcsjPid(String tGdgsjcsjPid) {
        this.tGdgsjcsjPid = tGdgsjcsjPid;
    }

    public String gettGdgsjcsjXjzdfh() {
        return tGdgsjcsjXjzdfh;
    }

    public void settGdgsjcsjXjzdfh(String tGdgsjcsjXjzdfh) {
        this.tGdgsjcsjXjzdfh = tGdgsjcsjXjzdfh;
    }

    public String gettGdgsjcsjDjzdfh() {
        return tGdgsjcsjDjzdfh;
    }

    public void settGdgsjcsjDjzdfh(String tGdgsjcsjDjzdfh) {
        this.tGdgsjcsjDjzdfh = tGdgsjcsjDjzdfh;
    }

    public String gettGdgsjcsjZgqw() {
        return tGdgsjcsjZgqw;
    }

    public void settGdgsjcsjZgqw(String tGdgsjcsjZgqw) {
        this.tGdgsjcsjZgqw = tGdgsjcsjZgqw;
    }

    public String gettGdgsjcsjZdqw() {
        return tGdgsjcsjZdqw;
    }

    public void settGdgsjcsjZdqw(String tGdgsjcsjZdqw) {
        this.tGdgsjcsjZdqw = tGdgsjcsjZdqw;
    }

    public String gettGdgsjcsjDydj() {
        return tGdgsjcsjDydj;
    }

    public void settGdgsjcsjDydj(String tGdgsjcsjDydj) {
        this.tGdgsjcsjDydj = tGdgsjcsjDydj;
    }

    public String gettGdgsjcsjDyyhs() {
        return tGdgsjcsjDyyhs;
    }

    public void settGdgsjcsjDyyhs(String tGdgsjcsjDyyhs) {
        this.tGdgsjcsjDyyhs = tGdgsjcsjDyyhs;
    }

    public String gettGdgsjcsjEjysyhs() {
        return tGdgsjcsjEjysyhs;
    }

    public void settGdgsjcsjEjysyhs(String tGdgsjcsjEjysyhs) {
        this.tGdgsjcsjEjysyhs = tGdgsjcsjEjysyhs;
    }

    public String gettGdgsjcsjGztdsj() {
        return tGdgsjcsjGztdsj;
    }

    public void settGdgsjcsjGztdsj(String tGdgsjcsjGztdsj) {
        this.tGdgsjcsjGztdsj = tGdgsjcsjGztdsj;
    }

    public String gettGdgsjcsjAptdsj() {
        return tGdgsjcsjAptdsj;
    }

    public void settGdgsjcsjAptdsj(String tGdgsjcsjAptdsj) {
        this.tGdgsjcsjAptdsj = tGdgsjcsjAptdsj;
    }

    public String gettGdgsjcsjGqtxcd() {
        return tGdgsjcsjGqtxcd;
    }

    public void settGdgsjcsjGqtxcd(String tGdgsjcsjGqtxcd) {
        this.tGdgsjcsjGqtxcd = tGdgsjcsjGqtxcd;
    }

    public String gettGdgsjcsjGqtxsbs() {
        return tGdgsjcsjGqtxsbs;
    }

    public void settGdgsjcsjGqtxsbs(String tGdgsjcsjGqtxsbs) {
        this.tGdgsjcsjGqtxsbs = tGdgsjcsjGqtxsbs;
    }

    public String gettGdgsjcsjWxgws() {
        return tGdgsjcsjWxgws;
    }

    public void settGdgsjcsjWxgws(String tGdgsjcsjWxgws) {
        this.tGdgsjcsjWxgws = tGdgsjcsjWxgws;
    }

    public String gettGdgsjcsjZbzds() {
        return tGdgsjcsjZbzds;
    }

    public void settGdgsjcsjZbzds(String tGdgsjcsjZbzds) {
        this.tGdgsjcsjZbzds = tGdgsjcsjZbzds;
    }

    public String gettGdgsjcsjWxzwjzs() {
        return tGdgsjcsjWxzwjzs;
    }

    public void settGdgsjcsjWxzwjzs(String tGdgsjcsjWxzwjzs) {
        this.tGdgsjcsjWxzwjzs = tGdgsjcsjWxzwjzs;
    }

    public String gettGdgsjcsjWxzwzds() {
        return tGdgsjcsjWxzwzds;
    }

    public void settGdgsjcsjWxzwzds(String tGdgsjcsjWxzwzds) {
        this.tGdgsjcsjWxzwzds = tGdgsjcsjWxzwzds;
    }

    @Override
    protected Serializable pkVal() {
        return this.tGdgsjcsjId;
    }

    @Override
    public String toString() {
        return "TJcsjGdgsjcsj{" +
        "tGdgsjcsjId=" + tGdgsjcsjId +
        ", tGdgsjcsjTjnf=" + tGdgsjcsjTjnf +
        ", tGdgsjcsjXzmj=" + tGdgsjcsjXzmj +
        ", tGdgsjcsjGdmj=" + tGdgsjcsjGdmj +
        ", tGdgsjcsjGdrk=" + tGdgsjcsjGdrk +
        ", tGdgsjcsjGdfq=" + tGdgsjcsjGdfq +
        ", tGdgsjcsjQshgdl=" + tGdgsjcsjQshgdl +
        ", tGdgsjcsjWgdl=" + tGdgsjcsjWgdl +
        ", tGdgsjcsjZdfh=" + tGdgsjcsjZdfh +
        ", tGdgsjcsjRzb=" + tGdgsjcsjRzb +
        ", tGdgsjcsjSdl=" + tGdgsjcsjSdl +
        ", tGdgsjcsjGdkkl=" + tGdgsjcsjGdkkl +
        ", tGdgsjcsjDyhgl=" + tGdgsjcsjDyhgl +
        ", tGdgsjcsjXsl=" + tGdgsjcsjXsl +
        ", tGdgsjcsjYhybs=" + tGdgsjcsjYhybs +
        ", tGdgsjcsjYhybl=" + tGdgsjcsjYhybl +
        ", tGdgsjcsjGdhs=" + tGdgsjcsjGdhs +
        ", tGdgsjcsjBdzzs=" + tGdgsjcsjBdzzs +
        ", tGdgsjcsjZbts=" + tGdgsjcsjZbts +
        ", tGdgsjcsjZbrl=" + tGdgsjcsjZbrl +
        ", tGdgsjcsjXlhs=" + tGdgsjcsjXlhs +
        ", tGdgsjcsjXlcd=" + tGdgsjcsjXlcd +
        ", tGdgsjcsjYwdw=" + tGdgsjcsjYwdw +
        ", tGdgsjcsjPid=" + tGdgsjcsjPid +
        ", tGdgsjcsjXjzdfh=" + tGdgsjcsjXjzdfh +
        ", tGdgsjcsjDjzdfh=" + tGdgsjcsjDjzdfh +
        ", tGdgsjcsjZgqw=" + tGdgsjcsjZgqw +
        ", tGdgsjcsjZdqw=" + tGdgsjcsjZdqw +
        ", tGdgsjcsjDydj=" + tGdgsjcsjDydj +
        ", tGdgsjcsjDyyhs=" + tGdgsjcsjDyyhs +
        ", tGdgsjcsjEjysyhs=" + tGdgsjcsjEjysyhs +
        ", tGdgsjcsjGztdsj=" + tGdgsjcsjGztdsj +
        ", tGdgsjcsjAptdsj=" + tGdgsjcsjAptdsj +
        ", tGdgsjcsjGqtxcd=" + tGdgsjcsjGqtxcd +
        ", tGdgsjcsjGqtxsbs=" + tGdgsjcsjGqtxsbs +
        ", tGdgsjcsjWxgws=" + tGdgsjcsjWxgws +
        ", tGdgsjcsjZbzds=" + tGdgsjcsjZbzds +
        ", tGdgsjcsjWxzwjzs=" + tGdgsjcsjWxzwjzs +
        ", tGdgsjcsjWxzwzds=" + tGdgsjcsjWxzwzds +
        "}";
    }
}

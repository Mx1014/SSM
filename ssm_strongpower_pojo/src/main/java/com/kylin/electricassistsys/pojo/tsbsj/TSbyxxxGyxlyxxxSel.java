package com.kylin.electricassistsys.pojo.tsbsj;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 高压线路信息列表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSbyxxxGyxlyxxxSel extends Model<TSbyxxxGyxlyxxxSel> {

    private static final long serialVersionUID = 1L;

    private String tGyxlyxxxId;
    private String tGyxlyxxxSjny;
    private Double tGyxlyxxxYg;
    private Double tGyxlyxxxWg;
    private Double tGyxlyxxxZg;
    private Double tGyxlyxxxDl;
    private String tGyxlyxxxZdfhsk;
    private Double tGyxlyxxxFzl;
    private Double tGyxlyxxxZxyg;
    private Double tGyxlyxxxSzgl;
    private Double tGyxlyxxxGlys;
    private String tGyxlyxxxGyxlId;
    private String tGyxlyxxxRemarks;
    /**
     * 电压等级中文
     */
    private String tDycsName;
    /**
     * 供区类型中文
     */
    private String tGqlxName;
    /**
     * 所属区域中文
     */
    private String tGdfqName;
    /**
     * 使用方式中文
     */
    private String tSyfsName;
    /**
     * 城农网中文
     */
    private String tCnwName;
    /**
     *  CT变比中文
     */
    private String tCtbbName;
    /**
     * 导线名称
     */
    private String tDxcsXhmc;
    /**
     * 架设方式中文
     */
    private String tJsfsName;
    /**
     * 运维单位
     */
    private String tSysDwmz;
    /**
     *修改次数
     */
    private String tGyxlxxXgcs;
    /**
     * 电缆型号
     */
    private String tGyxlxxDlxhname;
    /**
     * 敷设方式中文
     */
    private String tFsfsName;

    public String gettDycsName() {
        return tDycsName;
    }
    public void settDycsName(String tDycsName) {
        this.tDycsName = tDycsName;
    }

    public String gettGqlxName() {
        return tGqlxName;
    }

    public void settGqlxName(String tGqlxName) {
        this.tGqlxName = tGqlxName;
    }

    public String gettGdfqName() {
        return tGdfqName;
    }

    public void settGdfqName(String tGdfqName) {
        this.tGdfqName = tGdfqName;
    }

    public String gettSyfsName() {
        return tSyfsName;
    }

    public void settSyfsName(String tSyfsName) {
        this.tSyfsName = tSyfsName;
    }

    public String gettCnwName() {
        return tCnwName;
    }

    public void settCnwName(String tCnwName) {
        this.tCnwName = tCnwName;
    }

    public String gettCtbbName() {
        return tCtbbName;
    }

    public void settCtbbName(String tCtbbName) {
        this.tCtbbName = tCtbbName;
    }

    public String gettDxcsXhmc() {
        return tDxcsXhmc;
    }

    public void settDxcsXhmc(String tDxcsXhmc) {
        this.tDxcsXhmc = tDxcsXhmc;
    }

    public String gettJsfsName() {
        return tJsfsName;
    }

    public void settJsfsName(String tJsfsName) {
        this.tJsfsName = tJsfsName;
    }

    public String gettSysDwmz() {
        return tSysDwmz;
    }

    public void settSysDwmz(String tSysDwmz) {
        this.tSysDwmz = tSysDwmz;
    }

    public String gettGyxlxxXgcs() {
        return tGyxlxxXgcs;
    }

    public void settGyxlxxXgcs(String tGyxlxxXgcs) {
        this.tGyxlxxXgcs = tGyxlxxXgcs;
    }

    public String gettGyxlxxDlxhname() {
        return tGyxlxxDlxhname;
    }

    public void settGyxlxxDlxhname(String tGyxlxxDlxhname) {
        this.tGyxlxxDlxhname = tGyxlxxDlxhname;
    }

    public String gettFsfsName() {
        return tFsfsName;
    }

    public void settFsfsName(String tFsfsName) {
        this.tFsfsName = tFsfsName;
    }

    public String gettGyxlyxxxId() {
        return tGyxlyxxxId;
    }

    public void settGyxlyxxxId(String tGyxlyxxxId) {
        this.tGyxlyxxxId = tGyxlyxxxId;
    }

    public String gettGyxlyxxxSjny() {
        return tGyxlyxxxSjny;
    }

    public void settGyxlyxxxSjny(String tGyxlyxxxSjny) {
        this.tGyxlyxxxSjny = tGyxlyxxxSjny;
    }

    public Double gettGyxlyxxxYg() {
        return tGyxlyxxxYg;
    }

    public void settGyxlyxxxYg(Double tGyxlyxxxYg) {
        this.tGyxlyxxxYg = tGyxlyxxxYg;
    }

    public Double gettGyxlyxxxWg() {
        return tGyxlyxxxWg;
    }

    public void settGyxlyxxxWg(Double tGyxlyxxxWg) {
        this.tGyxlyxxxWg = tGyxlyxxxWg;
    }

    public Double gettGyxlyxxxZg() {
        return tGyxlyxxxZg;
    }

    public void settGyxlyxxxZg(Double tGyxlyxxxZg) {
        this.tGyxlyxxxZg = tGyxlyxxxZg;
    }

    public Double gettGyxlyxxxDl() {
        return tGyxlyxxxDl;
    }

    public void settGyxlyxxxDl(Double tGyxlyxxxDl) {
        this.tGyxlyxxxDl = tGyxlyxxxDl;
    }

    public String gettGyxlyxxxZdfhsk() {
        return tGyxlyxxxZdfhsk;
    }

    public void settGyxlyxxxZdfhsk(String tGyxlyxxxZdfhsk) {
        this.tGyxlyxxxZdfhsk = tGyxlyxxxZdfhsk;
    }

    public Double gettGyxlyxxxFzl() {
        return tGyxlyxxxFzl;
    }

    public void settGyxlyxxxFzl(Double tGyxlyxxxFzl) {
        this.tGyxlyxxxFzl = tGyxlyxxxFzl;
    }

    public Double gettGyxlyxxxZxyg() {
        return tGyxlyxxxZxyg;
    }

    public void settGyxlyxxxZxyg(Double tGyxlyxxxZxyg) {
        this.tGyxlyxxxZxyg = tGyxlyxxxZxyg;
    }

    public Double gettGyxlyxxxSzgl() {
        return tGyxlyxxxSzgl;
    }

    public void settGyxlyxxxSzgl(Double tGyxlyxxxSzgl) {
        this.tGyxlyxxxSzgl = tGyxlyxxxSzgl;
    }

    public Double gettGyxlyxxxGlys() {
        return tGyxlyxxxGlys;
    }

    public void settGyxlyxxxGlys(Double tGyxlyxxxGlys) {
        this.tGyxlyxxxGlys = tGyxlyxxxGlys;
    }

    public String gettGyxlyxxxGyxlId() {
        return tGyxlyxxxGyxlId;
    }

    public void settGyxlyxxxGyxlId(String tGyxlyxxxGyxlId) {
        this.tGyxlyxxxGyxlId = tGyxlyxxxGyxlId;
    }

    public String gettGyxlyxxxRemarks() {
        return tGyxlyxxxRemarks;
    }

    public void settGyxlyxxxRemarks(String tGyxlyxxxRemarks) {
        this.tGyxlyxxxRemarks = tGyxlyxxxRemarks;
    }

    @Override
    protected Serializable pkVal() {
        return this.tGyxlyxxxId;
    }

    @Override
    public String toString() {
        return "TSbyxxxGyxlyxxx{" +
        "tGyxlyxxxId=" + tGyxlyxxxId +
        ", tGyxlyxxxSjny=" + tGyxlyxxxSjny +
        ", tGyxlyxxxYg=" + tGyxlyxxxYg +
        ", tGyxlyxxxWg=" + tGyxlyxxxWg +
        ", tGyxlyxxxZg=" + tGyxlyxxxZg +
        ", tGyxlyxxxDl=" + tGyxlyxxxDl +
        ", tGyxlyxxxZdfhsk=" + tGyxlyxxxZdfhsk +
        ", tGyxlyxxxFzl=" + tGyxlyxxxFzl +
        ", tGyxlyxxxZxyg=" + tGyxlyxxxZxyg +
        ", tGyxlyxxxSzgl=" + tGyxlyxxxSzgl +
        ", tGyxlyxxxGlys=" + tGyxlyxxxGlys +
        ", tGyxlyxxxGyxlId=" + tGyxlyxxxGyxlId +
        ", tGyxlyxxxRemarks=" + tGyxlyxxxRemarks +
        "}";
    }
}

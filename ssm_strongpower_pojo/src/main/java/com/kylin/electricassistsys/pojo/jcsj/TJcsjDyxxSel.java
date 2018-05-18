package com.kylin.electricassistsys.pojo.jcsj;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjDyxxSel extends Model<TJcsjDyxxSel> {

    private static final long serialVersionUID = 1L;
    @TableId("T_DYXX_ID")
    private String tDyxxId;
    private String tDyxxDcmc;
    private String tDyxxDybj;
    private String tDyxxQyid;
    private String tDyxxDydj;
    private String tDyxxGqlx;
    private String tDyxxDclx;
    private String tDyxxCydl;
    private String tDyxxTcsj;
    private String tDyxxTssx;
    private String tDyxxZjmx;
    private String tDyxxNfdl;
    private String tDyxxLyxss;
    private String tDyxxFqcl;
    private String tDyxxKqcl;
    private String tDyxxBtysj;
    private String tDyxxEtysj;
    private String tDyxxYxzt;
    private String tDyxxRemark;

    /*自定义属性开始*/
    /**
     * 供区类型名称
     */
    private String tGqlxName;
    /**
     * 供电分区名称
     */
    private String tGdfqName;
    /**
     * 电压参数名称
     */
    private String tDycsName;
    /**
     * 电源类型名称
     */
    private String tDylxName;

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

    public String gettDycsName() {
        return tDycsName;
    }

    public void settDycsName(String tDycsName) {
        this.tDycsName = tDycsName;
    }

    public String gettDylxName() {
        return tDylxName;
    }

    public void settDylxName(String tDylxName) {
        this.tDylxName = tDylxName;
    }/*自定义属性结束*/


    public String gettDyxxId() {
        return tDyxxId;
    }

    public void settDyxxId(String tDyxxId) {
        this.tDyxxId = tDyxxId;
    }

    public String gettDyxxDcmc() {
        return tDyxxDcmc;
    }

    public void settDyxxDcmc(String tDyxxDcmc) {
        this.tDyxxDcmc = tDyxxDcmc;
    }

    public String gettDyxxDybj() {
        return tDyxxDybj;
    }

    public void settDyxxDybj(String tDyxxDybj) {
        this.tDyxxDybj = tDyxxDybj;
    }

    public String gettDyxxQyid() {
        return tDyxxQyid;
    }

    public void settDyxxQyid(String tDyxxQyid) {
        this.tDyxxQyid = tDyxxQyid;
    }

    public String gettDyxxDydj() {
        return tDyxxDydj;
    }

    public void settDyxxDydj(String tDyxxDydj) {
        this.tDyxxDydj = tDyxxDydj;
    }

    public String gettDyxxGqlx() {
        return tDyxxGqlx;
    }

    public void settDyxxGqlx(String tDyxxGqlx) {
        this.tDyxxGqlx = tDyxxGqlx;
    }

    public String gettDyxxDclx() {
        return tDyxxDclx;
    }

    public void settDyxxDclx(String tDyxxDclx) {
        this.tDyxxDclx = tDyxxDclx;
    }

    public String gettDyxxCydl() {
        return tDyxxCydl;
    }

    public void settDyxxCydl(String tDyxxCydl) {
        this.tDyxxCydl = tDyxxCydl;
    }

    public String gettDyxxTcsj() {
        return tDyxxTcsj;
    }

    public void settDyxxTcsj(String tDyxxTcsj) {
        this.tDyxxTcsj = tDyxxTcsj;
    }

    public String gettDyxxTssx() {
        return tDyxxTssx;
    }

    public void settDyxxTssx(String tDyxxTssx) {
        this.tDyxxTssx = tDyxxTssx;
    }

    public String gettDyxxZjmx() {
        return tDyxxZjmx;
    }

    public void settDyxxZjmx(String tDyxxZjmx) {
        this.tDyxxZjmx = tDyxxZjmx;
    }

    public String gettDyxxNfdl() {
        return tDyxxNfdl;
    }

    public void settDyxxNfdl(String tDyxxNfdl) {
        this.tDyxxNfdl = tDyxxNfdl;
    }

    public String gettDyxxLyxss() {
        return tDyxxLyxss;
    }

    public void settDyxxLyxss(String tDyxxLyxss) {
        this.tDyxxLyxss = tDyxxLyxss;
    }

    public String gettDyxxFqcl() {
        return tDyxxFqcl;
    }

    public void settDyxxFqcl(String tDyxxFqcl) {
        this.tDyxxFqcl = tDyxxFqcl;
    }

    public String gettDyxxKqcl() {
        return tDyxxKqcl;
    }

    public void settDyxxKqcl(String tDyxxKqcl) {
        this.tDyxxKqcl = tDyxxKqcl;
    }

    public String gettDyxxBtysj() {
        return tDyxxBtysj;
    }

    public void settDyxxBtysj(String tDyxxBtysj) {
        this.tDyxxBtysj = tDyxxBtysj;
    }

    public String gettDyxxEtysj() {
        return tDyxxEtysj;
    }

    public void settDyxxEtysj(String tDyxxEtysj) {
        this.tDyxxEtysj = tDyxxEtysj;
    }

    public String gettDyxxYxzt() {
        return tDyxxYxzt;
    }

    public void settDyxxYxzt(String tDyxxYxzt) {
        this.tDyxxYxzt = tDyxxYxzt;
    }

    public String gettDyxxRemark() {
        return tDyxxRemark;
    }

    public void settDyxxRemark(String tDyxxRemark) {
        this.tDyxxRemark = tDyxxRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tDyxxId;
    }

    @Override
    public String toString() {
        return "TJcsjDyxx{" +
                "tDyxxId=" + tDyxxId +
                ", tDyxxDcmc=" + tDyxxDcmc +
                ", tDyxxDybj=" + tDyxxDybj +
                ", tDyxxQyid=" + tDyxxQyid +
                ", tDyxxDydj=" + tDyxxDydj +
                ", tDyxxGqlx=" + tDyxxGqlx +
                ", tDyxxDclx=" + tDyxxDclx +
                ", tDyxxCydl=" + tDyxxCydl +
                ", tDyxxTcsj=" + tDyxxTcsj +
                ", tDyxxTssx=" + tDyxxTssx +
                ", tDyxxZjmx=" + tDyxxZjmx +
                ", tDyxxNfdl=" + tDyxxNfdl +
                ", tDyxxLyxss=" + tDyxxLyxss +
                ", tDyxxFqcl=" + tDyxxFqcl +
                ", tDyxxKqcl=" + tDyxxKqcl +
                ", tDyxxBtysj=" + tDyxxBtysj +
                ", tDyxxEtysj=" + tDyxxEtysj +
                ", tDyxxYxzt=" + tDyxxYxzt +
                ", tDyxxRemark=" + tDyxxRemark +
                "}";
    }
}

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
public class TJcsjDqgkxxSel extends Model<TJcsjDqgkxxSel> {

    private static final long serialVersionUID = 1L;
    @TableId("T_DQGKXX_ID")
    private String tDqgkxxId;
    private String tDqgkxxYear;
    private String tDqgkxxQyid;
    private String tDqgkxxGqlx;
    private String tDqgkxxNpjqw;
    private String tDqgkxxPjzgqw;
    private String tDqgkxxPjzdqw;
    private String tDqgkxxJd;
    private String tDqgkxxWd;
    private String tDqgkxxCsrk;
    private String tDqgkxxNcrk;
    private String tDqgkxxTdmj;
    private String tDqgkxxNmzrk;
    private String tDqgkxxJcqmj;
    private String tDqgkxxRkmd;

    /**
     * 供区类型
     */
    private String tGqlxName;
    /**
     * 供电分区
     */
    private String tGdfqName;

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


    public String gettDqgkxxId() {
        return tDqgkxxId;
    }

    public void settDqgkxxId(String tDqgkxxId) {
        this.tDqgkxxId = tDqgkxxId;
    }

    public String gettDqgkxxYear() {
        return tDqgkxxYear;
    }

    public void settDqgkxxYear(String tDqgkxxYear) {
        this.tDqgkxxYear = tDqgkxxYear;
    }

    public String gettDqgkxxQyid() {
        return tDqgkxxQyid;
    }

    public void settDqgkxxQyid(String tDqgkxxQyid) {
        this.tDqgkxxQyid = tDqgkxxQyid;
    }

    public String gettDqgkxxGqlx() {
        return tDqgkxxGqlx;
    }

    public void settDqgkxxGqlx(String tDqgkxxGqlx) {
        this.tDqgkxxGqlx = tDqgkxxGqlx;
    }

    public String gettDqgkxxNpjqw() {
        return tDqgkxxNpjqw;
    }

    public void settDqgkxxNpjqw(String tDqgkxxNpjqw) {
        this.tDqgkxxNpjqw = tDqgkxxNpjqw;
    }

    public String gettDqgkxxPjzgqw() {
        return tDqgkxxPjzgqw;
    }

    public void settDqgkxxPjzgqw(String tDqgkxxPjzgqw) {
        this.tDqgkxxPjzgqw = tDqgkxxPjzgqw;
    }

    public String gettDqgkxxPjzdqw() {
        return tDqgkxxPjzdqw;
    }

    public void settDqgkxxPjzdqw(String tDqgkxxPjzdqw) {
        this.tDqgkxxPjzdqw = tDqgkxxPjzdqw;
    }

    public String gettDqgkxxJd() {
        return tDqgkxxJd;
    }

    public void settDqgkxxJd(String tDqgkxxJd) {
        this.tDqgkxxJd = tDqgkxxJd;
    }

    public String gettDqgkxxWd() {
        return tDqgkxxWd;
    }

    public void settDqgkxxWd(String tDqgkxxWd) {
        this.tDqgkxxWd = tDqgkxxWd;
    }

    public String gettDqgkxxCsrk() {
        return tDqgkxxCsrk;
    }

    public void settDqgkxxCsrk(String tDqgkxxCsrk) {
        this.tDqgkxxCsrk = tDqgkxxCsrk;
    }

    public String gettDqgkxxNcrk() {
        return tDqgkxxNcrk;
    }

    public void settDqgkxxNcrk(String tDqgkxxNcrk) {
        this.tDqgkxxNcrk = tDqgkxxNcrk;
    }

    public String gettDqgkxxTdmj() {
        return tDqgkxxTdmj;
    }

    public void settDqgkxxTdmj(String tDqgkxxTdmj) {
        this.tDqgkxxTdmj = tDqgkxxTdmj;
    }

    public String gettDqgkxxNmzrk() {
        return tDqgkxxNmzrk;
    }

    public void settDqgkxxNmzrk(String tDqgkxxNmzrk) {
        this.tDqgkxxNmzrk = tDqgkxxNmzrk;
    }

    public String gettDqgkxxJcqmj() {
        return tDqgkxxJcqmj;
    }

    public void settDqgkxxJcqmj(String tDqgkxxJcqmj) {
        this.tDqgkxxJcqmj = tDqgkxxJcqmj;
    }

    public String gettDqgkxxRkmd() {
        return tDqgkxxRkmd;
    }

    public void settDqgkxxRkmd(String tDqgkxxRkmd) {
        this.tDqgkxxRkmd = tDqgkxxRkmd;
    }

    @Override
    protected Serializable pkVal() {
        return this.tDqgkxxId;
    }

    @Override
    public String toString() {
        return "TJcsjDqgkxx{" +
        "tDqgkxxId=" + tDqgkxxId +
        ", tDqgkxxYear=" + tDqgkxxYear +
        ", tDqgkxxQyid=" + tDqgkxxQyid +
        ", tDqgkxxGqlx=" + tDqgkxxGqlx +
        ", tDqgkxxNpjqw=" + tDqgkxxNpjqw +
        ", tDqgkxxPjzgqw=" + tDqgkxxPjzgqw +
        ", tDqgkxxPjzdqw=" + tDqgkxxPjzdqw +
        ", tDqgkxxJd=" + tDqgkxxJd +
        ", tDqgkxxWd=" + tDqgkxxWd +
        ", tDqgkxxCsrk=" + tDqgkxxCsrk +
        ", tDqgkxxNcrk=" + tDqgkxxNcrk +
        ", tDqgkxxTdmj=" + tDqgkxxTdmj +
        ", tDqgkxxNmzrk=" + tDqgkxxNmzrk +
        ", tDqgkxxJcqmj=" + tDqgkxxJcqmj +
        ", tDqgkxxRkmd=" + tDqgkxxRkmd +
        "}";
    }
}

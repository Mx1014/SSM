package com.kylin.electricassistsys.pojo.ghdg;

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
public class TGhdgJmfbSel extends Model<TGhdgJmfbSel> {

    private static final long serialVersionUID = 1L;

    private String tJmfbId;
    private String tJmfbType;
    private String tJmfbDydj;
    private String tJmfbJkxlcd240;
    private String tJmfbJkxlcd185;
    private String tJmfbJkxlcd150;
    private String tJmfbJkxlcd120;
    private String tJmfbJkxlcd95;
    private String tJmfbJkxlcd70;
    private String tJmfbDlxlcd400;
    private String tJmfbDlxlcd300;
    private String tJmfbDlxlcd240;
    private String tJmfbDlxlcd185;
    /**
     * 供区类型中文
     */
    private String tGqlxName;

    public String gettGqlxName() {
        return tGqlxName;
    }

    public void settGqlxName(String tGqlxName) {
        this.tGqlxName = tGqlxName;
    }

    public String gettJmfbId() {
        return tJmfbId;
    }

    public void settJmfbId(String tJmfbId) {
        this.tJmfbId = tJmfbId;
    }

    public String gettJmfbType() {
        return tJmfbType;
    }

    public void settJmfbType(String tJmfbType) {
        this.tJmfbType = tJmfbType;
    }

    public String gettJmfbDydj() {
        return tJmfbDydj;
    }

    public void settJmfbDydj(String tJmfbDydj) {
        this.tJmfbDydj = tJmfbDydj;
    }

    public String gettJmfbJkxlcd240() {
        return tJmfbJkxlcd240;
    }

    public void settJmfbJkxlcd240(String tJmfbJkxlcd240) {
        this.tJmfbJkxlcd240 = tJmfbJkxlcd240;
    }

    public String gettJmfbJkxlcd185() {
        return tJmfbJkxlcd185;
    }

    public void settJmfbJkxlcd185(String tJmfbJkxlcd185) {
        this.tJmfbJkxlcd185 = tJmfbJkxlcd185;
    }

    public String gettJmfbJkxlcd150() {
        return tJmfbJkxlcd150;
    }

    public void settJmfbJkxlcd150(String tJmfbJkxlcd150) {
        this.tJmfbJkxlcd150 = tJmfbJkxlcd150;
    }

    public String gettJmfbJkxlcd120() {
        return tJmfbJkxlcd120;
    }

    public void settJmfbJkxlcd120(String tJmfbJkxlcd120) {
        this.tJmfbJkxlcd120 = tJmfbJkxlcd120;
    }

    public String gettJmfbJkxlcd95() {
        return tJmfbJkxlcd95;
    }

    public void settJmfbJkxlcd95(String tJmfbJkxlcd95) {
        this.tJmfbJkxlcd95 = tJmfbJkxlcd95;
    }

    public String gettJmfbJkxlcd70() {
        return tJmfbJkxlcd70;
    }

    public void settJmfbJkxlcd70(String tJmfbJkxlcd70) {
        this.tJmfbJkxlcd70 = tJmfbJkxlcd70;
    }

    public String gettJmfbDlxlcd400() {
        return tJmfbDlxlcd400;
    }

    public void settJmfbDlxlcd400(String tJmfbDlxlcd400) {
        this.tJmfbDlxlcd400 = tJmfbDlxlcd400;
    }

    public String gettJmfbDlxlcd300() {
        return tJmfbDlxlcd300;
    }

    public void settJmfbDlxlcd300(String tJmfbDlxlcd300) {
        this.tJmfbDlxlcd300 = tJmfbDlxlcd300;
    }

    public String gettJmfbDlxlcd240() {
        return tJmfbDlxlcd240;
    }

    public void settJmfbDlxlcd240(String tJmfbDlxlcd240) {
        this.tJmfbDlxlcd240 = tJmfbDlxlcd240;
    }

    public String gettJmfbDlxlcd185() {
        return tJmfbDlxlcd185;
    }

    public void settJmfbDlxlcd185(String tJmfbDlxlcd185) {
        this.tJmfbDlxlcd185 = tJmfbDlxlcd185;
    }

    @Override
    protected Serializable pkVal() {
        return this.tJmfbId;
    }

    @Override
    public String toString() {
        return "TGhdgJmfb{" +
                "tJmfbId=" + tJmfbId +
                ", tJmfbType=" + tJmfbType +
                ", tJmfbDydj=" + tJmfbDydj +
                ", tJmfbJkxlcd240=" + tJmfbJkxlcd240 +
                ", tJmfbJkxlcd185=" + tJmfbJkxlcd185 +
                ", tJmfbJkxlcd150=" + tJmfbJkxlcd150 +
                ", tJmfbJkxlcd120=" + tJmfbJkxlcd120 +
                ", tJmfbJkxlcd95=" + tJmfbJkxlcd95 +
                ", tJmfbJkxlcd70=" + tJmfbJkxlcd70 +
                ", tJmfbDlxlcd400=" + tJmfbDlxlcd400 +
                ", tJmfbDlxlcd300=" + tJmfbDlxlcd300 +
                ", tJmfbDlxlcd240=" + tJmfbDlxlcd240 +
                ", tJmfbDlxlcd185=" + tJmfbDlxlcd185 +
                "}";
    }
}

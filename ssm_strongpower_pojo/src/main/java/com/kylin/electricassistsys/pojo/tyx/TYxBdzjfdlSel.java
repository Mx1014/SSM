package com.kylin.electricassistsys.pojo.tyx;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 变电站运行数据表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TYxBdzjfdlSel extends Model<TYxBdzjfdlSel> {

    private static final long serialVersionUID = 1L;
    private String tJfdlId;
    private String tJfdlBdzid;
    private String tJfdlZongzhi;
    private String tJfdlZhengzhi;
    private String tJfdlFuzhi;
    private String tJfdlData;
    private Double tJfdlTqjg;
    private String tJfdlOpensbid;
    private String tJfdlType;
    /**
     * 變電站名称
     */
    private String tBdzxxName;

    public String gettBdzxxName() {
        return tBdzxxName;
    }

    public void settBdzxxName(String tBdzxxName) {
        this.tBdzxxName = tBdzxxName;
    }

    public String gettJfdlId() {
        return tJfdlId;
    }

    public void settJfdlId(String tJfdlId) {
        this.tJfdlId = tJfdlId;
    }

    public String gettJfdlBdzid() {
        return tJfdlBdzid;
    }

    public void settJfdlBdzid(String tJfdlBdzid) {
        this.tJfdlBdzid = tJfdlBdzid;
    }

    public String gettJfdlZongzhi() {
        return tJfdlZongzhi;
    }

    public void settJfdlZongzhi(String tJfdlZongzhi) {
        this.tJfdlZongzhi = tJfdlZongzhi;
    }

    public String gettJfdlZhengzhi() {
        return tJfdlZhengzhi;
    }

    public void settJfdlZhengzhi(String tJfdlZhengzhi) {
        this.tJfdlZhengzhi = tJfdlZhengzhi;
    }

    public String gettJfdlFuzhi() {
        return tJfdlFuzhi;
    }

    public void settJfdlFuzhi(String tJfdlFuzhi) {
        this.tJfdlFuzhi = tJfdlFuzhi;
    }

    public String gettJfdlData() {
        return tJfdlData;
    }

    public void settJfdlData(String tJfdlData) {
        this.tJfdlData = tJfdlData;
    }

    public Double gettJfdlTqjg() {
        return tJfdlTqjg;
    }

    public void settJfdlTqjg(Double tJfdlTqjg) {
        this.tJfdlTqjg = tJfdlTqjg;
    }

    public String gettJfdlOpensbid() {
        return tJfdlOpensbid;
    }

    public void settJfdlOpensbid(String tJfdlOpensbid) {
        this.tJfdlOpensbid = tJfdlOpensbid;
    }

    public String gettJfdlType() {
        return tJfdlType;
    }

    public void settJfdlType(String tJfdlType) {
        this.tJfdlType = tJfdlType;
    }

    @Override
    protected Serializable pkVal() {
        return this.tJfdlId;
    }

    @Override
    public String toString() {
        return "TYxBdzjfdl{" +
        "tJfdlId=" + tJfdlId +
        ", tJfdlBdzid=" + tJfdlBdzid +
        ", tJfdlZongzhi=" + tJfdlZongzhi +
        ", tJfdlZhengzhi=" + tJfdlZhengzhi +
        ", tJfdlFuzhi=" + tJfdlFuzhi +
        ", tJfdlData=" + tJfdlData +
        ", tJfdlTqjg=" + tJfdlTqjg +
        ", tJfdlOpensbid=" + tJfdlOpensbid +
        ", tJfdlType=" + tJfdlType +
        "}";
    }
}

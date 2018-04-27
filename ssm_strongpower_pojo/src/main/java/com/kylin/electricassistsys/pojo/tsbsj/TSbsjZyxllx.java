package com.kylin.electricassistsys.pojo.tsbsj;

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
public class TSbsjZyxllx extends Model<TSbsjZyxllx> {

    private static final long serialVersionUID = 1L;

    private String tZyxllxId;
    private String tZyxllxBid;
    private String tZyxllxEid;


    public String gettZyxllxId() {
        return tZyxllxId;
    }

    public void settZyxllxId(String tZyxllxId) {
        this.tZyxllxId = tZyxllxId;
    }

    public String gettZyxllxBid() {
        return tZyxllxBid;
    }

    public void settZyxllxBid(String tZyxllxBid) {
        this.tZyxllxBid = tZyxllxBid;
    }

    public String gettZyxllxEid() {
        return tZyxllxEid;
    }

    public void settZyxllxEid(String tZyxllxEid) {
        this.tZyxllxEid = tZyxllxEid;
    }

    @Override
    protected Serializable pkVal() {
        return this.tZyxllxId;
    }

    @Override
    public String toString() {
        return "TSbsjZyxllx{" +
        "tZyxllxId=" + tZyxllxId +
        ", tZyxllxBid=" + tZyxllxBid +
        ", tZyxllxEid=" + tZyxllxEid +
        "}";
    }
}

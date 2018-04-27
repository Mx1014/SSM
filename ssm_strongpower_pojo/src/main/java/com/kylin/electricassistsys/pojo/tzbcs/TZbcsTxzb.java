package com.kylin.electricassistsys.pojo.tzbcs;

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
public class TZbcsTxzb extends Model<TZbcsTxzb> {

    private static final long serialVersionUID = 1L;

    private String tTxzbId;
    private String tTxzbGqlx;
    private String tTxzbGx;
    private String tTxzbZb;
    private String tTxzbWx;


    public String gettTxzbId() {
        return tTxzbId;
    }

    public void settTxzbId(String tTxzbId) {
        this.tTxzbId = tTxzbId;
    }

    public String gettTxzbGqlx() {
        return tTxzbGqlx;
    }

    public void settTxzbGqlx(String tTxzbGqlx) {
        this.tTxzbGqlx = tTxzbGqlx;
    }

    public String gettTxzbGx() {
        return tTxzbGx;
    }

    public void settTxzbGx(String tTxzbGx) {
        this.tTxzbGx = tTxzbGx;
    }

    public String gettTxzbZb() {
        return tTxzbZb;
    }

    public void settTxzbZb(String tTxzbZb) {
        this.tTxzbZb = tTxzbZb;
    }

    public String gettTxzbWx() {
        return tTxzbWx;
    }

    public void settTxzbWx(String tTxzbWx) {
        this.tTxzbWx = tTxzbWx;
    }

    @Override
    protected Serializable pkVal() {
        return this.tTxzbId;
    }

    @Override
    public String toString() {
        return "TZbcsTxzb{" +
        "tTxzbId=" + tTxzbId +
        ", tTxzbGqlx=" + tTxzbGqlx +
        ", tTxzbGx=" + tTxzbGx +
        ", tTxzbZb=" + tTxzbZb +
        ", tTxzbWx=" + tTxzbWx +
        "}";
    }
}

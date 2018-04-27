package com.kylin.electricassistsys.pojo.tbbcx;

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
public class TXs extends Model<TXs> {

    private static final long serialVersionUID = 1L;

    private String tId;
    private String tName;
    private String tXs;


    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettXs() {
        return tXs;
    }

    public void settXs(String tXs) {
        this.tXs = tXs;
    }

    @Override
    protected Serializable pkVal() {
        return this.tId;
    }

    @Override
    public String toString() {
        return "TXs{" +
        "tId=" + tId +
        ", tName=" + tName +
        ", tXs=" + tXs +
        "}";
    }
}

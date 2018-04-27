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
public class TSbsjSblx extends Model<TSbsjSblx> {

    private static final long serialVersionUID = 1L;

    private String tSblxId;
    private String tSblxName;
    private String tSblxBh;


    public String gettSblxId() {
        return tSblxId;
    }

    public void settSblxId(String tSblxId) {
        this.tSblxId = tSblxId;
    }

    public String gettSblxName() {
        return tSblxName;
    }

    public void settSblxName(String tSblxName) {
        this.tSblxName = tSblxName;
    }

    public String gettSblxBh() {
        return tSblxBh;
    }

    public void settSblxBh(String tSblxBh) {
        this.tSblxBh = tSblxBh;
    }

    @Override
    protected Serializable pkVal() {
        return this.tSblxId;
    }

    @Override
    public String toString() {
        return "TSbsjSblx{" +
        "tSblxId=" + tSblxId +
        ", tSblxName=" + tSblxName +
        ", tSblxBh=" + tSblxBh +
        "}";
    }
}

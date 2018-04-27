package com.kylin.electricassistsys.pojo.jcsj;

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
public class TJcsjDylx extends Model<TJcsjDylx> {

    private static final long serialVersionUID = 1L;

    private String tDylxId;
    private String tDylxName;
    private String tDylxRemark;


    public String gettDylxId() {
        return tDylxId;
    }

    public void settDylxId(String tDylxId) {
        this.tDylxId = tDylxId;
    }

    public String gettDylxName() {
        return tDylxName;
    }

    public void settDylxName(String tDylxName) {
        this.tDylxName = tDylxName;
    }

    public String gettDylxRemark() {
        return tDylxRemark;
    }

    public void settDylxRemark(String tDylxRemark) {
        this.tDylxRemark = tDylxRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tDylxId;
    }

    @Override
    public String toString() {
        return "TJcsjDylx{" +
        "tDylxId=" + tDylxId +
        ", tDylxName=" + tDylxName +
        ", tDylxRemark=" + tDylxRemark +
        "}";
    }
}

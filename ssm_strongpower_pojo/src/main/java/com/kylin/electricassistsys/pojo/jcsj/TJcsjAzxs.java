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
public class TJcsjAzxs extends Model<TJcsjAzxs> {

    private static final long serialVersionUID = 1L;

    private String tAzxsId;
    private String tAzxsName;
    private String tAzxsRemark;


    public String gettAzxsId() {
        return tAzxsId;
    }

    public void settAzxsId(String tAzxsId) {
        this.tAzxsId = tAzxsId;
    }

    public String gettAzxsName() {
        return tAzxsName;
    }

    public void settAzxsName(String tAzxsName) {
        this.tAzxsName = tAzxsName;
    }

    public String gettAzxsRemark() {
        return tAzxsRemark;
    }

    public void settAzxsRemark(String tAzxsRemark) {
        this.tAzxsRemark = tAzxsRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tAzxsId;
    }

    @Override
    public String toString() {
        return "TJcsjAzxs{" +
        "tAzxsId=" + tAzxsId +
        ", tAzxsName=" + tAzxsName +
        ", tAzxsRemark=" + tAzxsRemark +
        "}";
    }
}

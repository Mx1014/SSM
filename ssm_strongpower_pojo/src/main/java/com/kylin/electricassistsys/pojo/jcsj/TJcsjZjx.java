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
public class TJcsjZjx extends Model<TJcsjZjx> {

    private static final long serialVersionUID = 1L;
    @TableId("t_ZJX_ID")
    private String tZjxId;
    private String tZjxName;
    private String tZjxRemark;


    public String gettZjxId() {
        return tZjxId;
    }

    public void settZjxId(String tZjxId) {
        this.tZjxId = tZjxId;
    }

    public String gettZjxName() {
        return tZjxName;
    }

    public void settZjxName(String tZjxName) {
        this.tZjxName = tZjxName;
    }

    public String gettZjxRemark() {
        return tZjxRemark;
    }

    public void settZjxRemark(String tZjxRemark) {
        this.tZjxRemark = tZjxRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tZjxId;
    }

    @Override
    public String toString() {
        return "TJcsjZjx{" +
        "tZjxId=" + tZjxId +
        ", tZjxName=" + tZjxName +
        ", tZjxRemark=" + tZjxRemark +
        "}";
    }
}

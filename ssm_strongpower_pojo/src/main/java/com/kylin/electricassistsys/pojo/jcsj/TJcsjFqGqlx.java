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
public class TJcsjFqGqlx extends Model<TJcsjFqGqlx> {

    private static final long serialVersionUID = 1L;
    @TableId("T_GQLX_ID")
    private String tGqlxId;
    private String tGqlxName;
    private String tGqlxBianhao;
    private String tGqlxRemark;


    public String gettGqlxId() {
        return tGqlxId;
    }

    public void settGqlxId(String tGqlxId) {
        this.tGqlxId = tGqlxId;
    }

    public String gettGqlxName() {
        return tGqlxName;
    }

    public void settGqlxName(String tGqlxName) {
        this.tGqlxName = tGqlxName;
    }

    public String gettGqlxBianhao() {
        return tGqlxBianhao;
    }

    public void settGqlxBianhao(String tGqlxBianhao) {
        this.tGqlxBianhao = tGqlxBianhao;
    }

    public String gettGqlxRemark() {
        return tGqlxRemark;
    }

    public void settGqlxRemark(String tGqlxRemark) {
        this.tGqlxRemark = tGqlxRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tGqlxId;
    }

    @Override
    public String toString() {
        return "TJcsjFqGqlx{" +
        "tGqlxId=" + tGqlxId +
        ", tGqlxName=" + tGqlxName +
        ", tGqlxBianhao=" + tGqlxBianhao +
        ", tGqlxRemark=" + tGqlxRemark +
        "}";
    }
}

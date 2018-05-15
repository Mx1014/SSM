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
public class TJcsjXmlx extends Model<TJcsjXmlx> {

    private static final long serialVersionUID = 1L;
    @TableId("T_XMLX_ID")
    private String tXmlxId;
    private String tXmlxName;
    private String tXmlxPx;
    private String tXmlxRemark;


    public String gettXmlxId() {
        return tXmlxId;
    }

    public void settXmlxId(String tXmlxId) {
        this.tXmlxId = tXmlxId;
    }

    public String gettXmlxName() {
        return tXmlxName;
    }

    public void settXmlxName(String tXmlxName) {
        this.tXmlxName = tXmlxName;
    }

    public String gettXmlxPx() {
        return tXmlxPx;
    }

    public void settXmlxPx(String tXmlxPx) {
        this.tXmlxPx = tXmlxPx;
    }

    public String gettXmlxRemark() {
        return tXmlxRemark;
    }

    public void settXmlxRemark(String tXmlxRemark) {
        this.tXmlxRemark = tXmlxRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tXmlxId;
    }

    @Override
    public String toString() {
        return "TJcsjXmlx{" +
        "tXmlxId=" + tXmlxId +
        ", tXmlxName=" + tXmlxName +
        ", tXmlxPx=" + tXmlxPx +
        ", tXmlxRemark=" + tXmlxRemark +
        "}";
    }
}

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
public class TJcsjCtbb extends Model<TJcsjCtbb> {

    private static final long serialVersionUID = 1L;

    private String tCtbbId;
    private String tCtbbName;
    private String tCtbbRemark;


    public String gettCtbbId() {
        return tCtbbId;
    }

    public void settCtbbId(String tCtbbId) {
        this.tCtbbId = tCtbbId;
    }

    public String gettCtbbName() {
        return tCtbbName;
    }

    public void settCtbbName(String tCtbbName) {
        this.tCtbbName = tCtbbName;
    }

    public String gettCtbbRemark() {
        return tCtbbRemark;
    }

    public void settCtbbRemark(String tCtbbRemark) {
        this.tCtbbRemark = tCtbbRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tCtbbId;
    }

    @Override
    public String toString() {
        return "TJcsjCtbb{" +
        "tCtbbId=" + tCtbbId +
        ", tCtbbName=" + tCtbbName +
        ", tCtbbRemark=" + tCtbbRemark +
        "}";
    }
}

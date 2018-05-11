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
public class TJcsjBzfs extends Model<TJcsjBzfs> {

    private static final long serialVersionUID = 1L;
    @TableId("T_BZFS_ID")
    private String tBzfsId;
    private String tBzfsName;
    private String tBzfsRemark;


    public String gettBzfsId() {
        return tBzfsId;
    }

    public void settBzfsId(String tBzfsId) {
        this.tBzfsId = tBzfsId;
    }

    public String gettBzfsName() {
        return tBzfsName;
    }

    public void settBzfsName(String tBzfsName) {
        this.tBzfsName = tBzfsName;
    }

    public String gettBzfsRemark() {
        return tBzfsRemark;
    }

    public void settBzfsRemark(String tBzfsRemark) {
        this.tBzfsRemark = tBzfsRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tBzfsId;
    }

    @Override
    public String toString() {
        return "TJcsjBzfs{" +
        "tBzfsId=" + tBzfsId +
        ", tBzfsName=" + tBzfsName +
        ", tBzfsRemark=" + tBzfsRemark +
        "}";
    }
}

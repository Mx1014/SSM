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
public class TJcsjFsfs extends Model<TJcsjFsfs> {

    private static final long serialVersionUID = 1L;
    @TableId("T_FSFS_ID")
    private String tFsfsId;
    private String tFsfsName;
    private String tFsfsRemark;


    public String gettFsfsId() {
        return tFsfsId;
    }

    public void settFsfsId(String tFsfsId) {
        this.tFsfsId = tFsfsId;
    }

    public String gettFsfsName() {
        return tFsfsName;
    }

    public void settFsfsName(String tFsfsName) {
        this.tFsfsName = tFsfsName;
    }

    public String gettFsfsRemark() {
        return tFsfsRemark;
    }

    public void settFsfsRemark(String tFsfsRemark) {
        this.tFsfsRemark = tFsfsRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tFsfsId;
    }

    @Override
    public String toString() {
        return "TJcsjFsfs{" +
        "tFsfsId=" + tFsfsId +
        ", tFsfsName=" + tFsfsName +
        ", tFsfsRemark=" + tFsfsRemark +
        "}";
    }
}

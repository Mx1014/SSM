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
public class TJcsjSyfs extends Model<TJcsjSyfs> {

    private static final long serialVersionUID = 1L;
    @TableId("T_SYFS_ID")
    private String tSyfsId;
    private String tSyfsName;
    private String tSyfsRemark;


    public String gettSyfsId() {
        return tSyfsId;
    }

    public void settSyfsId(String tSyfsId) {
        this.tSyfsId = tSyfsId;
    }

    public String gettSyfsName() {
        return tSyfsName;
    }

    public void settSyfsName(String tSyfsName) {
        this.tSyfsName = tSyfsName;
    }

    public String gettSyfsRemark() {
        return tSyfsRemark;
    }

    public void settSyfsRemark(String tSyfsRemark) {
        this.tSyfsRemark = tSyfsRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tSyfsId;
    }

    @Override
    public String toString() {
        return "TJcsjSyfs{" +
        "tSyfsId=" + tSyfsId +
        ", tSyfsName=" + tSyfsName +
        ", tSyfsRemark=" + tSyfsRemark +
        "}";
    }
}

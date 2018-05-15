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
public class TJcsjMpbb extends Model<TJcsjMpbb> {

    private static final long serialVersionUID = 1L;
    @TableId("T_MPBB_ID")
    private String tMpbbId;
    private String tMpbbName;
    private String tMpbbPx;
    private String tMpbbRemark;


    public String gettMpbbId() {
        return tMpbbId;
    }

    public void settMpbbId(String tMpbbId) {
        this.tMpbbId = tMpbbId;
    }

    public String gettMpbbName() {
        return tMpbbName;
    }

    public void settMpbbName(String tMpbbName) {
        this.tMpbbName = tMpbbName;
    }

    public String gettMpbbPx() {
        return tMpbbPx;
    }

    public void settMpbbPx(String tMpbbPx) {
        this.tMpbbPx = tMpbbPx;
    }

    public String gettMpbbRemark() {
        return tMpbbRemark;
    }

    public void settMpbbRemark(String tMpbbRemark) {
        this.tMpbbRemark = tMpbbRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tMpbbId;
    }

    @Override
    public String toString() {
        return "TJcsjMpbb{" +
        "tMpbbId=" + tMpbbId +
        ", tMpbbName=" + tMpbbName +
        ", tMpbbPx=" + tMpbbPx +
        ", tMpbbRemark=" + tMpbbRemark +
        "}";
    }
}

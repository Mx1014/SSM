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
public class TJcsjCsDycs extends Model<TJcsjCsDycs> {

    private static final long serialVersionUID = 1L;

    /**
     * 电压编号
     */
    @TableId("T_DYCS_ID")
    private String tDycsId;
    /**
     * 电压名称
     */
    private Double tDycsName;
    /**
     * 排序
     */
    private String tDycsPx;
    /**
     * 备注
     */
    private String tDycsRemark;


    public String gettDycsId() {
        return tDycsId;
    }

    public void settDycsId(String tDycsId) {
        this.tDycsId = tDycsId;
    }

    public Double gettDycsName() {
        return tDycsName;
    }

    public void settDycsName(Double tDycsName) {
        this.tDycsName = tDycsName;
    }

    public String gettDycsPx() {
        return tDycsPx;
    }

    public void settDycsPx(String tDycsPx) {
        this.tDycsPx = tDycsPx;
    }

    public String gettDycsRemark() {
        return tDycsRemark;
    }

    public void settDycsRemark(String tDycsRemark) {
        this.tDycsRemark = tDycsRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tDycsId;
    }

    @Override
    public String toString() {
        return "TJcsjCsDycs{" +
        "tDycsId=" + tDycsId +
        ", tDycsName=" + tDycsName +
        ", tDycsPx=" + tDycsPx +
        ", tDycsRemark=" + tDycsRemark +
        "}";
    }
}

package com.kylin.electricassistsys.dto.wghgl;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 规划库信息
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TDwghglGhkxxDto extends BaseDto {


    /**
     * 主键
     */
    private String tGhkxxId;
    /**
     * 项目名称
     */
    private String tGhkxxName;
    /**
     * 父ID
     */
    private String tGhkxxPid;
    /**
     * 项目ID
     */
    private String tGhkxxXmqcid;
    /**
     * 排序
     */
    private String tGhkxxPx;
    /**
     * 备注
     */
    private String tGhkxxRemark;
    /**
     * 类型
     */
    private String tGhkxxLx;
    /**
     * 状态
     */
    private String tGhkxxZt;


    public String gettGhkxxId() {
        return tGhkxxId;
    }

    public void settGhkxxId(String tGhkxxId) {
        this.tGhkxxId = tGhkxxId;
    }

    public String gettGhkxxName() {
        return tGhkxxName;
    }

    public void settGhkxxName(String tGhkxxName) {
        this.tGhkxxName = tGhkxxName;
    }

    public String gettGhkxxPid() {
        return tGhkxxPid;
    }

    public void settGhkxxPid(String tGhkxxPid) {
        this.tGhkxxPid = tGhkxxPid;
    }

    public String gettGhkxxXmqcid() {
        return tGhkxxXmqcid;
    }

    public void settGhkxxXmqcid(String tGhkxxXmqcid) {
        this.tGhkxxXmqcid = tGhkxxXmqcid;
    }

    public String gettGhkxxPx() {
        return tGhkxxPx;
    }

    public void settGhkxxPx(String tGhkxxPx) {
        this.tGhkxxPx = tGhkxxPx;
    }

    public String gettGhkxxRemark() {
        return tGhkxxRemark;
    }

    public void settGhkxxRemark(String tGhkxxRemark) {
        this.tGhkxxRemark = tGhkxxRemark;
    }

    public String gettGhkxxLx() {
        return tGhkxxLx;
    }

    public void settGhkxxLx(String tGhkxxLx) {
        this.tGhkxxLx = tGhkxxLx;
    }

    public String gettGhkxxZt() {
        return tGhkxxZt;
    }

    public void settGhkxxZt(String tGhkxxZt) {
        this.tGhkxxZt = tGhkxxZt;
    }


    @Override
    public String toString() {
        return "TDwghglGhkxx{" +
                "tGhkxxId=" + tGhkxxId +
                ", tGhkxxName=" + tGhkxxName +
                ", tGhkxxPid=" + tGhkxxPid +
                ", tGhkxxXmqcid=" + tGhkxxXmqcid +
                ", tGhkxxPx=" + tGhkxxPx +
                ", tGhkxxRemark=" + tGhkxxRemark +
                ", tGhkxxLx=" + tGhkxxLx +
                ", tGhkxxZt=" + tGhkxxZt +
                "}";
    }
}

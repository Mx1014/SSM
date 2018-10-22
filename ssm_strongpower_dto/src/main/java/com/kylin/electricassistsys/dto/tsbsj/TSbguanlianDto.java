package com.kylin.electricassistsys.dto.tsbsj;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 设备关联表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSbguanlianDto extends BaseDto {


    /**
     * 标识列
     */
    private String glid;
    /**
     * open3000设备编号
     */
    private String opensbid;
    /**
     * open3000设备名称
     */
    private String opensbname;
    /**
     * open3000厂站Id
     */
    private String openfacId;
    /**
     * 设备类型 变压器，变电站 ，交流线路 ， 中压线路
     */
    private String sbtype;
    /**
     * 本系统设备Id
     */
    private String mysbid;
    /**
     * 关联日期
     */
    private String sbgltime;
    /**
     * 关联类型 手动，自动
     */
    private String gltype;
    /**
     * 备注
     */
    private String remark;


    public String getGlid() {
        return glid;
    }

    public void setGlid(String glid) {
        this.glid = glid;
    }

    public String getOpensbid() {
        return opensbid;
    }

    public void setOpensbid(String opensbid) {
        this.opensbid = opensbid;
    }

    public String getOpensbname() {
        return opensbname;
    }

    public void setOpensbname(String opensbname) {
        this.opensbname = opensbname;
    }

    public String getOpenfacId() {
        return openfacId;
    }

    public void setOpenfacId(String openfacId) {
        this.openfacId = openfacId;
    }

    public String getSbtype() {
        return sbtype;
    }

    public void setSbtype(String sbtype) {
        this.sbtype = sbtype;
    }

    public String getMysbid() {
        return mysbid;
    }

    public void setMysbid(String mysbid) {
        this.mysbid = mysbid;
    }

    public String getSbgltime() {
        return sbgltime;
    }

    public void setSbgltime(String sbgltime) {
        this.sbgltime = sbgltime;
    }

    public String getGltype() {
        return gltype;
    }

    public void setGltype(String gltype) {
        this.gltype = gltype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "TSbguanlian{" +
                "glid=" + glid +
                ", opensbid=" + opensbid +
                ", opensbname=" + opensbname +
                ", openfacId=" + openfacId +
                ", sbtype=" + sbtype +
                ", mysbid=" + mysbid +
                ", sbgltime=" + sbgltime +
                ", gltype=" + gltype +
                ", remark=" + remark +
                "}";
    }
}

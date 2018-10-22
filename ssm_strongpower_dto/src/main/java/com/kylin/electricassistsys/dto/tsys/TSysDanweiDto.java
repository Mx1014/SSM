package com.kylin.electricassistsys.dto.tsys;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSysDanweiDto extends BaseDto {


    private String dId;
    private String dPId;
    private String dName;
    private Double dIndex;
    private String dState;
    private String dRemark;


    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getdPId() {
        return dPId;
    }

    public void setdPId(String dPId) {
        this.dPId = dPId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Double getdIndex() {
        return dIndex;
    }

    public void setdIndex(Double dIndex) {
        this.dIndex = dIndex;
    }

    public String getdState() {
        return dState;
    }

    public void setdState(String dState) {
        this.dState = dState;
    }

    public String getdRemark() {
        return dRemark;
    }

    public void setdRemark(String dRemark) {
        this.dRemark = dRemark;
    }


    @Override
    public String toString() {
        return "TSysDanwei{" +
                "dId=" + dId +
                ", dPId=" + dPId +
                ", dName=" + dName +
                ", dIndex=" + dIndex +
                ", dState=" + dState +
                ", dRemark=" + dRemark +
                "}";
    }
}

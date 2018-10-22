package com.kylin.electricassistsys.dto.jcsj;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjJcmbDto extends BaseDto {


    private String tJcmbId;
    private String tJcmbPid;
    private String tJcmbName;
    private String tJcmbRemark;


    public String gettJcmbId() {
        return tJcmbId;
    }

    public void settJcmbId(String tJcmbId) {
        this.tJcmbId = tJcmbId;
    }

    public String gettJcmbPid() {
        return tJcmbPid;
    }

    public void settJcmbPid(String tJcmbPid) {
        this.tJcmbPid = tJcmbPid;
    }

    public String gettJcmbName() {
        return tJcmbName;
    }

    public void settJcmbName(String tJcmbName) {
        this.tJcmbName = tJcmbName;
    }

    public String gettJcmbRemark() {
        return tJcmbRemark;
    }

    public void settJcmbRemark(String tJcmbRemark) {
        this.tJcmbRemark = tJcmbRemark;
    }


    @Override
    public String toString() {
        return "TJcsjJcmb{" +
                "tJcmbId=" + tJcmbId +
                ", tJcmbPid=" + tJcmbPid +
                ", tJcmbName=" + tJcmbName +
                ", tJcmbRemark=" + tJcmbRemark +
                "}";
    }
}

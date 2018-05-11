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
public class TJcsjBzfsDto extends BaseDto {
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
    public String toString() {
        return "TJcsjBzfs{" +
        "tBzfsId=" + tBzfsId +
        ", tBzfsName=" + tBzfsName +
        ", tBzfsRemark=" + tBzfsRemark +
        "}";
    }
}

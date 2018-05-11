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
public class TJcsjSyfsDto  extends BaseDto {


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
    public String toString() {
        return "TJcsjSyfs{" +
        "tSyfsId=" + tSyfsId +
        ", tSyfsName=" + tSyfsName +
        ", tSyfsRemark=" + tSyfsRemark +
        "}";
    }
}

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
public class TJcsjFsfsDto extends BaseDto {

    private static final long serialVersionUID = 1L;

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
    public String toString() {
        return "TJcsjFsfs{" +
        "tFsfsId=" + tFsfsId +
        ", tFsfsName=" + tFsfsName +
        ", tFsfsRemark=" + tFsfsRemark +
        "}";
    }
}

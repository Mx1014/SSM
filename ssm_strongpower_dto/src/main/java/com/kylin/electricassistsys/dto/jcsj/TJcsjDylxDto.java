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
public class TJcsjDylxDto extends BaseDto {


    private String tDylxId;
    private String tDylxName;
    private String tDylxRemark;


    public String gettDylxId() {
        return tDylxId;
    }

    public void settDylxId(String tDylxId) {
        this.tDylxId = tDylxId;
    }

    public String gettDylxName() {
        return tDylxName;
    }

    public void settDylxName(String tDylxName) {
        this.tDylxName = tDylxName;
    }

    public String gettDylxRemark() {
        return tDylxRemark;
    }

    public void settDylxRemark(String tDylxRemark) {
        this.tDylxRemark = tDylxRemark;
    }


    @Override
    public String toString() {
        return "TJcsjDylx{" +
        "tDylxId=" + tDylxId +
        ", tDylxName=" + tDylxName +
        ", tDylxRemark=" + tDylxRemark +
        "}";
    }
}

package com.kylin.electricassistsys.dto.jcsj;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjZjxDto {


    private String tZjxId;
    private String tZjxName;
    private String tZjxRemark;


    public String gettZjxId() {
        return tZjxId;
    }

    public void settZjxId(String tZjxId) {
        this.tZjxId = tZjxId;
    }

    public String gettZjxName() {
        return tZjxName;
    }

    public void settZjxName(String tZjxName) {
        this.tZjxName = tZjxName;
    }

    public String gettZjxRemark() {
        return tZjxRemark;
    }

    public void settZjxRemark(String tZjxRemark) {
        this.tZjxRemark = tZjxRemark;
    }


    @Override
    public String toString() {
        return "TJcsjZjx{" +
        "tZjxId=" + tZjxId +
        ", tZjxName=" + tZjxName +
        ", tZjxRemark=" + tZjxRemark +
        "}";
    }
}

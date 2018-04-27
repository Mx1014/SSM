package com.kylin.electricassistsys.dto.jcsj;

/**
 * <p>
 * 资料类型
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjZllxDto {


    private String tZllxId;
    private String tZllxName;
    private String tZllxRemark;


    public String gettZllxId() {
        return tZllxId;
    }

    public void settZllxId(String tZllxId) {
        this.tZllxId = tZllxId;
    }

    public String gettZllxName() {
        return tZllxName;
    }

    public void settZllxName(String tZllxName) {
        this.tZllxName = tZllxName;
    }

    public String gettZllxRemark() {
        return tZllxRemark;
    }

    public void settZllxRemark(String tZllxRemark) {
        this.tZllxRemark = tZllxRemark;
    }


    @Override
    public String toString() {
        return "TJcsjZllx{" +
        "tZllxId=" + tZllxId +
        ", tZllxName=" + tZllxName +
        ", tZllxRemark=" + tZllxRemark +
        "}";
    }
}

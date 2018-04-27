package com.kylin.electricassistsys.dto.jcsj;


/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjAzxsDto{



    private String tAzxsId;
    private String tAzxsName;
    private String tAzxsRemark;


    public String gettAzxsId() {
        return tAzxsId;
    }

    public void settAzxsId(String tAzxsId) {
        this.tAzxsId = tAzxsId;
    }

    public String gettAzxsName() {
        return tAzxsName;
    }

    public void settAzxsName(String tAzxsName) {
        this.tAzxsName = tAzxsName;
    }

    public String gettAzxsRemark() {
        return tAzxsRemark;
    }

    public void settAzxsRemark(String tAzxsRemark) {
        this.tAzxsRemark = tAzxsRemark;
    }


    @Override
    public String toString() {
        return "TJcsjAzxs{" +
        "tAzxsId=" + tAzxsId +
        ", tAzxsName=" + tAzxsName +
        ", tAzxsRemark=" + tAzxsRemark +
        "}";
    }
}

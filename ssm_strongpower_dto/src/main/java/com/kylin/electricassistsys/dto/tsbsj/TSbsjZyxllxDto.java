package com.kylin.electricassistsys.dto.tsbsj;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSbsjZyxllxDto {


    private String tZyxllxId;
    private String tZyxllxBid;
    private String tZyxllxEid;


    public String gettZyxllxId() {
        return tZyxllxId;
    }

    public void settZyxllxId(String tZyxllxId) {
        this.tZyxllxId = tZyxllxId;
    }

    public String gettZyxllxBid() {
        return tZyxllxBid;
    }

    public void settZyxllxBid(String tZyxllxBid) {
        this.tZyxllxBid = tZyxllxBid;
    }

    public String gettZyxllxEid() {
        return tZyxllxEid;
    }

    public void settZyxllxEid(String tZyxllxEid) {
        this.tZyxllxEid = tZyxllxEid;
    }


    @Override
    public String toString() {
        return "TSbsjZyxllx{" +
        "tZyxllxId=" + tZyxllxId +
        ", tZyxllxBid=" + tZyxllxBid +
        ", tZyxllxEid=" + tZyxllxEid +
        "}";
    }
}

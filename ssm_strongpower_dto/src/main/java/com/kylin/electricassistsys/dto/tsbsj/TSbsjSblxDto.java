package com.kylin.electricassistsys.dto.tsbsj;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSbsjSblxDto {


    private String tSblxId;
    private String tSblxName;
    private String tSblxBh;


    public String gettSblxId() {
        return tSblxId;
    }

    public void settSblxId(String tSblxId) {
        this.tSblxId = tSblxId;
    }

    public String gettSblxName() {
        return tSblxName;
    }

    public void settSblxName(String tSblxName) {
        this.tSblxName = tSblxName;
    }

    public String gettSblxBh() {
        return tSblxBh;
    }

    public void settSblxBh(String tSblxBh) {
        this.tSblxBh = tSblxBh;
    }


    @Override
    public String toString() {
        return "TSbsjSblx{" +
        "tSblxId=" + tSblxId +
        ", tSblxName=" + tSblxName +
        ", tSblxBh=" + tSblxBh +
        "}";
    }
}

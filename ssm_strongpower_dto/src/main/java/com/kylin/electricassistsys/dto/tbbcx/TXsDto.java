package com.kylin.electricassistsys.dto.tbbcx;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TXsDto {

    private static final long serialVersionUID = 1L;

    private String tId;
    private String tName;
    private String tXs;


    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettXs() {
        return tXs;
    }

    public void settXs(String tXs) {
        this.tXs = tXs;
    }


    @Override
    public String toString() {
        return "TXs{" +
        "tId=" + tId +
        ", tName=" + tName +
        ", tXs=" + tXs +
        "}";
    }
}

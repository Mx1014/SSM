package com.kylin.electricassistsys.dto.tsys;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSysJsDto {


    private String tJsid;
    private String tPId;
    private String tJsname;
    private Double tIndex;
    private String tState;


    public String gettJsid() {
        return tJsid;
    }

    public void settJsid(String tJsid) {
        this.tJsid = tJsid;
    }

    public String gettPId() {
        return tPId;
    }

    public void settPId(String tPId) {
        this.tPId = tPId;
    }

    public String gettJsname() {
        return tJsname;
    }

    public void settJsname(String tJsname) {
        this.tJsname = tJsname;
    }

    public Double gettIndex() {
        return tIndex;
    }

    public void settIndex(Double tIndex) {
        this.tIndex = tIndex;
    }

    public String gettState() {
        return tState;
    }

    public void settState(String tState) {
        this.tState = tState;
    }


    @Override
    public String toString() {
        return "TSysJs{" +
        "tJsid=" + tJsid +
        ", tPId=" + tPId +
        ", tJsname=" + tJsname +
        ", tIndex=" + tIndex +
        ", tState=" + tState +
        "}";
    }
}

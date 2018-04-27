package com.kylin.electricassistsys.dto.ghdg;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TGhdgPdzdhDto {

    private static final long serialVersionUID = 1L;

    private String tPdzdhId;
    private String tPdzdhType;
    private String tPdzdhDydj;
    private String tPdzdhZdhfgl;
    private String tPdzdhPdzdyybl;
    private String tPdzdhPdzdeybl;
    private String tPdzdhPdzdsybl;


    public String gettPdzdhId() {
        return tPdzdhId;
    }

    public void settPdzdhId(String tPdzdhId) {
        this.tPdzdhId = tPdzdhId;
    }

    public String gettPdzdhType() {
        return tPdzdhType;
    }

    public void settPdzdhType(String tPdzdhType) {
        this.tPdzdhType = tPdzdhType;
    }

    public String gettPdzdhDydj() {
        return tPdzdhDydj;
    }

    public void settPdzdhDydj(String tPdzdhDydj) {
        this.tPdzdhDydj = tPdzdhDydj;
    }

    public String gettPdzdhZdhfgl() {
        return tPdzdhZdhfgl;
    }

    public void settPdzdhZdhfgl(String tPdzdhZdhfgl) {
        this.tPdzdhZdhfgl = tPdzdhZdhfgl;
    }

    public String gettPdzdhPdzdyybl() {
        return tPdzdhPdzdyybl;
    }

    public void settPdzdhPdzdyybl(String tPdzdhPdzdyybl) {
        this.tPdzdhPdzdyybl = tPdzdhPdzdyybl;
    }

    public String gettPdzdhPdzdeybl() {
        return tPdzdhPdzdeybl;
    }

    public void settPdzdhPdzdeybl(String tPdzdhPdzdeybl) {
        this.tPdzdhPdzdeybl = tPdzdhPdzdeybl;
    }

    public String gettPdzdhPdzdsybl() {
        return tPdzdhPdzdsybl;
    }

    public void settPdzdhPdzdsybl(String tPdzdhPdzdsybl) {
        this.tPdzdhPdzdsybl = tPdzdhPdzdsybl;
    }



    @Override
    public String toString() {
        return "TGhdgPdzdh{" +
        "tPdzdhId=" + tPdzdhId +
        ", tPdzdhType=" + tPdzdhType +
        ", tPdzdhDydj=" + tPdzdhDydj +
        ", tPdzdhZdhfgl=" + tPdzdhZdhfgl +
        ", tPdzdhPdzdyybl=" + tPdzdhPdzdyybl +
        ", tPdzdhPdzdeybl=" + tPdzdhPdzdeybl +
        ", tPdzdhPdzdsybl=" + tPdzdhPdzdsybl +
        "}";
    }
}

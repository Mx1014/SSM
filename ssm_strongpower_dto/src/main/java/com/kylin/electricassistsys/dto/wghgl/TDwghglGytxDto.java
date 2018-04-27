package com.kylin.electricassistsys.dto.wghgl;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TDwghglGytxDto {


    private String tGytxId;
    private String tDwghglId;
    private String tGytxName;
    private String tGytxType;
    private String tGytxXmtz;
    private String tGytxGlcd;
    private String tGytxGlts;
    private String tGytxGsbsl;
    private String tGytxGbsl;


    public String gettGytxId() {
        return tGytxId;
    }

    public void settGytxId(String tGytxId) {
        this.tGytxId = tGytxId;
    }

    public String gettDwghglId() {
        return tDwghglId;
    }

    public void settDwghglId(String tDwghglId) {
        this.tDwghglId = tDwghglId;
    }

    public String gettGytxName() {
        return tGytxName;
    }

    public void settGytxName(String tGytxName) {
        this.tGytxName = tGytxName;
    }

    public String gettGytxType() {
        return tGytxType;
    }

    public void settGytxType(String tGytxType) {
        this.tGytxType = tGytxType;
    }

    public String gettGytxXmtz() {
        return tGytxXmtz;
    }

    public void settGytxXmtz(String tGytxXmtz) {
        this.tGytxXmtz = tGytxXmtz;
    }

    public String gettGytxGlcd() {
        return tGytxGlcd;
    }

    public void settGytxGlcd(String tGytxGlcd) {
        this.tGytxGlcd = tGytxGlcd;
    }

    public String gettGytxGlts() {
        return tGytxGlts;
    }

    public void settGytxGlts(String tGytxGlts) {
        this.tGytxGlts = tGytxGlts;
    }

    public String gettGytxGsbsl() {
        return tGytxGsbsl;
    }

    public void settGytxGsbsl(String tGytxGsbsl) {
        this.tGytxGsbsl = tGytxGsbsl;
    }

    public String gettGytxGbsl() {
        return tGytxGbsl;
    }

    public void settGytxGbsl(String tGytxGbsl) {
        this.tGytxGbsl = tGytxGbsl;
    }


    @Override
    public String toString() {
        return "TDwghglGytx{" +
        "tGytxId=" + tGytxId +
        ", tDwghglId=" + tDwghglId +
        ", tGytxName=" + tGytxName +
        ", tGytxType=" + tGytxType +
        ", tGytxXmtz=" + tGytxXmtz +
        ", tGytxGlcd=" + tGytxGlcd +
        ", tGytxGlts=" + tGytxGlts +
        ", tGytxGsbsl=" + tGytxGsbsl +
        ", tGytxGbsl=" + tGytxGbsl +
        "}";
    }
}

package com.kylin.electricassistsys.dto.ddsb;


import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */

public class TDdsbBdzDto extends BaseDto {

    private String tBdzId;
    private String tBdzSblx;
    private String tBdzSbbh;
    private String tBdzSbname;
    private String tBdzGlsb;
    private String tBdzGllx;
    private String tBdzBz;


    public String gettBdzId() {
        return tBdzId;
    }

    public void settBdzId(String tBdzId) {
        this.tBdzId = tBdzId;
    }

    public String gettBdzSblx() {
        return tBdzSblx;
    }

    public void settBdzSblx(String tBdzSblx) {
        this.tBdzSblx = tBdzSblx;
    }

    public String gettBdzSbbh() {
        return tBdzSbbh;
    }

    public void settBdzSbbh(String tBdzSbbh) {
        this.tBdzSbbh = tBdzSbbh;
    }

    public String gettBdzSbname() {
        return tBdzSbname;
    }

    public void settBdzSbname(String tBdzSbname) {
        this.tBdzSbname = tBdzSbname;
    }

    public String gettBdzGlsb() {
        return tBdzGlsb;
    }

    public void settBdzGlsb(String tBdzGlsb) {
        this.tBdzGlsb = tBdzGlsb;
    }

    public String gettBdzGllx() {
        return tBdzGllx;
    }

    public void settBdzGllx(String tBdzGllx) {
        this.tBdzGllx = tBdzGllx;
    }

    public String gettBdzBz() {
        return tBdzBz;
    }

    public void settBdzBz(String tBdzBz) {
        this.tBdzBz = tBdzBz;
    }


    @Override
    public String toString() {
        return "TDdsbBdz{" +
                "tBdzId=" + tBdzId +
                ", tBdzSblx=" + tBdzSblx +
                ", tBdzSbbh=" + tBdzSbbh +
                ", tBdzSbname=" + tBdzSbname +
                ", tBdzGlsb=" + tBdzGlsb +
                ", tBdzGllx=" + tBdzGllx +
                ", tBdzBz=" + tBdzBz +
                "}";
    }
}

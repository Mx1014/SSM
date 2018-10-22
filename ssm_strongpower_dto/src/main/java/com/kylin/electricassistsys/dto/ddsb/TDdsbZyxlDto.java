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
public class TDdsbZyxlDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    private String tZyxlId;
    private String tZyxlSblx;
    private String tZyxlSbbh;
    private String tZyxlSbname;
    private String tZyxlGlsb;
    private String tZyxlGllx;
    private String tZyxlBz;


    public String gettZyxlId() {
        return tZyxlId;
    }

    public void settZyxlId(String tZyxlId) {
        this.tZyxlId = tZyxlId;
    }

    public String gettZyxlSblx() {
        return tZyxlSblx;
    }

    public void settZyxlSblx(String tZyxlSblx) {
        this.tZyxlSblx = tZyxlSblx;
    }

    public String gettZyxlSbbh() {
        return tZyxlSbbh;
    }

    public void settZyxlSbbh(String tZyxlSbbh) {
        this.tZyxlSbbh = tZyxlSbbh;
    }

    public String gettZyxlSbname() {
        return tZyxlSbname;
    }

    public void settZyxlSbname(String tZyxlSbname) {
        this.tZyxlSbname = tZyxlSbname;
    }

    public String gettZyxlGlsb() {
        return tZyxlGlsb;
    }

    public void settZyxlGlsb(String tZyxlGlsb) {
        this.tZyxlGlsb = tZyxlGlsb;
    }

    public String gettZyxlGllx() {
        return tZyxlGllx;
    }

    public void settZyxlGllx(String tZyxlGllx) {
        this.tZyxlGllx = tZyxlGllx;
    }

    public String gettZyxlBz() {
        return tZyxlBz;
    }

    public void settZyxlBz(String tZyxlBz) {
        this.tZyxlBz = tZyxlBz;
    }


    @Override
    public String toString() {
        return "TDdsbZyxl{" +
                "tZyxlId=" + tZyxlId +
                ", tZyxlSblx=" + tZyxlSblx +
                ", tZyxlSbbh=" + tZyxlSbbh +
                ", tZyxlSbname=" + tZyxlSbname +
                ", tZyxlGlsb=" + tZyxlGlsb +
                ", tZyxlGllx=" + tZyxlGllx +
                ", tZyxlBz=" + tZyxlBz +
                "}";
    }
}

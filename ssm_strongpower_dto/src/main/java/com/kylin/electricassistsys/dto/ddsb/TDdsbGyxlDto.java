package com.kylin.electricassistsys.dto.ddsb;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TDdsbGyxlDto{

    private static final long serialVersionUID = 1L;

    private String tGyxlId;
    private String tGyxlSblx;
    private String tGyxlSbbh;
    private String tGyxlSbname;
    private String tGyxlGlsb;
    private String tGyxlGllx;
    private String tGyxlBz;


    public String gettGyxlId() {
        return tGyxlId;
    }

    public void settGyxlId(String tGyxlId) {
        this.tGyxlId = tGyxlId;
    }

    public String gettGyxlSblx() {
        return tGyxlSblx;
    }

    public void settGyxlSblx(String tGyxlSblx) {
        this.tGyxlSblx = tGyxlSblx;
    }

    public String gettGyxlSbbh() {
        return tGyxlSbbh;
    }

    public void settGyxlSbbh(String tGyxlSbbh) {
        this.tGyxlSbbh = tGyxlSbbh;
    }

    public String gettGyxlSbname() {
        return tGyxlSbname;
    }

    public void settGyxlSbname(String tGyxlSbname) {
        this.tGyxlSbname = tGyxlSbname;
    }

    public String gettGyxlGlsb() {
        return tGyxlGlsb;
    }

    public void settGyxlGlsb(String tGyxlGlsb) {
        this.tGyxlGlsb = tGyxlGlsb;
    }

    public String gettGyxlGllx() {
        return tGyxlGllx;
    }

    public void settGyxlGllx(String tGyxlGllx) {
        this.tGyxlGllx = tGyxlGllx;
    }

    public String gettGyxlBz() {
        return tGyxlBz;
    }

    public void settGyxlBz(String tGyxlBz) {
        this.tGyxlBz = tGyxlBz;
    }


    @Override
    public String toString() {
        return "TDdsbGyxl{" +
        "tGyxlId=" + tGyxlId +
        ", tGyxlSblx=" + tGyxlSblx +
        ", tGyxlSbbh=" + tGyxlSbbh +
        ", tGyxlSbname=" + tGyxlSbname +
        ", tGyxlGlsb=" + tGyxlGlsb +
        ", tGyxlGllx=" + tGyxlGllx +
        ", tGyxlBz=" + tGyxlBz +
        "}";
    }
}

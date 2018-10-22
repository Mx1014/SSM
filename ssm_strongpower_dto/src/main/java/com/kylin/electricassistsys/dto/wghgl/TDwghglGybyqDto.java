package com.kylin.electricassistsys.dto.wghgl;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TDwghglGybyqDto extends BaseDto {


    private String tGybyqId;
    private String tBdzId;
    private String tDwghglId;
    private String tGybyqName;
    private String tGybyqEddy;
    private String tGybyqRl;
    private String tGybyqMpxh;
    private String tGybyqMpbb;
    private String tGybyqTyfs;
    private String tGybyqRemark;


    public String gettGybyqId() {
        return tGybyqId;
    }

    public void settGybyqId(String tGybyqId) {
        this.tGybyqId = tGybyqId;
    }

    public String gettBdzId() {
        return tBdzId;
    }

    public void settBdzId(String tBdzId) {
        this.tBdzId = tBdzId;
    }

    public String gettDwghglId() {
        return tDwghglId;
    }

    public void settDwghglId(String tDwghglId) {
        this.tDwghglId = tDwghglId;
    }

    public String gettGybyqName() {
        return tGybyqName;
    }

    public void settGybyqName(String tGybyqName) {
        this.tGybyqName = tGybyqName;
    }

    public String gettGybyqEddy() {
        return tGybyqEddy;
    }

    public void settGybyqEddy(String tGybyqEddy) {
        this.tGybyqEddy = tGybyqEddy;
    }

    public String gettGybyqRl() {
        return tGybyqRl;
    }

    public void settGybyqRl(String tGybyqRl) {
        this.tGybyqRl = tGybyqRl;
    }

    public String gettGybyqMpxh() {
        return tGybyqMpxh;
    }

    public void settGybyqMpxh(String tGybyqMpxh) {
        this.tGybyqMpxh = tGybyqMpxh;
    }

    public String gettGybyqMpbb() {
        return tGybyqMpbb;
    }

    public void settGybyqMpbb(String tGybyqMpbb) {
        this.tGybyqMpbb = tGybyqMpbb;
    }

    public String gettGybyqTyfs() {
        return tGybyqTyfs;
    }

    public void settGybyqTyfs(String tGybyqTyfs) {
        this.tGybyqTyfs = tGybyqTyfs;
    }

    public String gettGybyqRemark() {
        return tGybyqRemark;
    }

    public void settGybyqRemark(String tGybyqRemark) {
        this.tGybyqRemark = tGybyqRemark;
    }

    @Override
    public String toString() {
        return "TDwghglGybyq{" +
                "tGybyqId=" + tGybyqId +
                ", tBdzId=" + tBdzId +
                ", tDwghglId=" + tDwghglId +
                ", tGybyqName=" + tGybyqName +
                ", tGybyqEddy=" + tGybyqEddy +
                ", tGybyqRl=" + tGybyqRl +
                ", tGybyqMpxh=" + tGybyqMpxh +
                ", tGybyqMpbb=" + tGybyqMpbb +
                ", tGybyqTyfs=" + tGybyqTyfs +
                ", tGybyqRemark=" + tGybyqRemark +
                "}";
    }
}

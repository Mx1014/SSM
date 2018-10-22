package com.kylin.electricassistsys.dto.tyx;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TYxBdzjfdlDto extends BaseDto {


    private String tJfdlId;
    private String tJfdlBdzid;
    private String tJfdlZongzhi;
    private String tJfdlZhengzhi;
    private String tJfdlFuzhi;
    private String tJfdlData;
    private Double tJfdlTqjg;
    private String tJfdlOpensbid;
    private String tJfdlType;


    public String gettJfdlId() {
        return tJfdlId;
    }

    public void settJfdlId(String tJfdlId) {
        this.tJfdlId = tJfdlId;
    }

    public String gettJfdlBdzid() {
        return tJfdlBdzid;
    }

    public void settJfdlBdzid(String tJfdlBdzid) {
        this.tJfdlBdzid = tJfdlBdzid;
    }

    public String gettJfdlZongzhi() {
        return tJfdlZongzhi;
    }

    public void settJfdlZongzhi(String tJfdlZongzhi) {
        this.tJfdlZongzhi = tJfdlZongzhi;
    }

    public String gettJfdlZhengzhi() {
        return tJfdlZhengzhi;
    }

    public void settJfdlZhengzhi(String tJfdlZhengzhi) {
        this.tJfdlZhengzhi = tJfdlZhengzhi;
    }

    public String gettJfdlFuzhi() {
        return tJfdlFuzhi;
    }

    public void settJfdlFuzhi(String tJfdlFuzhi) {
        this.tJfdlFuzhi = tJfdlFuzhi;
    }

    public String gettJfdlData() {
        return tJfdlData;
    }

    public void settJfdlData(String tJfdlData) {
        this.tJfdlData = tJfdlData;
    }

    public Double gettJfdlTqjg() {
        return tJfdlTqjg;
    }

    public void settJfdlTqjg(Double tJfdlTqjg) {
        this.tJfdlTqjg = tJfdlTqjg;
    }

    public String gettJfdlOpensbid() {
        return tJfdlOpensbid;
    }

    public void settJfdlOpensbid(String tJfdlOpensbid) {
        this.tJfdlOpensbid = tJfdlOpensbid;
    }

    public String gettJfdlType() {
        return tJfdlType;
    }

    public void settJfdlType(String tJfdlType) {
        this.tJfdlType = tJfdlType;
    }


    @Override
    public String toString() {
        return "TYxBdzjfdl{" +
                "tJfdlId=" + tJfdlId +
                ", tJfdlBdzid=" + tJfdlBdzid +
                ", tJfdlZongzhi=" + tJfdlZongzhi +
                ", tJfdlZhengzhi=" + tJfdlZhengzhi +
                ", tJfdlFuzhi=" + tJfdlFuzhi +
                ", tJfdlData=" + tJfdlData +
                ", tJfdlTqjg=" + tJfdlTqjg +
                ", tJfdlOpensbid=" + tJfdlOpensbid +
                ", tJfdlType=" + tJfdlType +
                "}";
    }
}

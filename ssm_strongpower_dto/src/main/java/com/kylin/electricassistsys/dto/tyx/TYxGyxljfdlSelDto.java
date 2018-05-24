package com.kylin.electricassistsys.dto.tyx;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 高压线路电量信息
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TYxGyxljfdlSelDto extends BaseDto {
    private String tJfdlId;
    private String tJfdlXlid;
    private String tJfdlZongzhi;
    private String tJfdlZhengzhi;
    private String tJfdlFuzhi;
    private String tJfdlData;
    private Double tJfdlTqjg;
    private String tJfdlOpensbid;
    private String tJfdlType;
    /**
     * 变电站号中文
     */
    private String tGyxlxxXlmc;

    public String gettGyxlxxXlmc() {
        return tGyxlxxXlmc;
    }

    public void settGyxlxxXlmc(String tGyxlxxXlmc) {
        this.tGyxlxxXlmc = tGyxlxxXlmc;
    }

    public String gettJfdlId() {
        return tJfdlId;
    }

    public void settJfdlId(String tJfdlId) {
        this.tJfdlId = tJfdlId;
    }

    public String gettJfdlXlid() {
        return tJfdlXlid;
    }

    public void settJfdlXlid(String tJfdlXlid) {
        this.tJfdlXlid = tJfdlXlid;
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
        return "TYxGyxljfdl{" +
        "tJfdlId=" + tJfdlId +
        ", tJfdlXlid=" + tJfdlXlid +
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

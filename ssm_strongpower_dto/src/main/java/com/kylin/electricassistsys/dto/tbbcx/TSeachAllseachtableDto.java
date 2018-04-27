package com.kylin.electricassistsys.dto.tbbcx;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSeachAllseachtableDto {

    private static final long serialVersionUID = 1L;

    private String tSeachId;
    private String tSeachPId;
    private String tSeachName;
    private String tSeachSelectsql;
    private String tSeachCreatetime;
    private Double tSeachIndex;
    private String tSeachRemark;


    public String gettSeachId() {
        return tSeachId;
    }

    public void settSeachId(String tSeachId) {
        this.tSeachId = tSeachId;
    }

    public String gettSeachPId() {
        return tSeachPId;
    }

    public void settSeachPId(String tSeachPId) {
        this.tSeachPId = tSeachPId;
    }

    public String gettSeachName() {
        return tSeachName;
    }

    public void settSeachName(String tSeachName) {
        this.tSeachName = tSeachName;
    }

    public String gettSeachSelectsql() {
        return tSeachSelectsql;
    }

    public void settSeachSelectsql(String tSeachSelectsql) {
        this.tSeachSelectsql = tSeachSelectsql;
    }

    public String gettSeachCreatetime() {
        return tSeachCreatetime;
    }

    public void settSeachCreatetime(String tSeachCreatetime) {
        this.tSeachCreatetime = tSeachCreatetime;
    }

    public Double gettSeachIndex() {
        return tSeachIndex;
    }

    public void settSeachIndex(Double tSeachIndex) {
        this.tSeachIndex = tSeachIndex;
    }

    public String gettSeachRemark() {
        return tSeachRemark;
    }

    public void settSeachRemark(String tSeachRemark) {
        this.tSeachRemark = tSeachRemark;
    }


    @Override
    public String toString() {
        return "TSeachAllseachtable{" +
        "tSeachId=" + tSeachId +
        ", tSeachPId=" + tSeachPId +
        ", tSeachName=" + tSeachName +
        ", tSeachSelectsql=" + tSeachSelectsql +
        ", tSeachCreatetime=" + tSeachCreatetime +
        ", tSeachIndex=" + tSeachIndex +
        ", tSeachRemark=" + tSeachRemark +
        "}";
    }
}

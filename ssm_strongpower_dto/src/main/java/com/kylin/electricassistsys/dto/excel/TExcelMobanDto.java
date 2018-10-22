package com.kylin.electricassistsys.dto.excel;


import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TExcelMobanDto extends BaseDto {
    private String emId;
    private String emCreateuserid;
    private String emCreatetime;
    private String emName;
    private String emExcelinfo;
    private String emTableids;
    private Double emIndex;
    private String emRemark;
    private String emPId;


    public String getEmId() {
        return emId;
    }

    public void setEmId(String emId) {
        this.emId = emId;
    }

    public String getEmCreateuserid() {
        return emCreateuserid;
    }

    public void setEmCreateuserid(String emCreateuserid) {
        this.emCreateuserid = emCreateuserid;
    }

    public String getEmCreatetime() {
        return emCreatetime;
    }

    public void setEmCreatetime(String emCreatetime) {
        this.emCreatetime = emCreatetime;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public String getEmExcelinfo() {
        return emExcelinfo;
    }

    public void setEmExcelinfo(String emExcelinfo) {
        this.emExcelinfo = emExcelinfo;
    }

    public String getEmTableids() {
        return emTableids;
    }

    public void setEmTableids(String emTableids) {
        this.emTableids = emTableids;
    }

    public Double getEmIndex() {
        return emIndex;
    }

    public void setEmIndex(Double emIndex) {
        this.emIndex = emIndex;
    }

    public String getEmRemark() {
        return emRemark;
    }

    public void setEmRemark(String emRemark) {
        this.emRemark = emRemark;
    }

    public String getEmPId() {
        return emPId;
    }

    public void setEmPId(String emPId) {
        this.emPId = emPId;
    }


    @Override
    public String toString() {
        return "TExcelMoban{" +
                "emId=" + emId +
                ", emCreateuserid=" + emCreateuserid +
                ", emCreatetime=" + emCreatetime +
                ", emName=" + emName +
                ", emExcelinfo=" + emExcelinfo +
                ", emTableids=" + emTableids +
                ", emIndex=" + emIndex +
                ", emRemark=" + emRemark +
                ", emPId=" + emPId +
                "}";
    }
}

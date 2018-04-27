package com.kylin.electricassistsys.dto.excel;



/**
 * <p>
 * 导出模板
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TExceldaochumobanDto {


    private String eId;
    private String eCreateuserid;
    private String eCreatetime;
    private String eName;
    private String eMobanentity;
    private String eMobanseach;
    private String eMobanziduan;
    private Double eIndex;
    private String eIsmoren;
    private String eRemark;


    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String geteCreateuserid() {
        return eCreateuserid;
    }

    public void seteCreateuserid(String eCreateuserid) {
        this.eCreateuserid = eCreateuserid;
    }

    public String geteCreatetime() {
        return eCreatetime;
    }

    public void seteCreatetime(String eCreatetime) {
        this.eCreatetime = eCreatetime;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteMobanentity() {
        return eMobanentity;
    }

    public void seteMobanentity(String eMobanentity) {
        this.eMobanentity = eMobanentity;
    }

    public String geteMobanseach() {
        return eMobanseach;
    }

    public void seteMobanseach(String eMobanseach) {
        this.eMobanseach = eMobanseach;
    }

    public String geteMobanziduan() {
        return eMobanziduan;
    }

    public void seteMobanziduan(String eMobanziduan) {
        this.eMobanziduan = eMobanziduan;
    }

    public Double geteIndex() {
        return eIndex;
    }

    public void seteIndex(Double eIndex) {
        this.eIndex = eIndex;
    }

    public String geteIsmoren() {
        return eIsmoren;
    }

    public void seteIsmoren(String eIsmoren) {
        this.eIsmoren = eIsmoren;
    }

    public String geteRemark() {
        return eRemark;
    }

    public void seteRemark(String eRemark) {
        this.eRemark = eRemark;
    }


    @Override
    public String toString() {
        return "TExceldaochumoban{" +
        "eId=" + eId +
        ", eCreateuserid=" + eCreateuserid +
        ", eCreatetime=" + eCreatetime +
        ", eName=" + eName +
        ", eMobanentity=" + eMobanentity +
        ", eMobanseach=" + eMobanseach +
        ", eMobanziduan=" + eMobanziduan +
        ", eIndex=" + eIndex +
        ", eIsmoren=" + eIsmoren +
        ", eRemark=" + eRemark +
        "}";
    }
}

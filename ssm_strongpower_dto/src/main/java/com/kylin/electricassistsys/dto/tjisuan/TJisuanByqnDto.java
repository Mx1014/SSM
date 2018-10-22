package com.kylin.electricassistsys.dto.tjisuan;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJisuanByqnDto extends BaseDto {


    private String nid;
    private String byqid;
    private String jg;
    private String jsnf;
    private String remark;
    private String sdbl;


    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getByqid() {
        return byqid;
    }

    public void setByqid(String byqid) {
        this.byqid = byqid;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getJsnf() {
        return jsnf;
    }

    public void setJsnf(String jsnf) {
        this.jsnf = jsnf;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSdbl() {
        return sdbl;
    }

    public void setSdbl(String sdbl) {
        this.sdbl = sdbl;
    }


    @Override
    public String toString() {
        return "TJisuanByqn{" +
                "nid=" + nid +
                ", byqid=" + byqid +
                ", jg=" + jg +
                ", jsnf=" + jsnf +
                ", remark=" + remark +
                ", sdbl=" + sdbl +
                "}";
    }
}

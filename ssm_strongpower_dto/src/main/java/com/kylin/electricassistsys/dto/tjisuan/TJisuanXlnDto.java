package com.kylin.electricassistsys.dto.tjisuan;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 中压线路N-1校验
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJisuanXlnDto extends BaseDto {


    private String nid;
    private String xlid;
    private String jg;
    private String jsnf;
    private String remark;


    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getXlid() {
        return xlid;
    }

    public void setXlid(String xlid) {
        this.xlid = xlid;
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

    @Override
    public String toString() {
        return "TJisuanXln{" +
                "nid=" + nid +
                ", xlid=" + xlid +
                ", jg=" + jg +
                ", jsnf=" + jsnf +
                ", remark=" + remark +
                "}";
    }
}

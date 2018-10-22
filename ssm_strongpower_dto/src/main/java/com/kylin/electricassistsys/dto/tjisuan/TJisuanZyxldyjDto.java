package com.kylin.electricassistsys.dto.tjisuan;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 计算电压降
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJisuanZyxldyjDto extends BaseDto {


    private String id;
    private String xlid;
    private String nf;
    private Double value;
    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXlid() {
        return xlid;
    }

    public void setXlid(String xlid) {
        this.xlid = xlid;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "TJisuanZyxldyj{" +
                "id=" + id +
                ", xlid=" + xlid +
                ", nf=" + nf +
                ", value=" + value +
                ", remark=" + remark +
                "}";
    }
}

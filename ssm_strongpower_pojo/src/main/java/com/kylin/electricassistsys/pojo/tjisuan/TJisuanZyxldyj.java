package com.kylin.electricassistsys.pojo.tjisuan;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 * 中压线路电压降
 * 计算电压降
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJisuanZyxldyj extends Model<TJisuanZyxldyj> {

    private static final long serialVersionUID = 1L;
    @TableId("id")
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
    protected Serializable pkVal() {
        return this.id;
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

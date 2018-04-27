package com.kylin.electricassistsys.pojo.jcsj;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjJxxx extends Model<TJcsjJxxx> {

    private static final long serialVersionUID = 1L;

    private String tJxid;
    private String tJxname;
    private Double tJxindex;
    private String tJxremark;


    public String gettJxid() {
        return tJxid;
    }

    public void settJxid(String tJxid) {
        this.tJxid = tJxid;
    }

    public String gettJxname() {
        return tJxname;
    }

    public void settJxname(String tJxname) {
        this.tJxname = tJxname;
    }

    public Double gettJxindex() {
        return tJxindex;
    }

    public void settJxindex(Double tJxindex) {
        this.tJxindex = tJxindex;
    }

    public String gettJxremark() {
        return tJxremark;
    }

    public void settJxremark(String tJxremark) {
        this.tJxremark = tJxremark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tJxid;
    }

    @Override
    public String toString() {
        return "TJcsjJxxx{" +
        "tJxid=" + tJxid +
        ", tJxname=" + tJxname +
        ", tJxindex=" + tJxindex +
        ", tJxremark=" + tJxremark +
        "}";
    }
}

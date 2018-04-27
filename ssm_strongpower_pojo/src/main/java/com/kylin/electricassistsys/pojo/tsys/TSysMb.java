package com.kylin.electricassistsys.pojo.tsys;

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
public class TSysMb extends Model<TSysMb> {

    private static final long serialVersionUID = 1L;

    private String tMbid;
    private String tMbname;
    private String tMbremark;


    public String gettMbid() {
        return tMbid;
    }

    public void settMbid(String tMbid) {
        this.tMbid = tMbid;
    }

    public String gettMbname() {
        return tMbname;
    }

    public void settMbname(String tMbname) {
        this.tMbname = tMbname;
    }

    public String gettMbremark() {
        return tMbremark;
    }

    public void settMbremark(String tMbremark) {
        this.tMbremark = tMbremark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tMbid;
    }

    @Override
    public String toString() {
        return "TSysMb{" +
        "tMbid=" + tMbid +
        ", tMbname=" + tMbname +
        ", tMbremark=" + tMbremark +
        "}";
    }
}

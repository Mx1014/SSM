package com.kylin.electricassistsys.pojo.ghdg;

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
public class TGhdgDczjb extends Model<TGhdgDczjb> {

    private static final long serialVersionUID = 1L;

    private String tDczjbId;
    private String tDczjbBh;
    private String tDczjbLx;
    private String tDczjbDw;
    private String tDczjbDwt;


    public String gettDczjbId() {
        return tDczjbId;
    }

    public void settDczjbId(String tDczjbId) {
        this.tDczjbId = tDczjbId;
    }

    public String gettDczjbBh() {
        return tDczjbBh;
    }

    public void settDczjbBh(String tDczjbBh) {
        this.tDczjbBh = tDczjbBh;
    }

    public String gettDczjbLx() {
        return tDczjbLx;
    }

    public void settDczjbLx(String tDczjbLx) {
        this.tDczjbLx = tDczjbLx;
    }

    public String gettDczjbDw() {
        return tDczjbDw;
    }

    public void settDczjbDw(String tDczjbDw) {
        this.tDczjbDw = tDczjbDw;
    }

    public String gettDczjbDwt() {
        return tDczjbDwt;
    }

    public void settDczjbDwt(String tDczjbDwt) {
        this.tDczjbDwt = tDczjbDwt;
    }

    @Override
    protected Serializable pkVal() {
        return this.tDczjbId;
    }

    @Override
    public String toString() {
        return "TGhdgDczjb{" +
        "tDczjbId=" + tDczjbId +
        ", tDczjbBh=" + tDczjbBh +
        ", tDczjbLx=" + tDczjbLx +
        ", tDczjbDw=" + tDczjbDw +
        ", tDczjbDwt=" + tDczjbDwt +
        "}";
    }
}

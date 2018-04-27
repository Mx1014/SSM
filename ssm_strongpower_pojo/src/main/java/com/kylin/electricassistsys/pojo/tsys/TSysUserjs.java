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
public class TSysUserjs extends Model<TSysUserjs> {

    private static final long serialVersionUID = 1L;

    private String tUserjsid;
    private String tUserid;
    private String tJsid;


    public String gettUserjsid() {
        return tUserjsid;
    }

    public void settUserjsid(String tUserjsid) {
        this.tUserjsid = tUserjsid;
    }

    public String gettUserid() {
        return tUserid;
    }

    public void settUserid(String tUserid) {
        this.tUserid = tUserid;
    }

    public String gettJsid() {
        return tJsid;
    }

    public void settJsid(String tJsid) {
        this.tJsid = tJsid;
    }

    @Override
    protected Serializable pkVal() {
        return this.tUserjsid;
    }

    @Override
    public String toString() {
        return "TSysUserjs{" +
        "tUserjsid=" + tUserjsid +
        ", tUserid=" + tUserid +
        ", tJsid=" + tJsid +
        "}";
    }
}

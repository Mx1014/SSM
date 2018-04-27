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
public class TSysLogin extends Model<TSysLogin> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String uId;
    private String uLogin;
    private String uPassword;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuLogin() {
        return uLogin;
    }

    public void setuLogin(String uLogin) {
        this.uLogin = uLogin;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TSysLogin{" +
        "id=" + id +
        ", uId=" + uId +
        ", uLogin=" + uLogin +
        ", uPassword=" + uPassword +
        "}";
    }
}

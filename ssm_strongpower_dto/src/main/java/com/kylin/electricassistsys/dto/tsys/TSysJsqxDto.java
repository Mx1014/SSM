package com.kylin.electricassistsys.dto.tsys;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSysJsqxDto extends BaseDto {


    private String tJsqxid;
    private String tJsid;
    private String tButtonnames;
    private String tQxid;


    public String gettJsqxid() {
        return tJsqxid;
    }

    public void settJsqxid(String tJsqxid) {
        this.tJsqxid = tJsqxid;
    }

    public String gettJsid() {
        return tJsid;
    }

    public void settJsid(String tJsid) {
        this.tJsid = tJsid;
    }

    public String gettButtonnames() {
        return tButtonnames;
    }

    public void settButtonnames(String tButtonnames) {
        this.tButtonnames = tButtonnames;
    }

    public String gettQxid() {
        return tQxid;
    }

    public void settQxid(String tQxid) {
        this.tQxid = tQxid;
    }


    @Override
    public String toString() {
        return "TSysJsqx{" +
                "tJsqxid=" + tJsqxid +
                ", tJsid=" + tJsid +
                ", tButtonnames=" + tButtonnames +
                ", tQxid=" + tQxid +
                "}";
    }
}

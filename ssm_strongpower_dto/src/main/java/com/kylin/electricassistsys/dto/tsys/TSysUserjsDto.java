package com.kylin.electricassistsys.dto.tsys;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSysUserjsDto {


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
    public String toString() {
        return "TSysUserjs{" +
        "tUserjsid=" + tUserjsid +
        ", tUserid=" + tUserid +
        ", tJsid=" + tJsid +
        "}";
    }
}

package com.kylin.electricassistsys.dto.jcsj;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjTyfsDto  {


    private String tTyfsId;
    private String tTyfsName;
    private String tTyfsRemark;


    public String gettTyfsId() {
        return tTyfsId;
    }

    public void settTyfsId(String tTyfsId) {
        this.tTyfsId = tTyfsId;
    }

    public String gettTyfsName() {
        return tTyfsName;
    }

    public void settTyfsName(String tTyfsName) {
        this.tTyfsName = tTyfsName;
    }

    public String gettTyfsRemark() {
        return tTyfsRemark;
    }

    public void settTyfsRemark(String tTyfsRemark) {
        this.tTyfsRemark = tTyfsRemark;
    }


    @Override
    public String toString() {
        return "TJcsjTyfs{" +
        "tTyfsId=" + tTyfsId +
        ", tTyfsName=" + tTyfsName +
        ", tTyfsRemark=" + tTyfsRemark +
        "}";
    }
}

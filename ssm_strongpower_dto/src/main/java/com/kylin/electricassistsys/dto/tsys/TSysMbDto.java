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
public class TSysMbDto extends BaseDto {


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
    public String toString() {
        return "TSysMb{" +
                "tMbid=" + tMbid +
                ", tMbname=" + tMbname +
                ", tMbremark=" + tMbremark +
                "}";
    }
}

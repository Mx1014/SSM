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
public class TSysCwhlDto extends BaseDto {


    private String tCwhlId;
    private String tCwhlSjid;
    private String tCwhlBiao;


    public String gettCwhlId() {
        return tCwhlId;
    }

    public void settCwhlId(String tCwhlId) {
        this.tCwhlId = tCwhlId;
    }

    public String gettCwhlSjid() {
        return tCwhlSjid;
    }

    public void settCwhlSjid(String tCwhlSjid) {
        this.tCwhlSjid = tCwhlSjid;
    }

    public String gettCwhlBiao() {
        return tCwhlBiao;
    }

    public void settCwhlBiao(String tCwhlBiao) {
        this.tCwhlBiao = tCwhlBiao;
    }


    @Override
    public String toString() {
        return "TSysCwhl{" +
                "tCwhlId=" + tCwhlId +
                ", tCwhlSjid=" + tCwhlSjid +
                ", tCwhlBiao=" + tCwhlBiao +
                "}";
    }
}

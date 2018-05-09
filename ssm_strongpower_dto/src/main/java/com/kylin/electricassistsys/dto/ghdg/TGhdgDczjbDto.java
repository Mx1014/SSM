package com.kylin.electricassistsys.dto.ghdg;


import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TGhdgDczjbDto extends BaseDto {

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

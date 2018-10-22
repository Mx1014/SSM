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
public class TGhdgGdqyDto extends BaseDto {

    private String tGdqyId;
    private String tGdqyNf;
    private String tGdqyQygs;
    private String tGdqyXj;
    private String tGdqyZy;
    private String tGhdgKg;
    private String tGhdgDg;
    private String tGhdgQt;


    public String gettGdqyId() {
        return tGdqyId;
    }

    public void settGdqyId(String tGdqyId) {
        this.tGdqyId = tGdqyId;
    }

    public String gettGdqyNf() {
        return tGdqyNf;
    }

    public void settGdqyNf(String tGdqyNf) {
        this.tGdqyNf = tGdqyNf;
    }

    public String gettGdqyQygs() {
        return tGdqyQygs;
    }

    public void settGdqyQygs(String tGdqyQygs) {
        this.tGdqyQygs = tGdqyQygs;
    }

    public String gettGdqyXj() {
        return tGdqyXj;
    }

    public void settGdqyXj(String tGdqyXj) {
        this.tGdqyXj = tGdqyXj;
    }

    public String gettGdqyZy() {
        return tGdqyZy;
    }

    public void settGdqyZy(String tGdqyZy) {
        this.tGdqyZy = tGdqyZy;
    }

    public String gettGhdgKg() {
        return tGhdgKg;
    }

    public void settGhdgKg(String tGhdgKg) {
        this.tGhdgKg = tGhdgKg;
    }

    public String gettGhdgDg() {
        return tGhdgDg;
    }

    public void settGhdgDg(String tGhdgDg) {
        this.tGhdgDg = tGhdgDg;
    }

    public String gettGhdgQt() {
        return tGhdgQt;
    }

    public void settGhdgQt(String tGhdgQt) {
        this.tGhdgQt = tGhdgQt;
    }

    @Override
    public String toString() {
        return "TGhdgGdqy{" +
                "tGdqyId=" + tGdqyId +
                ", tGdqyNf=" + tGdqyNf +
                ", tGdqyQygs=" + tGdqyQygs +
                ", tGdqyXj=" + tGdqyXj +
                ", tGdqyZy=" + tGdqyZy +
                ", tGhdgKg=" + tGhdgKg +
                ", tGhdgDg=" + tGhdgDg +
                ", tGhdgQt=" + tGhdgQt +
                "}";
    }
}

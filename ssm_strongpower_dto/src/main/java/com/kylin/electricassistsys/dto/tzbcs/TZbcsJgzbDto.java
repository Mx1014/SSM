package com.kylin.electricassistsys.dto.tzbcs;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 *
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TZbcsJgzbDto extends BaseDto {


    private String tJgzbId;
    private String tJgzbGqlx;
    private String tJgzbTl;
    private String tJgzbSl;
    private String tJgzbOl;
    private String tJgzbShw;
    private String tJgzbDhw;
    private String tJgzbSfs;
    private String tJgzbDfs;


    public String gettJgzbId() {
        return tJgzbId;
    }

    public void settJgzbId(String tJgzbId) {
        this.tJgzbId = tJgzbId;
    }

    public String gettJgzbGqlx() {
        return tJgzbGqlx;
    }

    public void settJgzbGqlx(String tJgzbGqlx) {
        this.tJgzbGqlx = tJgzbGqlx;
    }

    public String gettJgzbTl() {
        return tJgzbTl;
    }

    public void settJgzbTl(String tJgzbTl) {
        this.tJgzbTl = tJgzbTl;
    }

    public String gettJgzbSl() {
        return tJgzbSl;
    }

    public void settJgzbSl(String tJgzbSl) {
        this.tJgzbSl = tJgzbSl;
    }

    public String gettJgzbOl() {
        return tJgzbOl;
    }

    public void settJgzbOl(String tJgzbOl) {
        this.tJgzbOl = tJgzbOl;
    }

    public String gettJgzbShw() {
        return tJgzbShw;
    }

    public void settJgzbShw(String tJgzbShw) {
        this.tJgzbShw = tJgzbShw;
    }

    public String gettJgzbDhw() {
        return tJgzbDhw;
    }

    public void settJgzbDhw(String tJgzbDhw) {
        this.tJgzbDhw = tJgzbDhw;
    }

    public String gettJgzbSfs() {
        return tJgzbSfs;
    }

    public void settJgzbSfs(String tJgzbSfs) {
        this.tJgzbSfs = tJgzbSfs;
    }

    public String gettJgzbDfs() {
        return tJgzbDfs;
    }

    public void settJgzbDfs(String tJgzbDfs) {
        this.tJgzbDfs = tJgzbDfs;
    }


    @Override
    public String toString() {
        return "TZbcsJgzb{" +
                "tJgzbId=" + tJgzbId +
                ", tJgzbGqlx=" + tJgzbGqlx +
                ", tJgzbTl=" + tJgzbTl +
                ", tJgzbSl=" + tJgzbSl +
                ", tJgzbOl=" + tJgzbOl +
                ", tJgzbShw=" + tJgzbShw +
                ", tJgzbDhw=" + tJgzbDhw +
                ", tJgzbSfs=" + tJgzbSfs +
                ", tJgzbDfs=" + tJgzbDfs +
                "}";
    }
}

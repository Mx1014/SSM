package com.kylin.electricassistsys.pojo.tzbcs;

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
public class TZbcsZhzb extends Model<TZbcsZhzb> {

    private static final long serialVersionUID = 1L;

    private String tZhzbId;
    private String tZhzbGqlx;
    private String tZhzbYhs;
    private String tZhzbHjtdsj;
    private String tZhzbLxbr;
    private String tZhzbZhdyhgl;
    private String tZhzbZgdl;
    private String tZhzbZgfh;
    private String tZhzbJstdsj;


    public String gettZhzbId() {
        return tZhzbId;
    }

    public void settZhzbId(String tZhzbId) {
        this.tZhzbId = tZhzbId;
    }

    public String gettZhzbGqlx() {
        return tZhzbGqlx;
    }

    public void settZhzbGqlx(String tZhzbGqlx) {
        this.tZhzbGqlx = tZhzbGqlx;
    }

    public String gettZhzbYhs() {
        return tZhzbYhs;
    }

    public void settZhzbYhs(String tZhzbYhs) {
        this.tZhzbYhs = tZhzbYhs;
    }

    public String gettZhzbHjtdsj() {
        return tZhzbHjtdsj;
    }

    public void settZhzbHjtdsj(String tZhzbHjtdsj) {
        this.tZhzbHjtdsj = tZhzbHjtdsj;
    }

    public String gettZhzbLxbr() {
        return tZhzbLxbr;
    }

    public void settZhzbLxbr(String tZhzbLxbr) {
        this.tZhzbLxbr = tZhzbLxbr;
    }

    public String gettZhzbZhdyhgl() {
        return tZhzbZhdyhgl;
    }

    public void settZhzbZhdyhgl(String tZhzbZhdyhgl) {
        this.tZhzbZhdyhgl = tZhzbZhdyhgl;
    }

    public String gettZhzbZgdl() {
        return tZhzbZgdl;
    }

    public void settZhzbZgdl(String tZhzbZgdl) {
        this.tZhzbZgdl = tZhzbZgdl;
    }

    public String gettZhzbZgfh() {
        return tZhzbZgfh;
    }

    public void settZhzbZgfh(String tZhzbZgfh) {
        this.tZhzbZgfh = tZhzbZgfh;
    }

    public String gettZhzbJstdsj() {
        return tZhzbJstdsj;
    }

    public void settZhzbJstdsj(String tZhzbJstdsj) {
        this.tZhzbJstdsj = tZhzbJstdsj;
    }

    @Override
    protected Serializable pkVal() {
        return this.tZhzbId;
    }

    @Override
    public String toString() {
        return "TZbcsZhzb{" +
        "tZhzbId=" + tZhzbId +
        ", tZhzbGqlx=" + tZhzbGqlx +
        ", tZhzbYhs=" + tZhzbYhs +
        ", tZhzbHjtdsj=" + tZhzbHjtdsj +
        ", tZhzbLxbr=" + tZhzbLxbr +
        ", tZhzbZhdyhgl=" + tZhzbZhdyhgl +
        ", tZhzbZgdl=" + tZhzbZgdl +
        ", tZhzbZgfh=" + tZhzbZgfh +
        ", tZhzbJstdsj=" + tZhzbJstdsj +
        "}";
    }
}

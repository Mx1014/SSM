package com.kylin.electricassistsys.pojo.ghdg;

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
public class TGhdgXldxjmfb extends Model<TGhdgXldxjmfb> {

    private static final long serialVersionUID = 1L;

    private String tXldxjmfbId;
    private String tXldxjmfbGqlx;
    private String tXldxjmfbDyxllx;
    private String tXldxjmfbDxjm1;
    private String tXldxjmfbDxjmcd1;
    private String tXldxjmfbDxjm2;
    private String tXldxjmfbDxjmcd2;
    private String tXldxjmfbDxjm3;
    private String tXldxjmfbDxjmcd3;


    public String gettXldxjmfbId() {
        return tXldxjmfbId;
    }

    public void settXldxjmfbId(String tXldxjmfbId) {
        this.tXldxjmfbId = tXldxjmfbId;
    }

    public String gettXldxjmfbGqlx() {
        return tXldxjmfbGqlx;
    }

    public void settXldxjmfbGqlx(String tXldxjmfbGqlx) {
        this.tXldxjmfbGqlx = tXldxjmfbGqlx;
    }

    public String gettXldxjmfbDyxllx() {
        return tXldxjmfbDyxllx;
    }

    public void settXldxjmfbDyxllx(String tXldxjmfbDyxllx) {
        this.tXldxjmfbDyxllx = tXldxjmfbDyxllx;
    }

    public String gettXldxjmfbDxjm1() {
        return tXldxjmfbDxjm1;
    }

    public void settXldxjmfbDxjm1(String tXldxjmfbDxjm1) {
        this.tXldxjmfbDxjm1 = tXldxjmfbDxjm1;
    }

    public String gettXldxjmfbDxjmcd1() {
        return tXldxjmfbDxjmcd1;
    }

    public void settXldxjmfbDxjmcd1(String tXldxjmfbDxjmcd1) {
        this.tXldxjmfbDxjmcd1 = tXldxjmfbDxjmcd1;
    }

    public String gettXldxjmfbDxjm2() {
        return tXldxjmfbDxjm2;
    }

    public void settXldxjmfbDxjm2(String tXldxjmfbDxjm2) {
        this.tXldxjmfbDxjm2 = tXldxjmfbDxjm2;
    }

    public String gettXldxjmfbDxjmcd2() {
        return tXldxjmfbDxjmcd2;
    }

    public void settXldxjmfbDxjmcd2(String tXldxjmfbDxjmcd2) {
        this.tXldxjmfbDxjmcd2 = tXldxjmfbDxjmcd2;
    }

    public String gettXldxjmfbDxjm3() {
        return tXldxjmfbDxjm3;
    }

    public void settXldxjmfbDxjm3(String tXldxjmfbDxjm3) {
        this.tXldxjmfbDxjm3 = tXldxjmfbDxjm3;
    }

    public String gettXldxjmfbDxjmcd3() {
        return tXldxjmfbDxjmcd3;
    }

    public void settXldxjmfbDxjmcd3(String tXldxjmfbDxjmcd3) {
        this.tXldxjmfbDxjmcd3 = tXldxjmfbDxjmcd3;
    }

    @Override
    protected Serializable pkVal() {
        return this.tXldxjmfbId;
    }

    @Override
    public String toString() {
        return "TGhdgXldxjmfb{" +
        "tXldxjmfbId=" + tXldxjmfbId +
        ", tXldxjmfbGqlx=" + tXldxjmfbGqlx +
        ", tXldxjmfbDyxllx=" + tXldxjmfbDyxllx +
        ", tXldxjmfbDxjm1=" + tXldxjmfbDxjm1 +
        ", tXldxjmfbDxjmcd1=" + tXldxjmfbDxjmcd1 +
        ", tXldxjmfbDxjm2=" + tXldxjmfbDxjm2 +
        ", tXldxjmfbDxjmcd2=" + tXldxjmfbDxjmcd2 +
        ", tXldxjmfbDxjm3=" + tXldxjmfbDxjm3 +
        ", tXldxjmfbDxjmcd3=" + tXldxjmfbDxjmcd3 +
        "}";
    }
}

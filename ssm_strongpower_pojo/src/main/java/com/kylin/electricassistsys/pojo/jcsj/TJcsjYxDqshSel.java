package com.kylin.electricassistsys.pojo.jcsj;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjYxDqshSel extends Model<TJcsjYxDqshSel> {

    private static final long serialVersionUID = 1L;
    @TableId("T_DQSH_ID")
    private String tDqshId;
    private String tDqshYear;
    private Double tDqshGdp;
    private Double tDqshZzl;
    private Double tDqshCzrk;
    private Double tDqshRjgdp;
    private Double tDqshFirstGdp;
    private Double tDqshSecondGdp;
    private Double tDqshThirdGdp;
    private String tDqshGdqyid;
    private String tDqshQysx;
    private String tDqshQymj;
    private Double tDqshGyzjGdp;
    private Double tDqshFirstZzl;
    private Double tDqshSecondZzl;
    private Double tDqshGyzjZzl;
    private Double tDqshThirdZzl;
    private Double tDqshQshgdzctz;
    private Double tDqshFirstZctz;
    private Double tDqshSecondZctz;
    private Double tDqshThirdZctz;
    private String tDqshPQyid;

    /**
     * 供电分区
     */
    private String tGdfqName;


    public String gettGdfqName() {
        return tGdfqName;
    }

    public void settGdfqName(String tGdfqName) {
        this.tGdfqName = tGdfqName;
    }


    public String gettDqshId() {
        return tDqshId;
    }

    public void settDqshId(String tDqshId) {
        this.tDqshId = tDqshId;
    }

    public String gettDqshYear() {
        return tDqshYear;
    }

    public void settDqshYear(String tDqshYear) {
        this.tDqshYear = tDqshYear;
    }

    public Double gettDqshGdp() {
        return tDqshGdp;
    }

    public void settDqshGdp(Double tDqshGdp) {
        this.tDqshGdp = tDqshGdp;
    }

    public Double gettDqshZzl() {
        return tDqshZzl;
    }

    public void settDqshZzl(Double tDqshZzl) {
        this.tDqshZzl = tDqshZzl;
    }

    public Double gettDqshCzrk() {
        return tDqshCzrk;
    }

    public void settDqshCzrk(Double tDqshCzrk) {
        this.tDqshCzrk = tDqshCzrk;
    }

    public Double gettDqshRjgdp() {
        return tDqshRjgdp;
    }

    public void settDqshRjgdp(Double tDqshRjgdp) {
        this.tDqshRjgdp = tDqshRjgdp;
    }

    public Double gettDqshFirstGdp() {
        return tDqshFirstGdp;
    }

    public void settDqshFirstGdp(Double tDqshFirstGdp) {
        this.tDqshFirstGdp = tDqshFirstGdp;
    }

    public Double gettDqshSecondGdp() {
        return tDqshSecondGdp;
    }

    public void settDqshSecondGdp(Double tDqshSecondGdp) {
        this.tDqshSecondGdp = tDqshSecondGdp;
    }

    public Double gettDqshThirdGdp() {
        return tDqshThirdGdp;
    }

    public void settDqshThirdGdp(Double tDqshThirdGdp) {
        this.tDqshThirdGdp = tDqshThirdGdp;
    }

    public String gettDqshGdqyid() {
        return tDqshGdqyid;
    }

    public void settDqshGdqyid(String tDqshGdqyid) {
        this.tDqshGdqyid = tDqshGdqyid;
    }

    public String gettDqshQysx() {
        return tDqshQysx;
    }

    public void settDqshQysx(String tDqshQysx) {
        this.tDqshQysx = tDqshQysx;
    }

    public String gettDqshQymj() {
        return tDqshQymj;
    }

    public void settDqshQymj(String tDqshQymj) {
        this.tDqshQymj = tDqshQymj;
    }

    public Double gettDqshGyzjGdp() {
        return tDqshGyzjGdp;
    }

    public void settDqshGyzjGdp(Double tDqshGyzjGdp) {
        this.tDqshGyzjGdp = tDqshGyzjGdp;
    }

    public Double gettDqshFirstZzl() {
        return tDqshFirstZzl;
    }

    public void settDqshFirstZzl(Double tDqshFirstZzl) {
        this.tDqshFirstZzl = tDqshFirstZzl;
    }

    public Double gettDqshSecondZzl() {
        return tDqshSecondZzl;
    }

    public void settDqshSecondZzl(Double tDqshSecondZzl) {
        this.tDqshSecondZzl = tDqshSecondZzl;
    }

    public Double gettDqshGyzjZzl() {
        return tDqshGyzjZzl;
    }

    public void settDqshGyzjZzl(Double tDqshGyzjZzl) {
        this.tDqshGyzjZzl = tDqshGyzjZzl;
    }

    public Double gettDqshThirdZzl() {
        return tDqshThirdZzl;
    }

    public void settDqshThirdZzl(Double tDqshThirdZzl) {
        this.tDqshThirdZzl = tDqshThirdZzl;
    }

    public Double gettDqshQshgdzctz() {
        return tDqshQshgdzctz;
    }

    public void settDqshQshgdzctz(Double tDqshQshgdzctz) {
        this.tDqshQshgdzctz = tDqshQshgdzctz;
    }

    public Double gettDqshFirstZctz() {
        return tDqshFirstZctz;
    }

    public void settDqshFirstZctz(Double tDqshFirstZctz) {
        this.tDqshFirstZctz = tDqshFirstZctz;
    }

    public Double gettDqshSecondZctz() {
        return tDqshSecondZctz;
    }

    public void settDqshSecondZctz(Double tDqshSecondZctz) {
        this.tDqshSecondZctz = tDqshSecondZctz;
    }

    public Double gettDqshThirdZctz() {
        return tDqshThirdZctz;
    }

    public void settDqshThirdZctz(Double tDqshThirdZctz) {
        this.tDqshThirdZctz = tDqshThirdZctz;
    }

    public String gettDqshPQyid() {
        return tDqshPQyid;
    }

    public void settDqshPQyid(String tDqshPQyid) {
        this.tDqshPQyid = tDqshPQyid;
    }

    @Override
    protected Serializable pkVal() {
        return this.tDqshId;
    }

    @Override
    public String toString() {
        return "TJcsjYxDqsh{" +
        "tDqshId=" + tDqshId +
        ", tDqshYear=" + tDqshYear +
        ", tDqshGdp=" + tDqshGdp +
        ", tDqshZzl=" + tDqshZzl +
        ", tDqshCzrk=" + tDqshCzrk +
        ", tDqshRjgdp=" + tDqshRjgdp +
        ", tDqshFirstGdp=" + tDqshFirstGdp +
        ", tDqshSecondGdp=" + tDqshSecondGdp +
        ", tDqshThirdGdp=" + tDqshThirdGdp +
        ", tDqshGdqyid=" + tDqshGdqyid +
        ", tDqshQysx=" + tDqshQysx +
        ", tDqshQymj=" + tDqshQymj +
        ", tDqshGyzjGdp=" + tDqshGyzjGdp +
        ", tDqshFirstZzl=" + tDqshFirstZzl +
        ", tDqshSecondZzl=" + tDqshSecondZzl +
        ", tDqshGyzjZzl=" + tDqshGyzjZzl +
        ", tDqshThirdZzl=" + tDqshThirdZzl +
        ", tDqshQshgdzctz=" + tDqshQshgdzctz +
        ", tDqshFirstZctz=" + tDqshFirstZctz +
        ", tDqshSecondZctz=" + tDqshSecondZctz +
        ", tDqshThirdZctz=" + tDqshThirdZctz +
        ", tDqshPQyid=" + tDqshPQyid +
        "}";
    }
}

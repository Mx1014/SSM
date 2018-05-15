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
public class TJcsjYxLsfhdlSel extends Model<TJcsjYxLsfhdlSel> {

    private static final long serialVersionUID = 1L;
    @TableId("T_LSFHDL_ID")
    private String tLsfhdlId;
    private String tLsfhdlQuid;
    private String tLsfhdlYear;
    private String tLsfhdlMaximumload;
    private String tLsfhdlMaximumloadtime;
    private Double tLsfhdlAllsocietyydl;
    private Double tLsfhdlFirstindustryydl;
    private Double tLsfhdlSecondindustryydl;
    private Double tLsfhdlThirdindustryydl;
    private Double tLsfhdlResidentydl;
    private Double tLsfhdlFarmingydl;
    private Double tLsfhdlForestryydl;
    private Double tLsfhdlStockraisingydl;
    private Double tLsfhdlAvocationydl;
    private Double tLsfhdlFisheryydl;
    private Double tLsfhdlIndustryydl;
    private Double tLsfhdlBusinessydl;
    private Double tLsfhdlNetspowerSupply;
    private Double tLsfhdlMonthmaximumload;
    private Double tLsfhdlSupplload;
    private String tLsfhdlGqlx;

    /**
     * 供区类型
     */
    private String tGqlxName;
    /**
     * 供电分区
     */
    private String tGdfqName;

    public String gettGqlxName() {
        return tGqlxName;
    }

    public void settGqlxName(String tGqlxName) {
        this.tGqlxName = tGqlxName;
    }

    public String gettGdfqName() {
        return tGdfqName;
    }

    public void settGdfqName(String tGdfqName) {
        this.tGdfqName = tGdfqName;
    }


    public String gettLsfhdlId() {
        return tLsfhdlId;
    }

    public void settLsfhdlId(String tLsfhdlId) {
        this.tLsfhdlId = tLsfhdlId;
    }

    public String gettLsfhdlQuid() {
        return tLsfhdlQuid;
    }

    public void settLsfhdlQuid(String tLsfhdlQuid) {
        this.tLsfhdlQuid = tLsfhdlQuid;
    }

    public String gettLsfhdlYear() {
        return tLsfhdlYear;
    }

    public void settLsfhdlYear(String tLsfhdlYear) {
        this.tLsfhdlYear = tLsfhdlYear;
    }

    public String gettLsfhdlMaximumload() {
        return tLsfhdlMaximumload;
    }

    public void settLsfhdlMaximumload(String tLsfhdlMaximumload) {
        this.tLsfhdlMaximumload = tLsfhdlMaximumload;
    }

    public String gettLsfhdlMaximumloadtime() {
        return tLsfhdlMaximumloadtime;
    }

    public void settLsfhdlMaximumloadtime(String tLsfhdlMaximumloadtime) {
        this.tLsfhdlMaximumloadtime = tLsfhdlMaximumloadtime;
    }

    public Double gettLsfhdlAllsocietyydl() {
        return tLsfhdlAllsocietyydl;
    }

    public void settLsfhdlAllsocietyydl(Double tLsfhdlAllsocietyydl) {
        this.tLsfhdlAllsocietyydl = tLsfhdlAllsocietyydl;
    }

    public Double gettLsfhdlFirstindustryydl() {
        return tLsfhdlFirstindustryydl;
    }

    public void settLsfhdlFirstindustryydl(Double tLsfhdlFirstindustryydl) {
        this.tLsfhdlFirstindustryydl = tLsfhdlFirstindustryydl;
    }

    public Double gettLsfhdlSecondindustryydl() {
        return tLsfhdlSecondindustryydl;
    }

    public void settLsfhdlSecondindustryydl(Double tLsfhdlSecondindustryydl) {
        this.tLsfhdlSecondindustryydl = tLsfhdlSecondindustryydl;
    }

    public Double gettLsfhdlThirdindustryydl() {
        return tLsfhdlThirdindustryydl;
    }

    public void settLsfhdlThirdindustryydl(Double tLsfhdlThirdindustryydl) {
        this.tLsfhdlThirdindustryydl = tLsfhdlThirdindustryydl;
    }

    public Double gettLsfhdlResidentydl() {
        return tLsfhdlResidentydl;
    }

    public void settLsfhdlResidentydl(Double tLsfhdlResidentydl) {
        this.tLsfhdlResidentydl = tLsfhdlResidentydl;
    }

    public Double gettLsfhdlFarmingydl() {
        return tLsfhdlFarmingydl;
    }

    public void settLsfhdlFarmingydl(Double tLsfhdlFarmingydl) {
        this.tLsfhdlFarmingydl = tLsfhdlFarmingydl;
    }

    public Double gettLsfhdlForestryydl() {
        return tLsfhdlForestryydl;
    }

    public void settLsfhdlForestryydl(Double tLsfhdlForestryydl) {
        this.tLsfhdlForestryydl = tLsfhdlForestryydl;
    }

    public Double gettLsfhdlStockraisingydl() {
        return tLsfhdlStockraisingydl;
    }

    public void settLsfhdlStockraisingydl(Double tLsfhdlStockraisingydl) {
        this.tLsfhdlStockraisingydl = tLsfhdlStockraisingydl;
    }

    public Double gettLsfhdlAvocationydl() {
        return tLsfhdlAvocationydl;
    }

    public void settLsfhdlAvocationydl(Double tLsfhdlAvocationydl) {
        this.tLsfhdlAvocationydl = tLsfhdlAvocationydl;
    }

    public Double gettLsfhdlFisheryydl() {
        return tLsfhdlFisheryydl;
    }

    public void settLsfhdlFisheryydl(Double tLsfhdlFisheryydl) {
        this.tLsfhdlFisheryydl = tLsfhdlFisheryydl;
    }

    public Double gettLsfhdlIndustryydl() {
        return tLsfhdlIndustryydl;
    }

    public void settLsfhdlIndustryydl(Double tLsfhdlIndustryydl) {
        this.tLsfhdlIndustryydl = tLsfhdlIndustryydl;
    }

    public Double gettLsfhdlBusinessydl() {
        return tLsfhdlBusinessydl;
    }

    public void settLsfhdlBusinessydl(Double tLsfhdlBusinessydl) {
        this.tLsfhdlBusinessydl = tLsfhdlBusinessydl;
    }

    public Double gettLsfhdlNetspowerSupply() {
        return tLsfhdlNetspowerSupply;
    }

    public void settLsfhdlNetspowerSupply(Double tLsfhdlNetspowerSupply) {
        this.tLsfhdlNetspowerSupply = tLsfhdlNetspowerSupply;
    }

    public Double gettLsfhdlMonthmaximumload() {
        return tLsfhdlMonthmaximumload;
    }

    public void settLsfhdlMonthmaximumload(Double tLsfhdlMonthmaximumload) {
        this.tLsfhdlMonthmaximumload = tLsfhdlMonthmaximumload;
    }

    public Double gettLsfhdlSupplload() {
        return tLsfhdlSupplload;
    }

    public void settLsfhdlSupplload(Double tLsfhdlSupplload) {
        this.tLsfhdlSupplload = tLsfhdlSupplload;
    }

    public String gettLsfhdlGqlx() {
        return tLsfhdlGqlx;
    }

    public void settLsfhdlGqlx(String tLsfhdlGqlx) {
        this.tLsfhdlGqlx = tLsfhdlGqlx;
    }

    @Override
    protected Serializable pkVal() {
        return this.tLsfhdlId;
    }

    @Override
    public String toString() {
        return "TJcsjYxLsfhdl{" +
                "tLsfhdlId=" + tLsfhdlId +
                ", tLsfhdlQuid=" + tLsfhdlQuid +
                ", tLsfhdlYear=" + tLsfhdlYear +
                ", tLsfhdlMaximumload=" + tLsfhdlMaximumload +
                ", tLsfhdlMaximumloadtime=" + tLsfhdlMaximumloadtime +
                ", tLsfhdlAllsocietyydl=" + tLsfhdlAllsocietyydl +
                ", tLsfhdlFirstindustryydl=" + tLsfhdlFirstindustryydl +
                ", tLsfhdlSecondindustryydl=" + tLsfhdlSecondindustryydl +
                ", tLsfhdlThirdindustryydl=" + tLsfhdlThirdindustryydl +
                ", tLsfhdlResidentydl=" + tLsfhdlResidentydl +
                ", tLsfhdlFarmingydl=" + tLsfhdlFarmingydl +
                ", tLsfhdlForestryydl=" + tLsfhdlForestryydl +
                ", tLsfhdlStockraisingydl=" + tLsfhdlStockraisingydl +
                ", tLsfhdlAvocationydl=" + tLsfhdlAvocationydl +
                ", tLsfhdlFisheryydl=" + tLsfhdlFisheryydl +
                ", tLsfhdlIndustryydl=" + tLsfhdlIndustryydl +
                ", tLsfhdlBusinessydl=" + tLsfhdlBusinessydl +
                ", tLsfhdlNetspowerSupply=" + tLsfhdlNetspowerSupply +
                ", tLsfhdlMonthmaximumload=" + tLsfhdlMonthmaximumload +
                ", tLsfhdlSupplload=" + tLsfhdlSupplload +
                ", tLsfhdlGqlx=" + tLsfhdlGqlx +
                "}";
    }
}

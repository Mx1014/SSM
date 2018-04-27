package com.kylin.electricassistsys.pojo.jcsj;

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
public class TJcsjZyyh extends Model<TJcsjZyyh> {

    private static final long serialVersionUID = 1L;

    private String tZyyhIuId;
    private String tZyyhIuYear;
    private String tZyyhUsername;
    private String tZyyhPowerupVoltageclass;
    private String tZyyhLoadlevel;
    private String tZyyhSeId;
    private String tZyyhTransformercapacity;
    private String tZyyhPowersupplyone;
    private String tZyyhPowersupplytwo;
    private String tZyyhSecurityitemsName;
    private String tZyyhIsmakeplans;
    private String tZyyhIuEndyear;
    private String tZyyhGqlx;


    public String gettZyyhIuId() {
        return tZyyhIuId;
    }

    public void settZyyhIuId(String tZyyhIuId) {
        this.tZyyhIuId = tZyyhIuId;
    }

    public String gettZyyhIuYear() {
        return tZyyhIuYear;
    }

    public void settZyyhIuYear(String tZyyhIuYear) {
        this.tZyyhIuYear = tZyyhIuYear;
    }

    public String gettZyyhUsername() {
        return tZyyhUsername;
    }

    public void settZyyhUsername(String tZyyhUsername) {
        this.tZyyhUsername = tZyyhUsername;
    }

    public String gettZyyhPowerupVoltageclass() {
        return tZyyhPowerupVoltageclass;
    }

    public void settZyyhPowerupVoltageclass(String tZyyhPowerupVoltageclass) {
        this.tZyyhPowerupVoltageclass = tZyyhPowerupVoltageclass;
    }

    public String gettZyyhLoadlevel() {
        return tZyyhLoadlevel;
    }

    public void settZyyhLoadlevel(String tZyyhLoadlevel) {
        this.tZyyhLoadlevel = tZyyhLoadlevel;
    }

    public String gettZyyhSeId() {
        return tZyyhSeId;
    }

    public void settZyyhSeId(String tZyyhSeId) {
        this.tZyyhSeId = tZyyhSeId;
    }

    public String gettZyyhTransformercapacity() {
        return tZyyhTransformercapacity;
    }

    public void settZyyhTransformercapacity(String tZyyhTransformercapacity) {
        this.tZyyhTransformercapacity = tZyyhTransformercapacity;
    }

    public String gettZyyhPowersupplyone() {
        return tZyyhPowersupplyone;
    }

    public void settZyyhPowersupplyone(String tZyyhPowersupplyone) {
        this.tZyyhPowersupplyone = tZyyhPowersupplyone;
    }

    public String gettZyyhPowersupplytwo() {
        return tZyyhPowersupplytwo;
    }

    public void settZyyhPowersupplytwo(String tZyyhPowersupplytwo) {
        this.tZyyhPowersupplytwo = tZyyhPowersupplytwo;
    }

    public String gettZyyhSecurityitemsName() {
        return tZyyhSecurityitemsName;
    }

    public void settZyyhSecurityitemsName(String tZyyhSecurityitemsName) {
        this.tZyyhSecurityitemsName = tZyyhSecurityitemsName;
    }

    public String gettZyyhIsmakeplans() {
        return tZyyhIsmakeplans;
    }

    public void settZyyhIsmakeplans(String tZyyhIsmakeplans) {
        this.tZyyhIsmakeplans = tZyyhIsmakeplans;
    }

    public String gettZyyhIuEndyear() {
        return tZyyhIuEndyear;
    }

    public void settZyyhIuEndyear(String tZyyhIuEndyear) {
        this.tZyyhIuEndyear = tZyyhIuEndyear;
    }

    public String gettZyyhGqlx() {
        return tZyyhGqlx;
    }

    public void settZyyhGqlx(String tZyyhGqlx) {
        this.tZyyhGqlx = tZyyhGqlx;
    }

    @Override
    protected Serializable pkVal() {
        return this.tZyyhIuId;
    }

    @Override
    public String toString() {
        return "TJcsjZyyh{" +
        "tZyyhIuId=" + tZyyhIuId +
        ", tZyyhIuYear=" + tZyyhIuYear +
        ", tZyyhUsername=" + tZyyhUsername +
        ", tZyyhPowerupVoltageclass=" + tZyyhPowerupVoltageclass +
        ", tZyyhLoadlevel=" + tZyyhLoadlevel +
        ", tZyyhSeId=" + tZyyhSeId +
        ", tZyyhTransformercapacity=" + tZyyhTransformercapacity +
        ", tZyyhPowersupplyone=" + tZyyhPowersupplyone +
        ", tZyyhPowersupplytwo=" + tZyyhPowersupplytwo +
        ", tZyyhSecurityitemsName=" + tZyyhSecurityitemsName +
        ", tZyyhIsmakeplans=" + tZyyhIsmakeplans +
        ", tZyyhIuEndyear=" + tZyyhIuEndyear +
        ", tZyyhGqlx=" + tZyyhGqlx +
        "}";
    }
}

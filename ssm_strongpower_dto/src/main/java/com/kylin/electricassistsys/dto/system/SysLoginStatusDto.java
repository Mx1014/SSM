package com.kylin.electricassistsys.dto.system;

import com.kylin.electricassistsys.dto.base.BaseDto;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author ${author}
 * @since 2018-10-22
 */
public class SysLoginStatusDto extends BaseDto {

    private Double id;
    private Double sysUserId;
    private String sessionId;
    private Date sessionExpires;
    private String sysUserLoginName;
    private String sysUserZhName;
    private Date lastLoginTime;
    private Double platform;
    private Double rank;
    private Date createTime;
    private Date updateTime;
    private Double createBy;
    private Double updateBy;
    private Double status;


    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Double sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getSessionExpires() {
        return sessionExpires;
    }

    public void setSessionExpires(Date sessionExpires) {
        this.sessionExpires = sessionExpires;
    }

    public String getSysUserLoginName() {
        return sysUserLoginName;
    }

    public void setSysUserLoginName(String sysUserLoginName) {
        this.sysUserLoginName = sysUserLoginName;
    }

    public String getSysUserZhName() {
        return sysUserZhName;
    }

    public void setSysUserZhName(String sysUserZhName) {
        this.sysUserZhName = sysUserZhName;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Double getPlatform() {
        return platform;
    }

    public void setPlatform(Double platform) {
        this.platform = platform;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Double getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Double createBy) {
        this.createBy = createBy;
    }

    public Double getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Double updateBy) {
        this.updateBy = updateBy;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SysLoginStatus{" +
                "id=" + id +
                ", sysUserId=" + sysUserId +
                ", sessionId=" + sessionId +
                ", sessionExpires=" + sessionExpires +
                ", sysUserLoginName=" + sysUserLoginName +
                ", sysUserZhName=" + sysUserZhName +
                ", lastLoginTime=" + lastLoginTime +
                ", platform=" + platform +
                ", rank=" + rank +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createBy=" + createBy +
                ", updateBy=" + updateBy +
                ", status=" + status +
                "}";
    }
}

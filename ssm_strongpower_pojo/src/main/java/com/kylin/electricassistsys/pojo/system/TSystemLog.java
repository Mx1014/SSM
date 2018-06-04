package com.kylin.electricassistsys.pojo.system;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;

/**
 * <p>
 * 用户操作日志记录表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-06-01
 */
public class TSystemLog extends Model<TSystemLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 日志主键id
     */
    private String id;
    /**
     * 用户的ip地址
     */
    private String userIp;
    /**
     * 用户操作的方法
     */
    private String userMethod;
    /**
     * 用户操作的时间
     */
    private String userOperationTime;
    /**
     * 用户的姓名
     */
    private String userName;
    /**
     * 用户操作是否合法
     */
    private String userOperationLegitimate;
    /**
     * 用户操作的参数
     */
    private String userParameters;
    /**
     * 用戶操作返回結果
     */
    private String userResult;
    /**
     * 用戶操作持續時間
     */
    private Long userDuration;
    /**
     * 用戶的id
     */
    private String userId;
    /**
     * 请求ua标识
     */
    private String userAgent;
    /**
     * 数据状态,1:正常,2:删除
     */
    private Long dataStatus;
    /**
     * 用户操作的url请求地址
     */
    @TableField("USER_URL")
    private String userURL;

    public String getUserURL() {
        return userURL;
    }

    public void setUserURL(String userURL) {
        this.userURL = userURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getUserMethod() {
        return userMethod;
    }

    public void setUserMethod(String userMethod) {
        this.userMethod = userMethod;
    }

    public String getUserOperationTime() {
        return userOperationTime;
    }

    public void setUserOperationTime(String userOperationTime) {
        this.userOperationTime = userOperationTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserOperationLegitimate() {
        return userOperationLegitimate;
    }

    public void setUserOperationLegitimate(String userOperationLegitimate) {
        this.userOperationLegitimate = userOperationLegitimate;
    }

    public String getUserParameters() {
        return userParameters;
    }

    public void setUserParameters(String userParameters) {
        this.userParameters = userParameters;
    }

    public String getUserResult() {
        return userResult;
    }

    public void setUserResult(String userResult) {
        this.userResult = userResult;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Long getUserDuration() {
        return userDuration;
    }

    public void setUserDuration(Long userDuration) {
        this.userDuration = userDuration;
    }

    public Long getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Long dataStatus) {
        this.dataStatus = dataStatus;
    }

    @Override
    public String toString() {
        return "TSystemLog{" +
        "id=" + id +
        ", userIp=" + userIp +
        ", userMethod=" + userMethod +
        ", userOperationTime=" + userOperationTime +
        ", userName=" + userName +
        ", userOperationLegitimate=" + userOperationLegitimate +
        ", userParameters=" + userParameters +
        ", userResult=" + userResult +
        ", userDuration=" + userDuration +
        ", userId=" + userId +
        ", userAgent=" + userAgent +
        ", dataStatus=" + dataStatus +
        "}";
    }

    protected Serializable pkVal() {
        return this.id;
    }
}

package com.kylin.electricassistsys.pojo.system;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户操作日志记录表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-05-10
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
     * 用户操作的参数
     */
    private String userParameters;
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

    public String getUserParameters() {
        return userParameters;
    }

    public void setUserParameters(String userParameters) {
        this.userParameters = userParameters;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TSystemLog{" +
        "id=" + id +
        ", userIp=" + userIp +
        ", userMethod=" + userMethod +
        ", userParameters=" + userParameters +
        ", userOperationTime=" + userOperationTime +
        ", userName=" + userName +
        ", userOperationLegitimate=" + userOperationLegitimate +
        "}";
    }
}

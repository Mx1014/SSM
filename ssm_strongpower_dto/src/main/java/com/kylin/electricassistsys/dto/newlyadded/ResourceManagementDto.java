package com.kylin.electricassistsys.dto.newlyadded;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * @Auther: cwx
 * @Date: 2018/5/23 13:58
 * @Description: 资源管理数据数据转换类
 */
public class ResourceManagementDto
extends BaseDto {
    /**
     * 主键ID
     */
    private String tBdzxxId;
    /**
     * 电压等级(KV)
     */
    private String tBdzxxDydj;
    /**
     *变压器的名字
     */
    private String tDycsName;
    /**
     * 变电站名称
     */
    private String tBdzxxName;
    /**
     *出线间隔总数
     */
    private String tBdzxxCxjg;
    /**
     *已用出线间隔总数
     */
    private String tBdzxxYy;

    public String gettBdzxxId() {

        return tBdzxxId;
    }

    public void settBdzxxId(String tBdzxxId) {
        this.tBdzxxId = tBdzxxId;
    }

    public String gettBdzxxDydj() {
        return tBdzxxDydj;
    }

    public void settBdzxxDydj(String tBdzxxDydj) {
        this.tBdzxxDydj = tBdzxxDydj;
    }

    public String gettDycsName() {
        return tDycsName;
    }

    public void settDycsName(String tDycsName) {
        this.tDycsName = tDycsName;
    }

    public String gettBdzxxName() {
        return tBdzxxName;
    }

    public void settBdzxxName(String tBdzxxName) {
        this.tBdzxxName = tBdzxxName;
    }

    public String gettBdzxxCxjg() {
        return tBdzxxCxjg;
    }

    public void settBdzxxCxjg(String tBdzxxCxjg) {
        this.tBdzxxCxjg = tBdzxxCxjg;
    }

    public String gettBdzxxYy() {
        return tBdzxxYy;
    }

    public void settBdzxxYy(String tBdzxxYy) {
        this.tBdzxxYy = tBdzxxYy;
    }
    @Override
    public String toString() {
        return "ResourceManagement{" +
                "tBdzxxId='" + tBdzxxId + '\'' +
                ", tBdzxxDydj='" + tBdzxxDydj + '\'' +
                ", tDycsName='" + tDycsName + '\'' +
                ", tBdzxxName='" + tBdzxxName + '\'' +
                ", tBdzxxCxjg='" + tBdzxxCxjg + '\'' +
                ", tBdzxxYy='" + tBdzxxYy + '\'' +
                '}';
    }
}

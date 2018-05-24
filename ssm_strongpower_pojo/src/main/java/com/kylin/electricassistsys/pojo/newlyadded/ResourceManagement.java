package com.kylin.electricassistsys.pojo.newlyadded;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * @Auther: cwx
 * @Date: 2018/5/23 13:58
 * @Description: 资源管理数据基础类
 */
@TableName("T_SBSJ_BDZXX")
public class ResourceManagement extends Model<ResourceManagement> {
    /**
     * 主键ID
     */
    @TableId("t_bdzxx_id")
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
    protected Serializable pkVal() {
        return this.tBdzxxId;
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

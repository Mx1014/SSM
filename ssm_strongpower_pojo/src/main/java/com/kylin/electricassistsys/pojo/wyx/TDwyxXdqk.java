package com.kylin.electricassistsys.pojo.wyx;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 拉闸/限电情况
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TDwyxXdqk extends Model<TDwyxXdqk> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String tXdqkId;
    /**
     * 线路名称
     */
    private String tXdqkXlmc;
    /**
     * 电压等级
     */
    private String tXdqkDydj;
    /**
     * 拉限性质
     */
    private String tXdqkLxxz;
    /**
     * 起始时间
     */
    private String tXdqkQssj;
    /**
     * 拉闸负荷
     */
    private String tXdqkLxfh;
    /**
     * 恢复时间
     */
    private String tXdqkHfsj;
    /**
     * 最大拉闸负荷
     */
    private String tXdqkZdlxfh;
    /**
     * 平均拉闸负荷
     */
    private String tXdqkPjlxfh;
    /**
     * 累计拉闸电量
     */
    private String tXdqkLjlxdl;
    /**
     * 最大移峰负荷
     */
    private String tXdqkZdyffh;
    /**
     * 移峰损失电量
     */
    private String tXdqkYfssdl;
    /**
     * 移峰转移电量
     */
    private String tXdqkYfzydl;
    /**
     * 最大错峰
     */
    private String tXdqkZdcf;
    /**
     * 最大避峰
     */
    private String tXdqkZdbf;
    /**
     * 最大负控限电
     */
    private String tXdqkZdfkxd;
    /**
     * 拉限天数
     */
    private String tXdqkLxts;
    /**
     * 移峰天数
     */
    private String tXdqkYfts;
    /**
     * 父节点
     */
    private String tXdqkPid;
    /**
     * 供电公司
     */
    private String tXdqkGdgs;
    /**
     * 备注
     */
    private String tXdqkBz;
    /**
     * 年月
     */
    private String tXdqkNy;


    public String gettXdqkId() {
        return tXdqkId;
    }

    public void settXdqkId(String tXdqkId) {
        this.tXdqkId = tXdqkId;
    }

    public String gettXdqkXlmc() {
        return tXdqkXlmc;
    }

    public void settXdqkXlmc(String tXdqkXlmc) {
        this.tXdqkXlmc = tXdqkXlmc;
    }

    public String gettXdqkDydj() {
        return tXdqkDydj;
    }

    public void settXdqkDydj(String tXdqkDydj) {
        this.tXdqkDydj = tXdqkDydj;
    }

    public String gettXdqkLxxz() {
        return tXdqkLxxz;
    }

    public void settXdqkLxxz(String tXdqkLxxz) {
        this.tXdqkLxxz = tXdqkLxxz;
    }

    public String gettXdqkQssj() {
        return tXdqkQssj;
    }

    public void settXdqkQssj(String tXdqkQssj) {
        this.tXdqkQssj = tXdqkQssj;
    }

    public String gettXdqkLxfh() {
        return tXdqkLxfh;
    }

    public void settXdqkLxfh(String tXdqkLxfh) {
        this.tXdqkLxfh = tXdqkLxfh;
    }

    public String gettXdqkHfsj() {
        return tXdqkHfsj;
    }

    public void settXdqkHfsj(String tXdqkHfsj) {
        this.tXdqkHfsj = tXdqkHfsj;
    }

    public String gettXdqkZdlxfh() {
        return tXdqkZdlxfh;
    }

    public void settXdqkZdlxfh(String tXdqkZdlxfh) {
        this.tXdqkZdlxfh = tXdqkZdlxfh;
    }

    public String gettXdqkPjlxfh() {
        return tXdqkPjlxfh;
    }

    public void settXdqkPjlxfh(String tXdqkPjlxfh) {
        this.tXdqkPjlxfh = tXdqkPjlxfh;
    }

    public String gettXdqkLjlxdl() {
        return tXdqkLjlxdl;
    }

    public void settXdqkLjlxdl(String tXdqkLjlxdl) {
        this.tXdqkLjlxdl = tXdqkLjlxdl;
    }

    public String gettXdqkZdyffh() {
        return tXdqkZdyffh;
    }

    public void settXdqkZdyffh(String tXdqkZdyffh) {
        this.tXdqkZdyffh = tXdqkZdyffh;
    }

    public String gettXdqkYfssdl() {
        return tXdqkYfssdl;
    }

    public void settXdqkYfssdl(String tXdqkYfssdl) {
        this.tXdqkYfssdl = tXdqkYfssdl;
    }

    public String gettXdqkYfzydl() {
        return tXdqkYfzydl;
    }

    public void settXdqkYfzydl(String tXdqkYfzydl) {
        this.tXdqkYfzydl = tXdqkYfzydl;
    }

    public String gettXdqkZdcf() {
        return tXdqkZdcf;
    }

    public void settXdqkZdcf(String tXdqkZdcf) {
        this.tXdqkZdcf = tXdqkZdcf;
    }

    public String gettXdqkZdbf() {
        return tXdqkZdbf;
    }

    public void settXdqkZdbf(String tXdqkZdbf) {
        this.tXdqkZdbf = tXdqkZdbf;
    }

    public String gettXdqkZdfkxd() {
        return tXdqkZdfkxd;
    }

    public void settXdqkZdfkxd(String tXdqkZdfkxd) {
        this.tXdqkZdfkxd = tXdqkZdfkxd;
    }

    public String gettXdqkLxts() {
        return tXdqkLxts;
    }

    public void settXdqkLxts(String tXdqkLxts) {
        this.tXdqkLxts = tXdqkLxts;
    }

    public String gettXdqkYfts() {
        return tXdqkYfts;
    }

    public void settXdqkYfts(String tXdqkYfts) {
        this.tXdqkYfts = tXdqkYfts;
    }

    public String gettXdqkPid() {
        return tXdqkPid;
    }

    public void settXdqkPid(String tXdqkPid) {
        this.tXdqkPid = tXdqkPid;
    }

    public String gettXdqkGdgs() {
        return tXdqkGdgs;
    }

    public void settXdqkGdgs(String tXdqkGdgs) {
        this.tXdqkGdgs = tXdqkGdgs;
    }

    public String gettXdqkBz() {
        return tXdqkBz;
    }

    public void settXdqkBz(String tXdqkBz) {
        this.tXdqkBz = tXdqkBz;
    }

    public String gettXdqkNy() {
        return tXdqkNy;
    }

    public void settXdqkNy(String tXdqkNy) {
        this.tXdqkNy = tXdqkNy;
    }

    @Override
    protected Serializable pkVal() {
        return this.tXdqkId;
    }

    @Override
    public String toString() {
        return "TDwyxXdqk{" +
        "tXdqkId=" + tXdqkId +
        ", tXdqkXlmc=" + tXdqkXlmc +
        ", tXdqkDydj=" + tXdqkDydj +
        ", tXdqkLxxz=" + tXdqkLxxz +
        ", tXdqkQssj=" + tXdqkQssj +
        ", tXdqkLxfh=" + tXdqkLxfh +
        ", tXdqkHfsj=" + tXdqkHfsj +
        ", tXdqkZdlxfh=" + tXdqkZdlxfh +
        ", tXdqkPjlxfh=" + tXdqkPjlxfh +
        ", tXdqkLjlxdl=" + tXdqkLjlxdl +
        ", tXdqkZdyffh=" + tXdqkZdyffh +
        ", tXdqkYfssdl=" + tXdqkYfssdl +
        ", tXdqkYfzydl=" + tXdqkYfzydl +
        ", tXdqkZdcf=" + tXdqkZdcf +
        ", tXdqkZdbf=" + tXdqkZdbf +
        ", tXdqkZdfkxd=" + tXdqkZdfkxd +
        ", tXdqkLxts=" + tXdqkLxts +
        ", tXdqkYfts=" + tXdqkYfts +
        ", tXdqkPid=" + tXdqkPid +
        ", tXdqkGdgs=" + tXdqkGdgs +
        ", tXdqkBz=" + tXdqkBz +
        ", tXdqkNy=" + tXdqkNy +
        "}";
    }
}

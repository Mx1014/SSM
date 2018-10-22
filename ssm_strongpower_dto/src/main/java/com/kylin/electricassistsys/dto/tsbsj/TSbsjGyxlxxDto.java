package com.kylin.electricassistsys.dto.tsbsj;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 高压线路信息
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSbsjGyxlxxDto extends BaseDto {


    /**
     * 数据标示
     */
    private String tGyxlxxId;
    /**
     * 线路编号
     */
    private String tGyxlxxXlbh;
    /**
     * 线路名称
     */
    private String tGyxlxxXlmc;
    /**
     * 数据年份
     */
    private String tGyxlxxSjnf;
    /**
     * 电压等级
     */
    private String tGyxlxxDydj;
    /**
     * 所属区域
     */
    private String tGyxlxxSsqy;
    /**
     * 运维单位
     */
    private String tGyxlxxYwdw;
    /**
     * 使用方式
     */
    private String tGyxlxxSyfs;
    /**
     * 城农网
     */
    private String tGyxlxxYnw;
    /**
     * CT变比
     */
    private String tGyxlxxCtbb;
    /**
     * (实际)起点，如：变电站或者电源或T接线
     */
    private String tGyxlxxSjqd;
    /**
     * 终点(变电站)
     */
    private String tGyxlxxSjzd;
    /**
     * 开关编号首
     */
    private String tGyxlxxKgbhs;
    /**
     * 开关编号末
     */
    private String tGyxlxxKgbhm;
    /**
     * 起始杆号
     */
    private String tGyxlxxQsgh;
    /**
     * 投运时间
     */
    private String tGyxlxxTysj;
    /**
     * 退役时间
     */
    private String tGyxlxxTuiyisj;
    /**
     * 状态，有退役日期为退役，否则为运行
     */
    private String tGyxlxxZt;
    /**
     * 电缆(全线)
     */
    private String tGyxlxxDlQx;
    /**
     * 架空导线,全线
     */
    private String tGyxlxxJkdxQx;
    /**
     * 总长(全线)
     */
    private String tGyxlxxZcQx;
    /**
     * 最小截面导线
     */
    private String tGyxlxxZxjmdx;
    /**
     * 最大允许电流
     */
    private String tGyxlxxZdyxdl;
    /**
     * 是否CT影响
     */
    private String tGyxlxxSfyxct;
    /**
     * 备注
     */
    private String tGyxlxxBz;
    /**
     * 其中同塔双回
     */
    private String tGyxlxxQzttsh;
    /**
     * 导线型号一
     */
    private String tGyxlxxDxxh1;
    /**
     * 导线型号二
     */
    private String tGyxlxxDxxh2;
    /**
     * 导线型号三
     */
    private String tGyxlxxDxxh3;
    /**
     * 架设方式
     */
    private String tGyxlxxJsfs;
    /**
     * 电阻
     */
    private String tGyxlxxDz;
    /**
     * 电抗
     */
    private String tGyxlxxDk;
    /**
     * 终端杆号
     */
    private String tGyxlxxZdgh;
    /**
     * 供区类型
     */
    private String tGyxlxxGqlx;
    /**
     * 起点类型
     */
    private String tGyxlxxQdlx;
    /**
     * 终点类型
     */
    private String tGyxlxxZdlx;
    /**
     * 电缆型号
     */
    private String tGyxlxxDlxh;
    /**
     * 分段数
     */
    private String tGyxlxxFds;
    /**
     * 分段长度
     */
    private String tGyxlxxFdcd;
    /**
     * 敷设方式
     */
    private String tGyxlxxFsfs;
    /**
     * 供电区属性
     */
    private String tGyxlxxGdqsx;
    /**
     * 供电性质
     */
    private String tGyxlxxGdxz;
    /**
     * 是否满足N-1
     */
    private String tGyxlxxN1;
    /**
     * 电网结构链接
     */
    private String tGyxlxxDwjg;


    public String gettGyxlxxId() {
        return tGyxlxxId;
    }

    public void settGyxlxxId(String tGyxlxxId) {
        this.tGyxlxxId = tGyxlxxId;
    }

    public String gettGyxlxxXlbh() {
        return tGyxlxxXlbh;
    }

    public void settGyxlxxXlbh(String tGyxlxxXlbh) {
        this.tGyxlxxXlbh = tGyxlxxXlbh;
    }

    public String gettGyxlxxXlmc() {
        return tGyxlxxXlmc;
    }

    public void settGyxlxxXlmc(String tGyxlxxXlmc) {
        this.tGyxlxxXlmc = tGyxlxxXlmc;
    }

    public String gettGyxlxxSjnf() {
        return tGyxlxxSjnf;
    }

    public void settGyxlxxSjnf(String tGyxlxxSjnf) {
        this.tGyxlxxSjnf = tGyxlxxSjnf;
    }

    public String gettGyxlxxDydj() {
        return tGyxlxxDydj;
    }

    public void settGyxlxxDydj(String tGyxlxxDydj) {
        this.tGyxlxxDydj = tGyxlxxDydj;
    }

    public String gettGyxlxxSsqy() {
        return tGyxlxxSsqy;
    }

    public void settGyxlxxSsqy(String tGyxlxxSsqy) {
        this.tGyxlxxSsqy = tGyxlxxSsqy;
    }

    public String gettGyxlxxYwdw() {
        return tGyxlxxYwdw;
    }

    public void settGyxlxxYwdw(String tGyxlxxYwdw) {
        this.tGyxlxxYwdw = tGyxlxxYwdw;
    }

    public String gettGyxlxxSyfs() {
        return tGyxlxxSyfs;
    }

    public void settGyxlxxSyfs(String tGyxlxxSyfs) {
        this.tGyxlxxSyfs = tGyxlxxSyfs;
    }

    public String gettGyxlxxYnw() {
        return tGyxlxxYnw;
    }

    public void settGyxlxxYnw(String tGyxlxxYnw) {
        this.tGyxlxxYnw = tGyxlxxYnw;
    }

    public String gettGyxlxxCtbb() {
        return tGyxlxxCtbb;
    }

    public void settGyxlxxCtbb(String tGyxlxxCtbb) {
        this.tGyxlxxCtbb = tGyxlxxCtbb;
    }

    public String gettGyxlxxSjqd() {
        return tGyxlxxSjqd;
    }

    public void settGyxlxxSjqd(String tGyxlxxSjqd) {
        this.tGyxlxxSjqd = tGyxlxxSjqd;
    }

    public String gettGyxlxxSjzd() {
        return tGyxlxxSjzd;
    }

    public void settGyxlxxSjzd(String tGyxlxxSjzd) {
        this.tGyxlxxSjzd = tGyxlxxSjzd;
    }

    public String gettGyxlxxKgbhs() {
        return tGyxlxxKgbhs;
    }

    public void settGyxlxxKgbhs(String tGyxlxxKgbhs) {
        this.tGyxlxxKgbhs = tGyxlxxKgbhs;
    }

    public String gettGyxlxxKgbhm() {
        return tGyxlxxKgbhm;
    }

    public void settGyxlxxKgbhm(String tGyxlxxKgbhm) {
        this.tGyxlxxKgbhm = tGyxlxxKgbhm;
    }

    public String gettGyxlxxQsgh() {
        return tGyxlxxQsgh;
    }

    public void settGyxlxxQsgh(String tGyxlxxQsgh) {
        this.tGyxlxxQsgh = tGyxlxxQsgh;
    }

    public String gettGyxlxxTysj() {
        return tGyxlxxTysj;
    }

    public void settGyxlxxTysj(String tGyxlxxTysj) {
        this.tGyxlxxTysj = tGyxlxxTysj;
    }

    public String gettGyxlxxTuiyisj() {
        return tGyxlxxTuiyisj;
    }

    public void settGyxlxxTuiyisj(String tGyxlxxTuiyisj) {
        this.tGyxlxxTuiyisj = tGyxlxxTuiyisj;
    }

    public String gettGyxlxxZt() {
        return tGyxlxxZt;
    }

    public void settGyxlxxZt(String tGyxlxxZt) {
        this.tGyxlxxZt = tGyxlxxZt;
    }

    public String gettGyxlxxDlQx() {
        return tGyxlxxDlQx;
    }

    public void settGyxlxxDlQx(String tGyxlxxDlQx) {
        this.tGyxlxxDlQx = tGyxlxxDlQx;
    }

    public String gettGyxlxxJkdxQx() {
        return tGyxlxxJkdxQx;
    }

    public void settGyxlxxJkdxQx(String tGyxlxxJkdxQx) {
        this.tGyxlxxJkdxQx = tGyxlxxJkdxQx;
    }

    public String gettGyxlxxZcQx() {
        return tGyxlxxZcQx;
    }

    public void settGyxlxxZcQx(String tGyxlxxZcQx) {
        this.tGyxlxxZcQx = tGyxlxxZcQx;
    }

    public String gettGyxlxxZxjmdx() {
        return tGyxlxxZxjmdx;
    }

    public void settGyxlxxZxjmdx(String tGyxlxxZxjmdx) {
        this.tGyxlxxZxjmdx = tGyxlxxZxjmdx;
    }

    public String gettGyxlxxZdyxdl() {
        return tGyxlxxZdyxdl;
    }

    public void settGyxlxxZdyxdl(String tGyxlxxZdyxdl) {
        this.tGyxlxxZdyxdl = tGyxlxxZdyxdl;
    }

    public String gettGyxlxxSfyxct() {
        return tGyxlxxSfyxct;
    }

    public void settGyxlxxSfyxct(String tGyxlxxSfyxct) {
        this.tGyxlxxSfyxct = tGyxlxxSfyxct;
    }

    public String gettGyxlxxBz() {
        return tGyxlxxBz;
    }

    public void settGyxlxxBz(String tGyxlxxBz) {
        this.tGyxlxxBz = tGyxlxxBz;
    }

    public String gettGyxlxxQzttsh() {
        return tGyxlxxQzttsh;
    }

    public void settGyxlxxQzttsh(String tGyxlxxQzttsh) {
        this.tGyxlxxQzttsh = tGyxlxxQzttsh;
    }

    public String gettGyxlxxDxxh1() {
        return tGyxlxxDxxh1;
    }

    public void settGyxlxxDxxh1(String tGyxlxxDxxh1) {
        this.tGyxlxxDxxh1 = tGyxlxxDxxh1;
    }

    public String gettGyxlxxDxxh2() {
        return tGyxlxxDxxh2;
    }

    public void settGyxlxxDxxh2(String tGyxlxxDxxh2) {
        this.tGyxlxxDxxh2 = tGyxlxxDxxh2;
    }

    public String gettGyxlxxDxxh3() {
        return tGyxlxxDxxh3;
    }

    public void settGyxlxxDxxh3(String tGyxlxxDxxh3) {
        this.tGyxlxxDxxh3 = tGyxlxxDxxh3;
    }

    public String gettGyxlxxJsfs() {
        return tGyxlxxJsfs;
    }

    public void settGyxlxxJsfs(String tGyxlxxJsfs) {
        this.tGyxlxxJsfs = tGyxlxxJsfs;
    }

    public String gettGyxlxxDz() {
        return tGyxlxxDz;
    }

    public void settGyxlxxDz(String tGyxlxxDz) {
        this.tGyxlxxDz = tGyxlxxDz;
    }

    public String gettGyxlxxDk() {
        return tGyxlxxDk;
    }

    public void settGyxlxxDk(String tGyxlxxDk) {
        this.tGyxlxxDk = tGyxlxxDk;
    }

    public String gettGyxlxxZdgh() {
        return tGyxlxxZdgh;
    }

    public void settGyxlxxZdgh(String tGyxlxxZdgh) {
        this.tGyxlxxZdgh = tGyxlxxZdgh;
    }

    public String gettGyxlxxGqlx() {
        return tGyxlxxGqlx;
    }

    public void settGyxlxxGqlx(String tGyxlxxGqlx) {
        this.tGyxlxxGqlx = tGyxlxxGqlx;
    }

    public String gettGyxlxxQdlx() {
        return tGyxlxxQdlx;
    }

    public void settGyxlxxQdlx(String tGyxlxxQdlx) {
        this.tGyxlxxQdlx = tGyxlxxQdlx;
    }

    public String gettGyxlxxZdlx() {
        return tGyxlxxZdlx;
    }

    public void settGyxlxxZdlx(String tGyxlxxZdlx) {
        this.tGyxlxxZdlx = tGyxlxxZdlx;
    }

    public String gettGyxlxxDlxh() {
        return tGyxlxxDlxh;
    }

    public void settGyxlxxDlxh(String tGyxlxxDlxh) {
        this.tGyxlxxDlxh = tGyxlxxDlxh;
    }

    public String gettGyxlxxFds() {
        return tGyxlxxFds;
    }

    public void settGyxlxxFds(String tGyxlxxFds) {
        this.tGyxlxxFds = tGyxlxxFds;
    }

    public String gettGyxlxxFdcd() {
        return tGyxlxxFdcd;
    }

    public void settGyxlxxFdcd(String tGyxlxxFdcd) {
        this.tGyxlxxFdcd = tGyxlxxFdcd;
    }

    public String gettGyxlxxFsfs() {
        return tGyxlxxFsfs;
    }

    public void settGyxlxxFsfs(String tGyxlxxFsfs) {
        this.tGyxlxxFsfs = tGyxlxxFsfs;
    }

    public String gettGyxlxxGdqsx() {
        return tGyxlxxGdqsx;
    }

    public void settGyxlxxGdqsx(String tGyxlxxGdqsx) {
        this.tGyxlxxGdqsx = tGyxlxxGdqsx;
    }

    public String gettGyxlxxGdxz() {
        return tGyxlxxGdxz;
    }

    public void settGyxlxxGdxz(String tGyxlxxGdxz) {
        this.tGyxlxxGdxz = tGyxlxxGdxz;
    }

    public String gettGyxlxxN1() {
        return tGyxlxxN1;
    }

    public void settGyxlxxN1(String tGyxlxxN1) {
        this.tGyxlxxN1 = tGyxlxxN1;
    }

    public String gettGyxlxxDwjg() {
        return tGyxlxxDwjg;
    }

    public void settGyxlxxDwjg(String tGyxlxxDwjg) {
        this.tGyxlxxDwjg = tGyxlxxDwjg;
    }


    @Override
    public String toString() {
        return "TSbsjGyxlxx{" +
                "tGyxlxxId=" + tGyxlxxId +
                ", tGyxlxxXlbh=" + tGyxlxxXlbh +
                ", tGyxlxxXlmc=" + tGyxlxxXlmc +
                ", tGyxlxxSjnf=" + tGyxlxxSjnf +
                ", tGyxlxxDydj=" + tGyxlxxDydj +
                ", tGyxlxxSsqy=" + tGyxlxxSsqy +
                ", tGyxlxxYwdw=" + tGyxlxxYwdw +
                ", tGyxlxxSyfs=" + tGyxlxxSyfs +
                ", tGyxlxxYnw=" + tGyxlxxYnw +
                ", tGyxlxxCtbb=" + tGyxlxxCtbb +
                ", tGyxlxxSjqd=" + tGyxlxxSjqd +
                ", tGyxlxxSjzd=" + tGyxlxxSjzd +
                ", tGyxlxxKgbhs=" + tGyxlxxKgbhs +
                ", tGyxlxxKgbhm=" + tGyxlxxKgbhm +
                ", tGyxlxxQsgh=" + tGyxlxxQsgh +
                ", tGyxlxxTysj=" + tGyxlxxTysj +
                ", tGyxlxxTuiyisj=" + tGyxlxxTuiyisj +
                ", tGyxlxxZt=" + tGyxlxxZt +
                ", tGyxlxxDlQx=" + tGyxlxxDlQx +
                ", tGyxlxxJkdxQx=" + tGyxlxxJkdxQx +
                ", tGyxlxxZcQx=" + tGyxlxxZcQx +
                ", tGyxlxxZxjmdx=" + tGyxlxxZxjmdx +
                ", tGyxlxxZdyxdl=" + tGyxlxxZdyxdl +
                ", tGyxlxxSfyxct=" + tGyxlxxSfyxct +
                ", tGyxlxxBz=" + tGyxlxxBz +
                ", tGyxlxxQzttsh=" + tGyxlxxQzttsh +
                ", tGyxlxxDxxh1=" + tGyxlxxDxxh1 +
                ", tGyxlxxDxxh2=" + tGyxlxxDxxh2 +
                ", tGyxlxxDxxh3=" + tGyxlxxDxxh3 +
                ", tGyxlxxJsfs=" + tGyxlxxJsfs +
                ", tGyxlxxDz=" + tGyxlxxDz +
                ", tGyxlxxDk=" + tGyxlxxDk +
                ", tGyxlxxZdgh=" + tGyxlxxZdgh +
                ", tGyxlxxGqlx=" + tGyxlxxGqlx +
                ", tGyxlxxQdlx=" + tGyxlxxQdlx +
                ", tGyxlxxZdlx=" + tGyxlxxZdlx +
                ", tGyxlxxDlxh=" + tGyxlxxDlxh +
                ", tGyxlxxFds=" + tGyxlxxFds +
                ", tGyxlxxFdcd=" + tGyxlxxFdcd +
                ", tGyxlxxFsfs=" + tGyxlxxFsfs +
                ", tGyxlxxGdqsx=" + tGyxlxxGdqsx +
                ", tGyxlxxGdxz=" + tGyxlxxGdxz +
                ", tGyxlxxN1=" + tGyxlxxN1 +
                ", tGyxlxxDwjg=" + tGyxlxxDwjg +
                "}";
    }
}

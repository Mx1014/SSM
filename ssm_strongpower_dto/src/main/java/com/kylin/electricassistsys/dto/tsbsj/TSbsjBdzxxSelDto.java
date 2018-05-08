package com.kylin.electricassistsys.dto.tsbsj;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 变电站信息
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSbsjBdzxxSelDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    /**
     * 数据标识列
     */
    private String tBdzxxId;
    /**
     * 年份
     */
    private String tBdzxxYear;
    /**
     * 变电站编号
     */
    private String tBdzxxNum;
    /**
     * 变电站名称
     */
    private String tBdzxxName;
    /**
     * 电压等级(KV)
     */
    private String tBdzxxDydj;
    /**
     * 变电站地址
     */
    private String tBdzxxDz;
    /**
     * 使用方式
     */
    private String tBdzxxSyfs;
    /**
     * 城农网
     */
    private String tBdzxxCnw;
    /**
     * 主变总容量（MVA）
     */
    private String tBdzxxZbzrl;
    /**
     * 变压器数量(台)
     */
    private String tBdzxxByqsl;
    /**
     * 容量构成
     */
    private String tBdzxxRlgc;
    /**
     * 无功补偿容量
     */
    private String tBdzxxWgbcrl;
    /**
     * 无功补偿构成
     */
    private String tBdzxxWgbcgc;
    /**
     * 无功补偿度
     */
    private String tBdzxxWgbcd;
    /**
     * 高压侧主接线1
     */
    private String tBdzxxGyczjx1;
    /**
     * 中压侧主接线1
     */
    private String tBdzxxZyczjx1;
    /**
     * 低压侧主接线1
     */
    private String tBdzxxDyczjx1;
    /**
     * 220kv出线间隔总数
     */
    private String tBdzxxCxjg220kv;
    /**
     * 110kv出线间隔总数
     */
    private String tBdzxxCxjg110kv;
    /**
     * 35kv出线间隔总数
     */
    private String tBdzxxCxjg35kv;
    /**
     * 10kv出线间隔总数
     */
    private String tBdzxxCxjg10kv;
    /**
     * 已用220kv出线间隔总数
     */
    private String tBdzxxYy220kv;
    /**
     * 已用110kv出线间隔总数
     */
    private String tBdzxxYy110kv;
    /**
     * 已用35kv出线间隔总数
     */
    private String tBdzxxYy35kv;
    /**
     * 已用10kv出线间隔总数
     */
    private String tBdzxxYy10kv;
    /**
     * 投运时间
     */
    private String tBdzxxBtysj;
    /**
     * 运维单位
     */
    private String tBdzxxYwdw;
    /**
     * 安装形式
     */
    private String tBdzxxAzxs;
    /**
     * 占地面积（公顷）
     */
    private String tBdzxxZdmj;
    /**
     * 坐标
     */
    private String tBdzxxZb;
    /**
     * 供电公司
     */
    private String tBdzxxGdgs;
    /**
     * 高压配电装置类型
     */
    private String tBdzxxGypdzzlb;
    /**
     * 所属供电区域
     */
    private String tBdzxxGdqyid;
    /**
     * 退役时间
     */
    private String tBdzxxEtysj;
    /**
     * 运行状态
     */
    private String tBdzxxYxzt;
    /**
     * 接线图纸
     */
    private String tBdzxxJxtz;
    /**
     * 供区类型
     */
    private String tBdzxxGqlxid;
    /**
     * 备注
     */
    private String tBdzxxRemark;
    /**
     * 高压侧电压等级
     */
    private String tBdzxxGycdydj;
    /**
     * 中压侧电压等级
     */
    private String tBdzxxZycdydj;
    /**
     * 低压侧电压等级
     */
    private String tBdzxxDycdydj;
    /**
     * 终期间隔个数
     */
    private String tBdzxxZqjggs;
    /**
     * 高压侧主接线2
     */
    private String tBdzxxGyczjx2;
    /**
     * 高压侧主接线3
     */
    private String tBdzxxGyczjx3;
    /**
     * 中压侧主接线2
     */
    private String tBdzxxZyczjx2;
    /**
     * 中压侧主接线3
     */
    private String tBdzxxZyczjx3;
    /**
     * 低压侧主接线2
     */
    private String tBdzxxDyczjx2;
    /**
     * 低压侧主接线3
     */
    private String tBdzxxDyczjx3;
    /**
     * 供电区属性
     */
    private String tBdzxxGdqsx;
    /**
     * 供电性质
     */
    private String tBdzxxGdxz;
    /**
     * 是否满足N_1
     */
    private String tBdzxxN1;
    /**
     * 电网结构
     */
    private String tBdzxxDwjg;
    /**
     * 断路器
     */
    private String tBdzxxDlq;
    /**
     * 电压等级中文
     */
    private String tDycsName;
    /**
     * 供区类型中文
     */
    private String tGqlxName;
    /**
     * 区域中文
     */
    private String tGdfqName;
    /**
     * 运维单位中文
     */
    private String tSysDwmz;


    /**
     * 变电站属性中文
     */
    private String tSyfsName;
    /**
     * 城农网中文
     */

    private String tCnwName;
    /**
     * 安装形式中文
     */
    private String tAzxsName;
    /**
     * 高压配电装置类型中文
     */
    private String tGypdzzlxName;

    /**
     * 修改次数
     */
    public String gettDycsName() {
        return tDycsName;
    }

    public void settDycsName(String tDycsName) {
        this.tDycsName = tDycsName;
    }

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

    public String gettSysDwmz() {
        return tSysDwmz;
    }

    public void settSysDwmz(String tSysDwmz) {
        this.tSysDwmz = tSysDwmz;
    }

    public String gettSyfsName() {
        return tSyfsName;
    }

    public void settSyfsName(String tSyfsName) {
        this.tSyfsName = tSyfsName;
    }

    public String gettCnwName() {
        return tCnwName;
    }

    public void settCnwName(String tCnwName) {
        this.tCnwName = tCnwName;
    }

    public String gettAzxsName() {
        return tAzxsName;
    }

    public void settAzxsName(String tAzxsName) {
        this.tAzxsName = tAzxsName;
    }

    public String gettGypdzzlxName() {
        return tGypdzzlxName;
    }

    public void settGypdzzlxName(String tGypdzzlxName) {
        this.tGypdzzlxName = tGypdzzlxName;
    }


    private String tBdzxxXgcs;

    public String gettBdzxxXgcs() {
        return tBdzxxXgcs;
    }

    public void settBdzxxXgcs(String tBdzxxXgcs) {
        this.tBdzxxXgcs = tBdzxxXgcs;
    }

    public String gettBdzxxId() {
        return tBdzxxId;
    }

    public void settBdzxxId(String tBdzxxId) {
        this.tBdzxxId = tBdzxxId;
    }

    public String gettBdzxxYear() {
        return tBdzxxYear;
    }

    public void settBdzxxYear(String tBdzxxYear) {
        this.tBdzxxYear = tBdzxxYear;
    }

    public String gettBdzxxNum() {
        return tBdzxxNum;
    }

    public void settBdzxxNum(String tBdzxxNum) {
        this.tBdzxxNum = tBdzxxNum;
    }

    public String gettBdzxxName() {
        return tBdzxxName;
    }

    public void settBdzxxName(String tBdzxxName) {
        this.tBdzxxName = tBdzxxName;
    }

    public String gettBdzxxDydj() {
        return tBdzxxDydj;
    }

    public void settBdzxxDydj(String tBdzxxDydj) {
        this.tBdzxxDydj = tBdzxxDydj;
    }

    public String gettBdzxxDz() {
        return tBdzxxDz;
    }

    public void settBdzxxDz(String tBdzxxDz) {
        this.tBdzxxDz = tBdzxxDz;
    }

    public String gettBdzxxSyfs() {
        return tBdzxxSyfs;
    }

    public void settBdzxxSyfs(String tBdzxxSyfs) {
        this.tBdzxxSyfs = tBdzxxSyfs;
    }

    public String gettBdzxxCnw() {
        return tBdzxxCnw;
    }

    public void settBdzxxCnw(String tBdzxxCnw) {
        this.tBdzxxCnw = tBdzxxCnw;
    }

    public String gettBdzxxZbzrl() {
        return tBdzxxZbzrl;
    }

    public void settBdzxxZbzrl(String tBdzxxZbzrl) {
        this.tBdzxxZbzrl = tBdzxxZbzrl;
    }

    public String gettBdzxxByqsl() {
        return tBdzxxByqsl;
    }

    public void settBdzxxByqsl(String tBdzxxByqsl) {
        this.tBdzxxByqsl = tBdzxxByqsl;
    }

    public String gettBdzxxRlgc() {
        return tBdzxxRlgc;
    }

    public void settBdzxxRlgc(String tBdzxxRlgc) {
        this.tBdzxxRlgc = tBdzxxRlgc;
    }

    public String gettBdzxxWgbcrl() {
        return tBdzxxWgbcrl;
    }

    public void settBdzxxWgbcrl(String tBdzxxWgbcrl) {
        this.tBdzxxWgbcrl = tBdzxxWgbcrl;
    }

    public String gettBdzxxWgbcgc() {
        return tBdzxxWgbcgc;
    }

    public void settBdzxxWgbcgc(String tBdzxxWgbcgc) {
        this.tBdzxxWgbcgc = tBdzxxWgbcgc;
    }

    public String gettBdzxxWgbcd() {
        return tBdzxxWgbcd;
    }

    public void settBdzxxWgbcd(String tBdzxxWgbcd) {
        this.tBdzxxWgbcd = tBdzxxWgbcd;
    }

    public String gettBdzxxGyczjx1() {
        return tBdzxxGyczjx1;
    }

    public void settBdzxxGyczjx1(String tBdzxxGyczjx1) {
        this.tBdzxxGyczjx1 = tBdzxxGyczjx1;
    }

    public String gettBdzxxZyczjx1() {
        return tBdzxxZyczjx1;
    }

    public void settBdzxxZyczjx1(String tBdzxxZyczjx1) {
        this.tBdzxxZyczjx1 = tBdzxxZyczjx1;
    }

    public String gettBdzxxDyczjx1() {
        return tBdzxxDyczjx1;
    }

    public void settBdzxxDyczjx1(String tBdzxxDyczjx1) {
        this.tBdzxxDyczjx1 = tBdzxxDyczjx1;
    }

    public String gettBdzxxCxjg220kv() {
        return tBdzxxCxjg220kv;
    }

    public void settBdzxxCxjg220kv(String tBdzxxCxjg220kv) {
        this.tBdzxxCxjg220kv = tBdzxxCxjg220kv;
    }

    public String gettBdzxxCxjg110kv() {
        return tBdzxxCxjg110kv;
    }

    public void settBdzxxCxjg110kv(String tBdzxxCxjg110kv) {
        this.tBdzxxCxjg110kv = tBdzxxCxjg110kv;
    }

    public String gettBdzxxCxjg35kv() {
        return tBdzxxCxjg35kv;
    }

    public void settBdzxxCxjg35kv(String tBdzxxCxjg35kv) {
        this.tBdzxxCxjg35kv = tBdzxxCxjg35kv;
    }

    public String gettBdzxxCxjg10kv() {
        return tBdzxxCxjg10kv;
    }

    public void settBdzxxCxjg10kv(String tBdzxxCxjg10kv) {
        this.tBdzxxCxjg10kv = tBdzxxCxjg10kv;
    }

    public String gettBdzxxYy220kv() {
        return tBdzxxYy220kv;
    }

    public void settBdzxxYy220kv(String tBdzxxYy220kv) {
        this.tBdzxxYy220kv = tBdzxxYy220kv;
    }

    public String gettBdzxxYy110kv() {
        return tBdzxxYy110kv;
    }

    public void settBdzxxYy110kv(String tBdzxxYy110kv) {
        this.tBdzxxYy110kv = tBdzxxYy110kv;
    }

    public String gettBdzxxYy35kv() {
        return tBdzxxYy35kv;
    }

    public void settBdzxxYy35kv(String tBdzxxYy35kv) {
        this.tBdzxxYy35kv = tBdzxxYy35kv;
    }

    public String gettBdzxxYy10kv() {
        return tBdzxxYy10kv;
    }

    public void settBdzxxYy10kv(String tBdzxxYy10kv) {
        this.tBdzxxYy10kv = tBdzxxYy10kv;
    }

    public String gettBdzxxBtysj() {
        return tBdzxxBtysj;
    }

    public void settBdzxxBtysj(String tBdzxxBtysj) {
        this.tBdzxxBtysj = tBdzxxBtysj;
    }

    public String gettBdzxxYwdw() {
        return tBdzxxYwdw;
    }

    public void settBdzxxYwdw(String tBdzxxYwdw) {
        this.tBdzxxYwdw = tBdzxxYwdw;
    }

    public String gettBdzxxAzxs() {
        return tBdzxxAzxs;
    }

    public void settBdzxxAzxs(String tBdzxxAzxs) {
        this.tBdzxxAzxs = tBdzxxAzxs;
    }

    public String gettBdzxxZdmj() {
        return tBdzxxZdmj;
    }

    public void settBdzxxZdmj(String tBdzxxZdmj) {
        this.tBdzxxZdmj = tBdzxxZdmj;
    }

    public String gettBdzxxZb() {
        return tBdzxxZb;
    }

    public void settBdzxxZb(String tBdzxxZb) {
        this.tBdzxxZb = tBdzxxZb;
    }

    public String gettBdzxxGdgs() {
        return tBdzxxGdgs;
    }

    public void settBdzxxGdgs(String tBdzxxGdgs) {
        this.tBdzxxGdgs = tBdzxxGdgs;
    }

    public String gettBdzxxGypdzzlb() {
        return tBdzxxGypdzzlb;
    }

    public void settBdzxxGypdzzlb(String tBdzxxGypdzzlb) {
        this.tBdzxxGypdzzlb = tBdzxxGypdzzlb;
    }

    public String gettBdzxxGdqyid() {
        return tBdzxxGdqyid;
    }

    public void settBdzxxGdqyid(String tBdzxxGdqyid) {
        this.tBdzxxGdqyid = tBdzxxGdqyid;
    }

    public String gettBdzxxEtysj() {
        return tBdzxxEtysj;
    }

    public void settBdzxxEtysj(String tBdzxxEtysj) {
        this.tBdzxxEtysj = tBdzxxEtysj;
    }

    public String gettBdzxxYxzt() {
        return tBdzxxYxzt;
    }

    public void settBdzxxYxzt(String tBdzxxYxzt) {
        this.tBdzxxYxzt = tBdzxxYxzt;
    }

    public String gettBdzxxJxtz() {
        return tBdzxxJxtz;
    }

    public void settBdzxxJxtz(String tBdzxxJxtz) {
        this.tBdzxxJxtz = tBdzxxJxtz;
    }

    public String gettBdzxxGqlxid() {
        return tBdzxxGqlxid;
    }

    public void settBdzxxGqlxid(String tBdzxxGqlxid) {
        this.tBdzxxGqlxid = tBdzxxGqlxid;
    }

    public String gettBdzxxRemark() {
        return tBdzxxRemark;
    }

    public void settBdzxxRemark(String tBdzxxRemark) {
        this.tBdzxxRemark = tBdzxxRemark;
    }

    public String gettBdzxxGycdydj() {
        return tBdzxxGycdydj;
    }

    public void settBdzxxGycdydj(String tBdzxxGycdydj) {
        this.tBdzxxGycdydj = tBdzxxGycdydj;
    }

    public String gettBdzxxZycdydj() {
        return tBdzxxZycdydj;
    }

    public void settBdzxxZycdydj(String tBdzxxZycdydj) {
        this.tBdzxxZycdydj = tBdzxxZycdydj;
    }

    public String gettBdzxxDycdydj() {
        return tBdzxxDycdydj;
    }

    public void settBdzxxDycdydj(String tBdzxxDycdydj) {
        this.tBdzxxDycdydj = tBdzxxDycdydj;
    }

    public String gettBdzxxZqjggs() {
        return tBdzxxZqjggs;
    }

    public void settBdzxxZqjggs(String tBdzxxZqjggs) {
        this.tBdzxxZqjggs = tBdzxxZqjggs;
    }

    public String gettBdzxxGyczjx2() {
        return tBdzxxGyczjx2;
    }

    public void settBdzxxGyczjx2(String tBdzxxGyczjx2) {
        this.tBdzxxGyczjx2 = tBdzxxGyczjx2;
    }

    public String gettBdzxxGyczjx3() {
        return tBdzxxGyczjx3;
    }

    public void settBdzxxGyczjx3(String tBdzxxGyczjx3) {
        this.tBdzxxGyczjx3 = tBdzxxGyczjx3;
    }

    public String gettBdzxxZyczjx2() {
        return tBdzxxZyczjx2;
    }

    public void settBdzxxZyczjx2(String tBdzxxZyczjx2) {
        this.tBdzxxZyczjx2 = tBdzxxZyczjx2;
    }

    public String gettBdzxxZyczjx3() {
        return tBdzxxZyczjx3;
    }

    public void settBdzxxZyczjx3(String tBdzxxZyczjx3) {
        this.tBdzxxZyczjx3 = tBdzxxZyczjx3;
    }

    public String gettBdzxxDyczjx2() {
        return tBdzxxDyczjx2;
    }

    public void settBdzxxDyczjx2(String tBdzxxDyczjx2) {
        this.tBdzxxDyczjx2 = tBdzxxDyczjx2;
    }

    public String gettBdzxxDyczjx3() {
        return tBdzxxDyczjx3;
    }

    public void settBdzxxDyczjx3(String tBdzxxDyczjx3) {
        this.tBdzxxDyczjx3 = tBdzxxDyczjx3;
    }

    public String gettBdzxxGdqsx() {
        return tBdzxxGdqsx;
    }

    public void settBdzxxGdqsx(String tBdzxxGdqsx) {
        this.tBdzxxGdqsx = tBdzxxGdqsx;
    }

    public String gettBdzxxGdxz() {
        return tBdzxxGdxz;
    }

    public void settBdzxxGdxz(String tBdzxxGdxz) {
        this.tBdzxxGdxz = tBdzxxGdxz;
    }

    public String gettBdzxxN1() {
        return tBdzxxN1;
    }

    public void settBdzxxN1(String tBdzxxN1) {
        this.tBdzxxN1 = tBdzxxN1;
    }

    public String gettBdzxxDwjg() {
        return tBdzxxDwjg;
    }

    public void settBdzxxDwjg(String tBdzxxDwjg) {
        this.tBdzxxDwjg = tBdzxxDwjg;
    }

    public String gettBdzxxDlq() {
        return tBdzxxDlq;
    }

    public void settBdzxxDlq(String tBdzxxDlq) {
        this.tBdzxxDlq = tBdzxxDlq;
    }


    @Override
    public String toString() {
        return "TSbsjBdzxx{" +
                "tBdzxxId=" + tBdzxxId +
                ", tBdzxxYear=" + tBdzxxYear +
                ", tBdzxxNum=" + tBdzxxNum +
                ", tBdzxxName=" + tBdzxxName +
                ", tBdzxxDydj=" + tBdzxxDydj +
                ", tBdzxxDz=" + tBdzxxDz +
                ", tBdzxxSyfs=" + tBdzxxSyfs +
                ", tBdzxxCnw=" + tBdzxxCnw +
                ", tBdzxxZbzrl=" + tBdzxxZbzrl +
                ", tBdzxxByqsl=" + tBdzxxByqsl +
                ", tBdzxxRlgc=" + tBdzxxRlgc +
                ", tBdzxxWgbcrl=" + tBdzxxWgbcrl +
                ", tBdzxxWgbcgc=" + tBdzxxWgbcgc +
                ", tBdzxxWgbcd=" + tBdzxxWgbcd +
                ", tBdzxxGyczjx1=" + tBdzxxGyczjx1 +
                ", tBdzxxZyczjx1=" + tBdzxxZyczjx1 +
                ", tBdzxxDyczjx1=" + tBdzxxDyczjx1 +
                ", tBdzxxCxjg220kv=" + tBdzxxCxjg220kv +
                ", tBdzxxCxjg110kv=" + tBdzxxCxjg110kv +
                ", tBdzxxCxjg35kv=" + tBdzxxCxjg35kv +
                ", tBdzxxCxjg10kv=" + tBdzxxCxjg10kv +
                ", tBdzxxYy220kv=" + tBdzxxYy220kv +
                ", tBdzxxYy110kv=" + tBdzxxYy110kv +
                ", tBdzxxYy35kv=" + tBdzxxYy35kv +
                ", tBdzxxYy10kv=" + tBdzxxYy10kv +
                ", tBdzxxBtysj=" + tBdzxxBtysj +
                ", tBdzxxYwdw=" + tBdzxxYwdw +
                ", tBdzxxAzxs=" + tBdzxxAzxs +
                ", tBdzxxZdmj=" + tBdzxxZdmj +
                ", tBdzxxZb=" + tBdzxxZb +
                ", tBdzxxGdgs=" + tBdzxxGdgs +
                ", tBdzxxGypdzzlb=" + tBdzxxGypdzzlb +
                ", tBdzxxGdqyid=" + tBdzxxGdqyid +
                ", tBdzxxEtysj=" + tBdzxxEtysj +
                ", tBdzxxYxzt=" + tBdzxxYxzt +
                ", tBdzxxJxtz=" + tBdzxxJxtz +
                ", tBdzxxGqlxid=" + tBdzxxGqlxid +
                ", tBdzxxRemark=" + tBdzxxRemark +
                ", tBdzxxGycdydj=" + tBdzxxGycdydj +
                ", tBdzxxZycdydj=" + tBdzxxZycdydj +
                ", tBdzxxDycdydj=" + tBdzxxDycdydj +
                ", tBdzxxZqjggs=" + tBdzxxZqjggs +
                ", tBdzxxGyczjx2=" + tBdzxxGyczjx2 +
                ", tBdzxxGyczjx3=" + tBdzxxGyczjx3 +
                ", tBdzxxZyczjx2=" + tBdzxxZyczjx2 +
                ", tBdzxxZyczjx3=" + tBdzxxZyczjx3 +
                ", tBdzxxDyczjx2=" + tBdzxxDyczjx2 +
                ", tBdzxxDyczjx3=" + tBdzxxDyczjx3 +
                ", tBdzxxGdqsx=" + tBdzxxGdqsx +
                ", tBdzxxGdxz=" + tBdzxxGdxz +
                ", tBdzxxN1=" + tBdzxxN1 +
                ", tBdzxxDwjg=" + tBdzxxDwjg +
                ", tBdzxxDlq=" + tBdzxxDlq +
                "}";
    }
}

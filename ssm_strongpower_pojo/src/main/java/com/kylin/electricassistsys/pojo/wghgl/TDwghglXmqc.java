package com.kylin.electricassistsys.pojo.wghgl;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 项目清册表
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TDwghglXmqc extends Model<TDwghglXmqc> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String tXmqcId;
    /**
     * 项目名称
     */
    private String tXmqcXmmc;
    /**
     * 规划年份
     */
    private String tXmqcGhnf;
    /**
     * 建设性质（新建、改造）
     */
    private String tXmqcJsxz;
    /**
     * 工程性质
     */
    private String tXmqcGcxz;
    /**
     * 工程属性
     */
    private String tXmqcGcsx;
    /**
     * 是否智能化项目
     */
    private String tXmqcIsznhxm;
    /**
     * 区域
     */
    private String tXmqcSsqy;
    /**
     * 变电站
     */
    private String tXmqcBdz;
    /**
     * 供区类型
     */
    private String tXmqcGqlx;
    /**
     * 项目类型
     */
    private String tXmqcXmlx;
    /**
     * 电压等级
     */
    private String tXmqcDydj;
    /**
     * 运维单位
     */
    private String tXmqcYwdw;
    /**
     * 开工时间
     */
    private String tXmqcKgsj;
    /**
     * 竣工时间
     */
    private String tXmqcJgsj;
    /**
     * 使用方式
     */
    private String tXmqcSyfs;
    /**
     * 城农网
     */
    private String tXmqcCnw;
    /**
     * 项目总投资
     */
    private String tXmqcXmtz;
    /**
     * 线路总条数
     */
    private String tXmqcXlzts;
    /**
     * 线路总长度
     */
    private String tXmqcXlzcd;
    /**
     * 配变台数
     */
    private String tXmqcPbts;
    /**
     * 配变容量
     */
    private String tXmqcPbrl;
    /**
     * 主干线长度
     */
    private String tXmqcZgxcd;
    /**
     * 农网建设性质1
     */
    private String tXmqcNwjsxz1;
    /**
     * 农网建设性质2
     */
    private String tXmqcNwjsxz2;
    /**
     * 农网建设性质3
     */
    private String tXmqcNwjsxz3;
    /**
     * 架空长度
     */
    private String tXmqcZyxlJkcd;
    /**
     * 电缆长度
     */
    private String tXmqcZyxlDlcd;
    /**
     * 供电半径
     */
    private String tXmqcZyxlGdbj;
    /**
     * 无功补偿容量
     */
    private String tXmqcZyxlWgbcrl;
    /**
     * 中压线路投资
     */
    private String tXmqcZyxlTz;
    /**
     * 开闭所
     */
    private String tXmqcZykgKbs;
    /**
     * 电缆分支箱
     */
    private String tXmqcZykgDlfzx;
    /**
     * 开关投资
     */
    private String tXmqcZykgTz;
    /**
     * 环网柜总数
     */
    private String tXmqcZykgHwgzs;
    /**
     * 环网柜分段
     */
    private String tXmqcZykgHwgfd;
    /**
     * 环网柜联络
     */
    private String tXmqcZykgHwgll;
    /**
     * 柱上开关总数
     */
    private String tXmqcZykgZskgzs;
    /**
     * 柱上开关分段
     */
    private String tXmqcZykgZskgfd;
    /**
     * 柱上开关联络
     */
    private String tXmqcZykgZskgll;
    /**
     * 配变无功补偿容量
     */
    private String tXmqcZypbWgbcrl;
    /**
     * 配变投资
     */
    private String tXmqcZypbTz;
    /**
     * 柱上变台数
     */
    private String tXmqcZypbZsbts;
    /**
     * 柱上变容量
     */
    private String tXmqcZypbZsbrl;
    /**
     * 非晶合金台数
     */
    private String tXmqcZypbFjhjpbts;
    /**
     * 非晶合金容量
     */
    private String tXmqcZypbFjhjpbrl;
    /**
     * 配电室座数
     */
    private String tXmqcZypbPdszs;
    /**
     * 配电室台数
     */
    private String tXmqcZypbPdsts;
    /**
     * 配电室容量
     */
    private String tXmqcZypbPdsrl;
    /**
     * 箱变座数
     */
    private String tXmqcZypbXbzs;
    /**
     * 箱变台数
     */
    private String tXmqcZypbXbts;
    /**
     * 箱变容量
     */
    private String tXmqcZypbXbrl;
    /**
     * 低配网架空线路条数
     */
    private String tXmqcDywptJkxlts;
    /**
     * 低配网架空线路长度
     */
    private String tXmqcDywptJkxlcd;
    /**
     * 低配网架空投资
     */
    private String tXmqcDywptJkxltz;
    /**
     * 低配网电缆条数
     */
    private String tXmqcDywptDlts;
    /**
     * 电缆长度
     */
    private String tXmqcDywptDlcd;
    /**
     * 电缆投资
     */
    private String tXmqcDywptDltz;
    /**
     * 户表
     */
    private String tXmqcHbHb;
    /**
     * 接户线
     */
    private String tXmqcHbJhx;
    /**
     * 户表投资
     */
    private String tXmqcHbHbtz;
    /**
     * 中央计划
     */
    private String tXmqcZjlyZyjh;
    /**
     * 公司自筹
     */
    private String tXmqcZjlyGszc;
    /**
     * 县级供电企业自筹
     */
    private String tXmqcZjlyXjgdqyzc;
    /**
     * 用户投资
     */
    private String tXmqcZjlyYhtz;
    /**
     * 小区配套费
     */
    private String tXmqcZjlyXqptf;
    /**
     * 政府垫资
     */
    private String tXmqcZjlyZfdz;
    /**
     * 其他
     */
    private String tXmqcZjlyQt;
    /**
     * 资产属性
     */
    private String tXmqcZcsx;
    /**
     * 改造:配变总台数
     */
    private String tXmqcGzZts;
    /**
     * 配变改造前总容量
     */
    private String tXmqcGzQzrl;
    /**
     * 配变改造后总容量
     */
    private String tXmqcGzHzrl;
    /**
     * 改造:高损台数
     */
    private String tXmqcGzGsts;
    /**
     * 改造:高损容量
     */
    private String tXmqcGzGsrl;
    /**
     * 改造:非晶台数
     */
    private String tXmqcGzFjts;
    /**
     * 改造:非晶容量
     */
    private String tXmqcGzFjrl;
    /**
     * 改造:无功组数
     */
    private String tXmqcGzWgzs;
    /**
     * 改造:无功总容量
     */
    private String tXmqcGzWgzrl;
    /**
     * 改造:无功投资
     */
    private String tXmqcGzWgtz;
    /**
     * 改造:断路器
     */
    private String tXmqcGzDlq;
    /**
     * 改造:负荷开关
     */
    private String tXmqcGzFhkg;
    /**
     * 改造:环网柜
     */
    private String tXmqcGzHwg;
    /**
     * 改造:电缆分支箱
     */
    private String tXmqcGzDlfzx;
    /**
     * 改造:开关类投资
     */
    private String tXmqcGzKgtz;
    /**
     * 改造:架空线路长度
     */
    private String tXmqcGzJkxlcd;
    /**
     * 改造:绝缘导线长度
     */
    private String tXmqcGzJydxcd;
    /**
     * 改造:架空线路投资
     */
    private String tXmqcGzJkxltz;
    /**
     * 改造:电缆线路长度
     */
    private String tXmqcGzDlxlcd;
    /**
     * 改造:沟道长度
     */
    private String tXmqcGzGdcd;
    /**
     * 改造:电缆线路投资
     */
    private String tXmqcGzDlxltz;
    /**
     * 改造:配变投资
     */
    private String tXmqcGzPbtz;
    /**
     * 其他项
     */
    private String tXmqcQtx;
    /**
     * 其他项投资
     */
    private String tXmqcQtxtz;
    /**
     * 电源送出类别
     */
    private String tXmqcDysclb;
    /**
     * 类型
     */
    private String tXmqcType;
    /**
     * 变电站类型
     */
    private String tXmqcBdzlx;
    /**
     * 变电站配电装置形式
     */
    private String tXmqcBdzpdzzxs;
    /**
     * 变电站占地面积
     */
    private String tXmqcBdzzdmj;
    /**
     * 变电站台数
     */
    private String tXmqcBdzts;
    /**
     * 变电站新增容量
     */
    private String tXmqcBdzxzrl;
    /**
     * 无功补偿容性容量
     */
    private String tXmqcBdzrxrl;
    /**
     * 无功补偿感性容量
     */
    private String tXmqcBdzgxrl;
    /**
     * 变电站投资
     */
    private String tXmqcBdztz;
    /**
     * 变电站间隔
     */
    private String tXmqcBdzjg;
    /**
     * 变电站线路条数
     */
    private String tXmqcBdzxlts;
    /**
     * 变电站线路总长度
     */
    private String tXmqcBdzxlzcd;
    /**
     * 变电站电缆长度
     */
    private String tXmqcBdzdlcd;
    /**
     * 变电站电缆型号
     */
    private String tXmqcBdzdlxh;
    /**
     * 变电站架空长度
     */
    private String tXmqcBdzjkcd;
    /**
     * 变电站架空型号
     */
    private String tXmqcBdzjkxh;
    /**
     * 变电站线路投资
     */
    private String tXmqcBdzxltz;
    /**
     * 是否城农网
     */
    private String tXmqcIscnw;
    /**
     * 变压器改造台数
     */
    private String tXmqcByqgzts;
    /**
     * 改造变压器编号1
     */
    private String tXmqcGzbyqbh1;
    /**
     * 改造变压器编号2
     */
    private String tXmqcGzbyqbh2;
    /**
     * 改造前主变容量
     */
    private String tXmqcGzqzbrl;
    /**
     * 改造后主变容量
     */
    private String tXmqcGzhzbrl;
    /**
     * 改造变电站座数
     */
    private String tXmqcBdzgzzs;
    /**
     * 入库状态
     */
    private String tXmqcZt;


    public String gettXmqcId() {
        return tXmqcId;
    }

    public void settXmqcId(String tXmqcId) {
        this.tXmqcId = tXmqcId;
    }

    public String gettXmqcXmmc() {
        return tXmqcXmmc;
    }

    public void settXmqcXmmc(String tXmqcXmmc) {
        this.tXmqcXmmc = tXmqcXmmc;
    }

    public String gettXmqcGhnf() {
        return tXmqcGhnf;
    }

    public void settXmqcGhnf(String tXmqcGhnf) {
        this.tXmqcGhnf = tXmqcGhnf;
    }

    public String gettXmqcJsxz() {
        return tXmqcJsxz;
    }

    public void settXmqcJsxz(String tXmqcJsxz) {
        this.tXmqcJsxz = tXmqcJsxz;
    }

    public String gettXmqcGcxz() {
        return tXmqcGcxz;
    }

    public void settXmqcGcxz(String tXmqcGcxz) {
        this.tXmqcGcxz = tXmqcGcxz;
    }

    public String gettXmqcGcsx() {
        return tXmqcGcsx;
    }

    public void settXmqcGcsx(String tXmqcGcsx) {
        this.tXmqcGcsx = tXmqcGcsx;
    }

    public String gettXmqcIsznhxm() {
        return tXmqcIsznhxm;
    }

    public void settXmqcIsznhxm(String tXmqcIsznhxm) {
        this.tXmqcIsznhxm = tXmqcIsznhxm;
    }

    public String gettXmqcSsqy() {
        return tXmqcSsqy;
    }

    public void settXmqcSsqy(String tXmqcSsqy) {
        this.tXmqcSsqy = tXmqcSsqy;
    }

    public String gettXmqcBdz() {
        return tXmqcBdz;
    }

    public void settXmqcBdz(String tXmqcBdz) {
        this.tXmqcBdz = tXmqcBdz;
    }

    public String gettXmqcGqlx() {
        return tXmqcGqlx;
    }

    public void settXmqcGqlx(String tXmqcGqlx) {
        this.tXmqcGqlx = tXmqcGqlx;
    }

    public String gettXmqcXmlx() {
        return tXmqcXmlx;
    }

    public void settXmqcXmlx(String tXmqcXmlx) {
        this.tXmqcXmlx = tXmqcXmlx;
    }

    public String gettXmqcDydj() {
        return tXmqcDydj;
    }

    public void settXmqcDydj(String tXmqcDydj) {
        this.tXmqcDydj = tXmqcDydj;
    }

    public String gettXmqcYwdw() {
        return tXmqcYwdw;
    }

    public void settXmqcYwdw(String tXmqcYwdw) {
        this.tXmqcYwdw = tXmqcYwdw;
    }

    public String gettXmqcKgsj() {
        return tXmqcKgsj;
    }

    public void settXmqcKgsj(String tXmqcKgsj) {
        this.tXmqcKgsj = tXmqcKgsj;
    }

    public String gettXmqcJgsj() {
        return tXmqcJgsj;
    }

    public void settXmqcJgsj(String tXmqcJgsj) {
        this.tXmqcJgsj = tXmqcJgsj;
    }

    public String gettXmqcSyfs() {
        return tXmqcSyfs;
    }

    public void settXmqcSyfs(String tXmqcSyfs) {
        this.tXmqcSyfs = tXmqcSyfs;
    }

    public String gettXmqcCnw() {
        return tXmqcCnw;
    }

    public void settXmqcCnw(String tXmqcCnw) {
        this.tXmqcCnw = tXmqcCnw;
    }

    public String gettXmqcXmtz() {
        return tXmqcXmtz;
    }

    public void settXmqcXmtz(String tXmqcXmtz) {
        this.tXmqcXmtz = tXmqcXmtz;
    }

    public String gettXmqcXlzts() {
        return tXmqcXlzts;
    }

    public void settXmqcXlzts(String tXmqcXlzts) {
        this.tXmqcXlzts = tXmqcXlzts;
    }

    public String gettXmqcXlzcd() {
        return tXmqcXlzcd;
    }

    public void settXmqcXlzcd(String tXmqcXlzcd) {
        this.tXmqcXlzcd = tXmqcXlzcd;
    }

    public String gettXmqcPbts() {
        return tXmqcPbts;
    }

    public void settXmqcPbts(String tXmqcPbts) {
        this.tXmqcPbts = tXmqcPbts;
    }

    public String gettXmqcPbrl() {
        return tXmqcPbrl;
    }

    public void settXmqcPbrl(String tXmqcPbrl) {
        this.tXmqcPbrl = tXmqcPbrl;
    }

    public String gettXmqcZgxcd() {
        return tXmqcZgxcd;
    }

    public void settXmqcZgxcd(String tXmqcZgxcd) {
        this.tXmqcZgxcd = tXmqcZgxcd;
    }

    public String gettXmqcNwjsxz1() {
        return tXmqcNwjsxz1;
    }

    public void settXmqcNwjsxz1(String tXmqcNwjsxz1) {
        this.tXmqcNwjsxz1 = tXmqcNwjsxz1;
    }

    public String gettXmqcNwjsxz2() {
        return tXmqcNwjsxz2;
    }

    public void settXmqcNwjsxz2(String tXmqcNwjsxz2) {
        this.tXmqcNwjsxz2 = tXmqcNwjsxz2;
    }

    public String gettXmqcNwjsxz3() {
        return tXmqcNwjsxz3;
    }

    public void settXmqcNwjsxz3(String tXmqcNwjsxz3) {
        this.tXmqcNwjsxz3 = tXmqcNwjsxz3;
    }

    public String gettXmqcZyxlJkcd() {
        return tXmqcZyxlJkcd;
    }

    public void settXmqcZyxlJkcd(String tXmqcZyxlJkcd) {
        this.tXmqcZyxlJkcd = tXmqcZyxlJkcd;
    }

    public String gettXmqcZyxlDlcd() {
        return tXmqcZyxlDlcd;
    }

    public void settXmqcZyxlDlcd(String tXmqcZyxlDlcd) {
        this.tXmqcZyxlDlcd = tXmqcZyxlDlcd;
    }

    public String gettXmqcZyxlGdbj() {
        return tXmqcZyxlGdbj;
    }

    public void settXmqcZyxlGdbj(String tXmqcZyxlGdbj) {
        this.tXmqcZyxlGdbj = tXmqcZyxlGdbj;
    }

    public String gettXmqcZyxlWgbcrl() {
        return tXmqcZyxlWgbcrl;
    }

    public void settXmqcZyxlWgbcrl(String tXmqcZyxlWgbcrl) {
        this.tXmqcZyxlWgbcrl = tXmqcZyxlWgbcrl;
    }

    public String gettXmqcZyxlTz() {
        return tXmqcZyxlTz;
    }

    public void settXmqcZyxlTz(String tXmqcZyxlTz) {
        this.tXmqcZyxlTz = tXmqcZyxlTz;
    }

    public String gettXmqcZykgKbs() {
        return tXmqcZykgKbs;
    }

    public void settXmqcZykgKbs(String tXmqcZykgKbs) {
        this.tXmqcZykgKbs = tXmqcZykgKbs;
    }

    public String gettXmqcZykgDlfzx() {
        return tXmqcZykgDlfzx;
    }

    public void settXmqcZykgDlfzx(String tXmqcZykgDlfzx) {
        this.tXmqcZykgDlfzx = tXmqcZykgDlfzx;
    }

    public String gettXmqcZykgTz() {
        return tXmqcZykgTz;
    }

    public void settXmqcZykgTz(String tXmqcZykgTz) {
        this.tXmqcZykgTz = tXmqcZykgTz;
    }

    public String gettXmqcZykgHwgzs() {
        return tXmqcZykgHwgzs;
    }

    public void settXmqcZykgHwgzs(String tXmqcZykgHwgzs) {
        this.tXmqcZykgHwgzs = tXmqcZykgHwgzs;
    }

    public String gettXmqcZykgHwgfd() {
        return tXmqcZykgHwgfd;
    }

    public void settXmqcZykgHwgfd(String tXmqcZykgHwgfd) {
        this.tXmqcZykgHwgfd = tXmqcZykgHwgfd;
    }

    public String gettXmqcZykgHwgll() {
        return tXmqcZykgHwgll;
    }

    public void settXmqcZykgHwgll(String tXmqcZykgHwgll) {
        this.tXmqcZykgHwgll = tXmqcZykgHwgll;
    }

    public String gettXmqcZykgZskgzs() {
        return tXmqcZykgZskgzs;
    }

    public void settXmqcZykgZskgzs(String tXmqcZykgZskgzs) {
        this.tXmqcZykgZskgzs = tXmqcZykgZskgzs;
    }

    public String gettXmqcZykgZskgfd() {
        return tXmqcZykgZskgfd;
    }

    public void settXmqcZykgZskgfd(String tXmqcZykgZskgfd) {
        this.tXmqcZykgZskgfd = tXmqcZykgZskgfd;
    }

    public String gettXmqcZykgZskgll() {
        return tXmqcZykgZskgll;
    }

    public void settXmqcZykgZskgll(String tXmqcZykgZskgll) {
        this.tXmqcZykgZskgll = tXmqcZykgZskgll;
    }

    public String gettXmqcZypbWgbcrl() {
        return tXmqcZypbWgbcrl;
    }

    public void settXmqcZypbWgbcrl(String tXmqcZypbWgbcrl) {
        this.tXmqcZypbWgbcrl = tXmqcZypbWgbcrl;
    }

    public String gettXmqcZypbTz() {
        return tXmqcZypbTz;
    }

    public void settXmqcZypbTz(String tXmqcZypbTz) {
        this.tXmqcZypbTz = tXmqcZypbTz;
    }

    public String gettXmqcZypbZsbts() {
        return tXmqcZypbZsbts;
    }

    public void settXmqcZypbZsbts(String tXmqcZypbZsbts) {
        this.tXmqcZypbZsbts = tXmqcZypbZsbts;
    }

    public String gettXmqcZypbZsbrl() {
        return tXmqcZypbZsbrl;
    }

    public void settXmqcZypbZsbrl(String tXmqcZypbZsbrl) {
        this.tXmqcZypbZsbrl = tXmqcZypbZsbrl;
    }

    public String gettXmqcZypbFjhjpbts() {
        return tXmqcZypbFjhjpbts;
    }

    public void settXmqcZypbFjhjpbts(String tXmqcZypbFjhjpbts) {
        this.tXmqcZypbFjhjpbts = tXmqcZypbFjhjpbts;
    }

    public String gettXmqcZypbFjhjpbrl() {
        return tXmqcZypbFjhjpbrl;
    }

    public void settXmqcZypbFjhjpbrl(String tXmqcZypbFjhjpbrl) {
        this.tXmqcZypbFjhjpbrl = tXmqcZypbFjhjpbrl;
    }

    public String gettXmqcZypbPdszs() {
        return tXmqcZypbPdszs;
    }

    public void settXmqcZypbPdszs(String tXmqcZypbPdszs) {
        this.tXmqcZypbPdszs = tXmqcZypbPdszs;
    }

    public String gettXmqcZypbPdsts() {
        return tXmqcZypbPdsts;
    }

    public void settXmqcZypbPdsts(String tXmqcZypbPdsts) {
        this.tXmqcZypbPdsts = tXmqcZypbPdsts;
    }

    public String gettXmqcZypbPdsrl() {
        return tXmqcZypbPdsrl;
    }

    public void settXmqcZypbPdsrl(String tXmqcZypbPdsrl) {
        this.tXmqcZypbPdsrl = tXmqcZypbPdsrl;
    }

    public String gettXmqcZypbXbzs() {
        return tXmqcZypbXbzs;
    }

    public void settXmqcZypbXbzs(String tXmqcZypbXbzs) {
        this.tXmqcZypbXbzs = tXmqcZypbXbzs;
    }

    public String gettXmqcZypbXbts() {
        return tXmqcZypbXbts;
    }

    public void settXmqcZypbXbts(String tXmqcZypbXbts) {
        this.tXmqcZypbXbts = tXmqcZypbXbts;
    }

    public String gettXmqcZypbXbrl() {
        return tXmqcZypbXbrl;
    }

    public void settXmqcZypbXbrl(String tXmqcZypbXbrl) {
        this.tXmqcZypbXbrl = tXmqcZypbXbrl;
    }

    public String gettXmqcDywptJkxlts() {
        return tXmqcDywptJkxlts;
    }

    public void settXmqcDywptJkxlts(String tXmqcDywptJkxlts) {
        this.tXmqcDywptJkxlts = tXmqcDywptJkxlts;
    }

    public String gettXmqcDywptJkxlcd() {
        return tXmqcDywptJkxlcd;
    }

    public void settXmqcDywptJkxlcd(String tXmqcDywptJkxlcd) {
        this.tXmqcDywptJkxlcd = tXmqcDywptJkxlcd;
    }

    public String gettXmqcDywptJkxltz() {
        return tXmqcDywptJkxltz;
    }

    public void settXmqcDywptJkxltz(String tXmqcDywptJkxltz) {
        this.tXmqcDywptJkxltz = tXmqcDywptJkxltz;
    }

    public String gettXmqcDywptDlts() {
        return tXmqcDywptDlts;
    }

    public void settXmqcDywptDlts(String tXmqcDywptDlts) {
        this.tXmqcDywptDlts = tXmqcDywptDlts;
    }

    public String gettXmqcDywptDlcd() {
        return tXmqcDywptDlcd;
    }

    public void settXmqcDywptDlcd(String tXmqcDywptDlcd) {
        this.tXmqcDywptDlcd = tXmqcDywptDlcd;
    }

    public String gettXmqcDywptDltz() {
        return tXmqcDywptDltz;
    }

    public void settXmqcDywptDltz(String tXmqcDywptDltz) {
        this.tXmqcDywptDltz = tXmqcDywptDltz;
    }

    public String gettXmqcHbHb() {
        return tXmqcHbHb;
    }

    public void settXmqcHbHb(String tXmqcHbHb) {
        this.tXmqcHbHb = tXmqcHbHb;
    }

    public String gettXmqcHbJhx() {
        return tXmqcHbJhx;
    }

    public void settXmqcHbJhx(String tXmqcHbJhx) {
        this.tXmqcHbJhx = tXmqcHbJhx;
    }

    public String gettXmqcHbHbtz() {
        return tXmqcHbHbtz;
    }

    public void settXmqcHbHbtz(String tXmqcHbHbtz) {
        this.tXmqcHbHbtz = tXmqcHbHbtz;
    }

    public String gettXmqcZjlyZyjh() {
        return tXmqcZjlyZyjh;
    }

    public void settXmqcZjlyZyjh(String tXmqcZjlyZyjh) {
        this.tXmqcZjlyZyjh = tXmqcZjlyZyjh;
    }

    public String gettXmqcZjlyGszc() {
        return tXmqcZjlyGszc;
    }

    public void settXmqcZjlyGszc(String tXmqcZjlyGszc) {
        this.tXmqcZjlyGszc = tXmqcZjlyGszc;
    }

    public String gettXmqcZjlyXjgdqyzc() {
        return tXmqcZjlyXjgdqyzc;
    }

    public void settXmqcZjlyXjgdqyzc(String tXmqcZjlyXjgdqyzc) {
        this.tXmqcZjlyXjgdqyzc = tXmqcZjlyXjgdqyzc;
    }

    public String gettXmqcZjlyYhtz() {
        return tXmqcZjlyYhtz;
    }

    public void settXmqcZjlyYhtz(String tXmqcZjlyYhtz) {
        this.tXmqcZjlyYhtz = tXmqcZjlyYhtz;
    }

    public String gettXmqcZjlyXqptf() {
        return tXmqcZjlyXqptf;
    }

    public void settXmqcZjlyXqptf(String tXmqcZjlyXqptf) {
        this.tXmqcZjlyXqptf = tXmqcZjlyXqptf;
    }

    public String gettXmqcZjlyZfdz() {
        return tXmqcZjlyZfdz;
    }

    public void settXmqcZjlyZfdz(String tXmqcZjlyZfdz) {
        this.tXmqcZjlyZfdz = tXmqcZjlyZfdz;
    }

    public String gettXmqcZjlyQt() {
        return tXmqcZjlyQt;
    }

    public void settXmqcZjlyQt(String tXmqcZjlyQt) {
        this.tXmqcZjlyQt = tXmqcZjlyQt;
    }

    public String gettXmqcZcsx() {
        return tXmqcZcsx;
    }

    public void settXmqcZcsx(String tXmqcZcsx) {
        this.tXmqcZcsx = tXmqcZcsx;
    }

    public String gettXmqcGzZts() {
        return tXmqcGzZts;
    }

    public void settXmqcGzZts(String tXmqcGzZts) {
        this.tXmqcGzZts = tXmqcGzZts;
    }

    public String gettXmqcGzQzrl() {
        return tXmqcGzQzrl;
    }

    public void settXmqcGzQzrl(String tXmqcGzQzrl) {
        this.tXmqcGzQzrl = tXmqcGzQzrl;
    }

    public String gettXmqcGzHzrl() {
        return tXmqcGzHzrl;
    }

    public void settXmqcGzHzrl(String tXmqcGzHzrl) {
        this.tXmqcGzHzrl = tXmqcGzHzrl;
    }

    public String gettXmqcGzGsts() {
        return tXmqcGzGsts;
    }

    public void settXmqcGzGsts(String tXmqcGzGsts) {
        this.tXmqcGzGsts = tXmqcGzGsts;
    }

    public String gettXmqcGzGsrl() {
        return tXmqcGzGsrl;
    }

    public void settXmqcGzGsrl(String tXmqcGzGsrl) {
        this.tXmqcGzGsrl = tXmqcGzGsrl;
    }

    public String gettXmqcGzFjts() {
        return tXmqcGzFjts;
    }

    public void settXmqcGzFjts(String tXmqcGzFjts) {
        this.tXmqcGzFjts = tXmqcGzFjts;
    }

    public String gettXmqcGzFjrl() {
        return tXmqcGzFjrl;
    }

    public void settXmqcGzFjrl(String tXmqcGzFjrl) {
        this.tXmqcGzFjrl = tXmqcGzFjrl;
    }

    public String gettXmqcGzWgzs() {
        return tXmqcGzWgzs;
    }

    public void settXmqcGzWgzs(String tXmqcGzWgzs) {
        this.tXmqcGzWgzs = tXmqcGzWgzs;
    }

    public String gettXmqcGzWgzrl() {
        return tXmqcGzWgzrl;
    }

    public void settXmqcGzWgzrl(String tXmqcGzWgzrl) {
        this.tXmqcGzWgzrl = tXmqcGzWgzrl;
    }

    public String gettXmqcGzWgtz() {
        return tXmqcGzWgtz;
    }

    public void settXmqcGzWgtz(String tXmqcGzWgtz) {
        this.tXmqcGzWgtz = tXmqcGzWgtz;
    }

    public String gettXmqcGzDlq() {
        return tXmqcGzDlq;
    }

    public void settXmqcGzDlq(String tXmqcGzDlq) {
        this.tXmqcGzDlq = tXmqcGzDlq;
    }

    public String gettXmqcGzFhkg() {
        return tXmqcGzFhkg;
    }

    public void settXmqcGzFhkg(String tXmqcGzFhkg) {
        this.tXmqcGzFhkg = tXmqcGzFhkg;
    }

    public String gettXmqcGzHwg() {
        return tXmqcGzHwg;
    }

    public void settXmqcGzHwg(String tXmqcGzHwg) {
        this.tXmqcGzHwg = tXmqcGzHwg;
    }

    public String gettXmqcGzDlfzx() {
        return tXmqcGzDlfzx;
    }

    public void settXmqcGzDlfzx(String tXmqcGzDlfzx) {
        this.tXmqcGzDlfzx = tXmqcGzDlfzx;
    }

    public String gettXmqcGzKgtz() {
        return tXmqcGzKgtz;
    }

    public void settXmqcGzKgtz(String tXmqcGzKgtz) {
        this.tXmqcGzKgtz = tXmqcGzKgtz;
    }

    public String gettXmqcGzJkxlcd() {
        return tXmqcGzJkxlcd;
    }

    public void settXmqcGzJkxlcd(String tXmqcGzJkxlcd) {
        this.tXmqcGzJkxlcd = tXmqcGzJkxlcd;
    }

    public String gettXmqcGzJydxcd() {
        return tXmqcGzJydxcd;
    }

    public void settXmqcGzJydxcd(String tXmqcGzJydxcd) {
        this.tXmqcGzJydxcd = tXmqcGzJydxcd;
    }

    public String gettXmqcGzJkxltz() {
        return tXmqcGzJkxltz;
    }

    public void settXmqcGzJkxltz(String tXmqcGzJkxltz) {
        this.tXmqcGzJkxltz = tXmqcGzJkxltz;
    }

    public String gettXmqcGzDlxlcd() {
        return tXmqcGzDlxlcd;
    }

    public void settXmqcGzDlxlcd(String tXmqcGzDlxlcd) {
        this.tXmqcGzDlxlcd = tXmqcGzDlxlcd;
    }

    public String gettXmqcGzGdcd() {
        return tXmqcGzGdcd;
    }

    public void settXmqcGzGdcd(String tXmqcGzGdcd) {
        this.tXmqcGzGdcd = tXmqcGzGdcd;
    }

    public String gettXmqcGzDlxltz() {
        return tXmqcGzDlxltz;
    }

    public void settXmqcGzDlxltz(String tXmqcGzDlxltz) {
        this.tXmqcGzDlxltz = tXmqcGzDlxltz;
    }

    public String gettXmqcGzPbtz() {
        return tXmqcGzPbtz;
    }

    public void settXmqcGzPbtz(String tXmqcGzPbtz) {
        this.tXmqcGzPbtz = tXmqcGzPbtz;
    }

    public String gettXmqcQtx() {
        return tXmqcQtx;
    }

    public void settXmqcQtx(String tXmqcQtx) {
        this.tXmqcQtx = tXmqcQtx;
    }

    public String gettXmqcQtxtz() {
        return tXmqcQtxtz;
    }

    public void settXmqcQtxtz(String tXmqcQtxtz) {
        this.tXmqcQtxtz = tXmqcQtxtz;
    }

    public String gettXmqcDysclb() {
        return tXmqcDysclb;
    }

    public void settXmqcDysclb(String tXmqcDysclb) {
        this.tXmqcDysclb = tXmqcDysclb;
    }

    public String gettXmqcType() {
        return tXmqcType;
    }

    public void settXmqcType(String tXmqcType) {
        this.tXmqcType = tXmqcType;
    }

    public String gettXmqcBdzlx() {
        return tXmqcBdzlx;
    }

    public void settXmqcBdzlx(String tXmqcBdzlx) {
        this.tXmqcBdzlx = tXmqcBdzlx;
    }

    public String gettXmqcBdzpdzzxs() {
        return tXmqcBdzpdzzxs;
    }

    public void settXmqcBdzpdzzxs(String tXmqcBdzpdzzxs) {
        this.tXmqcBdzpdzzxs = tXmqcBdzpdzzxs;
    }

    public String gettXmqcBdzzdmj() {
        return tXmqcBdzzdmj;
    }

    public void settXmqcBdzzdmj(String tXmqcBdzzdmj) {
        this.tXmqcBdzzdmj = tXmqcBdzzdmj;
    }

    public String gettXmqcBdzts() {
        return tXmqcBdzts;
    }

    public void settXmqcBdzts(String tXmqcBdzts) {
        this.tXmqcBdzts = tXmqcBdzts;
    }

    public String gettXmqcBdzxzrl() {
        return tXmqcBdzxzrl;
    }

    public void settXmqcBdzxzrl(String tXmqcBdzxzrl) {
        this.tXmqcBdzxzrl = tXmqcBdzxzrl;
    }

    public String gettXmqcBdzrxrl() {
        return tXmqcBdzrxrl;
    }

    public void settXmqcBdzrxrl(String tXmqcBdzrxrl) {
        this.tXmqcBdzrxrl = tXmqcBdzrxrl;
    }

    public String gettXmqcBdzgxrl() {
        return tXmqcBdzgxrl;
    }

    public void settXmqcBdzgxrl(String tXmqcBdzgxrl) {
        this.tXmqcBdzgxrl = tXmqcBdzgxrl;
    }

    public String gettXmqcBdztz() {
        return tXmqcBdztz;
    }

    public void settXmqcBdztz(String tXmqcBdztz) {
        this.tXmqcBdztz = tXmqcBdztz;
    }

    public String gettXmqcBdzjg() {
        return tXmqcBdzjg;
    }

    public void settXmqcBdzjg(String tXmqcBdzjg) {
        this.tXmqcBdzjg = tXmqcBdzjg;
    }

    public String gettXmqcBdzxlts() {
        return tXmqcBdzxlts;
    }

    public void settXmqcBdzxlts(String tXmqcBdzxlts) {
        this.tXmqcBdzxlts = tXmqcBdzxlts;
    }

    public String gettXmqcBdzxlzcd() {
        return tXmqcBdzxlzcd;
    }

    public void settXmqcBdzxlzcd(String tXmqcBdzxlzcd) {
        this.tXmqcBdzxlzcd = tXmqcBdzxlzcd;
    }

    public String gettXmqcBdzdlcd() {
        return tXmqcBdzdlcd;
    }

    public void settXmqcBdzdlcd(String tXmqcBdzdlcd) {
        this.tXmqcBdzdlcd = tXmqcBdzdlcd;
    }

    public String gettXmqcBdzdlxh() {
        return tXmqcBdzdlxh;
    }

    public void settXmqcBdzdlxh(String tXmqcBdzdlxh) {
        this.tXmqcBdzdlxh = tXmqcBdzdlxh;
    }

    public String gettXmqcBdzjkcd() {
        return tXmqcBdzjkcd;
    }

    public void settXmqcBdzjkcd(String tXmqcBdzjkcd) {
        this.tXmqcBdzjkcd = tXmqcBdzjkcd;
    }

    public String gettXmqcBdzjkxh() {
        return tXmqcBdzjkxh;
    }

    public void settXmqcBdzjkxh(String tXmqcBdzjkxh) {
        this.tXmqcBdzjkxh = tXmqcBdzjkxh;
    }

    public String gettXmqcBdzxltz() {
        return tXmqcBdzxltz;
    }

    public void settXmqcBdzxltz(String tXmqcBdzxltz) {
        this.tXmqcBdzxltz = tXmqcBdzxltz;
    }

    public String gettXmqcIscnw() {
        return tXmqcIscnw;
    }

    public void settXmqcIscnw(String tXmqcIscnw) {
        this.tXmqcIscnw = tXmqcIscnw;
    }

    public String gettXmqcByqgzts() {
        return tXmqcByqgzts;
    }

    public void settXmqcByqgzts(String tXmqcByqgzts) {
        this.tXmqcByqgzts = tXmqcByqgzts;
    }

    public String gettXmqcGzbyqbh1() {
        return tXmqcGzbyqbh1;
    }

    public void settXmqcGzbyqbh1(String tXmqcGzbyqbh1) {
        this.tXmqcGzbyqbh1 = tXmqcGzbyqbh1;
    }

    public String gettXmqcGzbyqbh2() {
        return tXmqcGzbyqbh2;
    }

    public void settXmqcGzbyqbh2(String tXmqcGzbyqbh2) {
        this.tXmqcGzbyqbh2 = tXmqcGzbyqbh2;
    }

    public String gettXmqcGzqzbrl() {
        return tXmqcGzqzbrl;
    }

    public void settXmqcGzqzbrl(String tXmqcGzqzbrl) {
        this.tXmqcGzqzbrl = tXmqcGzqzbrl;
    }

    public String gettXmqcGzhzbrl() {
        return tXmqcGzhzbrl;
    }

    public void settXmqcGzhzbrl(String tXmqcGzhzbrl) {
        this.tXmqcGzhzbrl = tXmqcGzhzbrl;
    }

    public String gettXmqcBdzgzzs() {
        return tXmqcBdzgzzs;
    }

    public void settXmqcBdzgzzs(String tXmqcBdzgzzs) {
        this.tXmqcBdzgzzs = tXmqcBdzgzzs;
    }

    public String gettXmqcZt() {
        return tXmqcZt;
    }

    public void settXmqcZt(String tXmqcZt) {
        this.tXmqcZt = tXmqcZt;
    }

    @Override
    protected Serializable pkVal() {
        return this.tXmqcId;
    }

    @Override
    public String toString() {
        return "TDwghglXmqc{" +
        "tXmqcId=" + tXmqcId +
        ", tXmqcXmmc=" + tXmqcXmmc +
        ", tXmqcGhnf=" + tXmqcGhnf +
        ", tXmqcJsxz=" + tXmqcJsxz +
        ", tXmqcGcxz=" + tXmqcGcxz +
        ", tXmqcGcsx=" + tXmqcGcsx +
        ", tXmqcIsznhxm=" + tXmqcIsznhxm +
        ", tXmqcSsqy=" + tXmqcSsqy +
        ", tXmqcBdz=" + tXmqcBdz +
        ", tXmqcGqlx=" + tXmqcGqlx +
        ", tXmqcXmlx=" + tXmqcXmlx +
        ", tXmqcDydj=" + tXmqcDydj +
        ", tXmqcYwdw=" + tXmqcYwdw +
        ", tXmqcKgsj=" + tXmqcKgsj +
        ", tXmqcJgsj=" + tXmqcJgsj +
        ", tXmqcSyfs=" + tXmqcSyfs +
        ", tXmqcCnw=" + tXmqcCnw +
        ", tXmqcXmtz=" + tXmqcXmtz +
        ", tXmqcXlzts=" + tXmqcXlzts +
        ", tXmqcXlzcd=" + tXmqcXlzcd +
        ", tXmqcPbts=" + tXmqcPbts +
        ", tXmqcPbrl=" + tXmqcPbrl +
        ", tXmqcZgxcd=" + tXmqcZgxcd +
        ", tXmqcNwjsxz1=" + tXmqcNwjsxz1 +
        ", tXmqcNwjsxz2=" + tXmqcNwjsxz2 +
        ", tXmqcNwjsxz3=" + tXmqcNwjsxz3 +
        ", tXmqcZyxlJkcd=" + tXmqcZyxlJkcd +
        ", tXmqcZyxlDlcd=" + tXmqcZyxlDlcd +
        ", tXmqcZyxlGdbj=" + tXmqcZyxlGdbj +
        ", tXmqcZyxlWgbcrl=" + tXmqcZyxlWgbcrl +
        ", tXmqcZyxlTz=" + tXmqcZyxlTz +
        ", tXmqcZykgKbs=" + tXmqcZykgKbs +
        ", tXmqcZykgDlfzx=" + tXmqcZykgDlfzx +
        ", tXmqcZykgTz=" + tXmqcZykgTz +
        ", tXmqcZykgHwgzs=" + tXmqcZykgHwgzs +
        ", tXmqcZykgHwgfd=" + tXmqcZykgHwgfd +
        ", tXmqcZykgHwgll=" + tXmqcZykgHwgll +
        ", tXmqcZykgZskgzs=" + tXmqcZykgZskgzs +
        ", tXmqcZykgZskgfd=" + tXmqcZykgZskgfd +
        ", tXmqcZykgZskgll=" + tXmqcZykgZskgll +
        ", tXmqcZypbWgbcrl=" + tXmqcZypbWgbcrl +
        ", tXmqcZypbTz=" + tXmqcZypbTz +
        ", tXmqcZypbZsbts=" + tXmqcZypbZsbts +
        ", tXmqcZypbZsbrl=" + tXmqcZypbZsbrl +
        ", tXmqcZypbFjhjpbts=" + tXmqcZypbFjhjpbts +
        ", tXmqcZypbFjhjpbrl=" + tXmqcZypbFjhjpbrl +
        ", tXmqcZypbPdszs=" + tXmqcZypbPdszs +
        ", tXmqcZypbPdsts=" + tXmqcZypbPdsts +
        ", tXmqcZypbPdsrl=" + tXmqcZypbPdsrl +
        ", tXmqcZypbXbzs=" + tXmqcZypbXbzs +
        ", tXmqcZypbXbts=" + tXmqcZypbXbts +
        ", tXmqcZypbXbrl=" + tXmqcZypbXbrl +
        ", tXmqcDywptJkxlts=" + tXmqcDywptJkxlts +
        ", tXmqcDywptJkxlcd=" + tXmqcDywptJkxlcd +
        ", tXmqcDywptJkxltz=" + tXmqcDywptJkxltz +
        ", tXmqcDywptDlts=" + tXmqcDywptDlts +
        ", tXmqcDywptDlcd=" + tXmqcDywptDlcd +
        ", tXmqcDywptDltz=" + tXmqcDywptDltz +
        ", tXmqcHbHb=" + tXmqcHbHb +
        ", tXmqcHbJhx=" + tXmqcHbJhx +
        ", tXmqcHbHbtz=" + tXmqcHbHbtz +
        ", tXmqcZjlyZyjh=" + tXmqcZjlyZyjh +
        ", tXmqcZjlyGszc=" + tXmqcZjlyGszc +
        ", tXmqcZjlyXjgdqyzc=" + tXmqcZjlyXjgdqyzc +
        ", tXmqcZjlyYhtz=" + tXmqcZjlyYhtz +
        ", tXmqcZjlyXqptf=" + tXmqcZjlyXqptf +
        ", tXmqcZjlyZfdz=" + tXmqcZjlyZfdz +
        ", tXmqcZjlyQt=" + tXmqcZjlyQt +
        ", tXmqcZcsx=" + tXmqcZcsx +
        ", tXmqcGzZts=" + tXmqcGzZts +
        ", tXmqcGzQzrl=" + tXmqcGzQzrl +
        ", tXmqcGzHzrl=" + tXmqcGzHzrl +
        ", tXmqcGzGsts=" + tXmqcGzGsts +
        ", tXmqcGzGsrl=" + tXmqcGzGsrl +
        ", tXmqcGzFjts=" + tXmqcGzFjts +
        ", tXmqcGzFjrl=" + tXmqcGzFjrl +
        ", tXmqcGzWgzs=" + tXmqcGzWgzs +
        ", tXmqcGzWgzrl=" + tXmqcGzWgzrl +
        ", tXmqcGzWgtz=" + tXmqcGzWgtz +
        ", tXmqcGzDlq=" + tXmqcGzDlq +
        ", tXmqcGzFhkg=" + tXmqcGzFhkg +
        ", tXmqcGzHwg=" + tXmqcGzHwg +
        ", tXmqcGzDlfzx=" + tXmqcGzDlfzx +
        ", tXmqcGzKgtz=" + tXmqcGzKgtz +
        ", tXmqcGzJkxlcd=" + tXmqcGzJkxlcd +
        ", tXmqcGzJydxcd=" + tXmqcGzJydxcd +
        ", tXmqcGzJkxltz=" + tXmqcGzJkxltz +
        ", tXmqcGzDlxlcd=" + tXmqcGzDlxlcd +
        ", tXmqcGzGdcd=" + tXmqcGzGdcd +
        ", tXmqcGzDlxltz=" + tXmqcGzDlxltz +
        ", tXmqcGzPbtz=" + tXmqcGzPbtz +
        ", tXmqcQtx=" + tXmqcQtx +
        ", tXmqcQtxtz=" + tXmqcQtxtz +
        ", tXmqcDysclb=" + tXmqcDysclb +
        ", tXmqcType=" + tXmqcType +
        ", tXmqcBdzlx=" + tXmqcBdzlx +
        ", tXmqcBdzpdzzxs=" + tXmqcBdzpdzzxs +
        ", tXmqcBdzzdmj=" + tXmqcBdzzdmj +
        ", tXmqcBdzts=" + tXmqcBdzts +
        ", tXmqcBdzxzrl=" + tXmqcBdzxzrl +
        ", tXmqcBdzrxrl=" + tXmqcBdzrxrl +
        ", tXmqcBdzgxrl=" + tXmqcBdzgxrl +
        ", tXmqcBdztz=" + tXmqcBdztz +
        ", tXmqcBdzjg=" + tXmqcBdzjg +
        ", tXmqcBdzxlts=" + tXmqcBdzxlts +
        ", tXmqcBdzxlzcd=" + tXmqcBdzxlzcd +
        ", tXmqcBdzdlcd=" + tXmqcBdzdlcd +
        ", tXmqcBdzdlxh=" + tXmqcBdzdlxh +
        ", tXmqcBdzjkcd=" + tXmqcBdzjkcd +
        ", tXmqcBdzjkxh=" + tXmqcBdzjkxh +
        ", tXmqcBdzxltz=" + tXmqcBdzxltz +
        ", tXmqcIscnw=" + tXmqcIscnw +
        ", tXmqcByqgzts=" + tXmqcByqgzts +
        ", tXmqcGzbyqbh1=" + tXmqcGzbyqbh1 +
        ", tXmqcGzbyqbh2=" + tXmqcGzbyqbh2 +
        ", tXmqcGzqzbrl=" + tXmqcGzqzbrl +
        ", tXmqcGzhzbrl=" + tXmqcGzhzbrl +
        ", tXmqcBdzgzzs=" + tXmqcBdzgzzs +
        ", tXmqcZt=" + tXmqcZt +
        "}";
    }
}

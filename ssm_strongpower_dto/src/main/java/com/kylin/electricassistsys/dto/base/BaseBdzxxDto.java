package com.kylin.electricassistsys.dto.base;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public class BaseBdzxxDto {
    private Integer page;
    private Integer limit;
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

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}

package com.kylin.electricassistsys.dto.jcsj;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjCsDycsDto {

    private static final long serialVersionUID = 1L;

    /**
     * 电压编号
     */
    private String tDycsId;
    /**
     * 电压名称
     */
    private Double tDycsName;
    /**
     * 排序
     */
    private String tDycsPx;
    /**
     * 备注
     */
    private String tDycsRemark;


    public String gettDycsId() {
        return tDycsId;
    }

    public void settDycsId(String tDycsId) {
        this.tDycsId = tDycsId;
    }

    public Double gettDycsName() {
        return tDycsName;
    }

    public void settDycsName(Double tDycsName) {
        this.tDycsName = tDycsName;
    }

    public String gettDycsPx() {
        return tDycsPx;
    }

    public void settDycsPx(String tDycsPx) {
        this.tDycsPx = tDycsPx;
    }

    public String gettDycsRemark() {
        return tDycsRemark;
    }

    public void settDycsRemark(String tDycsRemark) {
        this.tDycsRemark = tDycsRemark;
    }


    @Override
    public String toString() {
        return "TJcsjCsDycs{" +
        "tDycsId=" + tDycsId +
        ", tDycsName=" + tDycsName +
        ", tDycsPx=" + tDycsPx +
        ", tDycsRemark=" + tDycsRemark +
        "}";
    }
}

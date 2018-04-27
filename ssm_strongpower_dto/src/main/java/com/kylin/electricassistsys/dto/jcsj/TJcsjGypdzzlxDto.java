package com.kylin.electricassistsys.dto.jcsj;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjGypdzzlxDto  {

    private static final long serialVersionUID = 1L;

    private String tGypdzzlxId;
    private String tGypdzzlxName;
    private String tGypdzzlxRemark;


    public String gettGypdzzlxId() {
        return tGypdzzlxId;
    }

    public void settGypdzzlxId(String tGypdzzlxId) {
        this.tGypdzzlxId = tGypdzzlxId;
    }

    public String gettGypdzzlxName() {
        return tGypdzzlxName;
    }

    public void settGypdzzlxName(String tGypdzzlxName) {
        this.tGypdzzlxName = tGypdzzlxName;
    }

    public String gettGypdzzlxRemark() {
        return tGypdzzlxRemark;
    }

    public void settGypdzzlxRemark(String tGypdzzlxRemark) {
        this.tGypdzzlxRemark = tGypdzzlxRemark;
    }

    @Override
    public String toString() {
        return "TJcsjGypdzzlx{" +
        "tGypdzzlxId=" + tGypdzzlxId +
        ", tGypdzzlxName=" + tGypdzzlxName +
        ", tGypdzzlxRemark=" + tGypdzzlxRemark +
        "}";
    }
}

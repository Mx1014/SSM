package com.kylin.electricassistsys.dto.jcsj;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjCnwDto{

    private static final long serialVersionUID = 1L;

    private String tCnwId;
    private String tCnwName;
    private String tCnwRemark;


    public String gettCnwId() {
        return tCnwId;
    }

    public void settCnwId(String tCnwId) {
        this.tCnwId = tCnwId;
    }

    public String gettCnwName() {
        return tCnwName;
    }

    public void settCnwName(String tCnwName) {
        this.tCnwName = tCnwName;
    }

    public String gettCnwRemark() {
        return tCnwRemark;
    }

    public void settCnwRemark(String tCnwRemark) {
        this.tCnwRemark = tCnwRemark;
    }



    @Override
    public String toString() {
        return "TJcsjCnw{" +
        "tCnwId=" + tCnwId +
        ", tCnwName=" + tCnwName +
        ", tCnwRemark=" + tCnwRemark +
        "}";
    }
}

package com.kylin.electricassistsys.dto.jcsj;

import com.kylin.electricassistsys.dto.base.BaseDto;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjFqGqlxDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    private String tGqlxId;
    private String tGqlxName;
    private String tGqlxBianhao;
    private String tGqlxRemark;


    public String gettGqlxId() {
        return tGqlxId;
    }

    public void settGqlxId(String tGqlxId) {
        this.tGqlxId = tGqlxId;
    }

    public String gettGqlxName() {
        return tGqlxName;
    }

    public void settGqlxName(String tGqlxName) {
        this.tGqlxName = tGqlxName;
    }

    public String gettGqlxBianhao() {
        return tGqlxBianhao;
    }

    public void settGqlxBianhao(String tGqlxBianhao) {
        this.tGqlxBianhao = tGqlxBianhao;
    }

    public String gettGqlxRemark() {
        return tGqlxRemark;
    }

    public void settGqlxRemark(String tGqlxRemark) {
        this.tGqlxRemark = tGqlxRemark;
    }


    @Override
    public String toString() {
        return "TJcsjFqGqlx{" +
        "tGqlxId=" + tGqlxId +
        ", tGqlxName=" + tGqlxName +
        ", tGqlxBianhao=" + tGqlxBianhao +
        ", tGqlxRemark=" + tGqlxRemark +
        "}";
    }
}

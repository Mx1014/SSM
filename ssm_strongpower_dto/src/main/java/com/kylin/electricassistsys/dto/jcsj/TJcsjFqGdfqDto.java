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
public class TJcsjFqGdfqDto extends BaseDto {

    private String tGdfqId;
    private String tGdfqName;
    private String tGdfqSsx;
    private String tGdfqBianhao;
    private String tGdfqRemark;
    private String tGdfqPId;


    public String gettGdfqId() {
        return tGdfqId;
    }

    public void settGdfqId(String tGdfqId) {
        this.tGdfqId = tGdfqId;
    }

    public String gettGdfqName() {
        return tGdfqName;
    }

    public void settGdfqName(String tGdfqName) {
        this.tGdfqName = tGdfqName;
    }

    public String gettGdfqSsx() {
        return tGdfqSsx;
    }

    public void settGdfqSsx(String tGdfqSsx) {
        this.tGdfqSsx = tGdfqSsx;
    }

    public String gettGdfqBianhao() {
        return tGdfqBianhao;
    }

    public void settGdfqBianhao(String tGdfqBianhao) {
        this.tGdfqBianhao = tGdfqBianhao;
    }

    public String gettGdfqRemark() {
        return tGdfqRemark;
    }

    public void settGdfqRemark(String tGdfqRemark) {
        this.tGdfqRemark = tGdfqRemark;
    }

    public String gettGdfqPId() {
        return tGdfqPId;
    }

    public void settGdfqPId(String tGdfqPId) {
        this.tGdfqPId = tGdfqPId;
    }


    @Override
    public String toString() {
        return "TJcsjFqGdfq{" +
        "tGdfqId=" + tGdfqId +
        ", tGdfqName=" + tGdfqName +
        ", tGdfqSsx=" + tGdfqSsx +
        ", tGdfqBianhao=" + tGdfqBianhao +
        ", tGdfqRemark=" + tGdfqRemark +
        ", tGdfqPId=" + tGdfqPId +
        "}";
    }
}

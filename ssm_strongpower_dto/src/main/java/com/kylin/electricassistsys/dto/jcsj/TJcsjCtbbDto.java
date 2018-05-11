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
public class TJcsjCtbbDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    private String tCtbbId;
    private String tCtbbName;
    private String tCtbbRemark;


    public String gettCtbbId() {
        return tCtbbId;
    }

    public void settCtbbId(String tCtbbId) {
        this.tCtbbId = tCtbbId;
    }

    public String gettCtbbName() {
        return tCtbbName;
    }

    public void settCtbbName(String tCtbbName) {
        this.tCtbbName = tCtbbName;
    }

    public String gettCtbbRemark() {
        return tCtbbRemark;
    }

    public void settCtbbRemark(String tCtbbRemark) {
        this.tCtbbRemark = tCtbbRemark;
    }


    @Override
    public String toString() {
        return "TJcsjCtbb{" +
                "tCtbbId=" + tCtbbId +
                ", tCtbbName=" + tCtbbName +
                ", tCtbbRemark=" + tCtbbRemark +
                "}";
    }
}

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
public class TJcsjJsfsDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    private String tJsfsId;
    private String tJsfsName;
    private String tJsfsRemark;


    public String gettJsfsId() {
        return tJsfsId;
    }

    public void settJsfsId(String tJsfsId) {
        this.tJsfsId = tJsfsId;
    }

    public String gettJsfsName() {
        return tJsfsName;
    }

    public void settJsfsName(String tJsfsName) {
        this.tJsfsName = tJsfsName;
    }

    public String gettJsfsRemark() {
        return tJsfsRemark;
    }

    public void settJsfsRemark(String tJsfsRemark) {
        this.tJsfsRemark = tJsfsRemark;
    }


    @Override
    public String toString() {
        return "TJcsjJsfs{" +
        "tJsfsId=" + tJsfsId +
        ", tJsfsName=" + tJsfsName +
        ", tJsfsRemark=" + tJsfsRemark +
        "}";
    }
}

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
public class TJcsjMpxhDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    private String tMpxhId;
    private String tMpxhName;
    private String tMpxhPx;
    private String tMpxhRemark;


    public String gettMpxhId() {
        return tMpxhId;
    }

    public void settMpxhId(String tMpxhId) {
        this.tMpxhId = tMpxhId;
    }

    public String gettMpxhName() {
        return tMpxhName;
    }

    public void settMpxhName(String tMpxhName) {
        this.tMpxhName = tMpxhName;
    }

    public String gettMpxhPx() {
        return tMpxhPx;
    }

    public void settMpxhPx(String tMpxhPx) {
        this.tMpxhPx = tMpxhPx;
    }

    public String gettMpxhRemark() {
        return tMpxhRemark;
    }

    public void settMpxhRemark(String tMpxhRemark) {
        this.tMpxhRemark = tMpxhRemark;
    }


    @Override
    public String toString() {
        return "TJcsjMpxh{" +
                "tMpxhId=" + tMpxhId +
                ", tMpxhName=" + tMpxhName +
                ", tMpxhPx=" + tMpxhPx +
                ", tMpxhRemark=" + tMpxhRemark +
                "}";
    }
}

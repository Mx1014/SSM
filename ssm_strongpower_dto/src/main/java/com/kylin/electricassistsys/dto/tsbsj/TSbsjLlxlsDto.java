package com.kylin.electricassistsys.dto.tsbsj;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSbsjLlxlsDto {


    /**
     * 编号
     */
    private String tLlxlsId;
    /**
     * 起点线路名称
     */
    private String tLlxlsBid;
    /**
     * 终点线路名称
     */
    private String tLlxlsEid;
    /**
     * 修改时间
     */
    private String tLlxlsUpdata;
    /**
     * 修改人
     */
    private String tLlxlsUpuser;
    /**
     * 第几次修改
     */
    private Double tLlxlsCishu;


    public String gettLlxlsId() {
        return tLlxlsId;
    }

    public void settLlxlsId(String tLlxlsId) {
        this.tLlxlsId = tLlxlsId;
    }

    public String gettLlxlsBid() {
        return tLlxlsBid;
    }

    public void settLlxlsBid(String tLlxlsBid) {
        this.tLlxlsBid = tLlxlsBid;
    }

    public String gettLlxlsEid() {
        return tLlxlsEid;
    }

    public void settLlxlsEid(String tLlxlsEid) {
        this.tLlxlsEid = tLlxlsEid;
    }

    public String gettLlxlsUpdata() {
        return tLlxlsUpdata;
    }

    public void settLlxlsUpdata(String tLlxlsUpdata) {
        this.tLlxlsUpdata = tLlxlsUpdata;
    }

    public String gettLlxlsUpuser() {
        return tLlxlsUpuser;
    }

    public void settLlxlsUpuser(String tLlxlsUpuser) {
        this.tLlxlsUpuser = tLlxlsUpuser;
    }

    public Double gettLlxlsCishu() {
        return tLlxlsCishu;
    }

    public void settLlxlsCishu(Double tLlxlsCishu) {
        this.tLlxlsCishu = tLlxlsCishu;
    }


    @Override
    public String toString() {
        return "TSbsjLlxls{" +
        "tLlxlsId=" + tLlxlsId +
        ", tLlxlsBid=" + tLlxlsBid +
        ", tLlxlsEid=" + tLlxlsEid +
        ", tLlxlsUpdata=" + tLlxlsUpdata +
        ", tLlxlsUpuser=" + tLlxlsUpuser +
        ", tLlxlsCishu=" + tLlxlsCishu +
        "}";
    }
}

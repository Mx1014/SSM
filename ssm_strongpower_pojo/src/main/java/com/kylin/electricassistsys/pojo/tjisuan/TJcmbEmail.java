package com.kylin.electricassistsys.pojo.tjisuan;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcmbEmail extends Model<TJcmbEmail> {

    private static final long serialVersionUID = 1L;

    private String tEmailId;
    /**
     * 收件人
     */
    private String tEmailSjr;
    /**
     * 发件人
     */
    private String tEmailFjr;
    /**
     * 主题
     */
    private String tEmailYjzt;
    /**
     * 内容
     */
    private String tEmailYjnr;
    /**
     * 附件名称
     */
    private String tEmailFjname;
    /**
     * 附件路径
     */
    private String tEmailFjurl;
    /**
     * 发送时间
     */
    private String tEmailFssj;
    /**
     * 分类（收信箱、发信箱、草稿箱）
     */
    private String tEmailYjfl;
    /**
     * 是否标记
     */
    private String tEmailSfbj;
    /**
     * 是否已读
     */
    private String tEmailSfyd;
    /**
     * 是否已发送
     */
    private String tEmailSfyfs;


    public String gettEmailId() {
        return tEmailId;
    }

    public void settEmailId(String tEmailId) {
        this.tEmailId = tEmailId;
    }

    public String gettEmailSjr() {
        return tEmailSjr;
    }

    public void settEmailSjr(String tEmailSjr) {
        this.tEmailSjr = tEmailSjr;
    }

    public String gettEmailFjr() {
        return tEmailFjr;
    }

    public void settEmailFjr(String tEmailFjr) {
        this.tEmailFjr = tEmailFjr;
    }

    public String gettEmailYjzt() {
        return tEmailYjzt;
    }

    public void settEmailYjzt(String tEmailYjzt) {
        this.tEmailYjzt = tEmailYjzt;
    }

    public String gettEmailYjnr() {
        return tEmailYjnr;
    }

    public void settEmailYjnr(String tEmailYjnr) {
        this.tEmailYjnr = tEmailYjnr;
    }

    public String gettEmailFjname() {
        return tEmailFjname;
    }

    public void settEmailFjname(String tEmailFjname) {
        this.tEmailFjname = tEmailFjname;
    }

    public String gettEmailFjurl() {
        return tEmailFjurl;
    }

    public void settEmailFjurl(String tEmailFjurl) {
        this.tEmailFjurl = tEmailFjurl;
    }

    public String gettEmailFssj() {
        return tEmailFssj;
    }

    public void settEmailFssj(String tEmailFssj) {
        this.tEmailFssj = tEmailFssj;
    }

    public String gettEmailYjfl() {
        return tEmailYjfl;
    }

    public void settEmailYjfl(String tEmailYjfl) {
        this.tEmailYjfl = tEmailYjfl;
    }

    public String gettEmailSfbj() {
        return tEmailSfbj;
    }

    public void settEmailSfbj(String tEmailSfbj) {
        this.tEmailSfbj = tEmailSfbj;
    }

    public String gettEmailSfyd() {
        return tEmailSfyd;
    }

    public void settEmailSfyd(String tEmailSfyd) {
        this.tEmailSfyd = tEmailSfyd;
    }

    public String gettEmailSfyfs() {
        return tEmailSfyfs;
    }

    public void settEmailSfyfs(String tEmailSfyfs) {
        this.tEmailSfyfs = tEmailSfyfs;
    }

    @Override
    protected Serializable pkVal() {
        return this.tEmailId;
    }

    @Override
    public String toString() {
        return "TJcmbEmail{" +
        "tEmailId=" + tEmailId +
        ", tEmailSjr=" + tEmailSjr +
        ", tEmailFjr=" + tEmailFjr +
        ", tEmailYjzt=" + tEmailYjzt +
        ", tEmailYjnr=" + tEmailYjnr +
        ", tEmailFjname=" + tEmailFjname +
        ", tEmailFjurl=" + tEmailFjurl +
        ", tEmailFssj=" + tEmailFssj +
        ", tEmailYjfl=" + tEmailYjfl +
        ", tEmailSfbj=" + tEmailSfbj +
        ", tEmailSfyd=" + tEmailSfyd +
        ", tEmailSfyfs=" + tEmailSfyfs +
        "}";
    }
}

package com.kylin.electricassistsys.pojo.tsbsj;

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
public class TSbyxxxQyyxxx extends Model<TSbyxxxQyyxxx> {

    private static final long serialVersionUID = 1L;

    private String tQyyxxxId;
    private String tQyyxxxSjny;
    private String tQyyxxxBdzId;
    private String tQyyxxxByqId;
    private Double tQyyxxxRl;
    private String tQyyxxxZdfhsk;
    private Double tQyyxxxYg;
    private Double tQyyxxxWg;
    private Double tQyyxxxDl;
    private Double tQyyxxxFzl;
    private Double tQyyxxxSzgl;
    private Double tQyyxxxGlys;
    private String tQyyxxxSjlx;


    public String gettQyyxxxId() {
        return tQyyxxxId;
    }

    public void settQyyxxxId(String tQyyxxxId) {
        this.tQyyxxxId = tQyyxxxId;
    }

    public String gettQyyxxxSjny() {
        return tQyyxxxSjny;
    }

    public void settQyyxxxSjny(String tQyyxxxSjny) {
        this.tQyyxxxSjny = tQyyxxxSjny;
    }

    public String gettQyyxxxBdzId() {
        return tQyyxxxBdzId;
    }

    public void settQyyxxxBdzId(String tQyyxxxBdzId) {
        this.tQyyxxxBdzId = tQyyxxxBdzId;
    }

    public String gettQyyxxxByqId() {
        return tQyyxxxByqId;
    }

    public void settQyyxxxByqId(String tQyyxxxByqId) {
        this.tQyyxxxByqId = tQyyxxxByqId;
    }

    public Double gettQyyxxxRl() {
        return tQyyxxxRl;
    }

    public void settQyyxxxRl(Double tQyyxxxRl) {
        this.tQyyxxxRl = tQyyxxxRl;
    }

    public String gettQyyxxxZdfhsk() {
        return tQyyxxxZdfhsk;
    }

    public void settQyyxxxZdfhsk(String tQyyxxxZdfhsk) {
        this.tQyyxxxZdfhsk = tQyyxxxZdfhsk;
    }

    public Double gettQyyxxxYg() {
        return tQyyxxxYg;
    }

    public void settQyyxxxYg(Double tQyyxxxYg) {
        this.tQyyxxxYg = tQyyxxxYg;
    }

    public Double gettQyyxxxWg() {
        return tQyyxxxWg;
    }

    public void settQyyxxxWg(Double tQyyxxxWg) {
        this.tQyyxxxWg = tQyyxxxWg;
    }

    public Double gettQyyxxxDl() {
        return tQyyxxxDl;
    }

    public void settQyyxxxDl(Double tQyyxxxDl) {
        this.tQyyxxxDl = tQyyxxxDl;
    }

    public Double gettQyyxxxFzl() {
        return tQyyxxxFzl;
    }

    public void settQyyxxxFzl(Double tQyyxxxFzl) {
        this.tQyyxxxFzl = tQyyxxxFzl;
    }

    public Double gettQyyxxxSzgl() {
        return tQyyxxxSzgl;
    }

    public void settQyyxxxSzgl(Double tQyyxxxSzgl) {
        this.tQyyxxxSzgl = tQyyxxxSzgl;
    }

    public Double gettQyyxxxGlys() {
        return tQyyxxxGlys;
    }

    public void settQyyxxxGlys(Double tQyyxxxGlys) {
        this.tQyyxxxGlys = tQyyxxxGlys;
    }

    public String gettQyyxxxSjlx() {
        return tQyyxxxSjlx;
    }

    public void settQyyxxxSjlx(String tQyyxxxSjlx) {
        this.tQyyxxxSjlx = tQyyxxxSjlx;
    }

    @Override
    protected Serializable pkVal() {
        return this.tQyyxxxId;
    }

    @Override
    public String toString() {
        return "TSbyxxxQyyxxx{" +
        "tQyyxxxId=" + tQyyxxxId +
        ", tQyyxxxSjny=" + tQyyxxxSjny +
        ", tQyyxxxBdzId=" + tQyyxxxBdzId +
        ", tQyyxxxByqId=" + tQyyxxxByqId +
        ", tQyyxxxRl=" + tQyyxxxRl +
        ", tQyyxxxZdfhsk=" + tQyyxxxZdfhsk +
        ", tQyyxxxYg=" + tQyyxxxYg +
        ", tQyyxxxWg=" + tQyyxxxWg +
        ", tQyyxxxDl=" + tQyyxxxDl +
        ", tQyyxxxFzl=" + tQyyxxxFzl +
        ", tQyyxxxSzgl=" + tQyyxxxSzgl +
        ", tQyyxxxGlys=" + tQyyxxxGlys +
        ", tQyyxxxSjlx=" + tQyyxxxSjlx +
        "}";
    }
}

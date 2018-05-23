package com.kylin.electricassistsys.pojo.tsbsj;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TSbyxxxGyxlyxxx extends Model<TSbyxxxGyxlyxxx> {

    private static final long serialVersionUID = 1L;
   @TableId("t_gyxlyxxx_id")
    private String tGyxlyxxxId;
    private String tGyxlyxxxSjny;
    private Double tGyxlyxxxYg;
    private Double tGyxlyxxxWg;
    private Double tGyxlyxxxZg;
    private Double tGyxlyxxxDl;
    private String tGyxlyxxxZdfhsk;
    private Double tGyxlyxxxFzl;
    private Double tGyxlyxxxZxyg;
    private Double tGyxlyxxxSzgl;
    private Double tGyxlyxxxGlys;
    private String tGyxlyxxxGyxlId;
    private String tGyxlyxxxRemarks;


    public String gettGyxlyxxxId() {
        return tGyxlyxxxId;
    }

    public void settGyxlyxxxId(String tGyxlyxxxId) {
        this.tGyxlyxxxId = tGyxlyxxxId;
    }

    public String gettGyxlyxxxSjny() {
        return tGyxlyxxxSjny;
    }

    public void settGyxlyxxxSjny(String tGyxlyxxxSjny) {
        this.tGyxlyxxxSjny = tGyxlyxxxSjny;
    }

    public Double gettGyxlyxxxYg() {
        return tGyxlyxxxYg;
    }

    public void settGyxlyxxxYg(Double tGyxlyxxxYg) {
        this.tGyxlyxxxYg = tGyxlyxxxYg;
    }

    public Double gettGyxlyxxxWg() {
        return tGyxlyxxxWg;
    }

    public void settGyxlyxxxWg(Double tGyxlyxxxWg) {
        this.tGyxlyxxxWg = tGyxlyxxxWg;
    }

    public Double gettGyxlyxxxZg() {
        return tGyxlyxxxZg;
    }

    public void settGyxlyxxxZg(Double tGyxlyxxxZg) {
        this.tGyxlyxxxZg = tGyxlyxxxZg;
    }

    public Double gettGyxlyxxxDl() {
        return tGyxlyxxxDl;
    }

    public void settGyxlyxxxDl(Double tGyxlyxxxDl) {
        this.tGyxlyxxxDl = tGyxlyxxxDl;
    }

    public String gettGyxlyxxxZdfhsk() {
        return tGyxlyxxxZdfhsk;
    }

    public void settGyxlyxxxZdfhsk(String tGyxlyxxxZdfhsk) {
        this.tGyxlyxxxZdfhsk = tGyxlyxxxZdfhsk;
    }

    public Double gettGyxlyxxxFzl() {
        return tGyxlyxxxFzl;
    }

    public void settGyxlyxxxFzl(Double tGyxlyxxxFzl) {
        this.tGyxlyxxxFzl = tGyxlyxxxFzl;
    }

    public Double gettGyxlyxxxZxyg() {
        return tGyxlyxxxZxyg;
    }

    public void settGyxlyxxxZxyg(Double tGyxlyxxxZxyg) {
        this.tGyxlyxxxZxyg = tGyxlyxxxZxyg;
    }

    public Double gettGyxlyxxxSzgl() {
        return tGyxlyxxxSzgl;
    }

    public void settGyxlyxxxSzgl(Double tGyxlyxxxSzgl) {
        this.tGyxlyxxxSzgl = tGyxlyxxxSzgl;
    }

    public Double gettGyxlyxxxGlys() {
        return tGyxlyxxxGlys;
    }

    public void settGyxlyxxxGlys(Double tGyxlyxxxGlys) {
        this.tGyxlyxxxGlys = tGyxlyxxxGlys;
    }

    public String gettGyxlyxxxGyxlId() {
        return tGyxlyxxxGyxlId;
    }

    public void settGyxlyxxxGyxlId(String tGyxlyxxxGyxlId) {
        this.tGyxlyxxxGyxlId = tGyxlyxxxGyxlId;
    }

    public String gettGyxlyxxxRemarks() {
        return tGyxlyxxxRemarks;
    }

    public void settGyxlyxxxRemarks(String tGyxlyxxxRemarks) {
        this.tGyxlyxxxRemarks = tGyxlyxxxRemarks;
    }

    @Override
    protected Serializable pkVal() {
        return this.tGyxlyxxxId;
    }

    @Override
    public String toString() {
        return "TSbyxxxGyxlyxxx{" +
        "tGyxlyxxxId=" + tGyxlyxxxId +
        ", tGyxlyxxxSjny=" + tGyxlyxxxSjny +
        ", tGyxlyxxxYg=" + tGyxlyxxxYg +
        ", tGyxlyxxxWg=" + tGyxlyxxxWg +
        ", tGyxlyxxxZg=" + tGyxlyxxxZg +
        ", tGyxlyxxxDl=" + tGyxlyxxxDl +
        ", tGyxlyxxxZdfhsk=" + tGyxlyxxxZdfhsk +
        ", tGyxlyxxxFzl=" + tGyxlyxxxFzl +
        ", tGyxlyxxxZxyg=" + tGyxlyxxxZxyg +
        ", tGyxlyxxxSzgl=" + tGyxlyxxxSzgl +
        ", tGyxlyxxxGlys=" + tGyxlyxxxGlys +
        ", tGyxlyxxxGyxlId=" + tGyxlyxxxGyxlId +
        ", tGyxlyxxxRemarks=" + tGyxlyxxxRemarks +
        "}";
    }
}

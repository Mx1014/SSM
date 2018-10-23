package com.kylin.electricassistsys.pojo.tsys;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author ${author}
 * @since 2018-10-23
 */
public class TSysModule extends Model<TSysModule> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;
    /**
     * 模块编号
     */
    private String moduleCode;
    /**
     * 模块名称
     */
    private String moduleName;
    /**
     * 备注
     */
    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TSysModule{" +
                "id=" + id +
                ", moduleCode=" + moduleCode +
                ", moduleName=" + moduleName +
                ", remark=" + remark +
                "}";
    }

    protected Serializable pkVal() {
        return this.id;
    }
}

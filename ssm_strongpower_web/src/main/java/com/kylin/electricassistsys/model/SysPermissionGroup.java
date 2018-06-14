package com.kylin.electricassistsys.model;

/**
 * 权限组信息类
 */
public class SysPermissionGroup {
    // id :
    private Integer id;

    // name :名称
    private String name;

    // description :描述
    private String description;

    // parent_id :父级id
    private Integer parentId;

    // is_final :是否可删除
    private Integer isFinal;

    // status :数据状态,1:正常,2:删除
    private Integer status;
    /**
     * 菜单code唯一标示
     */
    private String menuCode;
    /**
     * jsessionid 存储
     */
    private String userRedisreQequestId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserRedisreQequestId() {
        return userRedisreQequestId;
    }

    public void setUserRedisreQequestId(String userRedisreQequestId) {
        this.userRedisreQequestId = userRedisreQequestId;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }



    /**
     * get 名称
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 描述
     *
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 父级id
     *
     * @return Integer
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * set 父级id
     *
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * get 是否可删除
     *
     * @return Integer
     */
    public Integer getIsFinal() {
        return isFinal;
    }

    /**
     * set 是否可删除
     *
     * @param isFinal
     */
    public void setIsFinal(Integer isFinal) {
        this.isFinal = isFinal;
    }



    /**
     * get 数据状态,1:正常,2:删除
     *
     * @return Integer
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 数据状态,1:正常,2:删除
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SysPermissionGroup{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", parentId=" + parentId +
                ", isFinal=" + isFinal +
                ", status=" + status +
                ", menuCode='" + menuCode + '\'' +
                '}';
    }
}

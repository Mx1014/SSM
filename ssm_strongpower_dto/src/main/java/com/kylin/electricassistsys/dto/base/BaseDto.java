package com.kylin.electricassistsys.dto.base;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
public class BaseDto {
    private Integer page;
    private Integer limit;
    private String userRedisreQequestId;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getUserRedisreQequestId() {
        return userRedisreQequestId;
    }

    public void setUserRedisreQequestId(String userRedisreQequestId) {
        this.userRedisreQequestId = userRedisreQequestId;
    }
}

package com.kylin.electricassistsys.tools.constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: cwx
 * @Date: 2018/5/25 16:46
 * @Description: URL请求常量类
 */
public class URLConstants {
    /**
     * 全局日志
     */
    public static final Logger LOG = LoggerFactory.getLogger(URLConstants.class);

    /**
     * 请求项目IP地址
     */
    public static final String DOMAINIP = "10.168.1.135";
    /**
     * 请求项目名称
     */
    public static final String HTTPPROJECT = "hunt-admin";

    public static final String HTTPPROST = "8089";
    /**
     * 请求url地址路径
     */
    public static final String URL = "http://" + DOMAINIP + ":" + HTTPPROST + "/" + HTTPPROJECT + "/";
    /**
     * 登录请求接口
     */
    public static final String LOGIN = URL + "system/login";
    /**
     * 退出请求接口
     */
    public static final String LOGOUT = URL + "system/logout";
    /**
     * 退出请求接口
     */
    public static final String GETCAPTCHIMG = URL + "system/captchImg";
    /**
     * 获取菜单集数据
     */
    public static final String USERMENU = URL + "selectuserrolemenu/selectUserRoleMenuList";
    /**
     * 獲取權限集數據
     */
    public static final String USERROLE = URL + "selectuserrolemenu/queryUserRoleList";
    /**
     * 獲取所以的權限信息
     */
    public static final String QUERYROLEALL = URL + "selectuserrolemenu/selectRoleAll";

    /**
     * 添加用户信息
     */
    public static final String USERINSERT = URL + "selectuserrolemenu/userInsert";
    /**
     * test權限
     */
    public static final String role = URL + "role/list";
    /**
     * 获取用户的权限列表
     */
    public static final String GETROLELIST = URL + "selectuserrolemenu/listRole";
    /**
     * 获取权限列表
     */
    public static final String GETPERMISSIONLIST = URL + "selectuserrolemenu/listAllPermission";
    /**
     * 获取分页权限列表
     */
    public static final String GETPERMISSIONPAGE = URL + "permission/page";

    /**
     * 获取用户列表
     */
    public static final String GETUSERLIST = URL + "selectuserrolemenu/listUser";
    /**
     * 禁用账号
     */
    public static final String FORBIDDENUSER = URL + "user/forbiddenUser";

    /**
     * 启用账号
     */
    public static final String ENABLEUSER = URL + "user/enableUser";
    /**
     * 重置密码
     */
    public static final String UPDATEPASSWORD = URL + "user/updatePassword";
    /**
     * 更新密码
     */
    public static final String UPDATEPASSWORDBYUSER = URL + "user/updatePasswordByUser";
    /**
     * 删除账号
     */
    public static final String DELETEUSERBYID = URL + "user/delete";
    /**
     * 修改用戶信息
     */
    public static final String UPDATAUSERID = URL + "selectuserrolemenu/updataUserId";

    /**
     * 新增角色
     */
    public static final String INSERTROLE = URL + "role/insert";
    /**
     * 更新角色
     */
    public static final String UPDATEROLE = URL + "role/update";
    /**
     * 删除角色
     */
    public static final String DELETEROLE = URL + "role/delete";
    /**
     * 给新用户设置角色
     */
    public static final String SETUSERROLE = URL + "userRoleData/setUserRole";
    /**
     * 添加角色组
     */
    public static final String ADDSYSPERMISSIONGROUP = URL + "userRoleData/addSysPermissionGroup";
    /**
     * 查询所有角色组信息
     */
    public static final String SELECTALL = URL + "userRoleData/selectAll";
    /**
     * 查询所有角色组信息
     */
    public static final String SELECTPAGE = URL + "userRoleData/selectPage";
    /**
     * 更新角色组信息
     */
    public static final String UPDATESYSPERMISSIONGROUP = URL + "userRoleData/updateSysPermissionGroup";
    /**
     * 删除角色组信息
     */
    public static final String DELETESYSPERMISSIONGROUP = URL + "userRoleData/deleteSysPermissionGroup";
    /**
     * 新增权限
     */
    public static final String INSERTPERMISSION = URL + "userjurisdictiondata/insertPermission";
    /**
     * 修改权限
     */
    public static final String UPDATEPERMISSION = URL + "userjurisdictiondata/updatePermission";
    /**
     * 删除权限
     */
    public static final String DELETEPERMISSION = URL + "userjurisdictiondata/deletePermission";
    /**
     * 获取日志列表
     */
    public static final String GETLOGLIST = URL + "system/log/list";
    /**
     * 获取ip控制列表
     */
    public static final String IPSELECT = URL + "system/ip/list";
    /**
     * 新增ip控制
     */
    public static final String IPINSERT = URL + "system/ip/insert";
    /**
     * 更新ip控制
     */
    public static final String IPUPDATE = URL + "system/ip/update";
    /**
     * 删除ip控制
     */
    public static final String IPDELETE = URL + "system/ip/delete";
    /**
     * ip控制开关
     */
    public static final String IPINTERCEPT = URL + "system/ip/intercept";
    /**
     * ip控制开关状态
     */
    public static final String IPINTERCEPTSTATUS = URL + "system/ip/intercept/status";

}

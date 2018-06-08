package com.kylin.electricassistsys.controller.system;

import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.rsas.MD5Utils;
import com.kylin.electricassistsys.tools.constants.URLConstants;
import com.kylin.electricassistsys.tools.httpclient.HttpClientUtilsJsonObject;
import io.swagger.annotations.Api;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: cwx
 * @Date: 2018/5/25 16:56
 * @Description: 用户登录数据信息, 用户的权限信息请求接口
 */
@RestController
@RequestMapping("/user")
@Api(value = "/user", description = "用户登录数据信息,用户的权限信息请求接口", produces = MediaType.APPLICATION_JSON)
public class UserLoginDataController {
    private static final Logger LOG = LogManager.getLogger(UserLoginDataController.class);
    /**
     * 从redis查询用户的基本信息和权限信息
     */
    @Resource
    private RedisCacheService redisCacheService;

    /**
     * 用户登录
     * //@param loginName 用户名
     * //@param password 用户密码
     *
     * @return
     */
    @RequestMapping(value = "/getUserLogin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getUserLogin(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            json.put("loginName", params.get("loginName").toString());
            json.put("password", params.get("password").toString());
            json.put("platforms", "1");
            HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
            result = http.doPost(URLConstants.LOGIN, json, null);
            System.err.print(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您联系系统管理员");
        }
        return result;
    }

    /**
     * //@param id
     * params
     *
     * @return
     */
    @RequestMapping(value = "/getUserMenuLogin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getUserMenuLogin(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            json.put("id", params.get("id").toString());
            String jsessionid = params.get("jsessionid").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.USERMENU, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根據用戶的id獲取用戶的權限列表
     * //@param id
     * params
     *
     * @return
     */
    @RequestMapping(value = "/getUserRoleList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getUserRoleList(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            json.put("id", params.get("id").toString());
            String jsessionid = params.get("jsessionid").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.USERROLE, json, jsessionid);

                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 權限列表
     *
     * @return
     */
    @RequestMapping(value = "/getQueryRoleAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getQueryRoleAll(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            String jsessionid = params.get("jsessionid").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.QUERYROLEALL, json, jsessionid);

                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取用户列表
     *
     * @param params 分页参数
     * @return 用户列表
     */
    @RequestMapping(value = "/getUserList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getUserList(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            json.put("page", params.get("page").toString());
            json.put("rows", params.get("rows").toString());
            String jsessionid = params.get("jsessionid").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.GETUSERLIST, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取角色列表
     *
     * @param params 分页参数
     * @return 角色列表
     */
    @RequestMapping(value = "/getRoleList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getRoleList(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            json.put("page", params.get("page").toString());
            json.put("rows", params.get("rows").toString());
            String jsessionid = params.get("jsessionid").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.GETROLELIST, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取权限列表
     *
     * @param params 无
     * @return 权限列表
     */
    @RequestMapping(value = "getPermissionList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getPermissionList(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            String jsessionid = params.get("jsessionid").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();

                result = http.doPost(URLConstants.GETPERMISSIONLIST, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 禁用用户
     *
     * @param params 用户id
     * @return
     */
    @RequestMapping(value = "forbiddenUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult forbiddenUser(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            String jsessionid = params.get("jsessionid").toString();
            json.put("id", params.get("id").toString());
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();

                result = http.doPost(URLConstants.FORBIDDENUSER, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 启用用户
     *
     * @param params 用户id
     * @return
     */
    @RequestMapping(value = "enableUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult enableUser(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            String jsessionid = params.get("jsessionid").toString();
            json.put("id", params.get("id").toString());
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();

                result = http.doPost(URLConstants.ENABLEUSER, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}

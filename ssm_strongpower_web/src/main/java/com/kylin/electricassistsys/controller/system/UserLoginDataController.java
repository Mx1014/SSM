package com.kylin.electricassistsys.controller.system;

import com.kylin.electricassistsys.model.SysUser;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.rsas.MD5Utils;
import com.kylin.electricassistsys.rsas.RSATools;
import com.kylin.electricassistsys.tools.constants.Constant;
import com.kylin.electricassistsys.tools.constants.URLConstants;
import com.kylin.electricassistsys.tools.httpclient.HttpClientUtilsJsonObject;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
    public static final String SPRING_SECURITY_FORM_CAPTCHA_KEY = "captcha";
    public static final String SESSION_GENERATED_CAPTCHA_KEY = Constant.SESSION_GENERATED_CAPTCHA_KEY;

    private String captchaParameter = SPRING_SECURITY_FORM_CAPTCHA_KEY;
    /**
     * 从redis查询用户的基本信息和权限信息
     */
    @Resource
    private RedisCacheService redisCacheService;

    protected String obtainGeneratedCaptcha(HttpServletRequest request) {
        return (String) request.getSession().getAttribute(SESSION_GENERATED_CAPTCHA_KEY);
    }


    /**
     * 用户登录
     * //@param loginName 用户名
     * //@param password 用户密码
     *
     * @return
     */
    @RequestMapping(value = "/getUserLogin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getUserLogin(@RequestBody Map<String, Object> params,HttpServletRequest request) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            String inputCode =  RSATools.decryptDataOnJava(params.get("captcha").toString()).toUpperCase();
            String genCode = this.obtainGeneratedCaptcha(request).toUpperCase();
            if(!inputCode.equals(genCode)){
                return JSONResult.failure("输入的验证码有误!");
            }

            json.put("loginName", RSATools.decryptDataOnJava(params.get("loginName").toString()));
            json.put("password", RSATools.decryptDataOnJava(params.get("password").toString()));
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
     * 用户登录
     * //@param loginName 用户名
     * //@param password 用户密码
     *
     * @return
     */
    @RequestMapping(value = "/getUserLogout", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getUserLogout(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                /*   redisCacheService.del(jsessionid);*/
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.LOGOUT, json, jsessionid);
                return result;
                /*  return JSONResult.success();*//**/
            }
            result = JSONResult.lostCode("登录验证码过期");
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
            String jsessionid = params.get("userRedisreQequestId").toString();
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
            String jsessionid = params.get("userRedisreQequestId").toString();
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
            String jsessionid = params.get("userRedisreQequestId").toString();
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
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map json = new HashMap();
                json.put("page", params.get("page").toString());
                json.put("rows", params.get("rows").toString());
                json.put("zhName", params.get("zhName"));
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

            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map json = new HashMap();
                json.put("page", params.get("page").toString());
                json.put("rows", params.get("rows").toString());
                json.put("roleName", params.get("roleName"));
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
     * 更新角色
     *
     * @param params 参数
     */
    @RequestMapping(value = "/updateRole", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult updateRole(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            json.put("permissionIds", params.get("permissionIds").toString());
            json.put("roleId", params.get("roleId").toString());
            json.put("roleName", params.get("roleName").toString());
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.UPDATEROLE, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 删除角色
     *
     * @param params 参数
     */
    @RequestMapping(value = "/deleteRole", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult deleteRole(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map json = new HashMap();
                json.put("roleId", params.get("roleId").toString());
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.DELETEROLE, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 新增角色
     *
     * @param params 参数
     */
    @RequestMapping(value = "/insertRole", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult insertRole(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map json = new HashMap();
                json.put("rolePermissionIds", params.get("permissionIds").toString());
                json.put("roleName", params.get("roleName").toString());
                json.put("isFinal", params.get("isFinal").toString());
                json.put("roleDescription", params.get("description").toString());
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.INSERTROLE, json, jsessionid);
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
            String jsessionid = params.get("userRedisreQequestId").toString();
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
     * 获取权限列表
     *
     * @param params 无
     * @return 权限列表
     */
    @RequestMapping(value = "getPermissionPage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getPermissionPage(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map json = new HashMap();
                json.put("page", params.get("page").toString());
                json.put("rows", params.get("limit").toString());
                json.put("name", params.get("name"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();

                result = http.doPost(URLConstants.GETPERMISSIONPAGE, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     *
     * @param params 无
     * @return 获取系统日志页面
     */
    @RequestMapping(value = "getSystemLogPage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getSystemLogPage(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map json = new HashMap();
                json.put("page", params.get("page").toString());
                json.put("rows", params.get("limit").toString());
                json.put("method", params.get("method"));
                json.put("url", params.get("url"));
                json.put("param", params.get("param"));
                json.put("result", params.get("result"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();

                result = http.doPost(URLConstants.GETLOGLIST, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     *
     * @param params 无
     * @return 获取系统日志页面
     */
    @RequestMapping(value = "getSystemLoginLogPage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getSystemLoginLogPage(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map json = new HashMap();
                json.put("page", params.get("page").toString());
                json.put("rows", params.get("limit").toString());
             /*   json.put("method", params.get("method"));
                json.put("url", params.get("url"));*/
                json.put("account", params.get("account"));
            /*    json.put("result", params.get("result"));*/
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();

                result = http.doPost(URLConstants.GETLOGINLOGLIST, json, jsessionid);
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
            String jsessionid = params.get("userRedisreQequestId").toString();
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
            String jsessionid = params.get("userRedisreQequestId").toString();
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

    /**
     * 启用用户
     *
     * @param params 用户id
     * @return
     */
    @RequestMapping(value = "deleteUserById", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult deleteUserById(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            Map json = new HashMap();
            String jsessionid = params.get("userRedisreQequestId").toString();
            json.put("id", params.get("id").toString());
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();

                result = http.doPost(URLConstants.DELETEUSERBYID, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 用戶信息修改
     *
     * @param sysuser
     * @return
     */
    @RequestMapping(value = "updataUserId", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult updataUserId(@RequestBody SysUser sysuser) {
        JSONResult result = null;
        try {
            String jsessionid = sysuser.getUserRedisreQequestId();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                System.err.print("start---:" + System.currentTimeMillis());
               /* sysuser.setLoginName(MD5Utils.md5LoginName(sysuser.getLoginName()));
                String salt = UUID.randomUUID().toString().replaceAll("-", "");
                sysuser.setPasswordSalt(salt);
                sysuser.setPassword(MD5Utils.createPassword(sysuser.getPassword(), salt, 2));*/
                Map<String, Object> map = MyBeanUtils.bean2map(sysuser);
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.UPDATAUSERID, map, jsessionid);
                System.err.print("end----:" + System.currentTimeMillis());
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误,请您联系系统管理员");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 重置密码
     *
     * @param params 参数
     * @return
     */
    @RequestMapping(value = "updatePassword", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult updatePasswordById(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map json = new HashMap();
                json.put("id", params.get("id"));
                json.put("newPassword", params.get("code"));
                json.put("repeatNewPassword", params.get("code"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.UPDATEPASSWORD, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误,请您联系系统管理员");
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 更新密码
     *
     * @param params 参数
     * @return
     */
    @RequestMapping(value = "updatePasswordByUserId", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult updatePasswordByUserId(@RequestBody Map<String, Object> params) {
        JSONResult result = null;
        try {
            String jsessionid = params.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map json = new HashMap();
                json.put("id", RSATools.decryptDataOnJava(params.get("id").toString()));
                json.put("oldPassword", RSATools.decryptDataOnJava(params.get("oldCode").toString()));
                json.put("newPassword", RSATools.decryptDataOnJava(params.get("newCode").toString()));
                json.put("repeatNewPassword", RSATools.decryptDataOnJava(params.get("repeatNewCode").toString()));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(URLConstants.UPDATEPASSWORDBYUSER, json, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            result = JSONResult.failure("服务器错误,请您联系系统管理员");
            e.printStackTrace();
        }
        return result;
    }

}

package com.kylin.electricassistsys.controller.system;

import com.kylin.electricassistsys.controller.exception.RestExceptionHandler;
import com.kylin.electricassistsys.http.HttpUtilParam;
import com.kylin.electricassistsys.model.SysPermissionGroup;
import com.kylin.electricassistsys.model.SysUser;
import com.kylin.electricassistsys.mybeanutils.JSONResult;
import com.kylin.electricassistsys.mybeanutils.MyBeanUtils;
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
import java.util.UUID;

/**
 * @Auther: cwx
 * @Date: 2018/6/4 16:16
 * @Description: 用戶數據
 */
@RestController
@RequestMapping("/permissionSystem/userData")
@Api(value = "/userData", description = "用户数据信息接口", produces = MediaType.APPLICATION_JSON)
public class UserDataController extends RestExceptionHandler {
    private static final Logger LOG = LogManager.getLogger(UserDataController.class);
    /**
     * 从redis查询用户的基本信息和权限信息
     */
    @Resource
    private RedisCacheService redisCacheService;
    @Resource
    private HttpUtilParam httpUtilParam;

    /**
     * 添加新用戶
     */
    @RequestMapping(value = "getUserDataInsert", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult getUserDataInsert(@RequestBody SysUser sysuser) {
        JSONResult result = null;
        try {
            String jsessionid = sysuser.getUserRedisreQequestId();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                System.err.print("start---:" + System.currentTimeMillis());
//                sysuser.setLoginName(MD5Utils.md5LoginName(sysuser.getLoginName()));
                String salt = UUID.randomUUID().toString().replaceAll("-", "");
                sysuser.setPasswordSalt(salt);
                sysuser.setPassword(MD5Utils.createPassword(sysuser.getPassword(), salt, 2));
                Map<String, Object> map = MyBeanUtils.bean2map(sysuser);
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.USERINSERT, map, jsessionid);
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
     * set用戶角色
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "setUserAddRole", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult setUserAddRole(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            Map<String, Object> parm = new HashMap<>();
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                String uId = map.get("uId").toString();
                String roleId = map.get("roleId").toString();
                parm.put("uId", uId);
                parm.put("roleId", roleId);
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.SETUSERROLE, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }


    /**
     * 添加角色信息
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "addSysPermissionGroup", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult addSysPermissionGroup(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            Map<String, Object> parm = new HashMap<>();
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                parm.put("menuCode", map.get("menuCode"));
                parm.put("permissionGroupName", map.get("name"));
                parm.put("description", map.get("description"));
                parm.put("parentId", map.get("parentId"));
                parm.put("status", map.get("status"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.ADDSYSPERMISSIONGROUP, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }


    /**
     * 查询角色組信息
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult selectAll(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.SELECTALL, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 查询角色組信息
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "selectPage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult selectPage(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            Map<String, Object> parm = new HashMap<>();
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                parm.put("page", map.get("page").toString());
                parm.put("rows", map.get("limit").toString());
                parm.put("name", map.get("name"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.SELECTPAGE, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 更新角色組信息
     *
     * @param
     * @return
     */
    @RequestMapping(value = "updateSysPermissionGroup", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult updateSysPermissionGroup(@RequestBody SysPermissionGroup sysPermissionGroup) {
        JSONResult result = null;
        try {
            Map<String, Object> parm = new HashMap<>();
            String jsessionid = sysPermissionGroup.getUserRedisreQequestId();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                parm = MyBeanUtils.bean2map(sysPermissionGroup);
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.UPDATESYSPERMISSIONGROUP, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 更新角色組信息
     *
     * @param
     * @return
     */
    @RequestMapping(value = "deleteSysPermissionGroup", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult deleteSysPermissionGroup(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            Map<String, Object> parm = new HashMap<>();
            String jsessionid = map.get("userRedisreQequestId").toString();
            String id = map.get("id").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                parm.put("id", id);
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.DELETESYSPERMISSIONGROUP, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 新增权限
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "insertPermission", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult insertPermission(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                parm.put("groupId", map.get("sysPermissionGroupId"));
                parm.put("permissionName", map.get("name"));
                parm.put("permissionCode", map.get("code"));
                parm.put("permissionDescription", map.get("description"));
                parm.put("isFinal", map.get("isFinal"));
                parm.put("status", map.get("status"));
                parm.put("requestUrl", map.get("requestUrl"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.INSERTPERMISSION, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 更新权限
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "updatePermission", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult updatePermission(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                parm.put("id", map.get("id").toString());
                parm.put("groupId", map.get("sysPermissionGroupId").toString());
                parm.put("permissionName", map.get("name").toString());
                parm.put("permissionCode", map.get("code").toString());
                parm.put("permissionDescription", map.get("description").toString());
                parm.put("requestUrl", map.get("requestUrl"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.UPDATEPERMISSION, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 删除权限
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "deletePermission", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult deletePermission(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                parm.put("id", map.get("id").toString());
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.DELETEPERMISSION, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 查询ip列表
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "ipSelect", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult ipSelect(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                parm.put("page", map.get("page"));
                parm.put("rows", map.get("limit"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.IPSELECT, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 新增ip
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "ipInsert", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult ipInsert(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                parm.put("ip", map.get("ip"));
                parm.put("expireTime", map.get("expireTime"));
                parm.put("description", map.get("description"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.IPINSERT, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 更新ip
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "ipUpdate", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult ipUpdate(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                parm.put("id", map.get("id"));
                parm.put("ip", map.get("ip"));
                parm.put("expireTime", map.get("expireTime"));
                parm.put("description", map.get("description"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.IPUPDATE, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * 删除ip
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "ipDelete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult ipDelete(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                parm.put("id", map.get("id"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.IPDELETE, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * ip拦截开关
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "ipIntercept", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult ipIntercept(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                parm.put("open", map.get("switch"));
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.IPINTERCEPT, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

    /**
     * ip拦截开关
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "ipInterceptStatus", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JSONResult ipInterceptStatus(@RequestBody Map<String, Object> map) {
        JSONResult result = null;
        try {
            String jsessionid = map.get("userRedisreQequestId").toString();
            boolean faleg = redisCacheService.hasKey(jsessionid);
            if (faleg) {
                Map<String, Object> parm = new HashMap<>();
                HttpClientUtilsJsonObject http = new HttpClientUtilsJsonObject();
                result = http.doPost(httpUtilParam.toString() + URLConstants.IPINTERCEPTSTATUS, parm, jsessionid);
                return result;
            }
            result = JSONResult.lostCode("登录验证码过期");
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONResult.failure("服务器错误,请您从新登陆");
        }
        return result;
    }

}

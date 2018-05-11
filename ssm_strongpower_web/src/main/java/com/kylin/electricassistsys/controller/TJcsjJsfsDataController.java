package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.TJcsjJsfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjJsfsDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: whq
 * @ClassName: TJcsjJsfsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 架设方式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/jsfs")
@Api(value = "jsfs", description = "架设方式", produces = MediaType.APPLICATION_JSON)
public class TJcsjJsfsDataController {
    @Resource
    private TJcsjJsfsDataApi tJcsjJsfsDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Page getPages(@RequestBody TJcsjJsfsDto tJcsjJsfsDto) {
        Page page1 = new Page(tJcsjJsfsDto.getPage(), tJcsjJsfsDto.getLimit());
        return tJcsjJsfsDataApi.getPages(page1, tJcsjJsfsDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TJcsjJsfsDto tJcsjJsfsDto) {
        try {
            tJcsjJsfsDataApi.update(tJcsjJsfsDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("insert")
    public String insert(@RequestBody TJcsjJsfsDto tJcsjJsfsDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjJsfsDto.settJsfsId(uuidStr);
            tJcsjJsfsDataApi.insert(tJcsjJsfsDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("list")
    public List setList() {
        try {
            return tJcsjJsfsDataApi.getList();
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }


    @RequestMapping("del")
    public String delete(@RequestBody String id) {
        try {
            tJcsjJsfsDataApi.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("batchDel")
    public String batchDelete(@RequestBody String ids) {
        try {
            tJcsjJsfsDataApi.batchDelete(ids);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

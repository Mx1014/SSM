package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjBzfsDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TJcsjBzfsDataServerImpl;
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
 * @ClassName: TJcsjBzfsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 布置方式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/bzfs")
@Api(value = "bzfs", description = "布置方式", produces = MediaType.APPLICATION_JSON)
public class TJcsjBzfsDataController {
    @Resource
    private TJcsjBzfsDataServerImpl tJcsjBzfsDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Page getPages(@RequestBody TJcsjBzfsDto tJcsjBzfsDto) {
        Page page1 = new Page(tJcsjBzfsDto.getPage(), tJcsjBzfsDto.getLimit());
        return tJcsjBzfsDataServerImpl.getPages(page1, tJcsjBzfsDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TJcsjBzfsDto tJcsjBzfsDto) {
        try {
            tJcsjBzfsDataServerImpl.update(tJcsjBzfsDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("insert")
    public String insert(@RequestBody TJcsjBzfsDto tJcsjBzfsDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjBzfsDto.settBzfsId(uuidStr);
            tJcsjBzfsDataServerImpl.insert(tJcsjBzfsDto);
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
            return tJcsjBzfsDataServerImpl.getList();
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
            tJcsjBzfsDataServerImpl.delete(id);
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
            tJcsjBzfsDataServerImpl.batchDelete(ids);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

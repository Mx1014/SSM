package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjGypdzzlxDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TJcsjGypdzzlxDataServerImpl;
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
 * @ClassName: TJcsjGypdzzlxDataController
 * @Date: 2018/5/10 9:07
 * @Description: 高压配电装置类型控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/gypdzzlx")
@Api(value = "gypdzzlx", description = "高压配电装置类型", produces = MediaType.APPLICATION_JSON)
public class TJcsjGypdzzlxDataController {
    @Resource
    private TJcsjGypdzzlxDataServerImpl tJcsjGypdzzlxDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Page getPages(@RequestBody TJcsjGypdzzlxDto tJcsjGypdzzlxDto) {
        Page page1 = new Page(tJcsjGypdzzlxDto.getPage(), tJcsjGypdzzlxDto.getLimit());
        return tJcsjGypdzzlxDataServerImpl.getPages(page1, tJcsjGypdzzlxDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TJcsjGypdzzlxDto tJcsjGypdzzlxDto) {
        try {
            tJcsjGypdzzlxDataServerImpl.update(tJcsjGypdzzlxDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("insert")
    public String insert(@RequestBody TJcsjGypdzzlxDto tJcsjGypdzzlxDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjGypdzzlxDto.settGypdzzlxId(uuidStr);
            tJcsjGypdzzlxDataServerImpl.insert(tJcsjGypdzzlxDto);
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
            return tJcsjGypdzzlxDataServerImpl.getList();
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
            tJcsjGypdzzlxDataServerImpl.delete(id);
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
            tJcsjGypdzzlxDataServerImpl.batchDelete(ids);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

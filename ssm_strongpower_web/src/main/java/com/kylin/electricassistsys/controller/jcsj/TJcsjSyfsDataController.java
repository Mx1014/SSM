package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjSyfsDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.jcsj.TJcsjSyfsDataServerImpl;
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
 * @ClassName: TJcsjSyfsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 使用方式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/syfs")
@Api(value = "syfs", description = "使用方式", produces = MediaType.APPLICATION_JSON)
public class TJcsjSyfsDataController {
    @Resource
    private TJcsjSyfsDataServerImpl tJcsjSyfsDataServerImpl;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Page getPages(@RequestBody TJcsjSyfsDto tJcsjSyfsDto) {
        Page page1 = new Page(tJcsjSyfsDto.getPage(), tJcsjSyfsDto.getLimit());
        return tJcsjSyfsDataServerImpl.getPages(page1, tJcsjSyfsDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TJcsjSyfsDto tJcsjSyfsDto) {
        try {
            tJcsjSyfsDataServerImpl.update(tJcsjSyfsDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("insert")
    public String insert(@RequestBody TJcsjSyfsDto tJcsjSyfsDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjSyfsDto.settSyfsId(uuidStr);
            tJcsjSyfsDataServerImpl.insert(tJcsjSyfsDto);
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
            return tJcsjSyfsDataServerImpl.getList();
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
            tJcsjSyfsDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

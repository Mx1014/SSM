package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsDycsDto;
import com.kylin.electricassistsys.pojo.jcsj.TJcsjCsDycs;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TJcsjCsDycsDataServerImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

/**
 * @author 吴华强
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 * ${tags}
 */
@RestController
@RequestMapping("dycs")
@Api(value = "dycs", description = "变电站信息", produces = MediaType.APPLICATION_JSON)
public class TJcsjCsDycsDataController {
    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TJcsjCsDycsDataServerImpl tJcsjCsDycsDataServerImpl;

    @RequestMapping("list")
    public List<TJcsjCsDycsDto> list() {

        return tJcsjCsDycsDataServerImpl.getList();
    }

    @RequestMapping("page")
    public Page getPages(@RequestBody TJcsjCsDycsDto tJcsjCsDycsDto) {
        Page page = new Page(tJcsjCsDycsDto.getPage(), tJcsjCsDycsDto.getLimit());
        return tJcsjCsDycsDataServerImpl.getPages(page, tJcsjCsDycsDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TJcsjCsDycsDto tJcsjCsDycsDto) {
        try {
            tJcsjCsDycsDataServerImpl.update(tJcsjCsDycsDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("insert")
    public String insert(@RequestBody TJcsjCsDycsDto tJcsjCsDycsDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjCsDycsDto.settDycsId(uuidStr);
            tJcsjCsDycsDataServerImpl.insert(tJcsjCsDycsDto);
            return "保存成功";
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
            tJcsjCsDycsDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

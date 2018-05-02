package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.jcsj.TJcsjCsDycsDto;
import com.kylin.electricassistsys.dto.tsbsj.TSbsjBdzxxDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TJcsjCsDycsDataServerImpl;
import com.kylin.electricassistsys.server.impl.TSbsjBdzxxDataServerImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("bdzxx")
@Api(value = "bdzxx", description = "变电站信息", produces = MediaType.APPLICATION_JSON)
public class TSbsjBdzxxDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TSbsjBdzxxDataServerImpl tSbsjBdzxxDataServerImpl;

    @RequestMapping("list")
    public List<TSbsjBdzxxDto> list() {

        return tSbsjBdzxxDataServerImpl.getList();
    }

    @RequestMapping("page")
    public Page getPages(@RequestBody TSbsjBdzxxDto tSbsjBdzxxDto) {
        Page page = new Page(tSbsjBdzxxDto.getPage(), tSbsjBdzxxDto.getLimit());
        return tSbsjBdzxxDataServerImpl.getPages(page, tSbsjBdzxxDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TSbsjBdzxxDto tSbsjBdzxxDto) {
        try {
            tSbsjBdzxxDataServerImpl.update(tSbsjBdzxxDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }

    }

    @RequestMapping("insert")
    public String insert(@RequestBody TSbsjBdzxxDto tSbsjBdzxxDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tSbsjBdzxxDto.settBdzxxId(uuidStr);
            tSbsjBdzxxDataServerImpl.insert(tSbsjBdzxxDto);
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
            tSbsjBdzxxDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

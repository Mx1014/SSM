package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwyxzbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwyxzbSelDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TGhdgDwyxzbDataServerImpl;
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
@RequestMapping("dwyxzb")
@Api(value = "dwyxzb", description = "电网运行指标", produces = MediaType.APPLICATION_JSON)
public class TGhdgDwyxzbDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgDwyxzbDataServerImpl tGhdgDwyxzbDataServerImpl;

    @RequestMapping("list")
    public List<TGhdgDwyxzbDto> list() {

        return tGhdgDwyxzbDataServerImpl.getList();
    }

    @RequestMapping("alllist")
    public Page<TGhdgDwyxzbSelDto> allList(@RequestBody TGhdgDwyxzbSelDto tGhdgDwyxzbSelDto) {
        Page page = new Page(tGhdgDwyxzbSelDto.getPage(), tGhdgDwyxzbSelDto.getLimit());
        return tGhdgDwyxzbDataServerImpl.getAllList(page, tGhdgDwyxzbSelDto);
    }

    @RequestMapping("page")
    public Page getPages(@RequestBody TGhdgDwyxzbDto tGhdgDwyxzbDto) {
        Page page = new Page(tGhdgDwyxzbDto.getPage(), tGhdgDwyxzbDto.getLimit());
        return tGhdgDwyxzbDataServerImpl.getPages(page, tGhdgDwyxzbDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TGhdgDwyxzbDto tGhdgDwyxzbDto) {
        try {
            tGhdgDwyxzbDataServerImpl.update(tGhdgDwyxzbDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }

    }

    @RequestMapping("insert")
    public String insert(@RequestBody TGhdgDwyxzbDto tGhdgDwyxzbDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgDwyxzbDto.settDwyxzbId(uuidStr);
            tGhdgDwyxzbDataServerImpl.insert(tGhdgDwyxzbDto);
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
            tGhdgDwyxzbDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

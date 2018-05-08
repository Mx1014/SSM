package com.kylin.electricassistsys.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgJmfbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgJmfbSelDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.TGhdgJmfbDataServerImpl;
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
@RequestMapping("jmfb")
@Api(value = "jmfb", description = "导线截面", produces = MediaType.APPLICATION_JSON)
public class TGhdgJmfbDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgJmfbDataServerImpl tGhdgJmfbDataServerImpl;

    @RequestMapping("list")
    public List<TGhdgJmfbDto> list() {

        return tGhdgJmfbDataServerImpl.getList();
    }

    @RequestMapping("alllist")
    public Page<TGhdgJmfbSelDto> allList(@RequestBody TGhdgJmfbSelDto tGhdgJmfbSelDto) {
        Page page = new Page(tGhdgJmfbSelDto.getPage(), tGhdgJmfbSelDto.getLimit());
        return tGhdgJmfbDataServerImpl.getAllList(page, tGhdgJmfbSelDto);
    }

    @RequestMapping("page")
    public Page getPages(@RequestBody TGhdgJmfbDto tGhdgJmfbDto) {
        Page page = new Page(tGhdgJmfbDto.getPage(), tGhdgJmfbDto.getLimit());
        return tGhdgJmfbDataServerImpl.getPages(page, tGhdgJmfbDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TGhdgJmfbDto tGhdgJmfbDto) {
        try {
            tGhdgJmfbDataServerImpl.update(tGhdgJmfbDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }

    }

    @RequestMapping("insert")
    public String insert(@RequestBody TGhdgJmfbDto tGhdgJmfbDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgJmfbDto.settJmfbId(uuidStr);
            tGhdgJmfbDataServerImpl.insert(tGhdgJmfbDto);
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
            tGhdgJmfbDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

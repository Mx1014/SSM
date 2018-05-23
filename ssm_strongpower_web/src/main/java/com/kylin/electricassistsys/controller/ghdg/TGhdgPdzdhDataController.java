package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgPdzdhDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgPdzdhSelDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgPdzdhDataServerImpl;
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
@RequestMapping("pdzdh")
@Api(value = "pdzdh", description = "配电自动化", produces = MediaType.APPLICATION_JSON)
public class TGhdgPdzdhDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgPdzdhDataServerImpl tGhdgPdzdhDataServerImpl;

    @RequestMapping("list")
    public List<TGhdgPdzdhDto> list() {

        return tGhdgPdzdhDataServerImpl.getList();
    }

    @RequestMapping("alllist")
    public Page<TGhdgPdzdhSelDto> allList(@RequestBody TGhdgPdzdhSelDto tGhdgPdzdhSelDto) {
        Page page = new Page(tGhdgPdzdhSelDto.getPage(), tGhdgPdzdhSelDto.getLimit());
        return tGhdgPdzdhDataServerImpl.getAllList(page, tGhdgPdzdhSelDto);
    }

    @RequestMapping("page")
    public Page getPages(@RequestBody TGhdgPdzdhDto tGhdgPdzdhDto) {
        Page page = new Page(tGhdgPdzdhDto.getPage(), tGhdgPdzdhDto.getLimit());
        return tGhdgPdzdhDataServerImpl.getPages(page, tGhdgPdzdhDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TGhdgPdzdhDto tGhdgPdzdhDto) {
        try {
            tGhdgPdzdhDataServerImpl.update(tGhdgPdzdhDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }

    }

    @RequestMapping("insert")
    public String insert(@RequestBody TGhdgPdzdhDto tGhdgPdzdhDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgPdzdhDto.settPdzdhId(uuidStr);
            tGhdgPdzdhDataServerImpl.insert(tGhdgPdzdhDto);
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
            tGhdgPdzdhDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

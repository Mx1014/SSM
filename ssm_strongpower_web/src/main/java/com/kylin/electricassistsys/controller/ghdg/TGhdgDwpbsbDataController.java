package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwpbsbSelDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgDwpbsbDataServerImpl;
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
@RequestMapping("dwpbsb")
@Api(value = "dwpbsb", description = "配电自动化", produces = MediaType.APPLICATION_JSON)
public class TGhdgDwpbsbDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgDwpbsbDataServerImpl tGhdgDwpbsbDataServerImpl;

    @RequestMapping("list")
    public List<TGhdgDwpbsbDto> list() {

        return tGhdgDwpbsbDataServerImpl.getList();
    }

    @RequestMapping("alllist")
    public Page<TGhdgDwpbsbSelDto> allList(@RequestBody TGhdgDwpbsbSelDto tGhdgDwpbsbSelDto) {
        Page page = new Page(tGhdgDwpbsbSelDto.getPage(), tGhdgDwpbsbSelDto.getLimit());
        return tGhdgDwpbsbDataServerImpl.getAllList(page, tGhdgDwpbsbSelDto);
    }

    @RequestMapping("page")
    public Page getPages(@RequestBody TGhdgDwpbsbDto tGhdgDwpbsbDto) {
        Page page = new Page(tGhdgDwpbsbDto.getPage(), tGhdgDwpbsbDto.getLimit());
        return tGhdgDwpbsbDataServerImpl.getPages(page, tGhdgDwpbsbDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TGhdgDwpbsbDto tGhdgDwpbsbDto) {
        try {
            tGhdgDwpbsbDataServerImpl.update(tGhdgDwpbsbDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }

    }

    @RequestMapping("insert")
    public String insert(@RequestBody TGhdgDwpbsbDto tGhdgDwpbsbDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgDwpbsbDto.settDwpbsbId(uuidStr);
            tGhdgDwpbsbDataServerImpl.insert(tGhdgDwpbsbDto);
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
            tGhdgDwpbsbDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

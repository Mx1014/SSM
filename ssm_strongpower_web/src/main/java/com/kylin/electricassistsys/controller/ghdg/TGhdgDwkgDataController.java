package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgDwkgSelDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgDwkgDataServerImpl;
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
@RequestMapping("dwkg")
@Api(value = "dwkg", description = "电网开关", produces = MediaType.APPLICATION_JSON)
public class TGhdgDwkgDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgDwkgDataServerImpl tGhdgDwkgDataServerImpl;

    @RequestMapping("list")
    public List<TGhdgDwkgDto> list() {

        return tGhdgDwkgDataServerImpl.getList();
    }

    @RequestMapping("alllist")
    public Page<TGhdgDwkgSelDto> allList(@RequestBody TGhdgDwkgSelDto tGhdgDwkgSelDto) {
        Page page = new Page(tGhdgDwkgSelDto.getPage(), tGhdgDwkgSelDto.getLimit());
        return tGhdgDwkgDataServerImpl.getAllList(page, tGhdgDwkgSelDto);
    }

    @RequestMapping("page")
    public Page getPages(@RequestBody TGhdgDwkgDto tGhdgDwkgDto) {
        Page page = new Page(tGhdgDwkgDto.getPage(), tGhdgDwkgDto.getLimit());
        return tGhdgDwkgDataServerImpl.getPages(page, tGhdgDwkgDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TGhdgDwkgDto tGhdgDwkgDto) {
        try {
            tGhdgDwkgDataServerImpl.update(tGhdgDwkgDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }

    }

    @RequestMapping("insert")
    public String insert(@RequestBody TGhdgDwkgDto tGhdgDwkgDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgDwkgDto.settDwkgId(uuidStr);
            tGhdgDwkgDataServerImpl.insert(tGhdgDwkgDto);
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
            tGhdgDwkgDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

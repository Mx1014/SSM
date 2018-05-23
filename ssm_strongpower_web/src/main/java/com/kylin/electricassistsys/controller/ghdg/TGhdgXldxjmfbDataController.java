package com.kylin.electricassistsys.controller.ghdg;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.dto.ghdg.TGhdgXldxjmfbDto;
import com.kylin.electricassistsys.dto.ghdg.TGhdgXldxjmfbSelDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
import com.kylin.electricassistsys.server.impl.ghdg.TGhdgXldxjmfbDataServerImpl;
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
@RequestMapping("xldxjmfb")
@Api(value = "xldxjmfb", description = "导线截面", produces = MediaType.APPLICATION_JSON)
public class TGhdgXldxjmfbDataController {

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private TGhdgXldxjmfbDataServerImpl tGhdgXldxjmfbDataServerImpl;

    @RequestMapping("list")
    public List<TGhdgXldxjmfbDto> list() {

        return tGhdgXldxjmfbDataServerImpl.getList();
    }

    @RequestMapping("alllist")
    public Page<TGhdgXldxjmfbSelDto> allList(@RequestBody TGhdgXldxjmfbSelDto tGhdgXldxjmfbSelDto) {
        Page page = new Page(tGhdgXldxjmfbSelDto.getPage(), tGhdgXldxjmfbSelDto.getLimit());
        return tGhdgXldxjmfbDataServerImpl.getAllList(page, tGhdgXldxjmfbSelDto);
    }

    @RequestMapping("page")
    public Page getPages(@RequestBody TGhdgXldxjmfbDto tGhdgXldxjmfbDto) {
        Page page = new Page(tGhdgXldxjmfbDto.getPage(), tGhdgXldxjmfbDto.getLimit());
        return tGhdgXldxjmfbDataServerImpl.getPages(page, tGhdgXldxjmfbDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TGhdgXldxjmfbDto tGhdgXldxjmfbDto) {
        try {
            tGhdgXldxjmfbDataServerImpl.update(tGhdgXldxjmfbDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }

    }

    @RequestMapping("insert")
    public String insert(@RequestBody TGhdgXldxjmfbDto tGhdgXldxjmfbDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tGhdgXldxjmfbDto.settXldxjmfbId(uuidStr);
            tGhdgXldxjmfbDataServerImpl.insert(tGhdgXldxjmfbDto);
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
            tGhdgXldxjmfbDataServerImpl.delete(id);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

package com.kylin.electricassistsys.controller.jcsj;

import com.baomidou.mybatisplus.plugins.Page;
import com.kylin.electricassistsys.data.api.jcsj.TJcsjTyfsDataApi;
import com.kylin.electricassistsys.dto.jcsj.TJcsjTyfsDto;
import com.kylin.electricassistsys.redisutils.RedisCacheService;
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
 * @ClassName: TJcsjTyfsDataController
 * @Date: 2018/5/10 9:07
 * @Description: 调压方式控制器
 */
@RestController // 标志为控制器组件，以json数据格式返回
@RequestMapping("/tyfs")
@Api(value = "tyfs", description = "调压方式", produces = MediaType.APPLICATION_JSON)
public class TJcsjTyfsDataController {
    @Resource
    private TJcsjTyfsDataApi tJcsjTyfsDataApi;
    @Resource
    private RedisCacheService redisCacheService;

    @RequestMapping("page")
    public Page getPages(@RequestBody TJcsjTyfsDto tJcsjTyfsDto) {
        Page page1 = new Page(tJcsjTyfsDto.getPage(), tJcsjTyfsDto.getLimit());
        return tJcsjTyfsDataApi.getPages(page1, tJcsjTyfsDto);
    }

    @RequestMapping(value = "update", produces = "application/json;charset=UTF-8", method = RequestMethod.POST, headers = "Accept=application/json")
    public String update(@RequestBody TJcsjTyfsDto tJcsjTyfsDto) {
        try {
            tJcsjTyfsDataApi.update(tJcsjTyfsDto);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }

    @RequestMapping("insert")
    public String insert(@RequestBody TJcsjTyfsDto tJcsjTyfsDto) {
        try {
            String uuidStr = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            tJcsjTyfsDto.settTyfsId(uuidStr);
            tJcsjTyfsDataApi.insert(tJcsjTyfsDto);
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
            return tJcsjTyfsDataApi.getList();
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
            tJcsjTyfsDataApi.delete(id);
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
            tJcsjTyfsDataApi.batchDelete(ids);
            return "保存成功";
        } catch (Exception e) {
            System.out.println("获得一个错误：" + e.getMessage());
            e.printStackTrace();
            throw e;
            //throw new Exception("保存失败");
        }


    }
}

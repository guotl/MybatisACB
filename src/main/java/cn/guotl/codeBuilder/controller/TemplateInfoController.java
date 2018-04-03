package cn.guotl.codeBuilder.controller;

import cn.guotl.codeBuilder.model.TemplateInfo;
import cn.guotl.codeBuilder.service.TemplateInfoService;
import cn.guotl.codeBuilder.vo.TemplateInfoVo;
import cn.guotl.common.vo.PageParameterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by guotianlin on 2018/3/30.
 */
@Controller
@RequestMapping("/templateInfo")
public class TemplateInfoController {

    @Autowired
    private TemplateInfoService templateInfoService;

    @RequestMapping("/test")
    public void test(HttpServletResponse response){
//        return this.templateInfoService.findOneTemplateContentForTest();


    }

    @RequestMapping(value = "/manageList.json", method = RequestMethod.POST)
    public @ResponseBody PageParameterVo manageList(@RequestBody PageParameterVo page, TemplateInfo entity){
        return this.templateInfoService.queryPage(page,entity);
    }

    @RequestMapping(value = "/createSystemplate", method = RequestMethod.POST)
    public @ResponseBody Map createSystemplate( @RequestBody TemplateInfoVo entity){
        Map<String,Object> result = new HashMap<>();
        result.put("status","ok");
        try {
            this.templateInfoService.create(entity);
        }catch (Exception e){
            e.printStackTrace();
            result.put("status","fail");
        }
        return result;
    }


}

package cn.guotl.codeBuilder.controller;

import cn.guotl.codeBuilder.service.TemplateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

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


}

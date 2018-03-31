import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by guotianlin on 2018/3/30.
 */
public class Test {

    public static void main(String[] args) {

//        String content = "Hellow Word! #{name}";
//        String result = null;
//        for (byte b : content.getBytes()) {
//            if (result == null){
//                result = ""+b;
//            }else {
//                result += ","+b;
//            }
//
//        }
//        System.out.println(result);

//        Configuration cfg = new Configuration();
//        StringTemplateLoader stringLoader = new StringTemplateLoader();
//        String templateContent="欢迎：${name}";
//        stringLoader.putTemplate("myTemplate",templateContent);
//
//        cfg.setTemplateLoader(stringLoader);
//
//        try {
//            Template template = cfg.getTemplate("myTemplate","utf-8");
//            Map root = new HashMap();
//            root.put("name", "张三丰！");
//
//            StringWriter writer = new StringWriter();
//            try {
//                template.process(root, writer);
//                System.out.println(writer.toString());
//            } catch (TemplateException e) {
//                e.printStackTrace();
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Configuration cfg = new Configuration();
//        StringTemplateLoader stringLoader = new StringTemplateLoader();
//        String templateContent="public class ${className} {\n" +
//                "    public static void main(String[] args) {\n" +
//                "        //${className}\n" +
//                "        System.out.println(\"${message}\");\n" +
//                "    }\n" +
//                "}";
//        stringLoader.putTemplate("myTemplate",templateContent);
//
//        cfg.setTemplateLoader(stringLoader);
//
//        try {
//            Template template = cfg.getTemplate("myTemplate","utf-8");
//            Map root = new HashMap();
//            root.put("className", "Test3");
//            root.put("message", "这是第一个java程序的测试");
//
//            StringWriter writer = new StringWriter();
//            try {
//                template.process(root, writer);
//                System.out.println(writer.toString());
//            } catch (TemplateException e) {
//                e.printStackTrace();
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println("package cn.guotl.codeBuilder.controller;\n\nimport cn.guotl.codeBuilder.service.TemplateInfoService;\nimport org.springframework.beans.factory.annotation.Autowired;\nimport org.springframework.stereotype.Controller;\nimport org.springframework.web.bind.annotation.RequestMapping;\nimport org.springframework.web.bind.annotation.ResponseBody;\n\nimport javax.servlet.http.HttpServletResponse;\n\n/**\n * Created by guotianlin on 2018/3/30.\n */\n@Controller\n@RequestMapping(\"/templateInfo\")\npublic class TemplateInfoController {\n\n    @Autowired\n    private TemplateInfoService templateInfoService;\n\n    @RequestMapping(\"/test\")\n    public void test(HttpServletResponse response){\n//        return this.templateInfoService.findOneTemplateContentForTest();\n" +
                "        //测试文本编辑器\n\n    }\n\n\n}");
    }

}

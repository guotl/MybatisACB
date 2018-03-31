package cn.guotl.codeBuilder.service.impl;

import cn.guotl.codeBuilder.dao.TemplateInfoDao;
import cn.guotl.codeBuilder.model.TemplateInfo;
import cn.guotl.codeBuilder.service.TemplateInfoService;
import cn.guotl.common.vo.PageParameterVo;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by guotianlin on 2018/3/30.
 */
@Transactional
@Service("templateInfoService")
public class TemplateInfoServiceImpl implements TemplateInfoService {

    @Autowired
    private TemplateInfoDao templateInfoDao;

    @Override
    public String findOneTemplateContentForTest() {

        //TODO 测试阶段，就不先搞blob读取了
        return "Hellow Word To #{name}!";
//        TemplateInfo templateInfo = this.templateInfoDao.findOneForTest();
//        if (templateInfo == null || templateInfo.getContent() == null || templateInfo.getContent().length == 0){
//            return null;
//        }
//        byte[] content = templateInfo.getContent();
//        return new String(content);
    }

    @Override
    public void testCodeBuilder() {
//        String result = "";
//        try {
//            Configuration cfg = new Configuration();
//            cfg.setNumberFormat("0.##");
//            cfg.setClassicCompatible(true);
//            Map<String, Object> paramMap = new HashMap<String, Object>();
//            paramMap.put("name", "张三丰");
//            StringTemplateLoader stringLoader = new StringTemplateLoader();
//            String templateContent = "hello ${name}!";
//            stringLoader.putTemplate("myTemplate", templateContent);
//            cfg.setTemplateLoader(stringLoader);
//            Template template = null;
//
//            template = cfg.getTemplate("myTemplate", "utf-8");
//            Writer writer = new StringWriter();
//            template = process(paramMap, writer);
//            result = writer.toString();
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        return result;
    }

    @Override
    public void download(String fileName, String filePath, HttpServletResponse response) {
        Configuration cfg = new Configuration();
        StringTemplateLoader stringLoader = new StringTemplateLoader();
        String templateContent="public class #{className} {\n" +
                "    public static void main(String[] args) {\n" +
                "        //#{className}\n" +
                "        System.out.println(\"#{message}\");\n" +
                "    }\n" +
                "}";
        stringLoader.putTemplate("myTemplate",templateContent);

        cfg.setTemplateLoader(stringLoader);

        try {
            Template template = cfg.getTemplate("myTemplate","utf-8");
            Map root = new HashMap();
            root.put("className", "Test3");
            root.put("message", "这是第一个java程序的测试");

            StringWriter writer = new StringWriter();
            try {
                template.process(root, writer);
                System.out.println(writer.toString());
            } catch (TemplateException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public PageParameterVo queryPage(PageParameterVo page, TemplateInfo entity) {
        page.setTotal(this.templateInfoDao.count(entity));
        page.setRowDatas(this.templateInfoDao.queryPage(page,entity));
        return page;
    }


}

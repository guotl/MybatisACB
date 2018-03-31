package cn.guotl.common.utils;

import com.mysql.fabric.xmlrpc.base.Params;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.Map;

/**
 * Created by guotianlin on 2018/3/30.
 */
public class FreemarkUtil {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/test";
    private static String username = "root";
    private static String password = "*******";
    //你模板放置的路径
    private static String basePath = "D:\\Workspaces\\MyEclipse for Spring 2014\\genateJavaCode\\src\\genateJavaCode";
    // 创建Configuration实例
    private static Configuration cfg = new Configuration();

    public static void genateCode() {
        Template temp = null;
        File loadTemplateFile = new File(basePath);
        try {
            cfg.setDirectoryForTemplateLoading(loadTemplateFile);
            String saveDir = basePath + "/test";

            //TODO 数据库连接和驱动，稍后再完善
//            Map<String, Map<String, Params>> classPropties = ConnectMySql.connect(driver, url, username, password);
            Map<String, Map<String, Params>> classPropties = null;
            SetJavaCode(temp, saveDir, classPropties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 首字母大写
    public static String toUpString(String className) {
        char[] cs = className.toCharArray();
        cs[0] -= 32;
        String ClassName = String.valueOf(cs);
        return ClassName;
    }

    public static void SetJavaCode(Template temp, String saveDir,
                                   Map<String, Map<String, Params>> classPropties) {

        Map<String, Params> m = classPropties.get("Paramss");
        //每一个实例里面都存有tableName，这里取第0个拿tableName
        String tableName = m.get("Params0").toString();//TODO 原始代码 (String) (m.get("Params0").getTableName());
        //表明为m_user,指定类名为User
        String className = tableName.replaceAll("m_", "");
        // 使首字母大写
        String ClassName = toUpString(className);
        // 存入，作为参数给页面 className：作为引用名 ClassName：作为类名
        String fileNameEntityPath = saveDir
                + "/entity/" + ClassName + ".java";
        String fileNameDaoPath = saveDir
                + "/dao/" + ClassName + "Dao.java";
        String fileNameServicePath = saveDir
                + "/service/" + ClassName+ "Service.java";
        String fileNameServiceImplPath = saveDir
                + "/service/impl/" + ClassName + "ServiceImpl.java";
        File newsDir = new File(saveDir);
        File newsDir2 = new File(saveDir + "/dao/");
        File newsDir3 = new File(saveDir + "/service/");
        File newsDir4 = new File(saveDir + "/service/impl/");
        File newsDir5 = new File(saveDir + "/entity/");
        boolean flag = false;
        flag = (Boolean) (newsDir.exists() == false ? newsDir.mkdirs() : true);
        flag = (Boolean) (newsDir2.exists() == false ? newsDir2.mkdirs() : true);
        flag = (Boolean) (newsDir3.exists() == false ? newsDir3.mkdirs() : true);
        flag = (Boolean) (newsDir4.exists() == false ? newsDir4.mkdirs() : true);
        flag = (Boolean) (newsDir5.exists() == false ? newsDir5.mkdirs() : true);

        try (Writer out = new OutputStreamWriter(new FileOutputStream(
                fileNameDaoPath), "utf-8");
             Writer out2 = new OutputStreamWriter(new FileOutputStream(
                     fileNameServicePath), "utf-8");
             Writer out3 = new OutputStreamWriter(new FileOutputStream(
                     fileNameServiceImplPath), "utf-8");
             Writer out4 = new OutputStreamWriter(new FileOutputStream(
                     fileNameEntityPath), "utf-8");) {

            temp = cfg.getTemplate("Dao.ftl");
            temp.process(classPropties, out);
            System.out.println("------------DAO生成完毕-------------");

            temp = cfg.getTemplate("Service.ftl");
            temp.process(classPropties, out2);
            System.out.println("------------Service生成完毕-------------");

            temp = cfg.getTemplate("ServiceImpl.ftl");
            temp.process(classPropties, out3);
            System.out.println("------------ServiceImpl生成完毕-------------");

            temp = cfg.getTemplate("Object.ftl");
            temp.process(classPropties, out4);
            System.out.println("------------Entity生成完毕-------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }

}

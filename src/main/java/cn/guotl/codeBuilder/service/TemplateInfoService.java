package cn.guotl.codeBuilder.service;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by guotianlin on 2018/3/30.
 */
public interface TemplateInfoService {

    public String findOneTemplateContentForTest();

    public void testCodeBuilder();

    public void download(String fileName, String filePath, HttpServletResponse response);

}

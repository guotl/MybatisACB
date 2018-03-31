package cn.guotl.codeBuilder.service;

import cn.guotl.codeBuilder.model.TemplateInfo;
import cn.guotl.common.vo.PageParameterVo;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by guotianlin on 2018/3/30.
 */
public interface TemplateInfoService {

    public String findOneTemplateContentForTest();

    public void testCodeBuilder();

    public void download(String fileName, String filePath, HttpServletResponse response);

    public PageParameterVo queryPage(PageParameterVo page,TemplateInfo entity);

}

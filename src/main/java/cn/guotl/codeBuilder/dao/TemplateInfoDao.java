package cn.guotl.codeBuilder.dao;

import cn.guotl.codeBuilder.model.TemplateInfo;
import cn.guotl.common.vo.PageParameterVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by guotianlin on 2018/3/30.
 */
@Repository("templateInfoDao")
public interface TemplateInfoDao {

    public TemplateInfo findOneForTest();

    public List<TemplateInfo> queryPage(@Param("page")PageParameterVo page , @Param("entity") TemplateInfo entity);

    public int count(TemplateInfo entity);

    public void create(TemplateInfo entity);

    public TemplateInfo queryById(String id);

}

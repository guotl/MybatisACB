package cn.guotl.codeBuilder.dao;

import cn.guotl.codeBuilder.model.TemplateInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by guotianlin on 2018/3/30.
 */
@Repository("templateInfoDao")
public interface TemplateInfoDao {

    public TemplateInfo findOneForTest();

}

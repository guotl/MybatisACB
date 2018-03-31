package cn.guotl.codeBuilder.model;

import java.io.Serializable;

/**
 * Created by guotianlin on 2018/3/30.
 */

public class TemplateInfo implements Serializable{

    private String id;

    private String name;

    private byte[] content;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}

package com.example.skill.someskill.bean;

import java.util.List;

/**
 * @Author peiqing Liu
 * @Date 2020/4/8 22:01
 * @Version 1.0
 */
public class RegionBeanTree {

    private String code ;
    private String pid ;
    private String label ;
    private String path;
    private List<RegionBeanTree> children;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<RegionBeanTree> getChildren() {
        return children;
    }

    public void setChildren(List<RegionBeanTree> children) {
        this.children = children;
    }
}

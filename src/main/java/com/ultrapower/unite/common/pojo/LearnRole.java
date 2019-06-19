package com.ultrapower.unite.common.pojo;

/**
 * @program: about-mybatis-learn
 * @description: role
 * @author: yang Qiankun
 * @create: 2019-06-04 20:51
 **/
public class LearnRole {
    private Long id;
    private String roleName;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return id+"\n"+roleName+"\n"+note;
    }
}

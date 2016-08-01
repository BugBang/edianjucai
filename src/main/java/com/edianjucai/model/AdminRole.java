package com.edianjucai.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_admin_role")
public class AdminRole implements Serializable {

    private static final long serialVersionUID = -381235025063757261L;

    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "class_id")
    private int classId;
    @Column(name = "describe")
    private String describe;
    @Column(name = "is_effect")
    private int isEffect;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(int isEffect) {
        this.isEffect = isEffect;
    }

}

package com.edianjucai.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_goods_type")
public class GoodsType implements Serializable{

    private static final long serialVersionUID = -7203549765340653989L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
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

    public int getIsEffect() {
        return isEffect;
    }

    public void setIsEffect(int isEffect) {
        this.isEffect = isEffect;
    }

}

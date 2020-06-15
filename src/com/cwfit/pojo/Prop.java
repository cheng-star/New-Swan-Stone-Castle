package com.cwfit.pojo;

/**
 * @author yeyike
 * @date 2020/5/29 - 0:44
 */
public class Prop {

    private String name;

    public Prop() {
    }

    public Prop(String name, String hitMonster) {
        this.name = name;
    }

    public Prop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

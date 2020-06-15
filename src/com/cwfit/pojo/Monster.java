package com.cwfit.pojo;

/**
 * @author yeyike
 * @date 2020/5/29 - 0:41
 */
public class Monster {

    private String name;
    private Prop hitWeapon;
    private int subtractHP;

    public Monster() {
    }

    public Monster(String name,Prop hitWeapon,int subtractHP) {
        this.name = name;
        this.hitWeapon = hitWeapon;
        this.subtractHP = subtractHP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prop getHitWeapon() {
        return hitWeapon;
    }

    public void setHitWeapon(Prop hitWeapon) {
        this.hitWeapon = hitWeapon;
    }

    public int getSubtractHP() {
        return subtractHP;
    }

    public void setSubtractHP(int subtractHP) {
        this.subtractHP = subtractHP;
    }
}

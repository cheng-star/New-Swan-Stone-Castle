package com.cwfit.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author yeyike
 * @date 2020/5/29 - 0:39
 */
public class Room {

    private String description;
    private HashMap<String ,Room> exits = new HashMap<>();
    private int addHP = 0;
    private Prop addWeapon;
    private Monster monster;

    public Room() {
    }

    public Room(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Prop getAddWeapon() {
        return addWeapon;
    }

    public void setAddWeapon(Prop addWeapon) {
        this.addWeapon = addWeapon;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public HashMap<String, Room> getExits() {
        return exits;
    }

    public void setExits(String dir, Room room) {
        exits.put(dir,room);
    }

    public int getAddHP() {
        return addHP;
    }

    public void setAddHP(int addHP) {
        this.addHP = addHP;
    }

    public Set<String> getExitDesc(){

        Set<String> exitList = exits.keySet();

        return exitList;
    }
    public Room getExit(String direction){
        return exits.get(direction);
    }

}

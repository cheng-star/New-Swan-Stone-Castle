package com.cwfit.controller;

import com.cwfit.mapper.RoleMapper;
import com.cwfit.mapper.RoomMapper;
import com.cwfit.pojo.Monster;
import com.cwfit.pojo.Prop;
import com.cwfit.pojo.Role;
import com.cwfit.pojo.Room;

import java.util.List;
import java.util.Scanner;

/**
 * @author yeyike
 * @date 2020/5/29 - 1:13
 */
public class Play {

    RoomMapper roomMapper = new RoomMapper();
    List<Room> roomList = roomMapper.createRoom();
    private Room currentRoom = roomList.get(4);
    Role role;

    public static void main(String[] args){
        Play play = new Play();
        RoleMapper roleMapper = new RoleMapper();

        UI.map();
        UI.scenario();

        System.out.println("你是：");
        Scanner in = new Scanner(System.in);
        String username = in.next();

        play.role = roleMapper.creatRole(username);
        System.out.println(play.role.toString());
        System.out.println("你现在在"+play.currentRoom.getDescription());
        System.out.println("出口有"+play.currentRoom.getExitDesc());
        play.game();
    }

    public void game(){
        Scanner in = new Scanner(System.in);
        while (true){
            if (role.getHP()<=0){
                System.out.println("你已经没有生命值了");
                break;
            }
            if (role.getHP()>200){
                System.out.println("你的生命值达到200以上，没有危险可以阻止你，你成为了强者");
                break;
            }
            String line = in.nextLine();
            String[] words = line.split(" ");
            String handler = words[0];
            if (handler.equals("bye")){
                System.out.println("再见");
                break;
            }else if (handler.equals("help")){
                doCmd();
            }else if (handler.equals("go")){
                String exit = words[1];
                goRoom(exit);
            }else {
                doCmd();
            }
        }
    }

    public void showPrompt(){
        System.out.println("现在你在" + currentRoom.getDescription());
        if (currentRoom.getAddHP()!=0){
            System.out.println("在这里你的生命值会提升"+currentRoom.getAddHP());
            role.setHP(currentRoom.getAddHP()+role.getHP());
        }
        if (currentRoom.getAddWeapon()!=null){
            System.out.println("在这里你会得到:"+currentRoom.getAddWeapon().getName());
            role.setProps(currentRoom.getAddWeapon());
        }
        if (currentRoom.getMonster()!=null){
            System.out.println("在这里你会遇到:"+currentRoom.getMonster().getName());
            fit(currentRoom.getMonster());
        }
        information();
        System.out.print("出口有：");
        System.out.println(currentRoom.getExitDesc());
        System.out.println();
    }

    public void doCmd() {
        System.out.println("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
    }

    private void goRoom(String direction)
    {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }

    public void fit(Monster monster){
        List<Prop> props = role.getProps();
        int canHit = 0;
        for (Prop prop:props){
            if (prop==currentRoom.getMonster().getHitWeapon()){
                System.out.println("你可以用"+prop.getName()+"打败他");
                canHit = 1;
            }
        }
        if (canHit==0){
            System.out.println("你没有办法打败他，你的生命值将减少"+monster.getSubtractHP());
            role.setHP(role.getHP()-monster.getSubtractHP());
        }
    }

    public void information(){
        System.out.println("你现在的生命值还剩有"
                +role.getHP()+"\n你一共收集的道具：\n"
                +role.getProps1());
    }
}

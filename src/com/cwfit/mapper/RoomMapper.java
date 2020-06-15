package com.cwfit.mapper;

import com.cwfit.pojo.Monster;
import com.cwfit.pojo.Prop;
import com.cwfit.pojo.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yeyike
 * @date 2020/5/29 - 0:48
 */
public class RoomMapper {

    PropMapper propMapper = new PropMapper();
    MonsterMapper monsterMapper = new MonsterMapper();
    public List<Room> createRoom(){
        List<Room> room_list = new ArrayList<>();
        List<Prop> props = propMapper.props();
        List<Monster> monsters = monsterMapper.monsterList();

        Room saengersaal,ritterbad,ambulatory,sitting_room,warm,palace;
        saengersaal = new Room("歌剧厅");
        ritterbad = new Room("骑士浴室");
        ambulatory = new Room("红色回廊");
        sitting_room = new Room("起居室");
        warm = new Room("小暖房");
        palace = new Room("宫殿");

        palace.setExits("south",ritterbad);
        palace.setExits("north",saengersaal);
        palace.setExits("east",ambulatory);
        ritterbad.setExits("north",palace);
        saengersaal.setExits("south",palace);
        ambulatory.setExits("west",palace);
        ambulatory.setExits("east",sitting_room);
        sitting_room.setExits("west",ambulatory);
        sitting_room.setExits("south",warm);
        warm.setExits("north",sitting_room);

        palace.setAddWeapon(props.get(0));
        warm.setAddWeapon(props.get(1));
        saengersaal.setAddWeapon(props.get(2));
        sitting_room.setAddWeapon(props.get(3));
        ritterbad.setAddWeapon(props.get(4));

        palace.setMonster(monsters.get(0));
        warm.setMonster(monsters.get(1));
        saengersaal.setMonster(monsters.get(2));
        ambulatory.setMonster(monsters.get(3));
        ritterbad.setMonster(monsters.get(4));

        sitting_room.setAddHP(26);
        warm.setAddHP(24);
        saengersaal.setAddHP(18);
        ritterbad.setAddHP(20);

        room_list.add(saengersaal);
        room_list.add(ritterbad);
        room_list.add(ambulatory);
        room_list.add(sitting_room);
        room_list.add(warm);
        room_list.add(palace);

        return room_list;

    }
}

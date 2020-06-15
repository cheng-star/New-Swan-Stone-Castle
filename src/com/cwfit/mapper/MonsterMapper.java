package com.cwfit.mapper;

import com.cwfit.pojo.Monster;
import com.cwfit.pojo.Prop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yeyike
 * @date 2020/5/30 - 14:32
 */
public class MonsterMapper {

    PropMapper propMapper = new PropMapper();
    public List<Monster> monsterList(){
        List<Monster> monsters = new ArrayList<>();
        List<Prop> props = propMapper.props();

        Monster ghost,dragon,destroy,storm,wind;

        ghost = new Monster("鬼剑圣人",props.get(4),20);
        dragon = new Monster("魂灭先知",props.get(0),15);
        destroy = new Monster("狂飙毁灭者",props.get(1),30);
        storm = new Monster("死灵风雨师",props.get(3),20);
        wind = new Monster("风铃神王",props.get(2),25);
        monsters.add(ghost);
        monsters.add(dragon);
        monsters.add(destroy);
        monsters.add(storm);
        monsters.add(wind);

        return monsters;
    }
}

package com.cwfit.pojo;

import com.cwfit.mapper.PropMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yeyike
 * @date 2020/5/29 - 0:37
 */
public class Role {

    private String username;
    private int HP;
    private List<Prop> props= new ArrayList<>();

    PropMapper propMapper = new PropMapper();
    List<Prop> propList = propMapper.props();

    public Role() {
    }

    public Role(String username) {
        this.username = username;
        this.HP = 100;
        props.add(propList.get(0));
        props.add(propList.get(1));

    }

    public List<Prop> getProps() {
        return props;
    }

    public List<String> getProps1() {
        List<String> propList = new ArrayList<>();
        for (Prop prop:props){
            propList.add(prop.getName());
        }
        return propList;
    }

    public void setProps(Prop  prop) {
        props.add(prop);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public String toString() {
        return"哦"+ username  +
                "你来了，\n目前你的生命值是：" + HP +
                "\n带上这些道具" + props.get(0).getName()+"、"+props.get(1).getName() +
                "它们会帮助你的\n当你走进这座城堡，永远不会知道，在下一个房间会遇到什么危险";
    }
}

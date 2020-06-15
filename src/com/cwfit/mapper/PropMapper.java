package com.cwfit.mapper;

import com.cwfit.pojo.Prop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yeyike
 * @date 2020/5/30 - 15:08
 */
public class PropMapper {

    public List<Prop> props(){

        List<Prop> propList = new ArrayList<>();
        Prop cable = new Prop("千缠百结索");
        Prop bag = new Prop("乾坤一气袋");
        Prop axe = new Prop("双刃斧");
        Prop chop = new Prop("月夜斩");
        Prop burner = new Prop("招神灯");
        propList.add(cable);
        propList.add(bag);
        propList.add(axe);
        propList.add(chop);
        propList.add(burner);

        return propList;
    }
}

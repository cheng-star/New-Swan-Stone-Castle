package com.cwfit.test;

import com.cwfit.mapper.PropMapper;
import com.cwfit.pojo.Prop;

import java.util.List;

/**
 * @author yeyike
 * @date 2020/5/30 - 16:36
 */
public class Test {

    public static void main(String[] args) {
        PropMapper propMapper = new PropMapper();
        List<Prop> props = propMapper.props();
        System.out.println(props.get(0).getName());
    }
}

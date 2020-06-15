package com.cwfit.mapper;

import com.cwfit.pojo.Role;

/**
 * @author yeyike
 * @date 2020/5/30 - 16:18
 */
public class RoleMapper {

    public Role creatRole(String name){

        Role role = new Role(name);
        return role;
    }
}

/**
 * FileName :UserServiceImpl
 * Author :zengzhijun
 * Date : 2018/5/7 10:06
 * Description:
 */
package com.byedbl.proxy.staticmodel.impl;


import com.byedbl.proxy.staticmodel.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public int save() {
        System.out.println(UserServiceImpl.class.getName() +" saveing...");
        return 0;
    }

    @Override
    public int delete() {
        System.out.println(UserServiceImpl.class.getName()+" delete...");
        return 0;
    }
}

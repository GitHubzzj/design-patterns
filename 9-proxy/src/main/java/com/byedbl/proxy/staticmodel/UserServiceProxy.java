/**
 * FileName :UserServiceProxy
 * Author :zengzhijun
 * Date : 2018/5/7 10:08
 * Description:代理类
 */
package com.byedbl.proxy.staticmodel;


import com.byedbl.proxy.staticmodel.impl.UserServiceImpl;

public class UserServiceProxy implements UserService{
    private UserService userService = new UserServiceImpl();
    @Override
    public int save() {
        System.out.println(UserServiceProxy.class.getName()+" save start...");
        userService.save();
        System.out.println(UserServiceProxy.class.getName()+" save end...");
        return 0;
    }

    @Override
    public int delete() {
        System.out.println(UserServiceProxy.class.getName()+" delete start...");
        userService.delete();
        System.out.println(UserServiceProxy.class.getName()+" delete end...");
        return 0;
    }
}

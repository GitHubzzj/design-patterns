package com.byedbl.proxy.cglib;

import org.junit.Test;

public class ProxyFactoryTest {


    @Test
    public void intercept() {
        //目标对象
        UserServiceDao target = new UserServiceDao();

        //代理对象
        UserServiceDao proxy = (UserServiceDao)new CglibProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}

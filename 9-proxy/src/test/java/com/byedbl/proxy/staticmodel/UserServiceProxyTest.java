package com.byedbl.proxy.staticmodel;

import org.junit.Test;

public class UserServiceProxyTest {

    /**
     * <pre>
     * 缺点:代理对象UserServiceProxy需要与目标对象UserServiceImpl实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护
     * @author : zengzhijun
     * @date : 2018/5/7 10:15
     **/
    @Test
    public void save() {

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.save();
    }
}

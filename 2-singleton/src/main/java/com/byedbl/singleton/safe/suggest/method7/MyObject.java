package com.byedbl.singleton.safe.suggest.method7;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 线程安全之静态内部类
 *
 *
 * @author : zengzhijun
 * @date : 2018/5/18 19:08
 **/
public class MyObject implements Serializable{

    // 内部类方式
    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    /**
     * 解决在序列化时线程不安全的问题
     **/
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return MyObjectHandler.myObject;
    }
}


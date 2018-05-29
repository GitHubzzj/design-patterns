package com.byedbl.singleton.unsafe.method2;

/**
 * 懒汉式,没加锁,不安全,加锁性能也低
 * @author : zengzhijun
 * @date : 2018/5/18 17:55
 **/
public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
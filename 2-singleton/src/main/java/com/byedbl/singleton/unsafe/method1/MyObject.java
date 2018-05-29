package com.byedbl.singleton.unsafe.method1;

/**
 * 饿汉模式
 * 这种测得为啥一直是线程安全的??
 *
 * @author : zengzhijun
 * @date : 2018/5/18 17:56
 **/
public class MyObject {

    // 立即加载方式==饿汉模式
    private static MyObject myObject = new MyObject();

    private MyObject() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static MyObject getInstance()  {
        // 此代码版本为立即加载
        // 此版本代码的缺点是不能有其它实例变量
        // 因为getInstance()方法没有同步
        // 所以有可能出现非线程安全问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}


package com.byedbl.singleton.safe.normal.method4;

/**
 * 这个虽然线程安全,但是效率太低了
 * @author : zengzhijun
 * @date : 2018/5/18 19:00
 **/
public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {
            // 此种写法等同于：
            // synchronized public static MyObject getInstance()
            // 的写法，效率一样很低，全部代码被上锁
            synchronized (MyObject.class) {
                if (myObject != null) {
                } else {
                    // 模拟在创建对象之前做一些准备性的工作
                    Thread.sleep(3000);

                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}

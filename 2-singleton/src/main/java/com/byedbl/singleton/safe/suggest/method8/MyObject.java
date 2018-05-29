package com.byedbl.singleton.safe.suggest.method8;


/**
 * 静态代码块中的代码在使用类的时候就已经执行了,所以可以利用这个特性来实现单例
 * @author : zengzhijun
 * @date : 2018/5/18 19:21
 **/
public class MyObject {

	private static MyObject instance = null;

	private MyObject() {
	}

	static {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        instance = new MyObject();
	}

	public static MyObject getInstance() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		return instance;
	}

}

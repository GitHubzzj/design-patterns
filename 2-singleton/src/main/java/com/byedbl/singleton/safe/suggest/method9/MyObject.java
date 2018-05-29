package com.byedbl.singleton.safe.suggest.method9;

import org.apache.commons.lang3.RandomUtils;

/**
 * 使用枚举类实现单例
 * 终极方法,能用静态枚举类的就用静态枚举类
 * @author : zengzhijun
 * @date : 2018/5/18 19:27
 **/
public class MyObject {

	private enum MyEnumSingleton {
		INSTANCE;
        String arg ;
        private MyObject myObject = null;
		MyEnumSingleton() {
		    //这里可以初始化变量,当然也可以在一个 static代码块里面初始化
            arg = "get arg from properties" + RandomUtils.nextInt();
            myObject = new MyObject();
		}


        public MyObject getInstance() {
			return myObject;
		}
	}

	public static MyObject getConnection() {
		return MyEnumSingleton.INSTANCE.getInstance();
	}
    public String getArg() {
        return MyEnumSingleton.INSTANCE.arg;
    }
}
package com.byedbl.singleton.safe.suggest.method9;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
			System.out.println(MyObject.getConnection().hashCode());
//            System.out.println("arg:"+Thread.currentThread().getName()+" : " + MyObject.MyEnumSingleton.INSTANCE.getArg());
            System.out.println("arg:"+Thread.currentThread().getName()+" : " + MyObject.getConnection().getArg());
		}
	}
}

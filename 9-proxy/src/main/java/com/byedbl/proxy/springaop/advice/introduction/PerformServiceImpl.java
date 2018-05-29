package com.byedbl.proxy.springaop.advice.introduction;

public class PerformServiceImpl implements PerformService {

	@Override
	public void method1() {
		try {
			System.out.println("doing somethings method1...");
			Thread.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void method2() {
		try {
			System.out.println("doing somethings method2...");
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

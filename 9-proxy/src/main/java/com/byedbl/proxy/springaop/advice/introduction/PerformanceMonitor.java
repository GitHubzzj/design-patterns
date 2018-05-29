package com.byedbl.proxy.springaop.advice.introduction;

import java.util.Date;

public class PerformanceMonitor {
	private static ThreadLocal<MethodPerformace> methodPerformace=new ThreadLocal<MethodPerformace>();
	public  static void begin(String methodName){
		MethodPerformace mp=new MethodPerformace();
		mp.setBeginTime(new Date());
		mp.setMethod(methodName);
		methodPerformace.set(mp);
		System.out.println(mp.getMethod()+" start...");
	}
	
	public static void end(){
		methodPerformace.get().setEndTime(new Date());
		methodPerformace.get().printPerformance();
		System.out.println(methodPerformace.get().getMethod()+" end...");
	}
	
	
}

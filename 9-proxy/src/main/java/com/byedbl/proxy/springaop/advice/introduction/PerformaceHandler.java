package com.byedbl.proxy.springaop.advice.introduction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PerformaceHandler implements InvocationHandler {
	private Object target;
	public PerformaceHandler(Object target){
		this.target=target;
	}
	public static Object factory(Object target){
		Class<?> cls=target.getClass();
		return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new PerformaceHandler(target));
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		PerformanceMonitor.begin(this.target.getClass().getName()+method.getName());
		Object obj=method.invoke(target, args);
		PerformanceMonitor.end();
		return obj;
	}

}

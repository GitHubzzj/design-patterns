/**
 * FileName :GreetingBeforeAdvice
 * Author :zengzhijun
 * Date : 2018/5/7 18:05
 * Description:
 */
package com.byedbl.proxy.springaop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {

    /**
     * 前置增强 MethodBeforeAdvice
     * @param method :目标类方法
     * @param args :目标类参数
     * @param target :目标类实例
     **/
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String className = Thread.currentThread().getStackTrace()[1].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("className: "+className + " methodName: "+methodName + " start...");

        System.out.println("method: " + method.getName());
        System.out.println("args: "+args[0].toString());

        System.out.println("className: "+className + " methodName: "+methodName + " end...");

    }
}

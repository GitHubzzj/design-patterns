/**
 * FileName :GreetingAfterAdvice
 * Author :zengzhijun
 * Date : 2018/5/8 9:43
 * Description:后置增强
 */
package com.byedbl.proxy.springaop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 后置增强 AfterReturningAdvice
 * @author : zengzhijun
 * @date : 2018/5/8 9:43
 **/
public class GreetingAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String className = Thread.currentThread().getStackTrace()[1].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("className: "+className + " methodName: "+methodName + " start...");
        System.out.println("returnValue: "+returnValue);
        System.out.println("method: " + method.getName());
        System.out.println("args: "+ args[0]);
        System.out.println("target: " + target);

        System.out.println("className: "+className + " methodName: "+methodName + " end...");


    }
}

/**
 * FileName :TransactionExceptionManagerAdvice
 * Author :zengzhijun
 * Date : 2018/5/8 10:03
 * Description:错误增强
 */
package com.byedbl.proxy.springaop.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class TransactionExceptionManagerAdvice implements ThrowsAdvice {

    /**
     * 异常抛出增强
     * ThrowAdvice没有定义任何签名,但是有相关规定.
     * 方法名必须为afterThrowing
     * 前三个参数可选
     * 最后一个参数必须为Exception或其子类,
     * 如果有多个Exception子类的方法,Spring会获取最匹配的那个
     *
     **/
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
        String className = Thread.currentThread().getStackTrace()[1].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("className: "+className + " methodName: "+methodName + " start...");
        System.out.println("method: "+ method.getName());
        System.out.println("args: " + args[0].toString());
        System.out.println("target: " + target);
        System.out.println("ex: " + ex.getMessage());

        System.out.println("className: "+className + " methodName: "+methodName + " end...");

    }
}

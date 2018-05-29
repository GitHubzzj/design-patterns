/**
 * FileName :GreetingRoundInterceptor
 * Author :zengzhijun
 * Date : 2018/5/8 9:50
 * Description:环绕增强
 */
package com.byedbl.proxy.springaop.advice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕增强 MethodInterceptor ,
 * 不要忘记这句 Object o = invocation.proceed();
 *
 * @author : zengzhijun
 * @date : 2018/5/8 9:51
 **/
public class GreetingRoundInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String className = Thread.currentThread().getStackTrace()[1].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("className: " + className + " methodName: " + methodName + " start...");
        System.out.println("invocation.getMethod(): " + invocation.getMethod().getName());
        System.out.println("invocation.getArguments(): " + invocation.getArguments().toString());
        System.out.println("invocation.getThis(): " + invocation.getThis().getClass().getName());
        Object o = invocation.proceed();

        System.out.println("className: " + className + " methodName: " + methodName + " end...");

        return o;
    }
}

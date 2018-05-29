/**
 * FileName :GreetingPointcutAdvisor
 * Author :zengzhijun
 * Date : 2018/5/8 14:59
 * Description:
 */
package com.byedbl.proxy.springaop.pointcut;

import com.byedbl.proxy.springaop.advice.Waiter;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * 静态普通方法名匹配规则
 * @author : zengzhijun
 * @date : 2018/5/8 15:00
 **/
public class GreetingPointcutAdvisor extends StaticMethodMatcherPointcutAdvisor {
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        String className = Thread.currentThread().getStackTrace()[1].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("className: "+className + " methodName: "+methodName + " start...");
        System.out.println("method: "+ method.getName());
        System.out.println("targetClass: "+ targetClass.getCanonicalName());
        System.out.println("className: "+className + " methodName: "+methodName + " end...");


        return "greetTo".equalsIgnoreCase(method.getName());
    }

    @Override
    public ClassFilter getClassFilter() {
        return Waiter.class::isAssignableFrom;
    }

}

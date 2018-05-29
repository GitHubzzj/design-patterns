/**
 * FileName :ControllablePerformanceMonitor
 * Author :zengzhijun
 * Date : 2018/5/8 11:05
 * Description:
 */
package com.byedbl.proxy.springaop.advice.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 引介切面:为目标类创建新的方法和属性,setMonitorActive
 *
 * 继承 DelegatingIntroductionInterceptor 类 ,其实现了IntroductionInterceptor接口
 *
 * 功能: 手工打开关闭性能监视的功能
 * @author : zengzhijun
 * @date : 2018/5/8 14:00
 **/
public class ControllablePerformanceMonitor extends DelegatingIntroductionInterceptor implements Monitorable{

    private ThreadLocal<Boolean> moniterStatus = new ThreadLocal<>();

    @Override
    public void setMonitorActive(boolean active) {
        moniterStatus.set(active);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj = null;

        if (moniterStatus.get() != null && moniterStatus.get()) {
             if(Arrays.stream(Monitorable.class.getMethods()).map(Method::getName).collect(Collectors.toList()).contains(mi.getMethod().getName())){
                 System.out.println("hit monitor method ...");
                 return obj = super.invoke(mi);
             }
            PerformanceMonitor.begin(mi.getMethod().getName());
            obj = super.invoke(mi);
            PerformanceMonitor.end();
        }else{
            obj = super.invoke(mi);
        }
        return obj;
    }
}

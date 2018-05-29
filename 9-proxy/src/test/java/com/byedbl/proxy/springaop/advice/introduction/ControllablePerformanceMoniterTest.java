package com.byedbl.proxy.springaop.advice.introduction;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class ControllablePerformanceMoniterTest {

    @Test
    public void invoke() {
        PerformService ps = new PerformServiceImpl();
        ps.method1();
        ps.method2();

        ControllablePerformanceMonitor advice = new ControllablePerformanceMonitor();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(ps);
        proxyFactory.addAdvice(advice);
        proxyFactory.setOptimize(true);


        PerformService performService = (PerformService) proxyFactory.getProxy();
        Monitorable monitorable = (Monitorable) performService;
        System.out.println("set monitor on ...");
        monitorable.setMonitorActive(true);
        performService.method1();
        performService.method2();
        System.out.println("set monitor off...");
        monitorable.setMonitorActive(false);
        performService.method1();
        performService.method2();
    }
}
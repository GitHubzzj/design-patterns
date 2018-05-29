package com.byedbl.proxy.springaop.pointcut;

import com.byedbl.proxy.springaop.advice.NaiveWaiter;
import com.byedbl.proxy.springaop.advice.Waiter;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class GreetingPointcutAdvisorTest {

    @Test
    public void matches() {
        Waiter waiter = new NaiveWaiter();
        Seller seller = new Seller();
        GreetingPointcutAdvisor advisor = new GreetingPointcutAdvisor();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setOptimize(true);
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvisor(advisor);

        Waiter proxy = (Waiter)proxyFactory.getProxy();
        proxy.greetTo(" zzj");

        proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(seller);

        Seller s = (Seller) proxyFactory.getProxy();
        s.greetTo(" zzj1");
    }
}
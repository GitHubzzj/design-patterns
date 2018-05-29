package com.byedbl.proxy.springaop;

import com.byedbl.proxy.springaop.advice.GreetingBeforeAdvice;
import com.byedbl.proxy.springaop.advice.NaiveWaiter;
import com.byedbl.proxy.springaop.advice.Waiter;
import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class GreetingBeforeAdviceTest {

    @Test
    public void before() {
        Waiter waiter = new NaiveWaiter();
        BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setInterfaces(waiter.getClass().getInterfaces());
        proxyFactory.setOptimize(true);
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(beforeAdvice);

        Waiter pw = (Waiter) proxyFactory.getProxy();
        pw.greetTo(" greetTo zzj");
        pw.serveTo(" serveTo zzj");
    }
}

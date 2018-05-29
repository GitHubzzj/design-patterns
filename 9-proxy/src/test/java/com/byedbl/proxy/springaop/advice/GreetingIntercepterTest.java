package com.byedbl.proxy.springaop.advice;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class GreetingIntercepterTest {

    @Test
    public void invoke() {

        Waiter waiter = new NaiveWaiter();
        GreetingRoundInterceptor i= new GreetingRoundInterceptor();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(i);

        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.serveTo(" serveTo zzj");
        proxy.greetTo(" greetTo zzj");

    }
}

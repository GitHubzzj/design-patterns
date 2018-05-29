package com.byedbl.proxy.springaop.advice;

import org.junit.Test;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class GreetingAfterAdviceTest {

    @Test
    public void afterReturning() {
        Waiter waiter = new NaiveWaiter();
        AfterAdvice afterAdvice = new GreetingAfterAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(afterAdvice);
        proxyFactory.setTarget(waiter);

        Waiter proxy = (Waiter)proxyFactory.getProxy();
        proxy.greetTo(" greetTo zzj");
        proxy.serveTo(" serveTo zzj");

    }
}

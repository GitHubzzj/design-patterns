package com.byedbl.proxy.springaop.advice;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class TransactionManagerTest {

    @Test
    public void afterThrowing() {
        ForumService service = new ForumService();
        TransactionExceptionManagerAdvice manager = new TransactionExceptionManagerAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(service);
        proxyFactory.addAdvice(manager);

        ForumService proxy = (ForumService) proxyFactory.getProxy();
        proxy.remove(100);
        proxy.update(1000);
    }
}
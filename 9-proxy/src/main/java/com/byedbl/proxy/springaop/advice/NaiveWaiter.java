/**
 * FileName :NaiveWaiter
 * Author :zengzhijun
 * Date : 2018/5/7 17:24
 * Description:
 */
package com.byedbl.proxy.springaop.advice;

public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String name) {

        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() + " " +name);
    }

    @Override
    public void serveTo(String name) {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName() + " " +name);
    }
}

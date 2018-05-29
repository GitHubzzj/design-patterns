/**
 * FileName :Waiter2
 * Author :zengzhijun
 * Date : 2018/5/8 19:47
 * Description:
 */
package com.byedbl.proxy.springaop.advice;

public class Waiter2 implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("...");

    }

    @Override
    public void serveTo(String name) {
        System.out.println("...");
    }
}

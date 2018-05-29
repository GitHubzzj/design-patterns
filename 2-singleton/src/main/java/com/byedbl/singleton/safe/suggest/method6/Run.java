package com.byedbl.singleton.safe.suggest.method6;


import java.util.concurrent.CountDownLatch;

public class Run {

	public static void main(String[] args) {
        int len = 100;
        CountDownLatch latch = new CountDownLatch(len);
        MyThread[] threads = new MyThread[len];
        for(int i =0 ;i< len;i++) {
            threads[i] = new MyThread();
            latch.countDown();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i= 0;i<len;i++) {
            threads[i].start();
        }

	}

}

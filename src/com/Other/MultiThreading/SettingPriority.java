package com.Other.MultiThreading;

import javax.swing.plaf.IconUIResource;

class MyThread implements Runnable{
    Thread thread = new Thread(this);
    boolean isRunning = false;
    double count = 0;
    public MyThread(String name) {
        thread.setName(name);
        System.out.println("Thread detail : " + thread.getName());
        thread.start();
    }

    @Override
    public void run() {
        while (!isRunning){
            count++;
        }
        //System.out.println(thread.getName() + " is dead");
    }
}

public class SettingPriority {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        MyThread myThread1 = new MyThread("child-1");
        MyThread myThread2 = new MyThread("child-2");
        try {
            Thread.sleep(10000);
            myThread1.thread.setPriority(Thread.NORM_PRIORITY + 3);
            myThread2.thread.setPriority(Thread.NORM_PRIORITY - 2);
            myThread1.isRunning = true;
            myThread2.isRunning = true;
            System.out.println("Total no of count of Child-1 :" + myThread1.count);
            System.out.println("Total no of count of Child-2 :" + myThread2.count);
        }catch (InterruptedException interruptedException){
            System.out.println(Thread.currentThread().getName() + " is inturrepted");
        }

    }
}

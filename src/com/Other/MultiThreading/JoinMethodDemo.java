package com.Other.MultiThreading;

class MyClass implements Runnable{
    Thread thread = new Thread(this);
    public MyClass(String name) {
        thread.setName(name);
        System.out.println("Thread details : " + thread.getName());
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i = i+2) {
            System.out.println(thread.getName() + " : " + i);
        }
        System.out.println(thread.getName() + " is dead");
    }
}

public class JoinMethodDemo {
    public static void main(String[] args) {

        MyClass myClass1 = new MyClass("Child-1");
        MyClass myClass2 = new MyClass("Child-2");
        MyClass myClass3 = new MyClass("Child-3");

        try{
            myClass1.thread.join();

            System.out.println("Hi");
            myClass2.thread.join();
            System.out.println("hello");
            myClass3.thread.join();
            System.out.println("stopped");
        }catch (InterruptedException interruptedException){
            System.out.println(Thread.currentThread().getName() + " Intrupted");
        }

    }
}

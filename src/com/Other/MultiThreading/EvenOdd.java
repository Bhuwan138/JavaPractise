package com.Other.MultiThreading;


class EvenOdd extends Thread{
    public EvenOdd(String title){
        super(title);
        System.out.println("Current thread : " + this);
    }

    @Override
    public void run(){
        try{
            for (int i = 1; i < 10; i = i+2) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException interruptedException){
            System.out.println("Error in sleep Method" + interruptedException);
        }
    }
}

class UseEvenOdd{
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd("Odd");
        evenOdd.start();
        System.out.println("Current thread : " + Thread.currentThread());
        try {
            for (int i = 2; i < 10; i = i+2) {
                System.out.println("In main thread : " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException interruptedException){
            System.out.println("Error in sleep Method" + interruptedException);
        }

    }
}

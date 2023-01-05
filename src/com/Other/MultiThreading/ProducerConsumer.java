package com.Other.MultiThreading;



class Counter{
    private int count;
    private boolean status = true;

    //getCount is used to consume the valye by the consumer
    synchronized public int getCount() {
        try {
            if(status){ // checking for if status == true then wait consumer
                System.out.println("Consumer waiting...");
                wait(); //It is used to wait the consumer if consumer wants to consume two times value one after another
            }
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        status = true;
        notify();
        return count;
    }

    //setCount is used to produced the value by the producer
    synchronized public void setCount(int count) {
        try {
            if(!status) { //checking for if status == false then wait producer
                System.out.println("Producer waiting...");
                wait(); // It is used to wait the producer if producer wants to produce two times value one after another
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.count = count;
        status = false;
        notify();
    }
}

class Producer extends Thread{
    Counter counter;
    public Producer(Counter counter) {
        this.counter = counter;
        this.start();
    }

    @Override
    public void run(){
        try{
            for (int i = 1; i <= 10; i++) {
                counter.setCount(i);
                System.out.println("Producer produced : " + i);
                Thread.sleep((int)(Math.random()*1000));
            }
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

class Consumer extends Thread{
    Counter counter;
    public Consumer(Counter counter) {
        this.counter = counter;
        this.start();
    }

    @Override
    public void run(){
        try{
            int total = 0;

            for (int i = 1; i <= 10; i++) {
                int count = counter.getCount();
                System.out.println("Consumer consumed : " + count);
                total += count;
                Thread.sleep((int)(Math.random()* 1000));
            }
            System.out.println("Total consumed : " + total);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Producer producer = new Producer(counter);
        Consumer consumer = new Consumer(counter);

        try{
            producer.join();
            consumer.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

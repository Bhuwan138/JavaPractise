package com.Other.MultiThreading;

import java.nio.file.FileStore;

class Prime implements Runnable {
    int num;
    Thread thread = new Thread(this);

    public Prime(int num){
        this.num = num;
    }


    @Override
    public void run() {

        boolean count = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count = true;

                break;
            }
        }
        if(!count){
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }


    }
}

class Factorial implements Runnable{
    int num;
    Thread thread = new Thread(this);

    public Factorial(int num){
        this.num = num;
    }
    @Override
    public void run() {

            int fact=1;
            for (int i = 1; i <= num; i++) {
                fact *= i;

            }
            System.out.println("Factorial of " + num  +" is " + fact);

    }

}

class UsePrimeFactorial {
    public static void main(String[] args) {
        int n = 2;
        Prime prime = new Prime(n);
        Factorial factorial = new Factorial(n);
        Thread thread = new Thread(prime);
        Thread thread1 = new Thread(factorial);
        thread.start();
        thread1.start();

    }
}

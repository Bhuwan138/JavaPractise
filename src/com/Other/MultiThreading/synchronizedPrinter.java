package com.Other.MultiThreading;



class Printer{
//    synchronized public void print(String message){
    public void print(String message){
        try {
            System.out.print("[ " + message);
            Thread.sleep(1000);
            System.out.println("]");
        }catch (InterruptedException interruptedException){
            System.out.println("Printer Intrupped");
        }
    }
}

class Ram extends Thread{
    Printer printer;
    String message;

    public Ram(Printer printer, String message) {
        this.printer = printer;
        this.message = message;
//        Thread.currentThread().start();
        start();
    }

    @Override
    public void run() {
        synchronized (printer) {
            printer.print(message);
        }
    }
}

public class synchronizedPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Ram ram1 = new Ram(printer,"Bhuwan Rocks");
        Ram ram2 = new Ram(printer,"You Rocks");
        Ram ram3 = new Ram(printer,"EveryOne Rocks");

        try{
            ram1.join();
            ram2.join();
            ram3.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

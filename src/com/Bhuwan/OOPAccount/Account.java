package com.Bhuwan.OOPAccount;

import java.util.Scanner;

class Account {
    private int accId;
    private String name;
    private double balance;

    public Account(int id, String name , double balance){
        accId  =  id;
        this.name = name;
        this.balance = balance;
    }

    public void show(){
        System.out.println(accId + " , " + name +  " , " + balance);
    }
}

class UseAccount{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Account Id number , name and balance of a person : ");
        int id = in.nextInt();
        in.nextLine();
        String name  = in.nextLine();

        Double balance  = in.nextDouble();

        Account acc = new Account(id,name,balance);
        Account acc1 = new Account(id,name,balance);
        acc.show();
        acc1.show();
    }
}


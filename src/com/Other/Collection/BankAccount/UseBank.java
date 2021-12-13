package com.Other.Collection.BankAccount;

import java.util.HashMap;
import java.util.Iterator;

public class UseBank {
    public static void main (String[] args) {
        Account obj1 = new Account(1001,"Bhuwan", 85000.0);
        Account obj2 = new Account(1002,"Ram", 65000.0);
        Account obj3 = new Account(1003,"Hari", 98500.0);
        Account obj4 = new Account(1004,"Shyam", 45860.0);

        Bank bank = new Bank();
        System.out.println("Account no :" + obj1.getAccountNumber() + " added --> " + bank.addAccount(obj1));
        System.out.println("Account no :" + obj2.getAccountNumber() + " added --> " + bank.addAccount(obj2));
        System.out.println("Account no :" + obj3.getAccountNumber() + " added --> " + bank.addAccount(obj3));
        System.out.println("Account no :" + obj4.getAccountNumber() + " added --> " + bank.addAccount(obj4));
        System.out.println("Account no :" + obj1.getAccountNumber() + " added --> " + bank.addAccount(obj1));


        System.out.println("Detail of " + obj1.getAccountNumber() + " is --> " + bank.getAccount(obj1.getAccountNumber()));
        System.out.println("Detail of " + obj2.getAccountNumber() + " is --> " + bank.getAccount(obj2.getAccountNumber()));
        System.out.println("Detail of " + obj3.getAccountNumber() + " is --> " + bank.getAccount(obj3.getAccountNumber()));
        System.out.println("Detail of " + obj4.getAccountNumber() + " is --> " + bank.getAccount(obj4.getAccountNumber()));

        System.out.println("Removed account : --> " + bank.remove(1001));
        System.out.println("Detail of " + obj1.getAccountNumber() + " is --> " + bank.getAccount(obj1.getAccountNumber()));

        HashMap<Integer,Account> allAccount =  bank.getAllAccount();
        Iterator it = allAccount.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

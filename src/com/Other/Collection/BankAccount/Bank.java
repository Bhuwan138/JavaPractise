package com.Other.Collection.BankAccount;

import java.util.HashMap;

public class Bank {
    private HashMap<Integer, Account> accounts = null;


    public Bank () {
        accounts = new HashMap<>();
    }

    public boolean addAccount(Account obj){
        return accounts.put(obj.getAccountNumber(), obj) == null;
    }

    public Account getAccount(Integer id){
        return accounts.get(id);
    }

    public boolean remove(Integer id){
        return accounts.remove(id) != null;
    }

    public Integer getCount(){
        return accounts.size();
    }

    public HashMap<Integer,Account> getAllAccount (){
        return accounts;
    }
}

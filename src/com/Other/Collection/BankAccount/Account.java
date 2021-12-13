package com.Other.Collection.BankAccount;

public class Account {
    private Integer accountNumber;
    private String name;
    private Double balance;

    public Account (Integer accountNumber, String name, Double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString () {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Double getBalance () {
        return balance;
    }

    public void setBalance (Double balance) {
        this.balance = balance;
    }
}

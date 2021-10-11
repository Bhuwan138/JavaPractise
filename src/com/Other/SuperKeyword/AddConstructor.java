package com.Other.SuperKeyword;

public class AddConstructor {
    private int a,b;

    public AddConstructor(){
        this(0);
        System.out.println("Super class No argument constructor called");
    }

    public AddConstructor(int num){
        this(num,num);
        System.out.println("Super class Single Argument constructor called");
    }
    public AddConstructor (int a, int b) {

        System.out.println("Super class Two Argument constructor called");
    }


}

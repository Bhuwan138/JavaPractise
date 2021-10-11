package com.Other.SuperKeyword;

public class AddConstructorCall extends AddConstructor{

    public AddConstructorCall () {
        this(0);
        System.out.println("Sub class No argumnet constructor called");
    }

    public AddConstructorCall (int num) {
        this(num,num);
        System.out.println("Sub Class One Argument constructor called");
    }

    public AddConstructorCall (int a, int b) {
        super();
        System.out.println("Sub Class Two Argument Constructor called");
    }
}

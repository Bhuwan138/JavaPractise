package com.Other.Inheretence.EmpSuper;

public class Box {
    private int lenght,breadth,height;

    public Box(){
        lenght = breadth = height = 0;
    }

    public Box(int s){
        lenght = breadth = height = s;
    }

    public Box (int lenght, int breadth, int height) {
        this.lenght = lenght;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(Box p){
        this.lenght = p.lenght;
        this.breadth = p.breadth;
        this.height = p.height;
    }

    public void show(){
        System.out.println( " " +  lenght + "  " + breadth + "  "   + height);
    }
}

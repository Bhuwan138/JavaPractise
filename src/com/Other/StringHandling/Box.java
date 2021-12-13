package com.Other.StringHandling;

public class Box {
    private int length, breadth, height;

    public Box (int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public boolean equals(Object obj){
        Box temp = (Box) obj;
        if (this.length == temp.length && this.breadth == temp.breadth && this.height == temp.height) {
            return true;
        }
        return false;
    }


    public void show(){
        System.out.println(length + ", " + breadth + ", " + height);
    }
}

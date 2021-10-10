package com.Other.InheretenceThis;

public class VolumeOfRectangle {
    private double lenght ,breadth , height;


    public VolumeOfRectangle(){
        this(0,0,0);
    }

    public  VolumeOfRectangle(double length){
        this(length,length,length);
    }

    public VolumeOfRectangle (double lenght, double breadth, double height) {
        this.lenght = lenght;
        this.breadth = breadth;
        this.height = height;
    }

    public double calculate(){
        double volume = lenght * breadth * height;
        return volume;
    }

    public void display(){
        System.out.println("\n\nLength: " + lenght + "\nBreadth : " + breadth + "\nHeight : " + height + "\nVolume : "  );
    }

}

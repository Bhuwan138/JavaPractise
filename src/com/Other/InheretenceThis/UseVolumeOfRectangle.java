package com.Other.InheretenceThis;

public class UseVolumeOfRectangle {
    public static void main (String[] args) {
        double length = 20;
        double breadth = 20;
        double height  = 30;
        VolumeOfRectangle rect  = new VolumeOfRectangle();
        VolumeOfRectangle rect1  = new VolumeOfRectangle(length);
        VolumeOfRectangle rect2  = new VolumeOfRectangle(length, breadth , height);
        rect.display();
        System.out.print(rect.calculate());
        rect1.display();
        System.out.print(rect1.calculate());
        rect2.display();
        System.out.print(rect2.calculate());
    }
}

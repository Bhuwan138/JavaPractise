package com.Programs.OverloadingArea;

class Area {
    public void area(double r){
        System.out.println("Area of Circle is : " + (Math.PI * Math.pow(r,2)));
    }
    public void area(double r,int h){
        System.out.println("Area of Cylinder is : "+ ( (2 * Math.PI * r * h) + (2* Math.PI * Math.pow(r,2)) ) );
    }
}
 class UseArea{
     public static void main(String[] args) {
        Area a = new Area();
        a.area(45);
        a.area(45,25);
     }
 }



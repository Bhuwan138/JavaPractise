/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bhuwan;

/**
 *
 * @author Bhuwan Raj Pandey
 */
public class Circle {
    private int radius;
    
    void setRadius(int r){
        radius = r;
    }
    void calculateArea(int r){
        double area =  (Math.PI * Math.pow(r,2));
        System.out.println("Area : "+ area);
    }
    
    void calculateCircumference(int r){
        double circumference = 2 * Math.PI * r;
        System.out.println("Circumference : " + circumference);
    }
    
}

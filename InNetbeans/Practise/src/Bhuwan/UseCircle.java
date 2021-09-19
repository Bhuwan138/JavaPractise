/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bhuwan;

import java.util.Scanner;

/**
 *
 * @author pande
 */
public class UseCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        c.calculateArea(radius);
        c.calculateCircumference(radius);
    }
    
}

package com.Programs.Introduction;

//h = rootsquare(p^2 + b^2)
import java.util.Scanner;
public class PythaagorasTheromFormulla {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double p = in.nextDouble();
	double b = in.nextDouble();
	double h;
	h = Math.sqrt(Math.pow(p,2) + Math.pow(b,2));
	System.out.println(h);

	
        
    }
}

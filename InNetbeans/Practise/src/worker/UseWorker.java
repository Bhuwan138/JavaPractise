/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

import java.util.Scanner;

/**
 *
 * @author pande
 */
public class UseWorker {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         Worker w = new Worker();
         System.out.println("Enter the hours worked : ");
         int hw = in.nextInt();
         System.out.println("Enter the payRate : ");
         double payRate = in.nextDouble();
         w.setData(hw, payRate);
         System.out.println("Salary of worker is : " + w.calculateSalary());
   
    }
  
}

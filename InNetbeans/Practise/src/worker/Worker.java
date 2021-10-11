/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

/**
 *
 * @author pande
 */
public class Worker {
    private int hw;
    private double payRate;
    
    void setData(int hw, double payRate){
        this.hw = hw;
        this.payRate = payRate;
    }
    
    double calculateSalary(){
        if(hw <= 40)
        {
            return hw*payRate;
        }
        else
        {
            return hw*(payRate*2);
        }
    }

   
}

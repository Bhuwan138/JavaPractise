package com.Programs.Inheretence;

class Principle{
    int principle;
    public void displayP(int principle){
        System.out.println("Principle is : " + principle);
    }
}
class Time extends Principle{
    int time;
    public void displayT(int time){
        System.out.println("Time is : " + time);
    }
}
class SimpleInterest extends Time{
    private double rate;
    private double SI;
    public void displayR(double rate){
        System.out.println("Rate is : " + rate);
    }
    public void setData(int p , int t , double r){
        principle = p;
        time =  t;
        rate = r;
    }
    public void calculate(){
        SI = (principle * time * rate)/100.0;
        System.out.println("Simple Interest is : "  + SI);
    }
}
public class MultiLevel {
    public static void main (String[] args) {
        SimpleInterest si = new SimpleInterest();
        int t = 2, p = 45000;
        double r = 2.5;
        si.displayT(t);
        si.displayP(p);
        si.displayR(r);
        si.setData(p,t,r);
        si.calculate();
    }
}

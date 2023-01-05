package com.Other;

public class CompoundInterest {
    public static void main(String[] args) {
        int principle = 45000;
        double rate = 0.08;
        double apy1 = 1;
        double apy2 = 1;
        double apy3 = 1;
        double fv  = 1;
        String bank = "nab";
        switch(bank){
            case "nab": {
                apy1 = Math.pow((1 + (rate/2)),2) -1;
                break;
            }
            case "wac":{
                apy2 = Math.pow((1+ (rate/4)),4) - 1;
                break;
            }
            case "naz":{
                apy3 = Math.pow((1 + (rate /1 )),1) - 1;
                break;
            }
            default :
                System.out.println("Sorry ");
        }

        if(apy1 > apy2 && apy1 > apy3){
            fv = principle * Math.pow((1+ (apy1/2)),2);
            System.out.println("Anual percentage yeild for nab : " + apy1);
            System.out.println("Final Valye for nab : " + fv);
        }
        else if(apy2 > apy1 && apy2 > apy3){
            fv = principle * Math.pow((1 + (apy2/4)),4);
            System.out.println("Anual percentage yeild for cwa : " + apy2);
            System.out.println("Final Valye for cwa : " + fv);
        }
        else{
            fv =  principle * Math.pow((1 + (apy3/1)),1);
            System.out.println("Anual percentage yeild for naz : " + apy3);
            System.out.println("Final Valye for naz : " + fv);
        }
    }




}

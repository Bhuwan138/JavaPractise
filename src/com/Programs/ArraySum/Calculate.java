package com.Programs.ArraySum;

public class Calculate {

    public double [] arraySum(int []arr){
        int total = 0;
        double ans[] = new double[2];
        for(int x: arr){
            total = total +  x;
        }
        ans[0] = total;
        ans[1] = (double) total/arr.length;
        return ans;
    }
}

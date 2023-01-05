package Striver_A2Z.Learn_The_Basic.Step1_LearnTheBasic;

import java.util.*;

public class AllDivisorOfNumber {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(allDivisor(n));
    }

    private static Set<Integer> allDivisor(int n) {
        Set<Integer> divisor = new TreeSet<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0){
                divisor.add(i);
                if(i != n/i) divisor.add(n/i);
            }
        }
        return divisor;
    }
}

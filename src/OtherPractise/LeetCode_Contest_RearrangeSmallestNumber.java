package OtherPractise;

import java.util.Arrays;
import java.util.Collections;

public class LeetCode_Contest_RearrangeSmallestNumber {
    public static void main(String[] args) {
        long num = 310;

        long ans = smallestNumber(num);
        System.out.println(ans);
    }

    private static long smallestNumber(long num) {
        String number = String.valueOf(Math.abs(num));
        char[] arr = number.toCharArray();
        Arrays.sort(arr);
        if(num < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(number);
            sb.reverse();
        }

        if(num>0){
            int lIndex = number.lastIndexOf("0");
            char first = number.charAt(0);
            number.replace(number.charAt(0),number.charAt(lIndex+1));
            number.replace(number.charAt(lIndex+1),number.charAt(first));
        }
        System.out.println(number);


        return num;
    }
}

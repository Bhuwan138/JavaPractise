package OtherPractise;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_concenateArray<n, i> {
    public static void main (String[] args) {
//        int[] nums = {1,2,1};
//        int n = nums.length;
//        int[] ans = new int[2*n];
//        for (int i = 0; i < n; i++) {
//            ans[i] = nums[i];
//            ans[n+i] = nums[i];
//
//        }
//        System.out.println(Arrays.toString(ans));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        int first = 0;
        int last = n-1;
        int temp = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i=0; i< (arr.length/2) ;i++) {
             temp = arr[first];
        arr[first]= arr[last];
        arr[last] = temp;
        first++;
        last--;
    }

        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    }
}

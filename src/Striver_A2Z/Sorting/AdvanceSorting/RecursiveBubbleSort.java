package Striver_A2Z.Sorting.AdvanceSorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,6,78,2,3,6,2,6,8};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        RecursiveBubble(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void RecursiveBubble(int[] arr, int n) {
        if(n == 1) return;
        int count =  0;
        for (int i = 0; i < n - 1; i++) {
            if(arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
            }
        }

        if(count == 0) return;
        RecursiveBubble(arr,n-1);
    }
}

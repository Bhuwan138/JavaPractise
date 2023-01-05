package Striver_A2Z.Sorting.AdvanceSorting;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,6,78,2,3,6,2,6,8};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        RecursiveInsertion(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void RecursiveInsertion(int[] arr, int n) {
        if(n <= 1) return;
        RecursiveInsertion(arr,n-1);

        int last = arr[n-1];
        int i = n-2;

        while (i >= 0 && arr[i] > last){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = last;

    }
}

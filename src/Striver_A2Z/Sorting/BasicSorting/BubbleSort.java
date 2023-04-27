package Striver_A2Z.Sorting.BasicSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,5};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        //sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

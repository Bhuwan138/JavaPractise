package Striver_A2Z.Sorting.BasicSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,6,78,2,3,6,2,6,8};
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

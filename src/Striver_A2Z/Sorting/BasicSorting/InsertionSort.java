package Striver_A2Z.Sorting.BasicSorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,6,78,2,3,6,2,6,8};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        //sorting
        for (int i = 1; i < n ; i++) {
            int currentElement = arr[i];

            int j = i-1;
            while (j>=0 && arr[j] > currentElement){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentElement;
        }

        System.out.println(Arrays.toString(arr));
    }
}

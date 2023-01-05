package Striver_A2Z.Sorting.BasicSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,6,78,2,3,6,2,6,8};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        //sorting
        for (int i = 0; i < n -1; i++) {
            int min = i;

            for (int j = i+1; j < n; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            //swaping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}

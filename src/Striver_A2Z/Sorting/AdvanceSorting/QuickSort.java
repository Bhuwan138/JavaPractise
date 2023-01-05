package Striver_A2Z.Sorting.AdvanceSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,6,78,2,3,6,2,6,8};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        QuickSortRecursively(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void QuickSortRecursively(int[] arr, int low, int high) {
        if (low< high){
            int pivot = partation(arr,low,high);
            QuickSortRecursively(arr,low,pivot-1);
            QuickSortRecursively(arr,pivot+1,high);
        }
    }

    private static int partation(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j){
            while (arr[i] <= pivot && i< high){
                i++;
            }

            while (arr[j] > pivot && j >=  low){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}

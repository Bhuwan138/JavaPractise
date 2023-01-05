package Striver_A2Z.Sorting.AdvanceSorting;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,6,78,2,3,6,2,6,8};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
        
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left<right){
            int mid = left + (right-left)/2;
            mergeSort(arr,left,mid); //seperate left part
            mergeSort(arr,mid+1,right); //seperate right part
            merge(arr,left,mid,right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int leftIndex = left;
        int afterMidIndex = mid+1;
        int finalIndex = left;
        int[] temp = new int[1000000];

        while (leftIndex <= mid && afterMidIndex <= right){
            if(arr[leftIndex] < arr[afterMidIndex]){
                temp[finalIndex] = arr[leftIndex];
                leftIndex++;
            }else {
                temp[finalIndex] = arr[afterMidIndex];
                afterMidIndex++;
            }
            finalIndex++;
        }

        // if element of left half are still left
        if(leftIndex > mid){
            while (afterMidIndex <= right){
                temp[finalIndex] = arr[afterMidIndex];
                finalIndex++;
                afterMidIndex++;
            }
        }else{
            // if element of right half are still left
            while (leftIndex <= mid){
                temp[finalIndex] = arr[leftIndex];
                leftIndex++;
                finalIndex++;
            }
        }

        //temp to arr
        for ( finalIndex = left;finalIndex <= right; finalIndex++) {
            arr[finalIndex] = temp[finalIndex];
        }
    }
}

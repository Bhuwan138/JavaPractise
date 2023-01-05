package OtherPractise.Recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,3,8,4,9,4,9,8,0,45,73,465,76};
//        int[] arr = {2,0,1,6,3,8,4,9,4,9,8,4,45,73,465,76};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
//        mergeSorts(arr,0,arr.length-1);

        quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        int midPart;
        if(start < end){
            midPart =  partation(arr,start,end);
            quickSort(arr,start,midPart);
            quickSort(arr,midPart+1,end);
        }
    }
    private static int partation(int[] arr, int start, int end) {
        int i = start, j = end, pivot = end;
        do{
            do {
                i++;
            }while(arr[i] <= arr[pivot]);
            do{
              j--;
            } while (arr[j] > arr[pivot]);
            if(i < j) swap(arr,i,j);
        }while (i < j);
        swap(arr,pivot,j);
        return j;
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void mergeSorts(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSorts(arr, start, mid);
            mergeSorts(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid+1;
        int[] ans = new int[arr.length];
        int k = start;
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        if( i > mid){
           while (j <= end) {
                ans[k] = arr[j];
                k++;
                j++;
            }
        }else{
            if( i <= mid){
                ans[k] = arr[i];
                k++;
                i++;
            }
        }

        for (int l = start; l <= end; l++) {
            arr[l] = ans[l];
        }
    }
}

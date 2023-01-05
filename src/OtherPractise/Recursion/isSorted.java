package OtherPractise.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {5,5,3,7,3,5};
        int n = arr.length;
        int x= 50;
        List<Integer> total = new ArrayList<>();
//        int ans = firstIndex(arr,n,x,0);
        allIndex(arr,n,x,total);
        Collections.sort(total);
        System.out.println(total);
//        int total = sumArraay(arr,n);
//        System.out.println(total);
//        System.out.println(isSort(arr,n));
    }

    private static void allIndex(int[] arr, int n, int x, List<Integer> total) {
        if(n == 0) return;
        if(x == arr[n-1]) total.add(n-1);
        allIndex(arr,n-1,x,total);
    }

    private static int firstIndex(int[] arr, int n, int x, int currentIndex) {
        if(n == currentIndex) return -1;
        if(arr[currentIndex] == x)return currentIndex;
        return firstIndex(arr,n,x,currentIndex+1);
    }

    private static int sumArraay(int[] arr, int n) {
        if(n <= 1) return n;
        return arr[n-1] + sumArraay(arr,n-1);
    }

    private static boolean isSort(int[] arr, int n) {
        if(n == 0 || n == 1){
            return true;
        }

        if(arr[n-1] < arr[n-2]) return false;
        boolean ans = isSort(arr ,n-1);
        return ans;
    }
}

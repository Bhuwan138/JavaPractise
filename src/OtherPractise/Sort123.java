package OtherPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Sort123 {
//    static void sort012(int arr[], int n) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            arrayList.add(arr[i]);
//        }
//        Collections.sort(arrayList);
//        Iterator<Integer> e = arrayList.iterator();
//        while (e.hasNext()){
//            int number = e.next();
//            System.out.print(number + " ");
//        }
//    }
static void sort012(int arr[], int n) {
    int low = 0;
    int high = arr.length-1;
    int mid = 0;

    while(mid <= high){
        if(arr[mid] == 0 ){
            arr[low] ^= arr[mid];
            arr[mid] ^= arr[low];
            arr[low] ^= arr[mid];
            mid++;
            low++;
        }
        else if(arr[mid] == 2){
            arr[mid] ^= arr[high];
            arr[high] ^= arr[mid];
            arr[mid] ^= arr[high];
            high--;
        }
        else mid++;
    }

    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();

}
    static void swap(int a,int b){
        if(a!=b){
            a = a^b;
            b = a^b;
            a = a^b;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0 ; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            sort012(arr, n);
//            for (int i = 0 ; i < n; i++) {
//                System.out.print(arr[i] + " ");
//            }
            System.out.println();;
            t--;
        }
    }
}

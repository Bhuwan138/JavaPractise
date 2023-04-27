package Striver_A2Z.array.easy;

import java.util.ArrayList;
import java.util.List;

public class intersectionOFArray {
    public static void main(String[] args) {
        int[] arr1= {1,3,5,7,9};
        int[] arr2 = {1,3,6,7,8,10};
        intersectionArrUsingTwoPointer(arr1,arr2);
    }

    private static void intersectionArrUsingTwoPointer(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();
        while(i< arr1.length && j< arr2.length){
            if(arr1[i]< arr2[j]){
                i++;
            }else if(arr1[i] == arr2[j]){
                ans.add(arr1[i] );
                i++;
                j++;
            }else{
                j++;
            }
        }

        System.out.println(ans);
    }

    private static void intersectionArr(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        for (int num : arr1) {
            for (int num2 : arr2) {
                if (num == num2) ans.add(num2);
            }
        }

        System.out.println(ans.toString());
    }
}

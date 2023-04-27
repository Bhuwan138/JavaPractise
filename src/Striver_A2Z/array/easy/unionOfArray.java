package Striver_A2Z.array.easy;

import oracle.sql.INTERVALDS;

import java.util.*;

public class unionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        List<Integer> ans  = unionArrUsingTwoPointer(arr1,arr2);
        System.out.println(ans.toString());
    }

    private static List<Integer> unionArrUsingTwoPointer(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        int i=0,j=0;

        while (i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j] ){
                if(ans.size()==0 || ans.get(ans.size()-1) != arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }else{
                if(ans.size()==0 || ans.get(ans.size()-1)!= arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        return ans;
    }

    private static List<Integer> unionArrUsingSet(int[] arr1, int[] arr2) {
        Set<Integer> set  = new TreeSet<>();
        for(Integer num: arr1) set.add(num);
        for(Integer num:arr2) set.add(num);
        List<Integer> ans = new ArrayList<>();
        ans.addAll(set);
        return  ans;
    }

    private static List<Integer> unionArr(int[] arr1, int[] arr2) {
        Map<Integer, Integer> frequency = new TreeMap<>();
        List<Integer> ans = new ArrayList<>();

        for(Integer num1 : arr1){
            frequency.put(num1, frequency.getOrDefault(num1,0)+1);
        }

        for (Integer num2: arr2){
            frequency.put(num2,frequency.getOrDefault(num2,0)+1);
        }

//        System.out.println(frequency.keySet());
        ans.addAll(frequency.keySet());
        return ans;
    }
}

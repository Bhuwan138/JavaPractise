package com.Bhuwan.Count;

public class ArraySearch {

    public int[] search(int []arr , int x){
        int []n = new int[arr.length];
//        int count  = 0;
        for (int i = 0; i < arr.length; i++) {
            n = new int[arr[i]];
            if (arr[i] == x){

                n[i] = i;
            }
        }
        return n;
    }


}

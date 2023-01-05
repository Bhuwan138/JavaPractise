package OtherPractise.BinarySearch.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
* https://leetcode.com/problems/check-if-n-and-its-double-exist/
* 1346. Check If N and Its Double Exist
* */
public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));

    }
    static public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr); // [2,3,5,10]
        HashMap<Integer,Integer> map = new HashMap<>();
        int low = 0 , high = arr.length-1;
        while (low<= high){
            int mid = low + (high - low)/2;

        }
        return false;
    }


}

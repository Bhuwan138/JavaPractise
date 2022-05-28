package OtherPractise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] nums = {-7,-8,7,5,7,1,6,0};


        int k = 4;
        int []arr = maxWindow(nums,k);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] maxWindow(int[] nums,int k){

        int start = 0,end = 0;
        int i = 0;
        int n;
        if(nums.length>2) {
             n = nums.length - k+1;
        }else if(nums.length == 1) {
            n = nums.length;
            return nums;
        }else {
            n = nums.length;
            int [] max = new int[n-k+1];
            while(i<max.length) {
                max[i] = Math.max(nums[i], nums[n - 1]);
                i++;
            }
            return max;
        }
        int[] max = new int[n];
        while(end < nums.length){


            if(end - start + 1 != k){
                end++;
            }
            else{
                max[i] = max(nums,start,end);
                i++;
                start++;
                end++;
            }
        }
        return max;
    }

    private static int max(int[] nums, int start, int end) {
        while(start != end){
            if(nums[start]>nums[end]){
                end--;
            }else {
                start++;
            }
        }
        return nums[end];
    }
}



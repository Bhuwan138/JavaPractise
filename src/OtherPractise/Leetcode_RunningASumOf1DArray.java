package OtherPractise;

import java.util.Arrays;

public class Leetcode_RunningASumOf1DArray {
    public static void main (String[] args) {
        int[] nums = {1,2,3,4};
        for (int i = 0; i < nums.length; i++) {
            if(i==0) continue;
            nums[i] += nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}

package OtherPractise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_BuildArrayfromPermutation {
    public static void main (String[] args) {
        Solution s = new Solution();
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(s.buildArray(nums)));
    }
}

class Solution {
    public int[] buildArray(int[] nums) {
        int []ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
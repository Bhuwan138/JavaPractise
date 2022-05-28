package OtherPractise.Hashing;

import java.util.Arrays;
import java.util.Map;
import java.util.Spliterator;

public class FirstMissingPositive_Hard {
    public static void main(String[] args) {
        int []nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    static public int firstMissingPositive(int[] nums) {
        boolean one = false;

        //checking for one
       for(int num : nums){
           if(num == 1){
               one = true;
               break;
           }
       }

       if(!one) return 1;

       int n = nums.length;
       if(n == 1) return 2;

       for (int i = 0; i < nums.length; i++) {
           if(nums[i] <= 0 || nums[i] > n) nums[i] = 1;
       }
       for (int i = 0; i < n; i++) {
           int x = Math.abs(nums[i]);
           if(nums[x-1] > 0) nums[x-1] *= -1;
       }
       for (int i = 0; i < n; i++) {
           if(nums[i] > 0) return i+1;
       }
       return n+1;
    }
}

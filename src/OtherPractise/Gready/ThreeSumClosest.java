package OtherPractise.Gready;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0};
        int target = -100;
        System.out.println(threeSumClosest(nums,target));
    }
    static public int threeSumClosest(int[] nums, int target) {
        int nearest = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i+1, right = nums.length-1;

            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];

                if(currentSum < target) left++;
                else right--;

                if(Math.abs(currentSum - target) < Math.abs(nearest - target)) nearest = currentSum;
            }
        }
        return nearest;
    }
}


package OtherPractise.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* https://leetcode.com/problems/two-sum/
* 1. Two Sum
* */
public class TwoSum_Easy {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}

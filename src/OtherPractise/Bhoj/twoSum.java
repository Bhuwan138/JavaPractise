package OtherPractise.Bhoj;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
//    public static void main(String[] args) {
//       Solution solution = new Solution();
//       int[] nums = {2,7,11,15};
//       int target = 26;
//       int output[] = solution.twoSum(nums,target);
//       System.out.println(Arrays.toString(output));
//    }

    public static void main(String[] args) {
        int a = 1;
        addA(a);
        System.out.println(a);
    }

    private static void addA(int a) {
        int temp = a;
        temp += 2;
        System.out.println(temp);
        a = temp;
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] output = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                output[0] = map.get(target - nums[i]);
                output[1] = i;
                return output;
            }else{
                map.put(nums[i], i );
            }
        }
        return output;
    }
}
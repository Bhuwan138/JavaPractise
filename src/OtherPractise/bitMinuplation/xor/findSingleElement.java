package OtherPractise.bitMinuplation.xor;
/*
* https://leetcode.com/problems/single-number/
* 136. Single Number
* */
public class findSingleElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
    static public int singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        // for(int i=0;i<nums.length;i++){
        //     xor ^= nums[i];
        // }
        return xor;
    }
}

package OtherPractise.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
* https://leetcode.com/problems/permutations-ii/
* 47. Permutations II
* */
public class Permutationii {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution s = new Solution();
        System.out.println(s.permuteUnique(nums));
    }
}
class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    public void swap(int i,int j,int[]nums){
        int k=nums[i];
        nums[i]=nums[j];
        nums[j]=k;
    }

    public void track(int k, int[]nums){
        if(k==nums.length){
            List<Integer>a= new ArrayList<>();
            for(int x:nums)a.add(x);
            ans.add(a);
            return;
        }
        HashSet<Integer> s=new HashSet<>();
        for(int i=k;i<nums.length;i++){
            if(s.contains(nums[i]))continue;
            s.add(nums[i]);
            swap(i,k,nums);
            track(k+1,nums);
            swap(i,k,nums);

        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {

        track(0,nums);
        return ans;
    }
}


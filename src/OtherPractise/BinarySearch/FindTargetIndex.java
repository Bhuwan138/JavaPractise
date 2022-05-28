package OtherPractise.BinarySearch;

import java.util.*;

/*
* https://leetcode.com/problems/find-target-indices-after-sorting-array/
* 2089. Find Target Indices After Sorting Array
* */
public class FindTargetIndex {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums,target));
    }
    static  public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int start = 0,end  = nums.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                list.add(mid);
            }

            if(target < nums[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return list;

    }
}

/*
* 34. Find First and Last Position of Element in Sorted Array
Medium

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
* */


package OtherPractise.BinarySearch;

import java.util.Arrays;



public class FirstAndLastPositionfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 3;
        int[] result = searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] searchRange(int[] nums, int target) {
        int first = -1,last = -1;
        if(nums.length == 1 && target == nums[0]) return new int[]{0,0};
        if(nums.length == 2 && target == nums[0]) return new int[]{0,1};
        if(nums.length <=2) return new int[]{-1,-1};
        //searching for first occ
        first =firstLastOcc(nums,target,true );
        //searching for last occ
        last = firstLastOcc(nums,target,false );
        //subtracting last-first

        return new int[]{first,last};
    }

    private static int firstLastOcc(int[] nums, int target, boolean flag) {
        int start = 0;

        int end = nums.length;
        int result = -1;
        while (start<=end){
            int mid = start  + (end-start)/2;

                if (nums[mid] == target) {
                    result = mid;
                    if(flag) {
                        end = mid - 1;
                    }else{
                        start = mid+1;
                    }
                }
                else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

        }
        return result;
    }
}

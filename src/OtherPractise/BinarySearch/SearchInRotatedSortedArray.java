package OtherPractise.BinarySearch;

import com.Other.Collection.HashMapDemo.EmailName;

/*
* https://leetcode.com/problems/search-in-rotated-sorted-array/
* 33. Search in Rotated Sorted Array
* */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int target =2;
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(SearchInRotated(nums,target));
    }

    public static int SearchInRotated(int[] nums, int target){
        int start = 0, end = nums.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;

            //if left part is sorted
            if (nums[start] <= nums[mid]) {
                //checking is sorted part
                if(target >= nums[start] && target <= nums[mid]) end = mid-1;
                else  start = mid+1;
            }
            //if right part is sorted
            else {
                //checking target in right sorted part
                if(target >= nums[mid] && target <= nums[end])  start = mid+1;
                else  end = mid-1;
            }
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        if((nums[0] != target) && (nums.length == 1) ) return -1;
        int minEle = minElement(nums);
        int first = binarySearch(nums,0,minEle,target);
        int second = binarySearch(nums,minEle,nums.length-1,target);
        if(first != -1) return first;
        else return second;

    }

    public static int minElement(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int n = nums.length;
        if (nums.length == 1) return nums[0];
        if (nums[0] < nums[end]) return nums[0];
        if (nums[0] > nums[1]) return nums[1];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;
            if (nums[mid] > nums[prev] && nums[mid] > nums[next]) {
                return next;
            } else if (nums[start] < nums[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums,int start,int end,int target){
        int mid = -1;
        while (start<=end){
            mid = start + (end-start)/2;
            if (target == nums[mid]) {
                return mid ;
            }else if(target < nums[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        return -1;
    }

}

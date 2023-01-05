package OtherPractise.BinarySearch;

/*
* https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
* 153. Find Minimum in Rotated Sorted Array
* */
public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int n = nums.length;
        if(nums.length == 1) return nums[0];
        if(nums[0]<nums[end]) return nums[0];
        if(nums[0]>nums[1]) return nums[1];

        while (start<=end){
            int mid = start + (end-start)/2;
            int prev = (mid+n-1)%n;
            int next = (mid+1)%n;
            if(nums[mid]>nums[prev] && nums[mid]>nums[next]){
                return nums[next];
            }else if(nums[start] < nums[mid]){
                start = mid;
            }else {
                end = mid;
            }
        }
        return -1;
    }
}

package OtherPractise.BinarySearch;
/*
* github profile: https://leetcode.com/pandeybhuwan138/
* https://leetcode.com/problems/find-peak-element/
* 162. Find Peak Element
* */

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    static public int findPeakElement(int[] nums) {
        int start=0, end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]) end = mid;
            else start = mid+1;
        }
        return start;
    }
}

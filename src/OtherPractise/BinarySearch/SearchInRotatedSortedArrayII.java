package OtherPractise.BinarySearch;
/*
* https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
* 81. Search in Rotated Sorted Array II
* */
public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        System.out.println(search(nums,target));
    }

    static  public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return true;

            //if left part is sorted
            if (nums[start] <= nums[mid]) {
                if(start!=mid && nums[start] == nums[mid]) start++;
                //checking is sorted part
                if(target >= nums[start] && target <= nums[mid]) end = mid-1;
                else  start = mid+1;
            }
            //if right part is sorted
            else {
                if(start!=mid && nums[mid] == nums[end]) end--;
                //checking target in right sorted part
                if(target >= nums[mid] && target <= nums[end])  start = mid+1;
                else  end = mid-1;
            }
        }
        return false;
    }
}

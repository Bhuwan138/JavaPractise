package OtherPractise.BinarySearch;

/*
* https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
* 1608. Special Array With X Elements Greater Than or Equal X
* */

public class SpecialElementWithXGreaterThanOrEqual {

    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        System.out.println(specialArray(nums));
    }

    static public int specialArray(int[] nums) {
        int start = 0,end = nums.length;
        while(start <= end){
            int mid = start + (end-start)/2;
            int currentCount  = count(nums,mid);
            if(currentCount == mid) return mid;
            else if(currentCount < mid) end = mid-1;
            else start = mid+1;
        }
        return -1;

    }

    static public int count(int[]nums, int index){
        int count = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] >= index) count++;
        }

        return count;
    }
}

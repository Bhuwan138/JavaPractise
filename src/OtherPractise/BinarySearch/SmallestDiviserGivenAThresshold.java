package OtherPractise.BinarySearch;

import java.util.Arrays;

/*
* https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
* 1283. Find the Smallest Divisor Given a Threshold
* */
public class SmallestDiviserGivenAThresshold {
    public static void main(String[] args) {
        int[] nums = {44,22,33,11,1};
        int threshold = 5;
        System.out.println(smallestDivisor(nums,threshold));
    }

    static public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt();
        int ans = high;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(sumAfterDivision(nums,mid) <= threshold){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }

    private static int sumAfterDivision(int[] nums, int divider) {
        int sum = 0, n = nums.length;
        for (int i = 0; i < n ; i++) {
            sum += (nums[i]/divider);
            if (nums[i] % divider != 0) {
                sum += 1;
            }
        }
        return sum;
    }
}

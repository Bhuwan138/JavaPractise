package OtherPractise.BinarySearch.hard;

import java.lang.reflect.MalformedParameterizedTypeException;

/*
*  https://leetcode.com/problems/median-of-two-sorted-arrays/
*  4. Median of Two Sorted Arrays
* */
public class MedianOf2SortedArray {
    public static void main(String[] args) {
        int[] nums1 = {12,14,24,26,27};
        int[] nums2 = {7,9,13,16,17,18,29};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length < nums1.length) return findMedianSortedArrays(nums2,nums1);
        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0,high = n1;

        while (low <= high){
            int cut1 = (low + high) /2;
            int cut2 = (n1 + n2 + 1)/2 - cut1;

            int first_left = (cut1 == 0)? Integer.MIN_VALUE : nums1[cut1-1];
            int second_left = (cut2 == 0)? Integer.MIN_VALUE : nums2[cut2-1];

            int first_right = (cut1 == n1) ? Integer.MAX_VALUE :nums1[cut1];
            int second_right = (cut2 == n2) ? Integer.MAX_VALUE :nums2[cut2];

            if (first_left <= second_right && second_left <= first_right){
                if((n1 + n2)%2 == 0) {
                    return (Math.max(first_left,second_left) + Math.min(first_right,second_right))/2.0;
                }else return Math.max(first_left,second_left);
            } else if (first_left > second_right) {
                high = cut1-1;
            }else {
                low = cut1+1;
            }
        }

        return 0.0;
    }
}

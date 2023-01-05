package OtherPractise.stack.MonotonicStack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] num1 = {4,12,2,3,10,6,5,8};
        int[] num2 = {1,3,4,2};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.nextGreater1(num1)));
        //Arrays.toString(solution.nextGreaterElement(num1,num2));
    }
}

class Solution {
    public int[] nextGreater1(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        ans[nums.length-1] = -1;
        stack.push(nums[nums.length-1]);
        for (int i = nums.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] > stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek();
            }else{
                ans[i] = -1;
            }
            stack.push(nums[i]);

        }
        ///ans[nums.length-1] = -1;
        return ans;
    }

    public int[] nextGreater(int[] nums){

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] < nums[j]){
                    ans[i] = nums[j];
                    break;
                }
            }
            if(ans[i] == 0)
                ans[i] = -1;

        }
        ///ans[nums.length-1] = -1;
        return ans;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

        }
        return new int[1];
    }
}

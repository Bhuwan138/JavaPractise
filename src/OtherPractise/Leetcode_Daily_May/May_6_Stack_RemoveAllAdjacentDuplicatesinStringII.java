package OtherPractise.Leetcode_Daily_May;

import java.util.Stack;

/*
* https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
* 1209. Remove All Adjacent Duplicates in String II
* */

public class May_6_Stack_RemoveAllAdjacentDuplicatesinStringII {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(s,k));
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {

            Stack<int[]> stack = new Stack();
            for(int i=0;i<s.length();i++)
            {
                if(stack.size()>0 && s.charAt(stack.peek()[0])==s.charAt(i))
                {
                    stack.peek()[1]++;
                }
                else
                {
                    stack.push(new int[]{i,1});
                }

                if(stack.peek()[1]==k)
                    stack.pop();
            }



            StringBuilder sb = new StringBuilder();
            while(stack.size()>0)
            {
                int top[] = stack.pop();
                while(top[1]-->0)
                {
                    sb.append(s.charAt(top[0]));
                }
            }

            return sb.reverse().toString();

    }
}

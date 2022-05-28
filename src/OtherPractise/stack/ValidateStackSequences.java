package OtherPractise.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5},popped = {4,5,3,2,1};
        boolean check  = validateStackSequences(pushed,popped);
        System.out.println(check);
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int arr : pushed){
            st.push(arr);
            while(st.size() >0 &&  st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return j == popped.length;
    }
}

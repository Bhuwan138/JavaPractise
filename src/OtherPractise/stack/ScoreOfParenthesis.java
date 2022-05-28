package OtherPractise.stack;

import java.util.Stack;

/*
* https://leetcode.com/problems/score-of-parentheses/
* 856. Score of Parentheses
* */
public class ScoreOfParenthesis {
    public static void main(String[] args) {
        String s = "(()(())())";
        System.out.println(scoreOfParentheses(s));
    }

    static  public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i < s.length();i++){
            if(s.charAt(i) == '(') stack.push(-1);
            else{
                if(stack.peek() == -1){
                    stack.pop();
                    stack.push(1);
                }else{
                    int value = 0;
                    while (stack.peek() != -1){
                        value += stack.pop();
                    }
                    stack.pop();
                    stack.push(2*value);
                }
            }
        }

        int value = 0;
        while (!stack.empty()){
            value += stack.pop();
        }
        return value;
    }
}
